package com.ss.android.ugc.tiktok.addyours.service;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.addyours.mob.invite.IAddYoursInviteEventProtocol;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursInviteBehavior$initScope$$inlined$registerProtocol$default$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IAddYoursInviteEventProtocol.class, null);
        }
    }
}
