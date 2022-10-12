// Generated by data binding compiler. Do not edit!
package com.example.mvvmdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.viewmodel.SetViewmodel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySetBinding extends ViewDataBinding {
  @NonNull
  public final EditText pass;

  @NonNull
  public final TextView password;

  @NonNull
  public final Button reset;

  @NonNull
  public final Button set;

  @NonNull
  public final Button settohome;

  @NonNull
  public final Button tologin;

  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tv2;

  @NonNull
  public final EditText user;

  @NonNull
  public final TextView username;

  @Bindable
  protected SetViewmodel mSetvm;

  protected ActivitySetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText pass, TextView password, Button reset, Button set, Button settohome, Button tologin,
      TextView tv1, TextView tv2, EditText user, TextView username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pass = pass;
    this.password = password;
    this.reset = reset;
    this.set = set;
    this.settohome = settohome;
    this.tologin = tologin;
    this.tv1 = tv1;
    this.tv2 = tv2;
    this.user = user;
    this.username = username;
  }

  public abstract void setSetvm(@Nullable SetViewmodel setvm);

  @Nullable
  public SetViewmodel getSetvm() {
    return mSetvm;
  }

  @NonNull
  public static ActivitySetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_set, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySetBinding>inflateInternal(inflater, R.layout.activity_set, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_set, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySetBinding>inflateInternal(inflater, R.layout.activity_set, null, false, component);
  }

  public static ActivitySetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySetBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySetBinding)bind(component, view, R.layout.activity_set);
  }
}
