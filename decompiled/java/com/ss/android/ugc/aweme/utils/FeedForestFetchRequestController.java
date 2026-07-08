package com.ss.android.ugc.aweme.utils;

import X.C0TCI;
import X.C1529660puO;
import X.C1533910q1F;
import X.C356901a3;
import X.C786410Ut5;
import X.EnumC742810TBv;
import X.InterfaceC469401sC;
import Y.ARunnableS45S0300000_12;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.forest.Forest;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedForestFetchRequestController implements DefaultLifecycleObserver, InterfaceC469401sC, GenericLifecycleObserver {
    public final C1529660puO LL;
    public final Forest LLILLJJLI;
    public final Lifecycle LLILLL;
    public final C0TCI LLILZ;
    public final Handler LLILZIL;
    public final AtomicBoolean LLILZLL;
    public C1533910q1F LLIZ;
    public Function1<? super File, Unit> LLIZLLLIL;
    public Function2<? super EnumC742810TBv, ? super Throwable, Unit> LLJ;

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

    public final void LIZIZ() {
        if (this.LLILZLL.get()) {
            return;
        }
        Lifecycle lifecycle = this.LLILLL;
        if ((lifecycle != null ? lifecycle.getCurrentState() : null) == Lifecycle.State.DESTROYED) {
            cancel();
            return;
        }
        Lifecycle lifecycle2 = this.LLILLL;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        this.LLILZ.onStart();
        Forest forest = this.LLILLJJLI;
        C1529660puO c1529660puO = this.LL;
        this.LLIZ = forest.fetchResourceAsync(c1529660puO.LIZJ, c1529660puO.LIZ(), new AwS591S0100000_12(this, 651));
    }

    @Override // X.InterfaceC469401sC
    public final void cancel() {
        if (this.LLILZLL.compareAndSet(false, true)) {
            C1533910q1F c1533910q1F = this.LLIZ;
            if (c1533910q1F != null) {
                c1533910q1F.LIZ();
            }
            Lifecycle lifecycle = this.LLILLL;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        cancel();
    }

    public final void LIZ(EnumC742810TBv enumC742810TBv, Throwable th) {
        if (this.LLILZLL.get()) {
            return;
        }
        C0TCI c0tci = this.LLILZ;
        C1529660puO c1529660puO = this.LL;
        String message = th.getMessage();
        if (message == null) {
            message = enumC742810TBv.name();
        }
        c0tci.LIZIZ(c1529660puO, enumC742810TBv, message);
        C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS45S0300000_12(this, enumC742810TBv, th, 17));
    }

    public FeedForestFetchRequestController(C1529660puO c1529660puO, Forest forest, Lifecycle lifecycle, C0TCI c0tci) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LL = c1529660puO;
        this.LLILLJJLI = forest;
        this.LLILLL = lifecycle;
        this.LLILZ = c0tci;
        this.LLILZIL = bPEAHandler;
        this.LLILZLL = new AtomicBoolean(false);
    }
}
