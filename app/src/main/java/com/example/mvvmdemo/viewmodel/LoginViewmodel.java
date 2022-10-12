package com.example.mvvmdemo.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmdemo.constant.MConstant;
import com.example.mvvmdemo.model.User;

public class LoginViewmodel extends ViewModel {
    public User mUser;
    public MutableLiveData<Integer> mLoginStatus;
    public MutableLiveData<Boolean> mLoginInputStatus;
    public MutableLiveData<String> mText;
    public MutableLiveData<String> mUsers;

    public LoginViewmodel() {
        this.mLoginStatus = new MutableLiveData<>();
        this.mLoginInputStatus = new MutableLiveData<>();
        this.mText = new MutableLiveData<>(MConstant.WAIT);
        this.mUsers = new MutableLiveData<>(MConstant.MSTR);
        mUser = new User();
    }

    public MutableLiveData<Integer> getLogin() {
        return mLoginStatus;
    }

    public MutableLiveData<Boolean> getmLoginInputStatus() {
        return mLoginInputStatus;
    }

    public void setmLoginInputStatus (boolean isLoginInput) {
        mLoginInputStatus.postValue(isLoginInput);
    }

    public void setLogin(int isLogin) {
        mLoginStatus.postValue(isLogin);
    }

    public void login(String user, String pass, String userName, String password) {
        if (user.equals("") || pass.equals("")) {
            return;
        }
        else if (userName.equals(user) && password.equals(pass)) {
            mUser.setUserName(userName);
            mUser.setPassword(password);
            setLogin(1);
            Log.i("TESTLOG","login TRUE");
            mText.setValue("Login Successfully");
            mUsers.setValue(userName);
        } else {
            setLogin(2);
            Log.i("TESTLOG","login FALSE");
            mText.setValue("Login Failed");
        }
    }

    public void logout() {
        mText.setValue("Wait for Login");
        mUsers.setValue("");
        setLogin(2);
    }
    
}
