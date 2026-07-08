package com.ss.android.ugc.aweme.services;

import X.C0XTR;
import X.C0XTX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes14.dex */
public class BaseProAccountService implements C0XTX, GenericLifecycleObserver {
    public LifecycleOwner mLifeOwner;
    public C0XTR mResult;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C0XTX
    public void quitBusinessAccount(C0XTR c0xtr) {
    }

    public void switchBusinessAccount(String str, C0XTR c0xtr) {
    }

    @Override // X.C0XTX
    public void switchProAccount(int i, String str, String str2, int i2, C0XTR c0xtr) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        C0XTR c0xtr = this.mResult;
        if (c0xtr != null) {
            c0xtr.onResult(i, i2, obj);
        }
    }
}
