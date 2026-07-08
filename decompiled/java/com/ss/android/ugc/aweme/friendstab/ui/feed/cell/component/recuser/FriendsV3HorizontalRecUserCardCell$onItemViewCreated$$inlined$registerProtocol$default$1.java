package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3HorizontalRecUserCardCell$onItemViewCreated$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, FriendsV3ViewStateProtocol.class, null);
        }
    }
}
