package kotlinx.coroutines.scheduling;

import X.C09AU;
import X.C139N;
import X.C1DDO;
import X.C1DDP;
import X.C1DEY;
import X.C1DF3;
import X.C1DF9;
import X.C1DFC;
import X.C1DFE;
import X.C2188811AlT;
import X.C2239208py;
import X.C2252481DEg;
import X.C2252691DFb;
import X.C2252751DFh;
import X.C786410Ut5;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public volatile int _isTerminated;
    public volatile long controlState;
    public final int corePoolSize;
    public final C2252691DFb globalBlockingQueue;
    public final C2252691DFb globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    public volatile long parkedWorkersStack;
    public final String schedulerName;
    public final C139N<C1DF3> workers;
    public static final C2252751DFh Companion = new Object() { // from class: X.1DFh
    };
    public static final AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    public static final AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    public static final C09AU NOT_IN_STACK = new C09AU("NOT_IN_STACK");

    private final int blockingTasks(long j) {
        return (int) ((j & 4398044413952L) >> 21);
    }

    private final int createdWorkers(long j) {
        return (int) (j & 2097151);
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final int availableCpuPermits(long j) {
        return (int) ((j & 9223367638808264704L) >> 42);
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.workers.LIZIZ(i3) != null) {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            C1DF3 c1df3 = new C1DF3(this, i3);
            this.workers.LIZJ(i3, c1df3);
            if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            c1df3.start();
            return i4;
        }
    }

    private final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, -2097152L);
    }

    private final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$FU.get(this) & 9223367638808264704L) >> 42);
    }

    private final int getCreatedWorkers() {
        return (int) (controlState$FU.get(this) & 2097151);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152L);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    private final C1DF3 parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C1DF3 c1df3LIZIZ = this.workers.LIZIZ((int) (2097151 & j));
            if (c1df3LIZIZ == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(c1df3LIZIZ);
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, ((long) iParkedWorkersStackNextIndex) | j2)) {
                c1df3LIZIZ.nextParkedWorker = NOT_IN_STACK;
                return c1df3LIZIZ;
            }
        }
    }

    private final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    private final boolean tryAcquireCpuPermit() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        shutdown(10000L);
    }

    public final boolean isTerminated() {
        return _isTerminated$FU.get(this) != 0;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iLIZ = this.workers.LIZ();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iLIZ; i6++) {
            C1DF3 c1df3LIZIZ = this.workers.LIZIZ(i6);
            if (c1df3LIZIZ != null) {
                C1DEY c1dey = c1df3LIZIZ.LL;
                c1dey.getClass();
                int i7 = C1DEY.LIZIZ.get(c1dey) != null ? (C1DEY.LIZJ.get(c1dey) - C1DEY.LIZLLL.get(c1dey)) + 1 : C1DEY.LIZJ.get(c1dey) - C1DEY.LIZLLL.get(c1dey);
                int i8 = C1DFE.LIZ[c1df3LIZIZ.LLILLL.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i7);
                    sbLIZ.append('b');
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i7);
                    sbLIZ2.append('c');
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                } else if (i8 == 4) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(i7);
                        sbLIZ3.append('d');
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else if (i8 == 5) {
                    i5++;
                }
            }
        }
        long j = controlState$FU.get(this);
        return this.schedulerName + '@' + C2239208py.LIZ(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + LIZJ() + ", global blocking queue size = " + LIZJ() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    private final C1DF3 currentWorker() {
        C1DF3 c1df3;
        Thread threadU3 = C786410Ut5.u3();
        if ((threadU3 instanceof C1DF3) && (c1df3 = (C1DF3) threadU3) != null && Intrinsics.LJFF(c1df3.LLIZLLLIL, this)) {
            return c1df3;
        }
        return null;
    }

    private final boolean tryUnpark() {
        C1DF3 c1df3ParkedWorkersStackPop;
        do {
            c1df3ParkedWorkersStackPop = parkedWorkersStackPop();
            if (c1df3ParkedWorkersStackPop == null) {
                return false;
            }
        } while (!C1DF3.LLJ.compareAndSet(c1df3ParkedWorkersStackPop, -1, 0));
        LockSupport.unpark(c1df3ParkedWorkersStackPop);
        return true;
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    private final boolean addToGlobalQueue(C1DDP c1ddp) {
        if (c1ddp.LLILLJJLI.LIZ() == 1) {
            return LIZ(c1ddp);
        }
        return LIZ(c1ddp);
    }

    private final int parkedWorkersStackNextIndex(C1DF3 c1df3) {
        Object obj = c1df3.nextParkedWorker;
        while (obj != NOT_IN_STACK) {
            if (obj == null) {
                return 0;
            }
            C1DF3 c1df32 = (C1DF3) obj;
            int i = c1df32.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = c1df32.nextParkedWorker;
        }
        return -1;
    }

    private final boolean tryCreateWorker(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1) {
                if (this.corePoolSize > 1) {
                    createNewWorker();
                }
                return true;
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    public final boolean parkedWorkersStackPush(C1DF3 c1df3) {
        long j;
        int i;
        if (c1df3.nextParkedWorker != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            i = c1df3.indexInArray;
            c1df3.nextParkedWorker = this.workers.LIZIZ((int) (2097151 & j));
        } while (!parkedWorkersStack$FU.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) i)));
        return true;
    }

    public final void runSafely(C1DDP c1ddp) {
        try {
            c1ddp.run();
        } catch (Throwable th) {
            Thread threadU3 = C786410Ut5.u3();
            threadU3.getUncaughtExceptionHandler().uncaughtException(threadU3, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void shutdown(long r9) throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU
            r0 = 0
            r5 = 1
            boolean r0 = r1.compareAndSet(r8, r0, r5)
            if (r0 != 0) goto Lb
            return
        Lb:
            X.1DF3 r4 = r8.currentWorker()
            X.139N<X.1DF3> r6 = r8.workers
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L98
            long r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L98
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r7 = (int) r0
            monitor-exit(r6)
            if (r5 > r7) goto L5a
            r6 = 1
        L21:
            X.139N<X.1DF3> r0 = r8.workers
            java.lang.Object r1 = r0.LIZIZ(r6)
            X.1DF3 r1 = (X.C1DF3) r1
            if (r1 == r4) goto L55
        L2b:
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L38
            java.util.concurrent.locks.LockSupport.unpark(r1)
            r1.join(r9)
            goto L2b
        L38:
            X.1DEY r3 = r1.LL
            X.1DFb r2 = r8.globalBlockingQueue
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C1DEY.LIZIZ
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r3, r0)
            if (r0 == 0) goto L4b
            r2.LIZ(r0)
        L4b:
            X.1DDP r0 = r3.LIZIZ()
            if (r0 == 0) goto L55
            r2.LIZ(r0)
            goto L4b
        L55:
            if (r6 == r7) goto L5a
            int r6 = r6 + 1
            goto L21
        L5a:
            X.1DFb r0 = r8.globalBlockingQueue
            r0.LIZIZ()
            X.1DFb r0 = r8.globalCpuQueue
            r0.LIZIZ()
        L64:
            if (r4 == 0) goto L6c
            X.1DDP r0 = r4.LIZJ(r5)
            if (r0 != 0) goto L94
        L6c:
            X.1DFb r0 = r8.globalCpuQueue
            java.lang.Object r0 = r0.LIZLLL()
            X.1DDP r0 = (X.C1DDP) r0
            if (r0 != 0) goto L94
            X.1DFb r0 = r8.globalBlockingQueue
            java.lang.Object r0 = r0.LIZLLL()
            X.1DDP r0 = (X.C1DDP) r0
            if (r0 != 0) goto L94
            if (r4 == 0) goto L87
            X.1DF9 r0 = X.C1DF9.TERMINATED
            r4.LJIIIIZZ(r0)
        L87:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r0.set(r8, r1)
            return
        L94:
            r8.runSafely(r0)
            goto L64
        L98:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.shutdown(long):void");
    }

    private final void signalBlockingWork(long j, boolean z) {
        if (z || tryUnpark() || tryCreateWorker(j)) {
            return;
        }
        tryUnpark();
    }

    public final C1DDP createTask(final Runnable runnable, final C1DDO c1ddo) {
        C1DFC.LJFF.getClass();
        final long jNanoTime = System.nanoTime();
        if (runnable instanceof C1DDP) {
            C1DDP c1ddp = (C1DDP) runnable;
            c1ddp.LL = jNanoTime;
            c1ddp.LLILLJJLI = c1ddo;
            return c1ddp;
        }
        return new C1DDP(runnable, jNanoTime, c1ddo) { // from class: X.1DDN
            public final Runnable LLILLL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        this.LLILLL.run();
                    } finally {
                        this.LLILLJJLI.LIZIZ();
                    }
                } catch (Throwable th) {
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Task[");
                sbLIZ.append(this.LLILLL.getClass().getSimpleName());
                sbLIZ.append('@');
                sbLIZ.append(C2239208py.LIZ(this.LLILLL));
                sbLIZ.append(", ");
                sbLIZ.append(this.LL);
                sbLIZ.append(", ");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(']');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(jNanoTime, c1ddo);
                this.LLILLL = runnable;
            }
        };
    }

    private final C1DDP submitToLocalQueue(C1DF3 c1df3, C1DDP c1ddp, boolean z) {
        if (c1df3 == null || c1df3.LLILLL == C1DF9.TERMINATED) {
            return c1ddp;
        }
        if (c1ddp.LLILLJJLI.LIZ() == 0 && c1df3.LLILLL == C1DF9.BLOCKING) {
            return c1ddp;
        }
        c1df3.LLIZ = true;
        C1DEY c1dey = c1df3.LL;
        if (z) {
            return c1dey.LIZ(c1ddp);
        }
        c1dey.getClass();
        C1DDP c1ddp2 = (C1DDP) C1DEY.LIZIZ.getAndSet(c1dey, c1ddp);
        if (c1ddp2 == null) {
            return null;
        }
        return c1dey.LIZ(c1ddp2);
    }

    public final void dispatch(Runnable runnable, C1DDO c1ddo, boolean z) {
        boolean z2;
        long jAddAndGet;
        C1DDP c1ddpCreateTask = createTask(runnable, c1ddo);
        boolean z3 = false;
        if (c1ddpCreateTask.LLILLJJLI.LIZ() == 1) {
            z2 = true;
            jAddAndGet = controlState$FU.addAndGet(this, 2097152L);
        } else {
            z2 = false;
            jAddAndGet = 0;
        }
        C1DF3 c1df3CurrentWorker = currentWorker();
        C1DDP c1ddpSubmitToLocalQueue = submitToLocalQueue(c1df3CurrentWorker, c1ddpCreateTask, z);
        if (c1ddpSubmitToLocalQueue != null && !addToGlobalQueue(c1ddpSubmitToLocalQueue)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.schedulerName);
            sbLIZ.append(" was terminated");
            throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z && c1df3CurrentWorker != null) {
            z3 = true;
        }
        if (z2) {
            signalBlockingWork(jAddAndGet, z3);
        } else {
            if (z3) {
                return;
            }
            signalCpuWork();
        }
    }

    public final void parkedWorkersStackTopUpdate(C1DF3 c1df3, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iParkedWorkersStackNextIndex == i) {
                if (i2 == 0) {
                    iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(c1df3);
                } else {
                    iParkedWorkersStackNextIndex = i2;
                }
            }
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, j2 | ((long) iParkedWorkersStackNextIndex))) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1DFb] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.1DFb] */
    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i >= 1) {
            if (i2 >= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.globalCpuQueue = new C2252481DEg<C1DDP>() { // from class: X.1DFb
                        };
                        this.globalBlockingQueue = new C2252481DEg<C1DDP>() { // from class: X.1DFb
                        };
                        this.workers = new C139N<>((i + 1) * 2);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Idle worker keep alive time ");
                    sbLIZ.append(j);
                    sbLIZ.append(" must be positive");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Max pool size ");
                sbLIZ2.append(i2);
                sbLIZ2.append(" should not exceed maximal supported number of threads 2097150");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Max pool size ");
            sbLIZ3.append(i2);
            sbLIZ3.append(" should be greater than or equals to core pool size ");
            sbLIZ3.append(i);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            strLIZIZ3.toString();
            throw new IllegalArgumentException(strLIZIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Core pool size ");
        sbLIZ4.append(i);
        sbLIZ4.append(" should be at least 1");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        strLIZIZ4.toString();
        throw new IllegalArgumentException(strLIZIZ4);
    }

    public static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = controlState$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j);
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? C1DFC.LJ : j, (i3 & 8) != 0 ? C1DFC.LIZ : str);
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, C1DDO c1ddo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            c1ddo = C1DFC.LJI;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, c1ddo, z);
    }
}
