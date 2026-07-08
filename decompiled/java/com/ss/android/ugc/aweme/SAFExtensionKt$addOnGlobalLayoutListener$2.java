package com.ss.android.ugc.aweme;

import X.C19EG;
import X.C356901a3;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class SAFExtensionKt$addOnGlobalLayoutListener$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ViewTreeObserver LL;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

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
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        C356901a3.LIZIZ(this, lifecycleOwner);
        if (this.LL.isAlive()) {
            C786410Ut5.C3(this.LL, this.LLILLJJLI);
            return;
        }
        C19EG activity = this.LLILLL.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        C786410Ut5.C3(viewTreeObserver, this.LLILLJJLI);
    }

    public SAFExtensionKt$addOnGlobalLayoutListener$2(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, Fragment fragment) {
        this.LL = viewTreeObserver;
        this.LLILLJJLI = onGlobalLayoutListener;
        this.LLILLL = fragment;
    }
}
