package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark;

import X.C1326490kch;
import X.C1546290qLD;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeLynxCell$createViewHolder$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ PdpSparkLiteCardHolder LL;

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

    public PdpBridgeLynxCell$createViewHolder$1$1(PdpSparkLiteCardHolder pdpSparkLiteCardHolder) {
        this.LL = pdpSparkLiteCardHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C1546290qLD c1546290qLD = this.LL.LLJJJJ;
        if (c1546290qLD != null) {
            c1546290qLD.LIZ();
        }
        C1326490kch.LJI("PdpLynxCardHolder, released");
    }
}
