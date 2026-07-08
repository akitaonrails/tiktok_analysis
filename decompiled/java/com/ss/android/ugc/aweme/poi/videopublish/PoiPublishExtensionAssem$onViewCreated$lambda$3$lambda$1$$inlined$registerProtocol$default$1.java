package com.ss.android.ugc.aweme.poi.videopublish;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.poi.videopublish.eventtrack.IPoiPublishExtensionProvider;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishExtensionAssem$onViewCreated$lambda$3$lambda$1$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IPoiPublishExtensionProvider.class, null);
        }
    }
}
