package com.ss.android.ugc.aweme.utils;

import X.C013C;
import X.C20656615sK;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraWidgetManager$showAddToHomeWidget$1$showPopup$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C20656615sK LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
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
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.LL.element = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.LL.element && !this.LLILLJJLI.element) {
            this.LLILLL.LIZ();
            this.LLILLJJLI.element = true;
        }
    }

    public CameraWidgetManager$showAddToHomeWidget$1$showPopup$1(C013C c013c, C013C c013c2, C20656615sK c20656615sK) {
        this.LL = c013c;
        this.LLILLJJLI = c013c2;
        this.LLILLL = c20656615sK;
    }
}
