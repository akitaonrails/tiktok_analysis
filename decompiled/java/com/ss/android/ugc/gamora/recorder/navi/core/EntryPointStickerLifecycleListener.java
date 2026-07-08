package com.ss.android.ugc.gamora.recorder.navi.core;

import X.C111X;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EntryPointStickerLifecycleListener extends C111X implements GenericLifecycleObserver {
    public final Lifecycle LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILLJJLI.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LL.invoke(Boolean.FALSE);
        MessageCenter.removeListener(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
    }

    public EntryPointStickerLifecycleListener(Lifecycle lifecycle, AwS608S0100000_29 awS608S0100000_29) {
        super(awS608S0100000_29);
        this.LLILLJJLI = lifecycle;
    }
}
