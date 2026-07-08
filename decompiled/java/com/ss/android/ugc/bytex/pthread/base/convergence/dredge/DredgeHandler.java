package com.ss.android.ugc.bytex.pthread.base.convergence.dredge;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DredgeHandler {
    public static final Companion Companion = new Companion();
    public Handler defaultHandler;
    public HandlerThread defaultHandlerThread;
    public volatile boolean enable;
    public IDredgeAbility mDredgeAbility;
    public volatile Handler mHandler;
    public long interval = 100;
    public final DredgeWorker mDredgeWorker = new DredgeWorker();
    public final AtomicInteger mDredgeState = new AtomicInteger();

    public static final class Companion {
    }

    public final class DredgeWorker implements Runnable {
        public DredgeWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("DredgeHandler$DredgeWorker@35.run");
            com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("DredgeHandler$DredgeWorker@35.run");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            if (r3.this$0.mDredgeAbility.dredge() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            r3.this$0.mDredgeState.set(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            if (r3.this$0.mDredgeAbility.prepare() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            r3.this$0.postDredgeWork();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___() {
            /*
                r3 = this;
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r1 = r0.mDredgeState
                r0 = 2
                r2 = 1
                boolean r0 = r1.compareAndSet(r0, r2)
                r1 = 0
                if (r0 == 0) goto L1d
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility r0 = r0.mDredgeAbility
                boolean r0 = r0.prepare()
                if (r0 == 0) goto L32
            L17:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                r0.postDredgeWork()
                return
            L1d:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                int r0 = r0.get()
                if (r0 != r2) goto L3a
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility r0 = r0.mDredgeAbility
                boolean r0 = r0.dredge()
                if (r0 == 0) goto L32
                goto L17
            L32:
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                r0.set(r1)
                return
            L3a:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "undesired state: "
                r1.append(r0)
                com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler r0 = com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.mDredgeState
                r1.append(r0)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler.DredgeWorker.com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___():void");
        }

        public static void com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DredgeWorker dredgeWorker) {
            try {
                dredgeWorker.com_ss_android_ugc_bytex_pthread_base_convergence_dredge_DredgeHandler$DredgeWorker__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    private final synchronized Handler getDefaultHandler() {
        Handler handler = this.defaultHandler;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("DredgeHandler");
        this.defaultHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.defaultHandlerThread;
        if (handlerThread2 == null) {
            Intrinsics.LJIIL();
        }
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread2));
        this.defaultHandler = bPEAHandler;
        return bPEAHandler;
    }

    private final synchronized void releaseDefaultHandler() {
        HandlerThread handlerThread = this.defaultHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.defaultHandlerThread = null;
        this.defaultHandler = null;
    }

    public final void bindDredgeAbility(IDredgeAbility iDredgeAbility) {
        this.mDredgeAbility = iDredgeAbility;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final void postDredgeWork() {
        Handler defaultHandler = this.mHandler;
        if (defaultHandler == null) {
            defaultHandler = getDefaultHandler();
        }
        C786410Ut5.LJLIIL(this.interval, defaultHandler, this.mDredgeWorker);
    }

    public final void requestDredgePrepare() {
        if (this.enable && this.mDredgeState.compareAndSet(0, 2)) {
            postDredgeWork();
        }
    }

    public final void setEnable(boolean z) {
        this.enable = z;
        if (z) {
            return;
        }
        releaseDefaultHandler();
    }

    public final void setHandler(Handler handler) {
        this.mHandler = handler;
        if (!Intrinsics.LJFF(this.mHandler, this.defaultHandler)) {
            releaseDefaultHandler();
        }
    }

    public final void setInterval(long j) {
        this.interval = j;
    }
}
