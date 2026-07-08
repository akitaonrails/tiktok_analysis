package com.ss.android.ugc.aweme.multi.maker;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol;

/* JADX INFO: loaded from: classes17.dex */
public final class CommonAnchorMaker$whenMyAnchorShown$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, FlexibleSparkPreloadProtocol.class, null);
        }
    }
}
