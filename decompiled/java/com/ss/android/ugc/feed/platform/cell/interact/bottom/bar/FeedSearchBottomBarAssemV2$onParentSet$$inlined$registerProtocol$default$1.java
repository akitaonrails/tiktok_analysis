package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSearchBottomBarAssemV2$onParentSet$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, DescExpandModeProtocol.class, null);
        }
    }
}
