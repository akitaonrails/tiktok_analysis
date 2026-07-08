package com.bytedance.common.jato.gc;

import X.C08U0;
import X.C08U1;
import X.C2104908Ml;
import X.C786410Ut5;
import Y.ARunnableS103S0100000_3;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class GCMonitor {
    public static C08U1 LJIIIIZZ;
    public final boolean LIZ;
    public HandlerThread LIZIZ;
    public C08U0[] LIZJ = new C08U0[1];
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicInteger LJ = new AtomicInteger(0);
    public C08U0[] LJFF = new C08U0[1];
    public final AtomicInteger LJI = new AtomicInteger(0);
    public final AtomicInteger LJII = new AtomicInteger(0);

    private native boolean init(int i);

    private native void notifyJavaCallbackCountChange(int i, int i2, int i3, int i4);

    private native boolean registerCallbackPtr(long j, long j2, long j3, boolean z);

    private native void setForceClearSoft(boolean z);

    private native boolean unregisterCallbackPtr(long j, long j2, long j3, boolean z);

    public native void initNotificationInWorkingThread();

    public final void LIZIZ() {
        if (this.LIZIZ == null) {
            C08U1 c08u1 = LJIIIIZZ;
            if (c08u1.LIZ == null) {
                HandlerThread handlerThread = new HandlerThread("gc_notification");
                c08u1.LIZ = handlerThread;
                handlerThread.start();
            }
            HandlerThread handlerThread2 = c08u1.LIZ;
            C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(handlerThread2)), new ARunnableS103S0100000_3(this, 20));
            this.LIZIZ = handlerThread2;
        }
    }

    public GCMonitor() {
        if (LJIIIIZZ == null) {
            LJIIIIZZ = new C08U1();
        }
        this.LIZ = C2104908Ml.LIZIZ() && init(7);
    }

    public final void LIZ(C08U0 c08u0) {
        synchronized (this) {
            if (c08u0 != null) {
                if (this.LIZ) {
                    C08U0[] c08u0Arr = this.LJFF;
                    AtomicInteger atomicInteger = this.LJI;
                    AtomicInteger atomicInteger2 = this.LJII;
                    int i = atomicInteger.get();
                    if (i == c08u0Arr.length) {
                        C08U0[] c08u0Arr2 = new C08U0[i * 2];
                        System.arraycopy(c08u0Arr, 0, c08u0Arr2, 0, i);
                        c08u0Arr = c08u0Arr2;
                    } else {
                        if (i > c08u0Arr.length) {
                        }
                    }
                    c08u0Arr[i] = c08u0;
                    if (atomicInteger.compareAndSet(i, i + 1)) {
                        if (!c08u0.callbackOnMainThreadWaitOnly()) {
                            atomicInteger2.incrementAndGet();
                        }
                        if (c08u0Arr != this.LJFF) {
                            this.LJFF = c08u0Arr;
                        }
                        LIZIZ();
                        notifyJavaCallbackCountChange(this.LIZLLL.get(), this.LJI.get(), this.LJ.get(), this.LJII.get());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r2 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        r1 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r5.compareAndSet(r3, r1) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r8.callbackOnMainThreadWaitOnly() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        r4.decrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r2 >= r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r6[r2] = r6[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        LIZIZ();
        notifyJavaCallbackCountChange(r7.LIZLLL.get(), r7.LJI.get(), r7.LJ.get(), r7.LJII.get());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C08U0 r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L5b
            boolean r0 = r7.LIZ     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L5b
            X.08U0[] r6 = r7.LJFF     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r5 = r7.LJI     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r4 = r7.LJII     // Catch: java.lang.Throwable -> L58
            int r3 = r5.get()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L56
            r2 = 0
        L14:
            r1 = -1
            if (r2 >= r3) goto L56
            r0 = r6[r2]     // Catch: java.lang.Throwable -> L58
            if (r0 != r8) goto L1c
            goto L1f
        L1c:
            int r2 = r2 + 1
            goto L14
        L1f:
            if (r2 == r1) goto L56
            int r1 = r3 + (-1)
            boolean r0 = r5.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L56
            boolean r0 = r8.callbackOnMainThreadWaitOnly()     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L32
            r4.decrementAndGet()     // Catch: java.lang.Throwable -> L58
        L32:
            if (r2 >= r1) goto L38
            r0 = r6[r1]     // Catch: java.lang.Throwable -> L58
            r6[r2] = r0     // Catch: java.lang.Throwable -> L58
        L38:
            r7.LIZIZ()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r0 = r7.LIZLLL     // Catch: java.lang.Throwable -> L58
            int r3 = r0.get()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r0 = r7.LJI     // Catch: java.lang.Throwable -> L58
            int r2 = r0.get()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r0 = r7.LJ     // Catch: java.lang.Throwable -> L58
            int r1 = r0.get()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.atomic.AtomicInteger r0 = r7.LJII     // Catch: java.lang.Throwable -> L58
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L58
            r7.notifyJavaCallbackCountChange(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r7)
            return
        L58:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L5b:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.gc.GCMonitor.LIZJ(X.08U0):void");
    }

    private synchronized void dispatchGCStart(boolean z, int i, int i2, int i3) {
        C08U0[] c08u0Arr;
        AtomicInteger atomicInteger;
        if (z) {
            c08u0Arr = this.LJFF;
            atomicInteger = this.LJI;
        } else {
            c08u0Arr = this.LIZJ;
            atomicInteger = this.LIZLLL;
        }
        int i4 = atomicInteger.get();
        for (int i5 = 0; i5 < i4; i5++) {
            C08U0 c08u0 = c08u0Arr[i5];
            if (c08u0 != null) {
                c08u0.onGCStart(i, i2, i3);
            }
        }
    }

    private synchronized void dispatchWaitGC(boolean z, boolean z2, int i, int i2, int i3) {
        C08U0[] c08u0Arr;
        AtomicInteger atomicInteger;
        if (z) {
            c08u0Arr = this.LJFF;
            atomicInteger = this.LJI;
        } else {
            c08u0Arr = this.LIZJ;
            atomicInteger = this.LIZLLL;
        }
        int i4 = atomicInteger.get();
        for (int i5 = 0; i5 < i4; i5++) {
            C08U0 c08u0 = c08u0Arr[i5];
            if (c08u0 != null && (!c08u0.callbackOnMainThreadWaitOnly() || z2)) {
                c08u0.onWaitGc(i, i2, i3);
            }
        }
    }

    private synchronized void dispatchGCEnd(boolean z, int i, int i2, int i3, long j, boolean z2, long j2, long j3, long j4, long j5, long j6) {
        C08U0[] c08u0Arr;
        AtomicInteger atomicInteger;
        if (z) {
            c08u0Arr = this.LJFF;
            atomicInteger = this.LJI;
        } else {
            c08u0Arr = this.LIZJ;
            atomicInteger = this.LIZLLL;
        }
        int i4 = atomicInteger.get();
        for (int i5 = 0; i5 < i4; i5++) {
            C08U0 c08u0 = c08u0Arr[i5];
            if (c08u0 != null) {
                c08u0.onGCEnd(i, i2, i3, j, z2, j2, j3, j4, j5, j6);
            }
        }
    }
}
