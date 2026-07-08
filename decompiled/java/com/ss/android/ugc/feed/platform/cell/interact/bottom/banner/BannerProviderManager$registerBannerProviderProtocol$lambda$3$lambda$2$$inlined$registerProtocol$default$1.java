package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerProviderManager$registerBannerProviderProtocol$lambda$3$lambda$2$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, FeedCommonBannerProtocol.class, null);
        }
    }
}
