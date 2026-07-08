package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes30.dex */
public class ImmersionProxy {
    public Fragment mFragment;
    public ImmersionOwner mImmersionOwner;
    public boolean mIsActivityCreated;
    public boolean mIsLazyAfterView;
    public boolean mIsLazyBeforeView;

    public boolean isUserVisibleHint() {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            return fragment.getUserVisibleHint();
        }
        return false;
    }

    public void onDestroy() {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getActivity() != null && this.mImmersionOwner.immersionBarEnabled()) {
            ImmersionBar.with(this.mFragment).destroy();
        }
        this.mFragment = null;
        this.mImmersionOwner = null;
    }

    public void onPause() {
        if (this.mFragment != null) {
            this.mImmersionOwner.onInvisible();
        }
    }

    public void onResume() {
        Fragment fragment = this.mFragment;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        this.mImmersionOwner.onVisible();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmersionProxy(Fragment fragment) {
        this.mFragment = fragment;
        if (fragment instanceof ImmersionOwner) {
            this.mImmersionOwner = (ImmersionOwner) fragment;
            return;
        }
        throw new IllegalArgumentException("please implement SimpleImmersionOwner in your Fragment");
    }

    public void onActivityCreated(Bundle bundle) {
        this.mIsActivityCreated = true;
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getUserVisibleHint()) {
            if (this.mImmersionOwner.immersionBarEnabled()) {
                this.mImmersionOwner.initImmersionBar();
            }
            if (!this.mIsLazyAfterView) {
                this.mImmersionOwner.onLazyAfterView();
                this.mIsLazyAfterView = true;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getUserVisibleHint()) {
            if (this.mImmersionOwner.immersionBarEnabled()) {
                this.mImmersionOwner.initImmersionBar();
            }
            this.mImmersionOwner.onVisible();
        }
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getUserVisibleHint() && !this.mIsLazyBeforeView) {
            this.mImmersionOwner.onLazyBeforeView();
            this.mIsLazyBeforeView = true;
        }
    }

    public void onHiddenChanged(boolean z) throws Throwable {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.setUserVisibleHint(!z);
        }
    }

    public void setUserVisibleHint(boolean z) {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            if (fragment.getUserVisibleHint()) {
                if (!this.mIsLazyBeforeView) {
                    this.mImmersionOwner.onLazyBeforeView();
                    this.mIsLazyBeforeView = true;
                }
                if (this.mIsActivityCreated && this.mFragment.getUserVisibleHint()) {
                    if (this.mImmersionOwner.immersionBarEnabled()) {
                        this.mImmersionOwner.initImmersionBar();
                    }
                    if (!this.mIsLazyAfterView) {
                        this.mImmersionOwner.onLazyAfterView();
                        this.mIsLazyAfterView = true;
                    }
                    this.mImmersionOwner.onVisible();
                    return;
                }
                return;
            }
            if (!this.mIsActivityCreated) {
                return;
            }
            this.mImmersionOwner.onInvisible();
        }
    }
}
