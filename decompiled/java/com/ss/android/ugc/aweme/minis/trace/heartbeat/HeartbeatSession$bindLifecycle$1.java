package com.ss.android.ugc.aweme.minis.trace.heartbeat;

import X.C08C6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class HeartbeatSession$bindLifecycle$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C08C6.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    throw null;
                }
            }
            throw null;
        }
        throw null;
    }
}
