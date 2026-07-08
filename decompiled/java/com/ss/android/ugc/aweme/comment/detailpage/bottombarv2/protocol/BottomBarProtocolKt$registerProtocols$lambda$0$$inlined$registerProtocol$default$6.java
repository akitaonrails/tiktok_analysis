package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class BottomBarProtocolKt$registerProtocols$lambda$0$$inlined$registerProtocol$default$6 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, BottomBarProtocol.class, null);
        }
    }
}
