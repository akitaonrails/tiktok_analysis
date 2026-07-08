package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.addyours.mob.IAddYoursBottomButtonProtocol;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursEntranceButtonAssem$onViewCreated$lambda$1$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IAddYoursBottomButtonProtocol.class, null);
        }
    }
}
