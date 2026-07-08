package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C356901a3;
import X.ViewTreeObserverOnGlobalFocusChangeListenerC895803em;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class CCDCAddCardHalfFragment$initKeyboardFloatingWindow$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ViewTreeObserver.OnGlobalFocusChangeListener LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (this.LL.getViewTreeObserver().isAlive()) {
            this.LL.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.LLILLJJLI);
        }
    }

    public CCDCAddCardHalfFragment$initKeyboardFloatingWindow$2(View view, ViewTreeObserverOnGlobalFocusChangeListenerC895803em viewTreeObserverOnGlobalFocusChangeListenerC895803em) {
        this.LL = view;
        this.LLILLJJLI = viewTreeObserverOnGlobalFocusChangeListenerC895803em;
    }
}
