package com.example.mvvmdemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.viewmodel.SetViewmodel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mainBinding;
    private SetViewmodel setViewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main); //视图绑定
        mainBinding.setLifecycleOwner(this);
        mainBinding.login1.setOnClickListener(this);
        mainBinding.set1.setOnClickListener(this);

        ViewModelProvider.AndroidViewModelFactory instance =
                ViewModelProvider.AndroidViewModelFactory
                        .getInstance(getApplication());
        setViewmodel = new ViewModelProvider(this, instance).get(SetViewmodel.class);  //创建viewmodel
        mainBinding.setSetvm(setViewmodel);  //绑定viewmodel
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login1:
                Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.set1:
                Intent intent2 = new Intent(this, SetActivity.class);
                startActivity(intent2);
                break;
        }
    }

}