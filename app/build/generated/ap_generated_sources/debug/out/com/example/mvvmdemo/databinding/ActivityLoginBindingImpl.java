package com.example.mvvmdemo.databinding;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.example.mvvmdemo.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et1, 5);
        sViewsWithIds.put(R.id.et2, 6);
        sViewsWithIds.put(R.id.toset, 7);
        sViewsWithIds.put(R.id.logintohome, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.login.setTag(null);
        this.logout.setTag(null);
        this.mUsers.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tv1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.mvvmdemo.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginvm == variableId) {
            setLoginvm((com.example.mvvmdemo.viewmodel.LoginViewmodel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginvm(@Nullable com.example.mvvmdemo.viewmodel.LoginViewmodel Loginvm) {
        this.mLoginvm = Loginvm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.loginvm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginvmMText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginvmMLoginStatus((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeLoginvmMLoginInputStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeLoginvmMUsers((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginvmMText(androidx.lifecycle.MutableLiveData<java.lang.String> LoginvmMText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginvmMLoginStatus(androidx.lifecycle.MutableLiveData<java.lang.Integer> LoginvmMLoginStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginvmMLoginInputStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> LoginvmMLoginInputStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginvmMUsers(androidx.lifecycle.MutableLiveData<java.lang.String> LoginvmMUsers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginStatusGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginInputStatusGetValue = false;
        boolean loginvmMLoginStatusInt1BooleanTrueBooleanFalse = false;
        java.lang.String loginvmMUsersGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginvmMText = null;
        boolean loginvmMLoginStatusInt1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> loginvmMLoginStatus = null;
        com.example.mvvmdemo.viewmodel.LoginViewmodel loginvm = mLoginvm;
        java.lang.Integer loginvmMLoginStatusGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginvmMLoginInputStatus = null;
        java.lang.String loginvmMTextGetValue = null;
        java.lang.Boolean loginvmMLoginInputStatusGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginvmMUsers = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (loginvm != null) {
                        // read loginvm.mText
                        loginvmMText = loginvm.mText;
                    }
                    updateLiveDataRegistration(0, loginvmMText);


                    if (loginvmMText != null) {
                        // read loginvm.mText.getValue()
                        loginvmMTextGetValue = loginvmMText.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (loginvm != null) {
                        // read loginvm.mLoginStatus
                        loginvmMLoginStatus = loginvm.mLoginStatus;
                    }
                    updateLiveDataRegistration(1, loginvmMLoginStatus);


                    if (loginvmMLoginStatus != null) {
                        // read loginvm.mLoginStatus.getValue()
                        loginvmMLoginStatusGetValue = loginvmMLoginStatus.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginStatus.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginvmMLoginStatusGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginStatus.getValue()) == 1
                    loginvmMLoginStatusInt1 = (androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginStatusGetValue) == (1);
                if((dirtyFlags & 0x32L) != 0) {
                    if(loginvmMLoginStatusInt1) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginStatus.getValue()) == 1 ? true : false
                    loginvmMLoginStatusInt1BooleanTrueBooleanFalse = ((loginvmMLoginStatusInt1) ? (true) : (false));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (loginvm != null) {
                        // read loginvm.mLoginInputStatus
                        loginvmMLoginInputStatus = loginvm.mLoginInputStatus;
                    }
                    updateLiveDataRegistration(2, loginvmMLoginInputStatus);


                    if (loginvmMLoginInputStatus != null) {
                        // read loginvm.mLoginInputStatus.getValue()
                        loginvmMLoginInputStatusGetValue = loginvmMLoginInputStatus.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginInputStatus.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginInputStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginvmMLoginInputStatusGetValue);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (loginvm != null) {
                        // read loginvm.mUsers
                        loginvmMUsers = loginvm.mUsers;
                    }
                    updateLiveDataRegistration(3, loginvmMUsers);


                    if (loginvmMUsers != null) {
                        // read loginvm.mUsers.getValue()
                        loginvmMUsersGetValue = loginvmMUsers.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.login.setEnabled(androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginInputStatusGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.logout.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.logout.setEnabled(loginvmMLoginStatusInt1BooleanTrueBooleanFalse);
            com.example.mvvmdemo.adapter.LoginBindingAdapter.setTextColor(this.tv1, androidxDatabindingViewDataBindingSafeUnboxLoginvmMLoginStatusGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mUsers, loginvmMUsersGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tv1, loginvmMTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginvm != null
        boolean loginvmJavaLangObjectNull = false;
        // loginvm
        com.example.mvvmdemo.viewmodel.LoginViewmodel loginvm = mLoginvm;



        loginvmJavaLangObjectNull = (loginvm) != (null);
        if (loginvmJavaLangObjectNull) {


            loginvm.logout();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginvm.mText
        flag 1 (0x2L): loginvm.mLoginStatus
        flag 2 (0x3L): loginvm.mLoginInputStatus
        flag 3 (0x4L): loginvm.mUsers
        flag 4 (0x5L): loginvm
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginStatus.getValue()) == 1 ? true : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(loginvm.mLoginStatus.getValue()) == 1 ? true : false
    flag mapping end*/
    //end
}