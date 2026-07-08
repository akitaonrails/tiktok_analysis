package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomBarAssem$onCreate$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IDetailBottomProtocol.class, null);
        }
    }
}
