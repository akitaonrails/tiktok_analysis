package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class DescBottomLabelConfig$applyPriorities$lambda$6$lambda$4$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, VideoBottomLabelProtocol.class, null);
        }
    }
}
