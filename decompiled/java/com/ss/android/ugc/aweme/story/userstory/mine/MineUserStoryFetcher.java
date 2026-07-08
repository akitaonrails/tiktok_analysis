package com.ss.android.ugc.aweme.story.userstory.mine;

import X.C1615006Ua;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public final class MineUserStoryFetcher implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public static Aweme LIZ() {
        C1615006Ua.LIZ.getClass();
        if (C1615006Ua.LIZIZ == null) {
            C1615006Ua.LIZIZ = C1615006Ua.LIZIZ();
        }
        return C1615006Ua.LIZIZ.m199clone().m199clone();
    }
}
