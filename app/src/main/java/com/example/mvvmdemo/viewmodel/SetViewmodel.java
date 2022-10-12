package com.example.mvvmdemo.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmdemo.constant.MConstant;

public class SetViewmodel extends ViewModel {

    public MutableLiveData<Boolean> setBtnEnableStatus;
    public MutableLiveData<Boolean> mBtnEnableStatus;
    public MutableLiveData<String> mUser;
    public MutableLiveData<String> mPass;

    public SetViewmodel() {
        this.setBtnEnableStatus = new MutableLiveData<>(Boolean.FALSE);
        this.mBtnEnableStatus = new MutableLiveData<>(Boolean.FALSE);
        this.mUser = new MutableLiveData<>(MConstant.MSTR);
        this.mPass = new MutableLiveData<>(MConstant.MSTR);
    }

    public void setToLoginBtnEnableStatus(boolean enableStatus) {
        mBtnEnableStatus.postValue(enableStatus);
    }


    public void setSet(boolean isSet) {
        setBtnEnableStatus.postValue(isSet);
    }

    public void reset() {
        mUser.setValue("");
        mPass.setValue("");
    }

    public void setEnableStatus(String user, String pass) {
        Log.i("TESTLog", "SetViewmodel setEnableStatus");
        mUser.setValue(user);
        mPass.setValue(pass);
    }
}
