package com.ss.android.ugc.tiktok.tpsc.core.render;

import X.AbstractC191843103l;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TPSCRenderManager$buildAdapter$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ List<AbstractC191843103l> LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TPSCRenderManager$buildAdapter$1(List<? extends AbstractC191843103l> list) {
        this.LL = list;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator<AbstractC191843103l> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Iterator<AbstractC191843103l> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        Iterator<AbstractC191843103l> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ();
        }
    }
}
