package com.ss.android.ugc.aweme.tako.botpage.components.userlist;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoSubCardScrollProtocol;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoUserListAssem$onViewCreated$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, ITakoSubCardScrollProtocol.class, null);
        }
    }
}
