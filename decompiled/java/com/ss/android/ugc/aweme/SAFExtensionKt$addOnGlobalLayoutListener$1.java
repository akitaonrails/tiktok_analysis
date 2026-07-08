package com.ss.android.ugc.aweme;

import X.C356901a3;
import X.C786410Ut5;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes5.dex */
public final class SAFExtensionKt$addOnGlobalLayoutListener$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ViewTreeObserver LL;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener LLILLJJLI;

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
        C356901a3.LIZIZ(this, lifecycleOwner);
        ViewTreeObserver viewTreeObserver = this.LL;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLILLJJLI;
        if (viewTreeObserver.isAlive()) {
            C786410Ut5.C3(viewTreeObserver, onGlobalLayoutListener);
        }
    }

    public SAFExtensionKt$addOnGlobalLayoutListener$1(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.LL = viewTreeObserver;
        this.LLILLJJLI = onGlobalLayoutListener;
    }
}
