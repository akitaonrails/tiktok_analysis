package com.ss.android.ugc.aweme.slash.plugin;

import X.C1558520qew;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.slash.skeleton.ISlashSkeletonSignalNotify;

/* JADX INFO: loaded from: classes3.dex */
public final class SlashSerialLoadPlugin$special$$inlined$loadAbility$default$1$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        C1558520qew.LIZ(null, ISlashSkeletonSignalNotify.class, null);
        throw null;
    }
}
