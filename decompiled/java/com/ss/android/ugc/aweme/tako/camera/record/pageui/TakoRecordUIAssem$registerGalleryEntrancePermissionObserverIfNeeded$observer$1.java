package com.ss.android.ugc.aweme.tako.camera.record.pageui;

import X.C356901a3;
import X.C540120LGg;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TakoRecordUIAssem LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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

    public TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1(TakoRecordUIAssem takoRecordUIAssem) {
        this.LL = takoRecordUIAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (!this.LL.LLJLIL) {
            return;
        }
        if (!C540120LGg.LIZLLL() && !C540120LGg.LJ()) {
            return;
        }
        TakoRecordUIAssem takoRecordUIAssem = this.LL;
        takoRecordUIAssem.LLJLIL = false;
        View view = takoRecordUIAssem.LLJL;
        if (view != null) {
            takoRecordUIAssem.tp(view);
        }
    }
}
