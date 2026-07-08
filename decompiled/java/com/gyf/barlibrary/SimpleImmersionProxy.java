package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public class SimpleImmersionProxy {
    public Fragment mFragment;
    public boolean mIsActivityCreated;
    public SimpleImmersionOwner mSimpleImmersionOwner;

    private void setImmersionBar() {
        Fragment fragment = this.mFragment;
        if (fragment != null && this.mIsActivityCreated && fragment.getUserVisibleHint() && this.mSimpleImmersionOwner.immersionBarEnabled()) {
            this.mSimpleImmersionOwner.initImmersionBar();
        }
    }

    public boolean isUserVisibleHint() {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            return fragment.getUserVisibleHint();
        }
        return false;
    }

    public void onDestroy() {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getActivity() != null && this.mSimpleImmersionOwner.immersionBarEnabled()) {
            ImmersionBar.with(this.mFragment).destroy();
        }
        this.mFragment = null;
        this.mSimpleImmersionOwner = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleImmersionProxy(Fragment fragment) {
        this.mFragment = fragment;
        if (fragment instanceof SimpleImmersionOwner) {
            this.mSimpleImmersionOwner = (SimpleImmersionOwner) fragment;
            return;
        }
        throw new IllegalArgumentException("please implement SimpleImmersionOwner in your Fragment");
    }

    public void onActivityCreated(Bundle bundle) {
        this.mIsActivityCreated = true;
        setImmersionBar();
    }

    public void onConfigurationChanged(Configuration configuration) {
        setImmersionBar();
    }

    public void onHiddenChanged(boolean z) throws Throwable {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.setUserVisibleHint(!z);
        }
    }

    public void setUserVisibleHint(boolean z) {
        setImmersionBar();
    }
}
