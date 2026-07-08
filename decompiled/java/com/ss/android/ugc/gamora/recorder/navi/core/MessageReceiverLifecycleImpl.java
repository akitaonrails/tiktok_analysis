package com.ss.android.ugc.gamora.recorder.navi.core;

import X.C20672087y;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;

/* JADX INFO: loaded from: classes30.dex */
public final class MessageReceiverLifecycleImpl extends C20672087y implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onDestroy() {
        MessageCenter.removeListener(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        MessageCenter.addListener(this);
    }

    public MessageReceiverLifecycleImpl(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }
}
