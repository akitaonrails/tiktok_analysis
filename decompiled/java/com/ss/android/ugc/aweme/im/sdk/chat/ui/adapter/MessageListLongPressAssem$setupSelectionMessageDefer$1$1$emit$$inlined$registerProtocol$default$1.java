package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageListLongPressAssem$setupSelectionMessageDefer$1$1$emit$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IMessageEventProtocol.class, null);
        }
    }
}
