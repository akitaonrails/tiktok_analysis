package com.google.android.gms.common.api.internal;

import X.AbstractC831960WkM;
import X.AbstractC832680WlW;
import X.C0W3J;
import X.C1995607rm;
import X.C1C7U;
import X.C832300Wku;
import X.C832720Wla;
import X.InterfaceC832710WlZ;
import X.InterfaceC832820Wlk;
import X.InterfaceC832870Wlp;
import X.InterfaceC832940Wlw;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BasePendingResult<R extends InterfaceC832870Wlp> extends AbstractC832680WlW<R> {
    public static final C1995607rm LJIILIIL = new ThreadLocal<Boolean>() { // from class: X.07rm
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    public final Object LIZ;
    public final CallbackHandler<R> LIZIZ;
    public final WeakReference<AbstractC831960WkM> LIZJ;
    public final CountDownLatch LIZLLL;
    public final ArrayList<InterfaceC832820Wlk> LJ;
    public InterfaceC832710WlZ<? super R> LJFF;
    public final AtomicReference<C832300Wku> LJI;
    public R LJII;
    public Status LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C832720Wla mResultGuardian;

    public abstract R LJ(Status status);

    public final void LIZLLL() {
        synchronized (this.LIZ) {
            try {
                if (this.LJIIJ || this.LJIIIZ) {
                    return;
                }
                LJIIL(this.LJII);
                this.LJIIJ = true;
                LJIIJ(LJ(Status.RESULT_CANCELED));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJI() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LJIIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJII() {
        return this.LIZLLL.getCount() == 0;
    }

    public final R LJIIIZ() {
        R r;
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Result has already been consumed.", !this.LJIIIZ);
                C0W3J.LJIIJ("Result is not ready.", LJII());
                r = this.LJII;
                this.LJII = null;
                this.LJFF = null;
                this.LJIIIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C832300Wku andSet = this.LJI.getAndSet(null);
        if (andSet != null) {
            andSet.LIZ.LIZ.remove(this);
        }
        C0W3J.LJIIIIZZ(r);
        return r;
    }

    public final void LJIIJJI() {
        this.LJIIL = this.LJIIL || LJIILIIL.get().booleanValue();
    }

    public BasePendingResult() {
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        this.LIZIZ = new CallbackHandler<>(Looper.getMainLooper());
        this.LIZJ = new WeakReference<>(null);
    }

    public static class CallbackHandler<R extends InterfaceC832870Wlp> extends zaq {
        public CallbackHandler(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("BasePendingResult$CallbackHandler@3e52.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    C1C7U.LIZIZ("BasePendingResult$CallbackHandler@3e52.handleMessage");
                    return;
                }
                ((BasePendingResult) HandlerHook.getMessageObj(message.obj)).LJFF(Status.RESULT_TIMEOUT);
                C1C7U.LIZIZ("BasePendingResult$CallbackHandler@3e52.handleMessage");
                return;
            }
            Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
            InterfaceC832710WlZ interfaceC832710WlZ = (InterfaceC832710WlZ) pair.first;
            InterfaceC832870Wlp interfaceC832870Wlp = (InterfaceC832870Wlp) pair.second;
            try {
                interfaceC832710WlZ.LIZ(interfaceC832870Wlp);
                C1C7U.LIZIZ("BasePendingResult$CallbackHandler@3e52.handleMessage");
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                BasePendingResult.LJIIL(interfaceC832870Wlp);
                throw e;
            }
        }

        public final void LJ(InterfaceC832710WlZ<? super R> interfaceC832710WlZ, R r) {
            sendMessage(obtainMessage(1, new Pair(interfaceC832710WlZ, r)));
        }
    }

    public BasePendingResult(AbstractC831960WkM abstractC831960WkM) {
        Looper mainLooper;
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        if (abstractC831960WkM != null) {
            mainLooper = abstractC831960WkM.LJIIJ();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.LIZIZ = new CallbackHandler<>(mainLooper);
        this.LIZJ = new WeakReference<>(abstractC831960WkM);
    }

    public static void LJIIL(InterfaceC832870Wlp interfaceC832870Wlp) {
        if (interfaceC832870Wlp instanceof InterfaceC832940Wlw) {
            try {
                ((InterfaceC832940Wlw) interfaceC832870Wlp).release();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                String.valueOf(interfaceC832870Wlp);
            }
        }
    }

    @Override // X.AbstractC832680WlW
    public final void LIZIZ(InterfaceC832710WlZ<? super R> interfaceC832710WlZ) {
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Result has already been consumed.", !this.LJIIIZ);
                if (LJI()) {
                    return;
                }
                if (LJII()) {
                    this.LIZIZ.LJ(interfaceC832710WlZ, LJIIIZ());
                } else {
                    this.LJFF = interfaceC832710WlZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(InterfaceC832820Wlk interfaceC832820Wlk) {
        synchronized (this.LIZ) {
            try {
                if (LJII()) {
                    interfaceC832820Wlk.LIZ(this.LJIIIIZZ);
                } else {
                    this.LJ.add(interfaceC832820Wlk);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(Status status) {
        synchronized (this.LIZ) {
            try {
                if (!LJII()) {
                    LIZ(LJ(status));
                    this.LJIIJJI = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0WAH
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LIZ(R r) {
        synchronized (this.LIZ) {
            try {
                if (!this.LJIIJJI && !this.LJIIJ) {
                    LJII();
                    C0W3J.LJIIJ("Results have already been set", !LJII());
                    C0W3J.LJIIJ("Result has already been consumed", !this.LJIIIZ);
                    LJIIJ(r);
                    return;
                }
                LJIIL(r);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Wla] */
    public final void LJIIJ(R r) {
        this.LJII = r;
        this.LJIIIIZZ = r.getStatus();
        this.LIZLLL.countDown();
        if (this.LJIIJ) {
            this.LJFF = null;
        } else {
            InterfaceC832710WlZ<? super R> interfaceC832710WlZ = this.LJFF;
            if (interfaceC832710WlZ == null) {
                if (this.LJII instanceof InterfaceC832940Wlw) {
                    this.mResultGuardian = new Object() { // from class: X.0Wla
                        public final void finalize() throws Throwable {
                            BasePendingResult.LJIIL(this.LIZ.LJII);
                            super.finalize();
                        }
                    };
                }
            } else {
                this.LIZIZ.removeMessages(2);
                this.LIZIZ.LJ(interfaceC832710WlZ, LJIIIZ());
            }
        }
        ArrayList<InterfaceC832820Wlk> arrayList = this.LJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC832820Wlk) ListProtector.get(arrayList, i)).LIZ(this.LJIIIIZZ);
        }
        this.LJ.clear();
    }

    public BasePendingResult(Looper looper) {
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        this.LIZIZ = new CallbackHandler<>(looper);
        this.LIZJ = new WeakReference<>(null);
    }
}
