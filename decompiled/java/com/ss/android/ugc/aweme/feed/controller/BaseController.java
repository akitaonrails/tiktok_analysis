package com.ss.android.ugc.aweme.feed.controller;

import X.C19EG;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;

/* JADX INFO: loaded from: classes13.dex */
public class BaseController implements BaseControllerContext {
    public Activity activity;
    public Fragment fragment;
    public String mEnterMethodValue = "click";
    public String mEventType;
    public String mFrom;
    public String mFromGroupId;
    public int mPageType;
    public String mPreviousPage;

    public void onDetach() {
        this.activity = null;
    }

    public final FragmentManager LJZI() {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            return fragment.getChildFragmentManager();
        }
        Activity activity = this.activity;
        if (activity instanceof C19EG) {
            return ((C19EG) activity).getSupportFragmentManager();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String Cf() {
        return getEventType();
    }

    public final boolean isViewValid() {
        AbsFragment absFragment = (AbsFragment) getFragment();
        if (absFragment != null) {
            return absFragment.isViewValid();
        }
        Activity activity = this.activity;
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public Activity getActivity() {
        return this.activity;
    }

    public Context getContext() {
        return this.activity;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String getEnterMethod() {
        return this.mEnterMethodValue;
    }

    public String getEventType() {
        return this.mEventType;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public String getFrom() {
        return this.mFrom;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final int getPageType() {
        return this.mPageType;
    }

    public final void LL(String str) {
        this.mEventType = str;
    }

    public void LLD(String str) {
        this.mFrom = str;
    }

    public final void LLF(int i) {
        this.mPageType = i;
    }

    public final void LLFF(String str) {
        this.mPreviousPage = str;
    }

    public final void setEnterMethod(String str) {
        this.mEnterMethodValue = str;
    }

    public BaseController(String str, int i) {
        this.mEventType = str;
        this.mPageType = i;
    }

    public void onAttach(Activity activity, Fragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }
}
