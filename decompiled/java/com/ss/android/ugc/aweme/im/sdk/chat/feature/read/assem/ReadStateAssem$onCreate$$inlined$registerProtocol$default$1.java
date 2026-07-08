package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class ReadStateAssem$onCreate$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IMessagePowerAdapterProtocol.class, null);
        }
    }
}
