package com.ss.android.ugc.aweme.services;

import X.C0XTR;
import X.InterfaceC1136104cR;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BasePasswordService implements InterfaceC1136104cR, GenericLifecycleObserver {
    public Set<Integer> actionSet = new HashSet(Arrays.asList(8, 13, 17));
    public boolean mKeepCallback;
    public LifecycleOwner mLifeOwner;
    public C0XTR mResult;

    public InterfaceC1136104cR keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1136104cR
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        C0XTR c0xtr;
        if (this.actionSet.contains(Integer.valueOf(i)) && (c0xtr = this.mResult) != null) {
            c0xtr.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1136104cR
    public void setPassword(Activity activity, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1136104cR
    public void verifyPassword(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1136104cR
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }
}
