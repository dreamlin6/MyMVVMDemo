package com.example.mvvmdemo.databinding;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySetBindingImpl extends ActivitySetBinding implements com.example.mvvmdemo.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv1, 6);
        sViewsWithIds.put(R.id.tv2, 7);
        sViewsWithIds.put(R.id.user, 8);
        sViewsWithIds.put(R.id.pass, 9);
        sViewsWithIds.put(R.id.settohome, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivitySetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.password.setTag(null);
        this.reset.setTag(null);
        this.set.setTag(null);
        this.tologin.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.mvvmdemo.generated.callback.OnClickListener(this, 1);
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
        if (BR.setvm == variableId) {
            setSetvm((com.example.mvvmdemo.viewmodel.SetViewmodel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSetvm(@Nullable com.example.mvvmdemo.viewmodel.SetViewmodel Setvm) {
        this.mSetvm = Setvm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.setvm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSetvmSetBtnEnableStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeSetvmMPass((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSetvmMUser((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSetvmMBtnEnableStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSetvmSetBtnEnableStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SetvmSetBtnEnableStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSetvmMPass(androidx.lifecycle.MutableLiveData<java.lang.String> SetvmMPass, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSetvmMUser(androidx.lifecycle.MutableLiveData<java.lang.String> SetvmMUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSetvmMBtnEnableStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SetvmMBtnEnableStatus, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> setvmSetBtnEnableStatus = null;
        java.lang.Boolean setvmMBtnEnableStatusGetValue = null;
        java.lang.String setvmMUserGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSetvmMBtnEnableStatusGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> setvmMPass = null;
        java.lang.String setvmMPassGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> setvmMUser = null;
        com.example.mvvmdemo.viewmodel.SetViewmodel setvm = mSetvm;
        boolean androidxDatabindingViewDataBindingSafeUnboxSetvmSetBtnEnableStatusGetValue = false;
        java.lang.Boolean setvmSetBtnEnableStatusGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> setvmMBtnEnableStatus = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (setvm != null) {
                        // read setvm.setBtnEnableStatus
                        setvmSetBtnEnableStatus = setvm.setBtnEnableStatus;
                    }
                    updateLiveDataRegistration(0, setvmSetBtnEnableStatus);


                    if (setvmSetBtnEnableStatus != null) {
                        // read setvm.setBtnEnableStatus.getValue()
                        setvmSetBtnEnableStatusGetValue = setvmSetBtnEnableStatus.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(setvm.setBtnEnableStatus.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSetvmSetBtnEnableStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(setvmSetBtnEnableStatusGetValue);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (setvm != null) {
                        // read setvm.mPass
                        setvmMPass = setvm.mPass;
                    }
                    updateLiveDataRegistration(1, setvmMPass);


                    if (setvmMPass != null) {
                        // read setvm.mPass.getValue()
                        setvmMPassGetValue = setvmMPass.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (setvm != null) {
                        // read setvm.mUser
                        setvmMUser = setvm.mUser;
                    }
                    updateLiveDataRegistration(2, setvmMUser);


                    if (setvmMUser != null) {
                        // read setvm.mUser.getValue()
                        setvmMUserGetValue = setvmMUser.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (setvm != null) {
                        // read setvm.mBtnEnableStatus
                        setvmMBtnEnableStatus = setvm.mBtnEnableStatus;
                    }
                    updateLiveDataRegistration(3, setvmMBtnEnableStatus);


                    if (setvmMBtnEnableStatus != null) {
                        // read setvm.mBtnEnableStatus.getValue()
                        setvmMBtnEnableStatusGetValue = setvmMBtnEnableStatus.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(setvm.mBtnEnableStatus.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSetvmMBtnEnableStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(setvmMBtnEnableStatusGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, setvmMPassGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.reset.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.reset.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSetvmMBtnEnableStatusGetValue);
            this.tologin.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSetvmMBtnEnableStatusGetValue);
            com.example.mvvmdemo.adapter.SetBindingAdapter.setBtnVisible(this.tologin, androidxDatabindingViewDataBindingSafeUnboxSetvmMBtnEnableStatusGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.set.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSetvmSetBtnEnableStatusGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, setvmMUserGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // setvm != null
        boolean setvmJavaLangObjectNull = false;
        // setvm
        com.example.mvvmdemo.viewmodel.SetViewmodel setvm = mSetvm;



        setvmJavaLangObjectNull = (setvm) != (null);
        if (setvmJavaLangObjectNull) {


            setvm.reset();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): setvm.setBtnEnableStatus
        flag 1 (0x2L): setvm.mPass
        flag 2 (0x3L): setvm.mUser
        flag 3 (0x4L): setvm.mBtnEnableStatus
        flag 4 (0x5L): setvm
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}