package com.example.mvvmdemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivitySetBinding;
import com.example.mvvmdemo.viewmodel.SetViewmodel;


public class SetActivity extends AppCompatActivity implements View.OnClickListener {

    private SetViewmodel setViewmodel;
    public static ActivitySetBinding setBinding;  //绑定对象
    private String text1;
    private String text2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding = DataBindingUtil.setContentView(this, R.layout.activity_set); //绑定布局
        setBinding.setLifecycleOwner(this); //在XML中使用

        ViewModelProvider.AndroidViewModelFactory instance =
                ViewModelProvider.AndroidViewModelFactory
                        .getInstance(getApplication());
        setViewmodel = new ViewModelProvider(this, instance).get(SetViewmodel.class);  //创建viewmodel
        setBinding.setSetvm(setViewmodel);  //设置绑定 XML和Adapter
        setBinding.user.addTextChangedListener(watcher1);
        setBinding.pass.addTextChangedListener(watcher1);
        setBinding.username.addTextChangedListener(watcher2);
        setBinding.set.setOnClickListener(this);
        setBinding.tologin.setOnClickListener(this);
        setBinding.settohome.setOnClickListener(this);
        setBinding.reset.setOnClickListener(this);
    }

    TextWatcher watcher1 = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.i("TESTLOG","SetActivity afterTextChanged watcher1");
            setViewmodel.setSet(setBinding.user.getText().length() > 0 && setBinding.pass.getText().length() > 0); //监听输入框文本变化
        }
    };

    TextWatcher watcher2 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.i("TESTLOG","SetActivity afterTextChanged watcher2");
            setViewmodel.setToLoginBtnEnableStatus(setBinding.username.getText().length() > 0 && setBinding.password.getText().length() > 0);//监听文本框文本变化
        }
    };

    public static String getUser() {
        return setBinding.username.getText().toString();
    }

    public static String getPass() {
        return setBinding.password.getText().toString();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tologin:
                Log.i("TESTLOG","SetActivity tologin onClick");
                Intent intent1 = new Intent(SetActivity.this, LoginActivity.class);
//                intent1.putExtra("user", setBinding.username.getText().toString());  // ---> onSaveInstanceState无用
//                intent1.putExtra("pass", setBinding.password.getText().toString());
                startActivity(intent1);
                break;
            case R.id.set:
                Log.i("TESTLOG","SetActivity set onClick");
                setViewmodel.setEnableStatus(setBinding.user.getText().toString(), setBinding.pass.getText().toString());
                setBinding.user.setText(null);
                setBinding.pass.setText(null);
                break;
            case R.id.settohome:
                Log.i("TESTLOG","SetActivity tohome onClick");
                Intent intent2 = new Intent(SetActivity.this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { //跳转后保留
        super.onRestoreInstanceState(savedInstanceState);
        setBinding.username.setText(text1);
        setBinding.password.setText(text2);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {  //跳转后保留
        super.onSaveInstanceState(outState);
        outState.putString(text1, setBinding.username.getText().toString());
        outState.putString(text2, setBinding.password.getText().toString());
    }

}
