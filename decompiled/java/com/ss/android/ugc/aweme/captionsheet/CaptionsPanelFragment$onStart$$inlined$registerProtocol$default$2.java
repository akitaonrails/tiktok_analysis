package com.ss.android.ugc.aweme.captionsheet;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;

/* JADX INFO: loaded from: classes12.dex */
public final class CaptionsPanelFragment$onStart$$inlined$registerProtocol$default$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, ETParamsProvider.class, null);
        }
    }
}
