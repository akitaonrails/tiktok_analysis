package com.ss.android.ugc.aweme.live.smoothhost;

import X.AnonymousClass0956;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OpenLivePreparationTask$prepare$currentObserver$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ OpenLivePreparationTask LL;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public OpenLivePreparationTask$prepare$currentObserver$1$1(OpenLivePreparationTask openLivePreparationTask) {
        this.LL = openLivePreparationTask;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.getClass();
        ((ArrayList) OpenLivePreparationTask.LIZLLL).clear();
        OpenLivePreparationTask.LJI = null;
        AnonymousClass0956 anonymousClass0956 = OpenLivePreparationTask.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        OpenLivePreparationTask.LJII = null;
        ((LinkedHashMap) OpenLivePreparationTask.LJ).clear();
        OpenLivePreparationTask.LJIIIIZZ = null;
        OpenLivePreparationTask.LJFF = null;
        OpenLivePreparationTask.LJIIIZ = null;
    }
}
