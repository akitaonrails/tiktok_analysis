package com.ss.android.ugc.aweme.minis.payment.qcpx;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisCouponAssem$onCreate$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IMinisTimingProtocol.class, null);
        }
    }
}
