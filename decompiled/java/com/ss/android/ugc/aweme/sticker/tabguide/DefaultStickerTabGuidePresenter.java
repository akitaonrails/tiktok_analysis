package com.ss.android.ugc.aweme.sticker.tabguide;

import X.C1627360sRy;
import X.C1627370sRz;
import X.InterfaceC1625520sP0;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes26.dex */
public final class DefaultStickerTabGuidePresenter implements LifecycleObserver, InterfaceC1625520sP0, GenericLifecycleObserver {
    @Override // X.InterfaceC1625520sP0
    public final void LIZ(C1627360sRy c1627360sRy) {
    }

    @Override // X.InterfaceC1625520sP0
    public final void LIZIZ(C1627370sRz c1627370sRz) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }
}
