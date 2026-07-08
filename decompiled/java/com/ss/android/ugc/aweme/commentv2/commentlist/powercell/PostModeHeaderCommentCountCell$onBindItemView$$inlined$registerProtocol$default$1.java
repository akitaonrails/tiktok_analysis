package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.api.IPostModePageScrollStateProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class PostModeHeaderCommentCountCell$onBindItemView$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, IPostModePageScrollStateProtocol.class, null);
        }
    }
}
