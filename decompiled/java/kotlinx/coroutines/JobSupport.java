package kotlinx.coroutines;

import X.AbstractC2249551D2z;
import X.AbstractC2252721DFe;
import X.C094W;
import X.C099E;
import X.C099F;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09A1;
import X.C09AE;
import X.C09AF;
import X.C09AO;
import X.C1145850fvL;
import X.C13SZ;
import X.C13WN;
import X.C13WO;
import X.C13WP;
import X.C1957407lc;
import X.C19719512Dh;
import X.C1DF1;
import X.C1DF2;
import X.C1DF6;
import X.C1DFF;
import X.C1DFI;
import X.C1DFJ;
import X.C1DFO;
import X.C1DFU;
import X.C1DFY;
import X.C2188811AlT;
import X.C2192531ArT;
import X.C2238108pn;
import X.C2239208py;
import X.C2239308pz;
import X.C2252611DEt;
import X.C2252681DFa;
import X.C2252701DFc;
import X.C2252741DFg;
import X.C23118094a;
import X.C23253099f;
import X.C259800zU;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC2238208po;
import X.InterfaceC2250561D6w;
import X.InterfaceC23272099y;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes36.dex */
@InterfaceC1294060jmO
public class JobSupport implements C09AE, C13WO, InterfaceC2250561D6w {
    public static final AtomicReferenceFieldUpdater LL = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater LLILLJJLI = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");
    public volatile Object _parentHandle;
    public volatile Object _state;

    public static final class Finishing implements C13WP {
        public volatile Object _exceptionsHolder;
        public volatile int _isCompleting;
        public volatile Object _rootCause;
        public final C2252701DFc list;
        public static final AtomicIntegerFieldUpdater _isCompleting$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting");
        public static final AtomicReferenceFieldUpdater _rootCause$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause");
        public static final AtomicReferenceFieldUpdater _exceptionsHolder$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder");

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        private final Object getExceptionsHolder() {
            return _exceptionsHolder$FU.get(this);
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$FU.get(this);
        }

        public final boolean isCompleting() {
            return _isCompleting$FU.get(this) != 0;
        }

        @Override // X.C13WP
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == C1DFI.LJ;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Finishing[cancelling=");
            sbLIZ.append(isCancelling());
            sbLIZ.append(", completing=");
            sbLIZ.append(isCompleting());
            sbLIZ.append(", rootCause=");
            sbLIZ.append(getRootCause());
            sbLIZ.append(", exceptions=");
            sbLIZ.append(getExceptionsHolder());
            sbLIZ.append(", list=");
            sbLIZ.append(getList());
            sbLIZ.append(']');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.C13WP
        public C2252701DFc getList() {
            return this.list;
        }

        private final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$FU.set(this, obj);
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(th);
                setExceptionsHolder(arrayListAllocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("State is ");
            sbLIZ.append(exceptionsHolder);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayListAllocateList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
            } else if (exceptionsHolder instanceof ArrayList) {
                arrayListAllocateList = (ArrayList) exceptionsHolder;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("State is ");
                sbLIZ.append(exceptionsHolder);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                ListProtector.add(arrayListAllocateList, 0, rootCause);
            }
            if (th != null && !Intrinsics.LJFF(th, rootCause)) {
                arrayListAllocateList.add(th);
            }
            setExceptionsHolder(C1DFI.LJ);
            return arrayListAllocateList;
        }

        public final void setCompleting(boolean z) {
            _isCompleting$FU.set(this, z ? 1 : 0);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$FU.set(this, th);
        }

        public Finishing(C2252701DFc c2252701DFc, boolean z, Throwable th) {
            this.list = c2252701DFc;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }
    }

    public void LJJIII(Object obj) {
    }

    public String LJJIJIL() {
        return "Job was cancelled";
    }

    public boolean LJJJJL() {
        return true;
    }

    public boolean LJJJJLL() {
        return this instanceof C099F;
    }

    public boolean LJJJLIIL(Throwable th) {
        return false;
    }

    public boolean LJJLIIIIJ() {
        return this instanceof C23253099f;
    }

    public void LJJLIIIJLLLLLLLZ(Object obj) {
    }

    public void LJJLJ() {
    }

    @Override // X.C09AE
    public final Sequence<C09AE> LIZ() {
        return new C1957407lc(new C13WN(null, this));
    }

    public final C2192531ArT LJJJJLI() {
        C1DF6 c1df6 = C1DF6.LL;
        C19719512Dh.LJ(3, c1df6);
        C099E c099e = C099E.LL;
        C19719512Dh.LJ(3, c099e);
        return new C2192531ArT(this, c1df6, c099e, null);
    }

    public final Object LJJJJZI() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2249551D2z)) {
                return obj;
            }
            ((AbstractC2249551D2z) obj).LIZ(this);
        }
    }

    @Override // X.C09AE
    public final C09AE getParent() {
        C1DFY c1dfy = (C1DFY) LLILLJJLI.get(this);
        if (c1dfy != null) {
            return c1dfy.getParent();
        }
        return null;
    }

    public final Object LJJJIL() throws Throwable {
        Object objLJJJJZI = LJJJJZI();
        if (!(!(objLJJJJZI instanceof C13WP))) {
            "This job has not completed yet".toString();
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objLJJJJZI instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objLJJJJZI).cause;
        }
        return C1DFI.LIZ(objLJJJJZI);
    }

    public final Throwable LJJJJI() {
        Object objLJJJJZI = LJJJJZI();
        if (objLJJJJZI instanceof Finishing) {
            Throwable rootCause = ((Finishing) objLJJJJZI).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Job is still new or active: ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        if (!(objLJJJJZI instanceof C13WP)) {
            if (objLJJJJZI instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) objLJJJJZI).cause;
            }
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Job is still new or active: ");
        sbLIZ2.append(this);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalStateException(strLIZIZ2);
    }

    public final Throwable LJJJJJL() {
        CompletedExceptionally completedExceptionally;
        Object objLJJJJZI = LJJJJZI();
        if (!(!(objLJJJJZI instanceof C13WP))) {
            "This job has not completed yet".toString();
            throw new IllegalStateException("This job has not completed yet");
        }
        if (!(objLJJJJZI instanceof CompletedExceptionally) || (completedExceptionally = (CompletedExceptionally) objLJJJJZI) == null) {
            return null;
        }
        return completedExceptionally.cause;
    }

    @Override // X.C09AE
    public final CancellationException LJJJLL() {
        CancellationException c2239308pz;
        Object objLJJJJZI = LJJJJZI();
        if (objLJJJJZI instanceof Finishing) {
            Throwable rootCause = ((Finishing) objLJJJJZI).getRootCause();
            if (rootCause == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Job is still new or active: ");
                sbLIZ.append(this);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(getClass().getSimpleName());
            sbLIZ2.append(" is cancelling");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (!(rootCause instanceof CancellationException) || (c2239308pz = (CancellationException) rootCause) == null) {
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = LJJIJIL();
                }
                c2239308pz = new C2239308pz(strLIZIZ2, rootCause, this);
            }
        } else {
            if (objLJJJJZI instanceof C13WP) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Job is still new or active: ");
                sbLIZ3.append(this);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                strLIZIZ3.toString();
                throw new IllegalStateException(strLIZIZ3);
            }
            if (!(objLJJJJZI instanceof CompletedExceptionally)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(getClass().getSimpleName());
                sbLIZ4.append(" has completed normally");
                return new C2239308pz(C2188811AlT.LIZIZ(sbLIZ4), null, this);
            }
            Throwable th = ((CompletedExceptionally) objLJJJJZI).cause;
            if (!(th instanceof CancellationException) || (c2239308pz = (CancellationException) th) == null) {
                return new C2239308pz(LJJIJIL(), th, this);
            }
        }
        return c2239308pz;
    }

    @Override // X.InterfaceC2250561D6w
    public final CancellationException LJJL() {
        CancellationException cancellationException;
        Object objLJJJJZI = LJJJJZI();
        Throwable rootCause = null;
        if (objLJJJJZI instanceof Finishing) {
            rootCause = ((Finishing) objLJJJJZI).getRootCause();
        } else if (objLJJJJZI instanceof CompletedExceptionally) {
            rootCause = ((CompletedExceptionally) objLJJJJZI).cause;
        } else if (objLJJJJZI instanceof C13WP) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot be cancelling child in this state: ");
            sbLIZ.append(objLJJJJZI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        if ((rootCause instanceof CancellationException) && (cancellationException = (CancellationException) rootCause) != null) {
            return cancellationException;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Parent job is ");
        sbLIZ2.append(LJJZZIII(objLJJJJZI));
        return new C2239308pz(C2188811AlT.LIZIZ(sbLIZ2), rootCause, this);
    }

    public String LJJLIIIJJIZ() {
        return getClass().getSimpleName();
    }

    @Override // X.C09AE
    public boolean isActive() {
        Object objLJJJJZI = LJJJJZI();
        return (objLJJJJZI instanceof C13WP) && ((C13WP) objLJJJJZI).isActive();
    }

    @Override // X.C09AE
    public final boolean isCancelled() {
        Object objLJJJJZI = LJJJJZI();
        if (objLJJJJZI instanceof CompletedExceptionally) {
            return true;
        }
        return (objLJJJJZI instanceof Finishing) && ((Finishing) objLJJJJZI).isCancelling();
    }

    @Override // X.C09AE
    public final boolean isCompleted() {
        return !(LJJJJZI() instanceof C13WP);
    }

    @Override // X.C09AE
    public final boolean start() {
        int iLJJZZI;
        do {
            iLJJZZI = LJJZZI(LJJJJZI());
            if (iLJJZZI == 0) {
                return false;
            }
        } while (iLJJZZI != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJJLIIIJJIZ());
        sbLIZ2.append('{');
        sbLIZ2.append(LJJZZIII(LJJJJZI()));
        sbLIZ2.append('}');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append('@');
        sbLIZ.append(C2239208py.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<?> getKey() {
        return C09AE.LJJLJ;
    }

    public JobSupport(boolean z) {
        C1DFJ c1dfj;
        if (z) {
            c1dfj = C1DFI.LJI;
        } else {
            c1dfj = C1DFI.LJFF;
        }
        this._state = c1dfj;
    }

    public static C1DFF LJJLIIIJL(C1DF2 c1df2) {
        while (c1df2.LJI()) {
            c1df2 = c1df2.LJFF();
        }
        while (true) {
            c1df2 = c1df2.LJ();
            if (!c1df2.LJI()) {
                if (c1df2 instanceof C1DFF) {
                    return (C1DFF) c1df2;
                }
                if (c1df2 instanceof C2252701DFc) {
                    return null;
                }
            }
        }
    }

    public static String LJJZZIII(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            if (finishing.isCompleting()) {
                return "Completing";
            }
            return "Active";
        }
        if (obj instanceof C13WP) {
            if (!((C13WP) obj).isActive()) {
                return "New";
            }
            return "Active";
        }
        if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // X.C09AE, X.AnonymousClass0954
    public void LIZIZ(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2239308pz(LJJIJIL(), null, this);
        }
        LJJIJIIJI(cancellationException);
    }

    @Override // X.C09AE
    public final InterfaceC2238208po LJII(Function1<? super Throwable, Unit> function1) {
        return LJJJJ(function1, false, true);
    }

    @Override // X.C13WO
    public final void LJIJJLI(JobSupport jobSupport) {
        LJJIIZI(jobSupport);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1DEt, X.1DF7] */
    public final Object LJJIIJ(InterfaceC1364105Vn<Object> interfaceC1364105Vn) throws Throwable {
        Object objLJJJJZI;
        do {
            objLJJJJZI = LJJJJZI();
            if (!(objLJJJJZI instanceof C13WP)) {
                if (!(objLJJJJZI instanceof CompletedExceptionally)) {
                    return C1DFI.LIZ(objLJJJJZI);
                }
                throw ((CompletedExceptionally) objLJJJJZI).cause;
            }
        } while (LJJZZI(objLJJJJZI) < 0);
        final InterfaceC1364105Vn interfaceC1364105VnLIZLLL = C099M.LIZLLL(interfaceC1364105Vn);
        final ?? r2 = new C2252611DEt<T>(interfaceC1364105VnLIZLLL, this) { // from class: X.1DF7
            public final JobSupport LLJ;

            @Override // X.C2252611DEt
            public final String LJJIIJ() {
                return "AwaitContinuation";
            }

            @Override // X.C2252611DEt
            public final Throwable LJIIZILJ(JobSupport jobSupport) {
                Throwable rootCause;
                Object objLJJJJZI2 = this.LLJ.LJJJJZI();
                if ((objLJJJJZI2 instanceof JobSupport.Finishing) && (rootCause = ((JobSupport.Finishing) objLJJJJZI2).getRootCause()) != null) {
                    return rootCause;
                }
                if (objLJJJJZI2 instanceof CompletedExceptionally) {
                    return ((CompletedExceptionally) objLJJJJZI2).cause;
                }
                return jobSupport.LJJJLL();
            }

            {
                this.LLJ = this;
            }
        };
        r2.LJIJJ();
        r2.LJJII(new C2238108pn(LJII(new C1DF1(r2) { // from class: X.1DF5
            public final C2252611DEt<T> LLILZIL;

            {
                this.LLILZIL = r2;
            }

            @Override // X.C1DFU
            public final void LJII(Throwable th) {
                Object objLJJJJZI2 = LJIIIIZZ().LJJJJZI();
                if (objLJJJJZI2 instanceof CompletedExceptionally) {
                    C2252611DEt<T> c2252611DEt = this.LLILZIL;
                    C098200Yq c098200Yq = new C098200Yq(((CompletedExceptionally) objLJJJJZI2).cause);
                    C189200o6.m2constructorimpl(c098200Yq);
                    c2252611DEt.resumeWith(c098200Yq);
                    return;
                }
                C2252611DEt<T> c2252611DEt2 = this.LLILZIL;
                Object objLIZ = C1DFI.LIZ(objLJJJJZI2);
                C189200o6.m2constructorimpl(objLIZ);
                c2252611DEt2.resumeWith(objLIZ);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                LJII(th);
                return Unit.LIZ;
            }
        })));
        Object objLJIJ = r2.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJIIZI(Object obj) {
        Object objLJLI = C1DFI.LIZ;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 2;
        boolean z = false;
        if (LJJJJLL()) {
            do {
                Object objLJJJJZI = LJJJJZI();
                if (!(objLJJJJZI instanceof C13WP) || ((objLJJJJZI instanceof Finishing) && ((Finishing) objLJJJJZI).isCompleting())) {
                    objLJLI = C1DFI.LIZ;
                    break;
                }
                objLJLI = LJLI(objLJJJJZI, new CompletedExceptionally(LJJIL(obj), z, i, objArr2 == true ? 1 : 0));
            } while (objLJLI == C1DFI.LIZJ);
            if (objLJLI == C1DFI.LIZIZ) {
                return true;
            }
        }
        if (objLJLI == C1DFI.LIZ) {
            Throwable thLJJIL = null;
            loop1: while (true) {
                Object objLJJJJZI2 = LJJJJZI();
                if (objLJJJJZI2 instanceof Finishing) {
                    synchronized (objLJJJJZI2) {
                        if (((Finishing) objLJJJJZI2).isSealed()) {
                            objLJLI = C1DFI.LIZLLL;
                        } else {
                            boolean zIsCancelling = ((Finishing) objLJJJJZI2).isCancelling();
                            if (obj != null || !zIsCancelling) {
                                if (thLJJIL == null) {
                                    thLJJIL = LJJIL(obj);
                                }
                                ((Finishing) objLJJJJZI2).addExceptionLocked(thLJJIL);
                            }
                            Throwable rootCause = ((Finishing) objLJJJJZI2).getRootCause();
                            if (!zIsCancelling) {
                                th = rootCause;
                            }
                            if (th != null) {
                                LJJLIIIJLJLI(((Finishing) objLJJJJZI2).getList(), th);
                            }
                            objLJLI = C1DFI.LIZ;
                        }
                    }
                } else if (objLJJJJZI2 instanceof C13WP) {
                    if (thLJJIL == null) {
                        thLJJIL = LJJIL(obj);
                    }
                    C13WP c13wp = (C13WP) objLJJJJZI2;
                    if (c13wp.isActive()) {
                        C2252701DFc c2252701DFcLJJJJZ = LJJJJZ(c13wp);
                        if (c2252701DFcLJJJJZ != null) {
                            Finishing finishing = new Finishing(c2252701DFcLJJJJZ, false, thLJJIL);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c13wp, finishing)) {
                                if (atomicReferenceFieldUpdater.get(this) != c13wp) {
                                    break;
                                }
                            }
                            LJJLIIIJLJLI(c2252701DFcLJJJJZ, thLJJIL);
                            objLJLI = C1DFI.LIZ;
                            break loop1;
                        }
                        continue;
                    } else {
                        objLJLI = LJLI(objLJJJJZI2, new CompletedExceptionally(thLJJIL, z, i, objArr == true ? 1 : 0));
                        if (objLJLI != C1DFI.LIZ) {
                            if (objLJLI != C1DFI.LIZJ) {
                                break;
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Cannot happen in ");
                            sbLIZ.append(objLJJJJZI2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalStateException(strLIZIZ);
                        }
                    }
                } else {
                    objLJLI = C1DFI.LIZLLL;
                    break;
                }
            }
        }
        if (objLJLI != C1DFI.LIZ && objLJLI != C1DFI.LIZIZ) {
            if (objLJLI == C1DFI.LIZLLL) {
                return false;
            }
            LJJIII(objLJLI);
        }
        return true;
    }

    public void LJJIJIIJI(Throwable th) {
        LJJIIZI(th);
    }

    public final boolean LJJIJIIJIL(Throwable th) {
        if (LJJLIIIIJ()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C1DFY c1dfy = (C1DFY) LLILLJJLI.get(this);
        if (c1dfy != null && c1dfy != C09AF.LL) {
            if (c1dfy.LIZJ(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public boolean LJJIJL(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (LJJIIZI(th) && LJJJJL()) {
            return true;
        }
        return false;
    }

    public final Throwable LJJIL(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((InterfaceC2250561D6w) obj).LJJL();
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        return new C2239308pz(LJJIJIL(), null, this);
    }

    public final C2252701DFc LJJJJZ(C13WP c13wp) {
        C2252701DFc list = c13wp.getList();
        if (list == null) {
            if (c13wp instanceof C1DFJ) {
                return new C2252701DFc();
            }
            if (c13wp instanceof C1DF1) {
                LJJLJLI((C1DF1) c13wp);
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("State should have list: ");
            sbLIZ.append(c13wp);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        return list;
    }

    public final void LJJLI(C09AE c09ae) {
        if (c09ae == null) {
            LLILLJJLI.set(this, C09AF.LL);
            return;
        }
        c09ae.start();
        C1DFY c1dfyLLFFF = c09ae.LLFFF(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILLJJLI;
        atomicReferenceFieldUpdater.set(this, c1dfyLLFFF);
        if (isCompleted()) {
            c1dfyLLFFF.dispose();
            atomicReferenceFieldUpdater.set(this, C09AF.LL);
        }
    }

    public final boolean LJJLIIIJILLIZJL(Object obj) {
        Object objLJLI;
        do {
            objLJLI = LJLI(LJJJJZI(), obj);
            if (objLJLI == C1DFI.LIZ) {
                return false;
            }
            if (objLJLI == C1DFI.LIZIZ) {
                return true;
            }
        } while (objLJLI == C1DFI.LIZJ);
        LJJIII(objLJLI);
        return true;
    }

    public final Object LJJLIIIJJI(Object obj) {
        Object objLJLI;
        CompletedExceptionally completedExceptionally;
        do {
            objLJLI = LJLI(LJJJJZI(), obj);
            if (objLJLI == C1DFI.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Job ");
                sbLIZ.append(this);
                sbLIZ.append(" is already complete or completing, but is being completed with ");
                sbLIZ.append(obj);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Throwable th = null;
                if ((obj instanceof CompletedExceptionally) && (completedExceptionally = (CompletedExceptionally) obj) != null) {
                    th = completedExceptionally.cause;
                }
                throw new IllegalStateException(strLIZIZ, th);
            }
        } while (objLJLI == C1DFI.LIZJ);
        return objLJLI;
    }

    public final void LJJLJLI(C1DF1 c1df1) {
        C2252701DFc c2252701DFc = new C2252701DFc();
        c1df1.getClass();
        C1DF2.LLILLJJLI.lazySet(c2252701DFc, c1df1);
        C1DF2.LL.lazySet(c2252701DFc, c1df1);
        loop0: while (true) {
            if (c1df1.LIZLLL() != c1df1) {
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1DF2.LL;
            while (!atomicReferenceFieldUpdater.compareAndSet(c1df1, c1df1, c2252701DFc)) {
                if (atomicReferenceFieldUpdater.get(c1df1) != c1df1) {
                    break;
                }
            }
            c2252701DFc.LIZIZ(c1df1);
            break loop0;
        }
        C1DF2 c1df2LJ = c1df1.LJ();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LL;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1df1, c1df2LJ) && atomicReferenceFieldUpdater2.get(this) == c1df1) {
        }
    }

    @Override // X.C09AE
    public final Object LJJZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJJJZI;
        do {
            objLJJJJZI = LJJJJZI();
            if (!(objLJJJJZI instanceof C13WP)) {
                C23118094a.LJI(interfaceC1364105Vn.getContext());
                return Unit.LIZ;
            }
        } while (LJJZZI(objLJJJJZI) < 0);
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new C2238108pn(LJII(new C1DF1(c2252611DEt) { // from class: X.1DE6
            public final InterfaceC1364105Vn<Unit> LLILZIL;

            {
                this.LLILZIL = c2252611DEt;
            }

            @Override // X.C1DFU
            public final void LJII(Throwable th) {
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = this.LLILZIL;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn2.resumeWith(unit);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                LJII(th);
                return Unit.LIZ;
            }
        })));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ != C099R.LJFF()) {
            objLJIJ = Unit.LIZ;
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public final int LJJZZI(Object obj) {
        if (obj instanceof C1DFJ) {
            if (((C1DFJ) obj).LL) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
            C1DFJ c1dfj = C1DFI.LJI;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1dfj)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            LJJLJ();
            return 1;
        }
        if (!(obj instanceof C2252681DFa)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LL;
        C2252701DFc c2252701DFc = ((C2252681DFa) obj).LL;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c2252701DFc)) {
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                return -1;
            }
        }
        LJJLJ();
        return 1;
    }

    @Override // X.C09AE
    public final C1DFY LLFFF(JobSupport jobSupport) {
        return (C1DFY) C1145850fvL.LIZIZ(this, true, new C1DFF(jobSupport), 2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    public void LJJJLZIJ(C09AO c09ao) {
        throw c09ao;
    }

    public final void LJJIJLIJ(C13WP c13wp, Object obj) {
        Throwable th;
        CompletedExceptionally completedExceptionally;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILLJJLI;
        InterfaceC2238208po interfaceC2238208po = (InterfaceC2238208po) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2238208po != null) {
            interfaceC2238208po.dispose();
            atomicReferenceFieldUpdater.set(this, C09AF.LL);
        }
        C09AO c09ao = null;
        if ((obj instanceof CompletedExceptionally) && (completedExceptionally = (CompletedExceptionally) obj) != null) {
            th = completedExceptionally.cause;
        } else {
            th = null;
        }
        if (c13wp instanceof C1DF1) {
            try {
                ((C1DF1) c13wp).LJII(th);
                return;
            } catch (Throwable th2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception in completion handler ");
                sbLIZ.append(c13wp);
                sbLIZ.append(" for ");
                sbLIZ.append(this);
                LJJJLZIJ(new C09AO(C2188811AlT.LIZIZ(sbLIZ), th2));
                return;
            }
        }
        C2252701DFc list = c13wp.getList();
        if (list != null) {
            for (C1DF2 c1df2LJ = (C1DF2) list.LIZLLL(); !Intrinsics.LJFF(c1df2LJ, list); c1df2LJ = c1df2LJ.LJ()) {
                if (c1df2LJ instanceof C1DF1) {
                    C1DFU c1dfu = (C1DFU) c1df2LJ;
                    try {
                        c1dfu.LJII(th);
                    } catch (Throwable th3) {
                        if (c09ao != null) {
                            C13SZ.LIZ(c09ao, th3);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Exception in completion handler ");
                            sbLIZ2.append(c1dfu);
                            sbLIZ2.append(" for ");
                            sbLIZ2.append(this);
                            c09ao = new C09AO(C2188811AlT.LIZIZ(sbLIZ2), th3);
                        }
                    }
                }
            }
            if (c09ao != null) {
                LJJJLZIJ(c09ao);
            }
        }
    }

    public final Object LJJJI(Finishing finishing, Object obj) {
        Throwable th;
        Throwable thLJJJJIZL;
        Object c2252741DFg;
        CompletedExceptionally completedExceptionally;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((obj instanceof CompletedExceptionally) && (completedExceptionally = (CompletedExceptionally) obj) != null) {
            th = completedExceptionally.cause;
        } else {
            th = null;
        }
        synchronized (finishing) {
            finishing.isCancelling();
            List<Throwable> listSealLocked = finishing.sealLocked(th);
            thLJJJJIZL = LJJJJIZL(finishing, listSealLocked);
            if (thLJJJJIZL != null && listSealLocked.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(listSealLocked.size()));
                for (Throwable th2 : listSealLocked) {
                    if (th2 != thLJJJJIZL && th2 != thLJJJJIZL && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C13SZ.LIZ(thLJJJJIZL, th2);
                    }
                }
            }
        }
        boolean z = false;
        if (thLJJJJIZL != null) {
            if (thLJJJJIZL != th) {
                obj = new CompletedExceptionally(thLJJJJIZL, z, 2, defaultConstructorMarker);
            }
            if (LJJIJIIJIL(thLJJJJIZL) || LJJJLIIL(thLJJJJIZL)) {
                ((CompletedExceptionally) obj).makeHandled();
            }
        }
        LJJLIIIJLLLLLLLZ(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
        if (obj instanceof C13WP) {
            c2252741DFg = new C2252741DFg((C13WP) obj);
        } else {
            c2252741DFg = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, c2252741DFg) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        LJJIJLIJ(finishing, obj);
        return obj;
    }

    public final Throwable LJJJJIZL(Finishing finishing, List<? extends Throwable> list) {
        Throwable next;
        Throwable th = null;
        if (list.isEmpty()) {
            if (!finishing.isCancelling()) {
                return null;
            }
            return new C2239308pz(LJJIJIL(), null, this);
        }
        Iterator<? extends Throwable> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!(next instanceof CancellationException)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Throwable th2 = next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) ListProtector.get(list, 0);
        if (th3 instanceof C094W) {
            Iterator<? extends Throwable> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Throwable next2 = it3.next();
                if (next2 != th3 && (next2 instanceof C094W)) {
                    th = next2;
                    break;
                }
            }
            Throwable th4 = th;
            if (th4 != null) {
                return th4;
            }
        }
        return th3;
    }

    public final void LJJLIIIJLJLI(C2252701DFc c2252701DFc, Throwable th) {
        C09AO c09ao = null;
        for (C1DF2 c1df2LJ = (C1DF2) c2252701DFc.LIZLLL(); !Intrinsics.LJFF(c1df2LJ, c2252701DFc); c1df2LJ = c1df2LJ.LJ()) {
            if (c1df2LJ instanceof AbstractC2252721DFe) {
                C1DFU c1dfu = (C1DFU) c1df2LJ;
                try {
                    c1dfu.LJII(th);
                } catch (Throwable th2) {
                    if (c09ao != null) {
                        C13SZ.LIZ(c09ao, th2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Exception in completion handler ");
                        sbLIZ.append(c1dfu);
                        sbLIZ.append(" for ");
                        sbLIZ.append(this);
                        c09ao = new C09AO(C2188811AlT.LIZIZ(sbLIZ), th2);
                    }
                }
            }
        }
        if (c09ao != null) {
            LJJJLZIJ(c09ao);
        }
        LJJIJIIJIL(th);
    }

    public final Object LJLI(Object obj, Object obj2) {
        Object c2252741DFg;
        boolean z;
        Finishing finishing;
        CompletedExceptionally completedExceptionally;
        C1DFF c1dff;
        if (!(obj instanceof C13WP)) {
            return C1DFI.LIZ;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (((obj instanceof C1DFJ) || (obj instanceof C1DF1)) && !(obj instanceof C1DFF) && !(obj2 instanceof CompletedExceptionally)) {
            C13WP c13wp = (C13WP) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LL;
            if (obj2 instanceof C13WP) {
                c2252741DFg = new C2252741DFg((C13WP) obj2);
            } else {
                c2252741DFg = obj2;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, c13wp, c2252741DFg)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c13wp) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else {
                LJJLIIIJLLLLLLLZ(obj2);
                LJJIJLIJ(c13wp, obj2);
            }
            if (z2) {
                return obj2;
            }
            return C1DFI.LIZJ;
        }
        C13WP c13wp2 = (C13WP) obj;
        C2252701DFc c2252701DFcLJJJJZ = LJJJJZ(c13wp2);
        if (c2252701DFcLJJJJZ == null) {
            return C1DFI.LIZJ;
        }
        C1DFF c1dffLJJLIIIJL = null;
        if (c13wp2 instanceof Finishing) {
            finishing = (Finishing) c13wp2;
        } else {
            finishing = null;
        }
        if (finishing == null) {
            finishing = new Finishing(c2252701DFcLJJJJZ, false, null);
        }
        new C259800zU();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return C1DFI.LIZ;
            }
            finishing.setCompleting(true);
            if (finishing != c13wp2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LL;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, c13wp2, finishing)) {
                        if (atomicReferenceFieldUpdater2.get(this) != c13wp2) {
                            break;
                        }
                    } else {
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    return C1DFI.LIZJ;
                }
            }
            boolean zIsCancelling = finishing.isCancelling();
            if (obj2 instanceof CompletedExceptionally) {
                completedExceptionally = (CompletedExceptionally) obj2;
            } else {
                completedExceptionally = null;
            }
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            Throwable rootCause = finishing.getRootCause();
            if (!Boolean.valueOf(true ^ zIsCancelling).booleanValue()) {
                rootCause = null;
            }
            if (rootCause != null) {
                LJJLIIIJLJLI(c2252701DFcLJJJJZ, rootCause);
            }
            if (c13wp2 instanceof C1DFF) {
                c1dff = (C1DFF) c13wp2;
            } else {
                c1dff = null;
            }
            if (c1dff == null) {
                C2252701DFc list = c13wp2.getList();
                if (list != null) {
                    c1dffLJJLIIIJL = LJJLIIIJL(list);
                }
            } else {
                c1dffLJJLIIIJL = c1dff;
            }
            if (c1dffLJJLIIIJL != null && LJLIIL(finishing, c1dffLJJLIIIJL, obj2)) {
                return C1DFI.LIZIZ;
            }
            return LJJJI(finishing, obj2);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }

    public final boolean LJJI(final Object obj, C2252701DFc c2252701DFc, final C1DF1 c1df1) {
        C1DF2 c1df2LJFF;
        C1DFO c1dfo = new C1DFO(c1df1) { // from class: X.1DFP
            @Override // X.C1DE1
            public final C09AU LIZJ(Object obj2) {
                if (this.LJJJJZI() == obj) {
                    return null;
                }
                return C2252761DFi.LIZ;
            }
        };
        while (true) {
            c1df2LJFF = c2252701DFc.LJFF();
            C1DF2.LLILLJJLI.lazySet(c1df1, c1df2LJFF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1DF2.LL;
            atomicReferenceFieldUpdater.lazySet(c1df1, c2252701DFc);
            c1dfo.LIZJ = c2252701DFc;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(c1df2LJFF, c2252701DFc, c1dfo)) {
                    if (1 != 0) {
                        break;
                    }
                } else if (atomicReferenceFieldUpdater.get(c1df2LJFF) != c2252701DFc) {
                    break;
                }
            }
        }
        if (c1dfo.LIZ(c1df2LJFF) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        if (r10 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ac, code lost:
    
        r8.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        return r2;
     */
    @Override // X.C09AE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC2238208po LJJJJ(final kotlin.jvm.functions.Function1 r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r3 = 0
            if (r9 == 0) goto L92
            boolean r0 = r8 instanceof X.AbstractC2252721DFe
            if (r0 == 0) goto Lc
            r5 = r8
            X.1DF1 r5 = (X.C1DF1) r5
            if (r5 != 0) goto L11
        Lc:
            X.1DFG r5 = new X.1DFG
            r5.<init>(r8)
        L11:
            r5.LLILZ = r7
        L13:
            java.lang.Object r4 = r7.LJJJJZI()
            boolean r0 = r4 instanceof X.C1DFJ
            if (r0 == 0) goto L51
            r6 = r4
            X.1DFJ r6 = (X.C1DFJ) r6
            boolean r0 = r6.LL
            if (r0 == 0) goto L32
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport.LL
        L24:
            boolean r0 = r1.compareAndSet(r7, r4, r5)
            if (r0 == 0) goto L2b
            return r5
        L2b:
            java.lang.Object r0 = r1.get(r7)
            if (r0 == r4) goto L24
            goto L13
        L32:
            X.1DFc r1 = new X.1DFc
            r1.<init>()
            boolean r0 = r6.LL
            if (r0 == 0) goto L4b
            r2 = r1
        L3c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport.LL
        L3e:
            boolean r0 = r1.compareAndSet(r7, r6, r2)
            if (r0 != 0) goto L13
            java.lang.Object r0 = r1.get(r7)
            if (r0 == r6) goto L3e
            goto L13
        L4b:
            X.1DFa r2 = new X.1DFa
            r2.<init>(r1)
            goto L3c
        L51:
            boolean r0 = r4 instanceof X.C13WP
            if (r0 == 0) goto Lb3
            r0 = r4
            X.13WP r0 = (X.C13WP) r0
            X.1DFc r6 = r0.getList()
            if (r6 != 0) goto L64
            X.1DF1 r4 = (X.C1DF1) r4
            r7.LJJLJLI(r4)
            goto L13
        L64:
            X.09AF r2 = X.C09AF.LL
            if (r9 == 0) goto L8b
            boolean r0 = r4 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto L8b
            monitor-enter(r4)
            r0 = r4
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable r1 = r0.getRootCause()     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L83
            boolean r0 = r8 instanceof X.C1DFF     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto La9
            r0 = r4
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0     // Catch: java.lang.Throwable -> Lb0
            boolean r0 = r0.isCompleting()     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto La9
        L83:
            boolean r0 = r7.LJJI(r4, r6, r5)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto La4
            monitor-exit(r4)
            goto L13
        L8b:
            boolean r0 = r7.LJJI(r4, r6, r5)
            if (r0 == 0) goto L13
            return r5
        L92:
            boolean r0 = r8 instanceof X.C1DF1
            if (r0 == 0) goto L9d
            r5 = r8
            X.1DF1 r5 = (X.C1DF1) r5
            if (r5 == 0) goto L9d
            goto L11
        L9d:
            X.1DE7 r5 = new X.1DE7
            r5.<init>(r8)
            goto L11
        La4:
            if (r1 != 0) goto La8
            monitor-exit(r4)
            return r5
        La8:
            r2 = r5
        La9:
            monitor-exit(r4)
            if (r10 == 0) goto Laf
            r8.invoke(r1)
        Laf:
            return r2
        Lb0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lb3:
            if (r10 == 0) goto Lc2
            boolean r0 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto Lbf
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            if (r4 == 0) goto Lbf
            java.lang.Throwable r3 = r4.cause
        Lbf:
            r8.invoke(r3)
        Lc2:
            X.09AF r0 = X.C09AF.LL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.LJJJJ(kotlin.jvm.functions.Function1, boolean, boolean):X.08po");
    }

    public final boolean LJLIIL(final Finishing finishing, final C1DFF c1dff, final Object obj) {
        while (C1145850fvL.LIZIZ(c1dff.LLILZIL, false, new C1DF1(this, finishing, c1dff, obj) { // from class: X.1DFA
            public final JobSupport LLILZIL;
            public final JobSupport.Finishing LLILZLL;
            public final C1DFF LLIZ;
            public final Object LLIZLLLIL;

            @Override // X.C1DFU
            public final void LJII(Throwable th) {
                JobSupport jobSupport = this.LLILZIL;
                JobSupport.Finishing finishing2 = this.LLILZLL;
                C1DFF c1dff2 = this.LLIZ;
                Object obj2 = this.LLIZLLLIL;
                jobSupport.getClass();
                C1DFF c1dffLJJLIIIJL = JobSupport.LJJLIIIJL(c1dff2);
                if (c1dffLJJLIIIJL != null && jobSupport.LJLIIL(finishing2, c1dffLJJLIIIJL, obj2)) {
                    return;
                }
                jobSupport.LJJIII(jobSupport.LJJJI(finishing2, obj2));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                LJII(th);
                return Unit.LIZ;
            }

            {
                this.LLILZIL = this;
                this.LLILZLL = finishing;
                this.LLIZ = c1dff;
                this.LLIZLLLIL = obj;
            }
        }, 1) == C09AF.LL) {
            c1dff = LJJLIIIJL(c1dff);
            if (c1dff == null) {
                return false;
            }
        }
        return true;
    }
}
