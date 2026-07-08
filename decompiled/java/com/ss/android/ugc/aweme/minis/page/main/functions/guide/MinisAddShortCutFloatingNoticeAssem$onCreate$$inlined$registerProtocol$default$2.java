package com.ss.android.ugc.aweme.minis.page.main.functions.guide;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisAddShortCutFloatingNoticeAssem$onCreate$$inlined$registerProtocol$default$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, MinisShortCutSnackbarProtocol.class, null);
        }
    }
}
