package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base;

import X.C356901a3;
import X.C897520ZIw;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public final class CommonMessageListConfigKt$insertExplainPublicActivityStatusConfig$1$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C897520ZIw LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public CommonMessageListConfigKt$insertExplainPublicActivityStatusConfig$1$2(C897520ZIw c897520ZIw) {
        this.LL = c897520ZIw;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C897520ZIw c897520ZIw = this.LL;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C897520ZIw c897520ZIw = this.LL;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C897520ZIw c897520ZIw = this.LL;
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
    }
}
