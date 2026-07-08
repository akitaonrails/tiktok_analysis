package com.ss.android.ugc.aweme.config;

import X.C2187701Ajg;
import X.C356901a3;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class RootFragmentFixLeakKt$addOnGlobalLayoutListenerFixLeak$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ View LL;
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
        ViewTreeObserver viewTreeObserver = this.LL.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLILLJJLI;
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public RootFragmentFixLeakKt$addOnGlobalLayoutListenerFixLeak$2(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.LL = view;
        this.LLILLJJLI = onGlobalLayoutListener;
    }
}
