package com.ss.android.ugc.aweme.localservice.optimistic;

import X.C0OAA;
import X.C356901a3;
import X.InterfaceC1631620sYq;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoLikeService$like$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C0OAA<Function2<Boolean, Boolean, Unit>> LL;
    public final /* synthetic */ C0OAA<InterfaceC1631620sYq<Boolean, Boolean, Throwable, Unit>> LLILLJJLI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.LIZ = null;
        this.LLILLJJLI.LIZ = null;
    }

    public VideoLikeService$like$1(C0OAA<Function2<Boolean, Boolean, Unit>> c0oaa, C0OAA<InterfaceC1631620sYq<Boolean, Boolean, Throwable, Unit>> c0oaa2) {
        this.LL = c0oaa;
        this.LLILLJJLI = c0oaa2;
    }
}
