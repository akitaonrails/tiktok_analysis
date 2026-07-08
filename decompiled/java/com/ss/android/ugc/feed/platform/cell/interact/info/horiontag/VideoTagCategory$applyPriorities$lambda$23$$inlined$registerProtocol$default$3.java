package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoTagCategory$applyPriorities$lambda$23$$inlined$registerProtocol$default$3 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, VideoTagCategoryProtocol.class, null);
        }
    }
}
