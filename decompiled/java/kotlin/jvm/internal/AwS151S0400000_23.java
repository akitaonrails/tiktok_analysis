package kotlin.jvm.internal;

import X.AbstractC1522680pj8;
import X.AbstractC1522730pjD;
import X.C098200Yq;
import X.C09AY;
import X.C0POE;
import X.C1515930pYF;
import X.C1515960pYI;
import X.C1526710ppd;
import X.C1527670prB;
import X.C1527890prX;
import X.C1533790q13;
import X.C1533880q1C;
import X.C1533900q1E;
import X.C1533910q1F;
import X.C1534000q1O;
import X.C1534010q1P;
import X.C1534020q1Q;
import X.C1534080q1W;
import X.C1534110q1Z;
import X.C1534250q1n;
import X.C1534320q1u;
import X.C189200o6;
import X.C644110POf;
import X.C801490VcJ;
import X.C801550VcP;
import X.InterfaceC1540940qCa;
import Y.ARunnableS31S0400000_23;
import android.util.Log;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.sync.v4.presistence.AppDatabaseV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS151S0400000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS151S0400000_23 awS151S0400000_23) {
        ((C1527670prB) awS151S0400000_23.l0).LJLIL().runInTransaction(new ARunnableS31S0400000_23((C1527670prB) awS151S0400000_23.l0, (List) awS151S0400000_23.l1, (List) awS151S0400000_23.l2, (List) awS151S0400000_23.l3, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS151S0400000_23 awS151S0400000_23) {
        try {
            AppDatabaseV4 appDatabaseV4LJLIL = ((C1527670prB) awS151S0400000_23.l0).LJLIL();
            final List list = (List) awS151S0400000_23.l1;
            final C1527670prB c1527670prB = (C1527670prB) awS151S0400000_23.l0;
            final List list2 = (List) awS151S0400000_23.l2;
            final C801490VcJ c801490VcJ = (C801490VcJ) awS151S0400000_23.l3;
            return (Boolean) appDatabaseV4LJLIL.runInTransaction(new Callable() { // from class: X.0prD
                /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        r7 = this;
                        java.util.List r1 = r3
                        X.0prB r3 = r1
                        java.util.List r2 = r4
                        X.0VcJ r6 = r2
                        java.lang.String r5 = "DBServiceImplV4$updateUploadCursorAndDelete$1@f17.invoke$1L"
                        X.C1C7U.LIZ(r5)
                        boolean r0 = r1.isEmpty()
                        r4 = 1
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L4e
                        X.0prG r0 = r3.LJLJI()
                        int r0 = r0.LIZIZ(r1)
                        if (r0 <= 0) goto L4e
                        r1 = 1
                    L21:
                        boolean r0 = r2.isEmpty()
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L49
                        X.0prG r0 = r3.LJLJI()
                        int r0 = r0.LJI(r2)
                        if (r0 <= 0) goto L4c
                    L33:
                        X.0prE r3 = r3.LJJZ()
                        java.lang.String r2 = r6.LIZ
                        long r0 = r6.LJI
                        int r0 = r3.LIZ(r0, r2)
                        if (r0 <= 0) goto L4c
                    L41:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                        X.C1C7U.LIZIZ(r5)
                        return r0
                    L49:
                        if (r1 == 0) goto L4c
                        goto L33
                    L4c:
                        r4 = 0
                        goto L41
                    L4e:
                        r1 = 0
                        goto L21
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1527690prD.call():java.lang.Object");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1526710ppd.LIZJ().ensureNotReachHere(e, "execute sql failed when updateUploadCursor");
            ((C1527670prB) awS151S0400000_23.l0).getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(e), "[DBServiceImplV4] "));
            return Boolean.FALSE;
        }
    }

    public static final Object invoke$2(AwS151S0400000_23 awS151S0400000_23) {
        if (((C1533900q1E) awS151S0400000_23.l0).LIZLLL && !((C1533900q1E) awS151S0400000_23.l0).LJIILL && !Intrinsics.LJFF(((RequestParams) awS151S0400000_23.l1).enableMemoryCache, Boolean.TRUE)) {
            C1533880q1C.LIZJ("ResourceGroup", "prefetch", "destroyed on prefetch", null, null);
        } else {
            ((C1533900q1E) awS151S0400000_23.l0).LIZIZ((C1533910q1F) awS151S0400000_23.l2, false, new AwS602S0100000_23((Function1) awS151S0400000_23.l3, (Function1<? super InterfaceC1540940qCa, Unit>) 56));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS151S0400000_23 awS151S0400000_23) {
        Object c098200Yq;
        if (((C1534110q1Z) awS151S0400000_23.l0).LIZLLL()) {
            Object obj = null;
            AbstractC1522730pjD abstractC1522730pjDLJI = C1534080q1W.LJI((C1534110q1Z) awS151S0400000_23.l0, (AbstractC1522680pj8) awS151S0400000_23.l1, null);
            if (abstractC1522730pjDLJI != null) {
                C1534080q1W.LJIIJ(abstractC1522730pjDLJI, (Map) awS151S0400000_23.l2, (C1534110q1Z) awS151S0400000_23.l0, (C1533790q13) awS151S0400000_23.l3);
                C1533790q13 c1533790q13 = (C1533790q13) awS151S0400000_23.l3;
                if (c1533790q13.LIZIZ && !c1533790q13.LJI) {
                    if (!abstractC1522730pjDLJI.LJ) {
                        abstractC1522730pjDLJI.close();
                        ((C1534110q1Z) awS151S0400000_23.l0).LIZJ(true);
                        C1534250q1n.LJII("TTNetDepender", "response does not support cache", false);
                    } else {
                        try {
                            c098200Yq = new C1534010q1P(abstractC1522730pjDLJI.LJI, c1533790q13, null);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = c098200Yq;
                        }
                        C1534010q1P c1534010q1P = (C1534010q1P) obj;
                        if (c1534010q1P != null) {
                            c1534010q1P.LJIJJLI((C1533790q13) awS151S0400000_23.l3);
                            try {
                                C1534020q1Q.LIZIZ(abstractC1522730pjDLJI, new C1534000q1O(c1534010q1P)).LIZIZ((C1534320q1u) abstractC1522730pjDLJI.LIZJ.LJI.getValue());
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                        }
                    }
                } else {
                    abstractC1522730pjDLJI.close();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS151S0400000_23 awS151S0400000_23) {
        INetworkChunk iNetworkChunk;
        INetworkChunk iNetworkChunk2 = ((C1515960pYI) awS151S0400000_23.l0).LIZIZ;
        if (iNetworkChunk2 != null) {
            iNetworkChunk2.LIZIZ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((C0POE) awS151S0400000_23.l1).onNext(awS151S0400000_23.l2);
            ((C1515960pYI) awS151S0400000_23.l0).LIZLLL += (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            C644110POf c644110POf = (C644110POf) awS151S0400000_23.l3;
            c644110POf.LIZ = ((C1515960pYI) awS151S0400000_23.l0).LIZLLL;
            c644110POf.LJII = System.currentTimeMillis();
            iNetworkChunk = ((C1515960pYI) awS151S0400000_23.l0).LIZIZ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ((C1515960pYI) awS151S0400000_23.l0).LIZ(new AwS424S0200000_23((C0POE) awS151S0400000_23.l1, th, (Throwable) 34));
                iNetworkChunk = ((C1515960pYI) awS151S0400000_23.l0).LIZIZ;
                if (iNetworkChunk != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                INetworkChunk iNetworkChunk3 = ((C1515960pYI) awS151S0400000_23.l0).LIZIZ;
                if (iNetworkChunk3 != null) {
                    iNetworkChunk3.LIZ();
                }
                throw th2;
            }
        }
        if (iNetworkChunk != null) {
            iNetworkChunk.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS151S0400000_23 awS151S0400000_23) {
        INetworkChunk iNetworkChunk;
        INetworkChunk iNetworkChunk2 = ((C1515930pYF) awS151S0400000_23.l0).LIZIZ;
        if (iNetworkChunk2 != null) {
            iNetworkChunk2.LIZIZ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((C0POE) awS151S0400000_23.l1).onNext(awS151S0400000_23.l2);
            ((C1515930pYF) awS151S0400000_23.l0).LIZLLL += (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            C644110POf c644110POf = (C644110POf) awS151S0400000_23.l3;
            c644110POf.LIZ = ((C1515930pYF) awS151S0400000_23.l0).LIZLLL;
            c644110POf.LJII = System.currentTimeMillis();
            iNetworkChunk = ((C1515930pYF) awS151S0400000_23.l0).LIZIZ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ((C1515930pYF) awS151S0400000_23.l0).LIZ(new AwS424S0200000_23((C0POE) awS151S0400000_23.l1, th, (Throwable) 45));
                iNetworkChunk = ((C1515930pYF) awS151S0400000_23.l0).LIZIZ;
                if (iNetworkChunk != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                INetworkChunk iNetworkChunk3 = ((C1515930pYF) awS151S0400000_23.l0).LIZIZ;
                if (iNetworkChunk3 != null) {
                    iNetworkChunk3.LIZ();
                }
                throw th2;
            }
        }
        if (iNetworkChunk != null) {
            iNetworkChunk.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0400000_23(C1515930pYF c1515930pYF, C1515930pYF c1515930pYF2, C0POE<T> c0poe, T t, C644110POf c644110POf) {
        super(0);
        this.$t = c644110POf;
        this.l0 = c1515930pYF;
        this.l1 = c1515930pYF2;
        this.l2 = c0poe;
        this.l3 = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0400000_23(C1515960pYI c1515960pYI, C1515960pYI c1515960pYI2, C0POE<T> c0poe, T t, C644110POf c644110POf) {
        super(0);
        this.$t = c644110POf;
        this.l0 = c1515960pYI;
        this.l1 = c1515960pYI2;
        this.l2 = c0poe;
        this.l3 = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0400000_23(C1527670prB c1527670prB, C801490VcJ c801490VcJ, List list, List list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1527670prB;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = c801490VcJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0400000_23(C1527670prB c1527670prB, C1527670prB c1527670prB2, List<? extends C801550VcP> list, List<C801490VcJ> list2, List<String> list3) {
        super(0);
        this.$t = list3;
        this.l0 = c1527670prB;
        this.l1 = c1527670prB2;
        this.l2 = list;
        this.l3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0400000_23(C1533900q1E c1533900q1E, C1533900q1E c1533900q1E2, RequestParams requestParams, C1533910q1F c1533910q1F, Function1<? super C1533790q13, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c1533900q1E;
        this.l1 = c1533900q1E2;
        this.l2 = requestParams;
        this.l3 = c1533910q1F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0400000_23(C1534110q1Z c1534110q1Z, C1534110q1Z c1534110q1Z2, AbstractC1522680pj8 abstractC1522680pj8, Map<String, String> map, C1533790q13 c1533790q13) {
        super(0);
        this.$t = c1533790q13;
        this.l0 = c1534110q1Z;
        this.l1 = c1534110q1Z2;
        this.l2 = abstractC1522680pj8;
        this.l3 = map;
    }
}
