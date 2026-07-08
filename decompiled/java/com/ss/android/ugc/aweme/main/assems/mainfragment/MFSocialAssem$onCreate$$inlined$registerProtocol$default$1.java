package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol;

/* JADX INFO: loaded from: classes25.dex */
public final class MFSocialAssem$onCreate$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IMFIconsProtocol.class, null);
        }
    }
}
