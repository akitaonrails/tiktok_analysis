package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base;

import X.AnonymousClass0956;
import X.C01S9;
import X.C2252331DDr;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class EventReceiver<T> implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C01S9<T> LL;
    public final Lifecycle LLILLJJLI;
    public final ConcurrentHashMap<Integer, Function1<T, Unit>> LLILLL = new ConcurrentHashMap<>();
    public AnonymousClass0956 LLILZ;
    public final boolean LLILZIL;
    public boolean LLILZLL;

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
        this.LLILLJJLI.removeObserver(this);
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL.clear();
        this.LLILZLL = true;
    }

    public EventReceiver(C2252331DDr c2252331DDr, Lifecycle lifecycle) {
        this.LL = c2252331DDr;
        this.LLILLJJLI = lifecycle;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            this.LLILZIL = true;
            this.LLILZLL = true;
        } else {
            lifecycle.addObserver(this);
        }
    }
}
