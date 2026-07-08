package com.ss.android.ugc.aweme.im.creative.common.api.camera;

import X.C1621980sJI;
import X.C1AM5;
import X.C356901a3;
import X.InterfaceC1625060sOG;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes32.dex */
public final class IMEffectsBridge$wireLandmarkListener$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ InterfaceC1625060sOG LL;
    public final /* synthetic */ C1AM5 LLILLJJLI;

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
        this.LL.Sa(this.LLILLJJLI);
    }

    public IMEffectsBridge$wireLandmarkListener$1(InterfaceC1625060sOG interfaceC1625060sOG, C1621980sJI c1621980sJI) {
        this.LL = interfaceC1625060sOG;
        this.LLILLJJLI = c1621980sJI;
    }
}
