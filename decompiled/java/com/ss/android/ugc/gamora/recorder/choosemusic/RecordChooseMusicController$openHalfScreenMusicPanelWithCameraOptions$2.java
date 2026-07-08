package com.ss.android.ugc.gamora.recorder.choosemusic;

import X.C268030Aev;
import X.C356901a3;
import X.InterfaceC1459070o4X;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes28.dex */
public final class RecordChooseMusicController$openHalfScreenMusicPanelWithCameraOptions$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ RecordChooseMusicController LL;

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

    public RecordChooseMusicController$openHalfScreenMusicPanelWithCameraOptions$2(RecordChooseMusicController recordChooseMusicController) {
        this.LL = recordChooseMusicController;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        InterfaceC1459070o4X interfaceC1459070o4X = this.LL.LLJJIJIIJIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.destroy();
        }
        if (((Boolean) C268030Aev.LIZ.getValue()).booleanValue()) {
            this.LL.LIZ().onDestroy();
        }
    }
}
