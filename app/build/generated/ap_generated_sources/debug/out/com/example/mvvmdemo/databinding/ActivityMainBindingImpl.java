package com.example.mvvmdemo.databinding;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.set1, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.login1.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.setvm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSetvmMHomeBtnEnableStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSetvmMHomeBtnEnableStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SetvmMHomeBtnEnableStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.Boolean setvmMHomeBtnEnableStatusGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> setvmMHomeBtnEnableStatus = null;
        com.example.mvvmdemo.viewmodel.SetViewmodel setvm = mSetvm;
        boolean androidxDatabindingViewDataBindingSafeUnboxSetvmMHomeBtnEnableStatusGetValue = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (setvm != null) {
                    // read setvm.mHomeBtnEnableStatus
                    setvmMHomeBtnEnableStatus = setvm.mHomeBtnEnableStatus;
                }
                updateLiveDataRegistration(0, setvmMHomeBtnEnableStatus);


                if (setvmMHomeBtnEnableStatus != null) {
                    // read setvm.mHomeBtnEnableStatus.getValue()
                    setvmMHomeBtnEnableStatusGetValue = setvmMHomeBtnEnableStatus.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(setvm.mHomeBtnEnableStatus.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSetvmMHomeBtnEnableStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(setvmMHomeBtnEnableStatusGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.login1.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSetvmMHomeBtnEnableStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): setvm.mHomeBtnEnableStatus
        flag 1 (0x2L): setvm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}