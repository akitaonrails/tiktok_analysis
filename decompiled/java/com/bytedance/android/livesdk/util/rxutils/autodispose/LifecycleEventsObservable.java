package com.bytedance.android.livesdk.util.rxutils.autodispose;

import X.C11NZ;
import X.C11PQ;
import X.C11QG;
import X.C11RC;
import X.InterfaceC626120Oh8;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes30.dex */
public final class LifecycleEventsObservable extends C11NZ<Lifecycle.Event> {
    public final Lifecycle LL;
    public final C11PQ<Lifecycle.Event> LLILLJJLI = new C11PQ<>();

    public static final class ArchLifecycleObserver extends C11RC implements LifecycleObserver {
        public final Lifecycle LLILLJJLI;
        public final InterfaceC626120Oh8<? super Lifecycle.Event> LLILLL;
        public final C11PQ<Lifecycle.Event> LLILZ;

        @Override // X.C11RC
        public final void LIZ() {
            this.LLILLJJLI.removeObserver(this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (!isDisposed()) {
                if (event != Lifecycle.Event.ON_CREATE || this.LLILZ.LJLZ() != event) {
                    this.LLILZ.onNext(event);
                }
                this.LLILLL.onNext(event);
            }
        }

        public ArchLifecycleObserver(Lifecycle lifecycle, InterfaceC626120Oh8<? super Lifecycle.Event> interfaceC626120Oh8, C11PQ<Lifecycle.Event> c11pq) {
            this.LLILLJJLI = lifecycle;
            this.LLILLL = interfaceC626120Oh8;
            this.LLILZ = c11pq;
        }
    }

    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.LL = lifecycle;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super Lifecycle.Event> interfaceC626120Oh8) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.LL, interfaceC626120Oh8, this.LLILLJJLI);
        interfaceC626120Oh8.onSubscribe(archLifecycleObserver);
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.LL.addObserver(archLifecycleObserver);
                if (archLifecycleObserver.isDisposed()) {
                    this.LL.removeObserver(archLifecycleObserver);
                    return;
                }
                return;
            }
            interfaceC626120Oh8.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw C11QG.LIZIZ(e);
        }
    }
}
