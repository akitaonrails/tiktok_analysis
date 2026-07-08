package kotlinx.coroutines;

import X.AbstractC2252541DEm;
import X.AbstractRunnableC2252511DEj;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AU;
import X.C2232608ou;
import X.C2238108pn;
import X.C2252471DEf;
import X.C2252531DEl;
import X.C2252561DEo;
import X.C2252571DEp;
import X.C2252611DEt;
import X.C23262099o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import X.InterfaceC2238208po;
import X.InterfaceC2239108px;
import X.InterfaceC2252551DEn;
import X.RunnableC2252521DEk;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public abstract class EventLoopImplBase extends AbstractC2252541DEm implements InterfaceC2239108px {
    public volatile Object _delayed;
    public volatile int _isCompleted;
    public volatile Object _queue;
    public static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater _isCompleted$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted");

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void closeQueue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                C09AU c09au = C2252571DEp.LIZIZ;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, c09au)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C2252471DEf) {
                ((C2252471DEf) obj).LIZIZ();
                return;
            }
            if (obj == C2252571DEp.LIZIZ) {
                return;
            }
            C2252471DEf c2252471DEf = new C2252471DEf(8, true);
            c2252471DEf.LIZ(obj);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c2252471DEf)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C2252471DEf)) {
                if (obj == C2252571DEp.LIZIZ) {
                    return null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return (Runnable) obj;
            }
            C2252471DEf c2252471DEf = (C2252471DEf) obj;
            Object objLIZLLL = c2252471DEf.LIZLLL();
            if (objLIZLLL != C2252471DEf.LJI) {
                return (Runnable) objLIZLLL;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
            C2252471DEf c2252471DEfLIZJ = c2252471DEf.LIZJ();
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c2252471DEfLIZJ) && atomicReferenceFieldUpdater3.get(this) == obj) {
            }
        }
    }

    public final boolean isCompleted() {
        return _isCompleted$FU.get(this) != 0;
    }

    public final void resetAll() {
        _queue$FU.set(this, null);
        _delayed$FU.set(this, null);
    }

    @Override // X.AbstractC2252601DEs
    public void shutdown() {
        C23262099o.LIZ.set(null);
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }

    private final void rescheduleAllDelayed() {
        InterfaceC2252551DEn interfaceC2252551DEnLIZLLL;
        long jNanoTime = System.nanoTime();
        while (true) {
            C2252531DEl c2252531DEl = (C2252531DEl) _delayed$FU.get(this);
            if (c2252531DEl == null) {
                return;
            }
            synchronized (c2252531DEl) {
                interfaceC2252551DEnLIZLLL = c2252531DEl.LIZIZ() > 0 ? c2252531DEl.LIZLLL(0) : null;
            }
            AbstractRunnableC2252511DEj abstractRunnableC2252511DEj = (AbstractRunnableC2252511DEj) interfaceC2252551DEnLIZLLL;
            if (abstractRunnableC2252511DEj == null) {
                return;
            } else {
                reschedule(jNanoTime, abstractRunnableC2252511DEj);
            }
        }
    }

    @Override // X.AbstractC2252601DEs
    public long getNextTime() {
        Object obj;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj2 = _queue$FU.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof C2252471DEf)) {
                return obj2 == C2252571DEp.LIZIZ ? Long.MAX_VALUE : 0L;
            }
            long j = C2252471DEf.LJFF.get(obj2);
            if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        C2252531DEl c2252531DEl = (C2252531DEl) _delayed$FU.get(this);
        if (c2252531DEl != null) {
            synchronized (c2252531DEl) {
                Object[] objArr = c2252531DEl.LIZ;
                obj = objArr != null ? objArr[0] : null;
            }
            AbstractRunnableC2252511DEj abstractRunnableC2252511DEj = (AbstractRunnableC2252511DEj) obj;
            if (abstractRunnableC2252511DEj != null) {
                long jNanoTime = abstractRunnableC2252511DEj.LL - System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // X.AbstractC2252601DEs
    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        C2252531DEl c2252531DEl = (C2252531DEl) _delayed$FU.get(this);
        if (c2252531DEl != null && c2252531DEl.LIZIZ() != 0) {
            return false;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (obj instanceof C2252471DEf) {
                long j = C2252471DEf.LJFF.get(obj);
                if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                    return false;
                }
            } else if (obj != C2252571DEp.LIZIZ) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC2252601DEs
    public long processNextEvent() {
        InterfaceC2252551DEn interfaceC2252551DEnLIZLLL;
        Object obj;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        C2252531DEl c2252531DEl = (C2252531DEl) _delayed$FU.get(this);
        if (c2252531DEl != null && c2252531DEl.LIZIZ() != 0) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (c2252531DEl) {
                    Object[] objArr = c2252531DEl.LIZ;
                    interfaceC2252551DEnLIZLLL = null;
                    if (objArr == null || (obj = objArr[0]) == null) {
                        break;
                    }
                    AbstractRunnableC2252511DEj abstractRunnableC2252511DEj = (AbstractRunnableC2252511DEj) obj;
                    if (jNanoTime - abstractRunnableC2252511DEj.LL >= 0 && enqueueImpl(abstractRunnableC2252511DEj)) {
                        interfaceC2252551DEnLIZLLL = c2252531DEl.LIZLLL(0);
                    }
                }
            } while (interfaceC2252551DEnLIZLLL != null);
        }
        Runnable runnableDequeue = dequeue();
        if (runnableDequeue == null) {
            return getNextTime();
        }
        runnableDequeue.run();
        return 0L;
    }

    private final boolean enqueueImpl(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof C2252471DEf) {
                C2252471DEf c2252471DEf = (C2252471DEf) obj;
                int iLIZ = c2252471DEf.LIZ(runnable);
                if (iLIZ == 0) {
                    return true;
                }
                if (iLIZ != 1) {
                    if (iLIZ == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _queue$FU;
                    C2252471DEf c2252471DEfLIZJ = c2252471DEf.LIZJ();
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c2252471DEfLIZJ) && atomicReferenceFieldUpdater3.get(this) == obj) {
                    }
                }
            } else {
                if (obj == C2252571DEp.LIZIZ) {
                    return false;
                }
                C2252471DEf c2252471DEf2 = new C2252471DEf(8, true);
                c2252471DEf2.LIZ(obj);
                c2252471DEf2.LIZ(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = _queue$FU;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj, c2252471DEf2)) {
                    if (atomicReferenceFieldUpdater4.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    private final void setCompleted(boolean z) {
        _isCompleted$FU.set(this, z ? 1 : 0);
    }

    private final boolean shouldUnpark(AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        C2252531DEl c2252531DEl = (C2252531DEl) _delayed$FU.get(this);
        Object obj = null;
        if (c2252531DEl != null) {
            synchronized (c2252531DEl) {
                Object[] objArr = c2252531DEl.LIZ;
                if (objArr != null) {
                    obj = objArr[0];
                }
            }
        }
        if (obj != abstractRunnableC2252511DEj) {
            return false;
        }
        return true;
    }

    public void enqueue(Runnable runnable) {
        if (enqueueImpl(runnable)) {
            unpark();
        } else {
            RunnableC2252521DEk.LL.enqueue(runnable);
        }
    }

    private final int scheduleImpl(long j, AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
        C2252561DEo c2252561DEo = (C2252561DEo) atomicReferenceFieldUpdater.get(this);
        if (c2252561DEo == null) {
            C2252561DEo c2252561DEo2 = new C2252561DEo(j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2252561DEo2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            c2252561DEo = (C2252561DEo) _delayed$FU.get(this);
        }
        return abstractRunnableC2252511DEj.LJIIIZ(j, c2252561DEo, this);
    }

    @InterfaceC1294060jmO
    public Object delay(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (j <= 0) {
            return Unit.LIZ;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        scheduleResumeAfterDelay(j, c2252611DEt);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        enqueue(runnable);
    }

    public final void schedule(long j, AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        int iScheduleImpl = scheduleImpl(j, abstractRunnableC2252511DEj);
        if (iScheduleImpl != 0) {
            if (iScheduleImpl != 1) {
                if (iScheduleImpl != 2) {
                    "unexpected result".toString();
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            reschedule(j, abstractRunnableC2252511DEj);
            return;
        }
        if (shouldUnpark(abstractRunnableC2252511DEj)) {
            unpark();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1 < 4611686018427387903L) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC2238208po scheduleInvokeOnTimeout(long r6, final java.lang.Runnable r8) {
        /*
            r5 = this;
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2a
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r6
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2a
        L1c:
            long r3 = java.lang.System.nanoTime()
            X.1DDR r0 = new X.1DDR
            long r1 = r1 + r3
            r0.<init>(r1, r8)
            r5.schedule(r3, r0)
            return r0
        L2a:
            X.09AF r0 = X.C09AF.LL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.scheduleInvokeOnTimeout(long, java.lang.Runnable):X.08po");
    }

    @Override // X.InterfaceC2239108px
    public void scheduleResumeAfterDelay(long j, final InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = 1000000 * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long jNanoTime = System.nanoTime();
        final long j3 = j2 + jNanoTime;
        AbstractRunnableC2252511DEj abstractRunnableC2252511DEj = new AbstractRunnableC2252511DEj(j3, interfaceC20236714Gf) { // from class: X.1DDS
            public final InterfaceC20236714Gf<Unit> LLILLL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LLILLL.LJIL(this.LLILZ, Unit.LIZ);
                } catch (Throwable th) {
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            @Override // X.AbstractRunnableC2252511DEj
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(super.toString());
                sbLIZ.append(this.LLILLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLL = interfaceC20236714Gf;
            }
        };
        schedule(jNanoTime, abstractRunnableC2252511DEj);
        interfaceC20236714Gf.LJJII(new C2238108pn(abstractRunnableC2252511DEj));
    }

    public InterfaceC2238208po invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return C2232608ou.LIZ.invokeOnTimeout(j, runnable, coroutineContext);
    }
}
