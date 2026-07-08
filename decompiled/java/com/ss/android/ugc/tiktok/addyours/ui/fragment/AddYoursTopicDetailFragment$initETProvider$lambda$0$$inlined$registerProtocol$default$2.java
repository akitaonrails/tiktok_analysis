package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.addyours.mob.detail.IEnterAddYoursDetailProvider;

/* JADX INFO: loaded from: classes7.dex */
public final class AddYoursTopicDetailFragment$initETProvider$lambda$0$$inlined$registerProtocol$default$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IEnterAddYoursDetailProvider.class, null);
        }
    }
}
