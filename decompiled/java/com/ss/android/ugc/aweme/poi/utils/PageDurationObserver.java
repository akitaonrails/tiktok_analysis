package com.ss.android.ugc.aweme.poi.utils;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes.dex */
public final class PageDurationObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Function1<Long, Unit> LL;
    public final Function1<Long, Unit> LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;

    public PageDurationObserver() {
        this(null, 3);
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
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZIL = System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        Function1<Long, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(Long.valueOf(this.LLILZ));
        }
        Function1<Long, Unit> function12 = this.LLILLJJLI;
        if (function12 != null) {
            function12.invoke(Long.valueOf(System.currentTimeMillis() - this.LLILZIL));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLILZ += System.currentTimeMillis() - this.LLILLL;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILLL = System.currentTimeMillis();
    }

    public PageDurationObserver(AwS597S0100000_18 awS597S0100000_18, int i) {
        this.LL = (i & 1) != 0 ? null : awS597S0100000_18;
        this.LLILLJJLI = null;
    }
}
