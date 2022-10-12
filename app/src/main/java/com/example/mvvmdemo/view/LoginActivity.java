package com.example.mvvmdemo.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityLoginBinding;
import com.example.mvvmdemo.viewmodel.LoginViewmodel;

public class LoginActivity extends AppCompatActivity {
    private LoginViewmodel loginViewmodel;
    private ActivityLoginBinding loginBinding;
    private String mCurrentUser;
    private String mWait = "Wait for Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginBinding.setLifecycleOwner(this);

        loginBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TESTLOG","LoginActivity login onClick");
                if (SetActivity.getUser().isEmpty() || SetActivity.getPass().isEmpty()) {
                    Log.i("TESTLOG","LoginActivity login onClick 111");
                    return;
                } else {
                    Log.i("TESTLOG","LoginActivity login onClick 222");
                    loginViewmodel.login(SetActivity.getUser(), SetActivity.getPass(), loginBinding.et1.getText().toString(), loginBinding.et2.getText().toString());
                    loginBinding.et1.setText(null);
                    loginBinding.et2.setText(null);
                }
            }
        });
        loginBinding.toset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TESTLOG","LoginActivity toset onClick");
                Intent intent1 = new Intent(LoginActivity.this, SetActivity.class);
                startActivity(intent1);
            }
        });
        loginBinding.logintohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TESTLOG","LoginActivity tohome onClick");
                Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        loginBinding.logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TESTLOG","LoginActivity logout onClick");
                loginViewmodel.logout();
            }
        });

        ViewModelProvider.AndroidViewModelFactory instance =
                ViewModelProvider.AndroidViewModelFactory
                        .getInstance(getApplication());
        loginViewmodel = new ViewModelProvider(this, instance).get(LoginViewmodel.class);  //创建viewmodel
        loginBinding.setLoginvm(loginViewmodel);  // 设置绑定
        loginViewmodel.getLogin().observe(this, loginObserver);  //观察loginObserver

        loginBinding.et1.addTextChangedListener(watcher); //监听输入框变化
        loginBinding.et2.addTextChangedListener(watcher);
        loginBinding.tv1.addTextChangedListener(watcher1);
    }

    TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            loginViewmodel.setmLoginInputStatus(s.length() > 0); //监听输入框文本变化
        }
    };

    TextWatcher watcher1 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().equals(mWait)) {
                Log.i("TESTLOG","LoginActivity afterTextChanged s = " + s);
                loginBinding.tv1.setTextColor(Color.parseColor("#ffa500"));
            }
        }
    };

    private Observer<Integer> loginObserver = new Observer<Integer>() {
        @Override
        public void onChanged(@Nullable Integer isLogin) {
            Log.i("TESTLOG","LoginActivity onChanged isLogin = " + isLogin);
            if (isLogin == 1) {
                loginBinding.tv1.setText("Login Successfully");
            } else if (isLogin == 2) {
                loginBinding.tv1.setText("Login Failed");
            } else {
            }
        }
    };

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { //跳转后保留
        super.onRestoreInstanceState(savedInstanceState);
        loginBinding.mUsers.setText("NULL");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {  //跳转后保留
        super.onSaveInstanceState(outState);
//        outState.putString(mCurrentUser, loginBinding.mUsers.getText().toString());
    }

}
