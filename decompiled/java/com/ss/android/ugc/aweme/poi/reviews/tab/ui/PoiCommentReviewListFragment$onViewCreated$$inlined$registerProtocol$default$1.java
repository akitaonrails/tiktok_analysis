package com.ss.android.ugc.aweme.poi.reviews.tab.ui;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;

/* JADX INFO: loaded from: classes13.dex */
public final class PoiCommentReviewListFragment$onViewCreated$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, ICommentPageReusedProtocol.class, null);
        }
    }
}
