package com.example.mvvmdemo.adapter;

import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class LoginBindingAdapter {

    @BindingAdapter(value = {"loginStatus"}, requireAll = false)
    public static void setTextColor(TextView view, int isStatus) {
        if (isStatus == 1) {
            Log.i("TESTLOG","setTextColor" + isStatus);
            view.setTextColor(Color.parseColor("#00CD00"));
        } else if (isStatus == 2){
            Log.i("TESTLOG","setTextColor" + isStatus);
            view.setTextColor(Color.parseColor("#FF0000"));
        } else {
        }
    }
}
