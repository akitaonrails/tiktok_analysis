package kotlin.jvm.internal;

import X.AbstractC1522680pj8;
import X.C098200Yq;
import X.C09AY;
import X.C0POE;
import X.C0WYW;
import X.C0WYY;
import X.C1515820pY4;
import X.C1516010pYN;
import X.C1516040pYQ;
import X.C1516060pYS;
import X.C1516070pYT;
import X.C1516130pYZ;
import X.C1527670prB;
import X.C1533020pzo;
import X.C1533790q13;
import X.C1534070q1V;
import X.C1534080q1W;
import X.C1534750q2b;
import X.C1535890q4R;
import X.C1540860qCS;
import X.C1551680qTu;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C801490VcJ;
import X.EnumC1516190pYf;
import Y.ARunnableS56S0300000_23;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.sync.v4.presistence.AppDatabaseV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS267S0300000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS267S0300000_23 awS267S0300000_23) {
        k c098200Yq;
        boolean z;
        FutureTask<k> futureTask;
        Iterator it2 = ((Iterable) awS267S0300000_23.l0).iterator();
        C1540860qCS c1540860qCSLIZ = (C1540860qCS) awS267S0300000_23.l1;
        while (true) {
            C1540860qCS c1540860qCS = c1540860qCSLIZ;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                try {
                    HashMap<String, FutureTask<k>> map = C1535890q4R.LIZLLL;
                    if (map != null && (futureTask = map.get(str)) != null) {
                        futureTask.run();
                        c098200Yq = futureTask.get();
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                k kVar = (k) c098200Yq;
                if (kVar != null) {
                    Map map2 = (Map) awS267S0300000_23.l2;
                    C1535890q4R c1535890q4R = C1535890q4R.LIZ;
                    boolean z2 = !it2.hasNext();
                    c1535890q4R.getClass();
                    if (kVar instanceof h) {
                        h hVarLJIIL = kVar.LJIIL();
                        int size = hVarLJIIL.size();
                        c1540860qCSLIZ = c1540860qCS;
                        int i = 0;
                        for (k kVar2 : hVarLJIIL) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                k kVar3 = kVar2;
                                C1535890q4R c1535890q4R2 = C1535890q4R.LIZ;
                                if (z2 && i == size - 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c1535890q4R2.getClass();
                                c1540860qCSLIZ = C1535890q4R.LIZ(kVar3, c1540860qCSLIZ, str, map2, z);
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    } else {
                        c1540860qCSLIZ = C1535890q4R.LIZ(kVar, c1540860qCS, str, map2, z2);
                    }
                    if (c1540860qCSLIZ == null) {
                    }
                }
            }
            return Unit.LIZ;
        }
    }

    public static final Object invoke$1(AwS267S0300000_23 awS267S0300000_23) {
        ((C1527670prB) awS267S0300000_23.l0).LJLIL().runInTransaction(new ARunnableS56S0300000_23((C801490VcJ) awS267S0300000_23.l2, (C1527670prB) awS267S0300000_23.l0, (ArrayList) awS267S0300000_23.l1, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS267S0300000_23 awS267S0300000_23) {
        AppDatabaseV4 appDatabaseV4LJLIL = ((C1527670prB) awS267S0300000_23.l0).LJLIL();
        final C1527670prB c1527670prB = (C1527670prB) awS267S0300000_23.l0;
        final C0WYY c0wyy = (C0WYY) awS267S0300000_23.l1;
        final List list = (List) awS267S0300000_23.l2;
        return appDatabaseV4LJLIL.runInTransaction(new Callable() { // from class: X.0pr9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1527670prB c1527670prB2 = c1527670prB;
                C0WYY c0wyy2 = c0wyy;
                List<? extends C0WYW> list2 = list;
                C1C7U.LIZ("DBServiceImplV4$updateSnapshotAndDeleteSyncLog$1@34b1.invoke$1L");
                Boolean boolValueOf = Boolean.valueOf(c1527670prB2.LJLILLLLZI().LIZJ(c0wyy2) > 0 && c1527670prB2.LJIJI(list2));
                C1C7U.LIZIZ("DBServiceImplV4$updateSnapshotAndDeleteSyncLog$1@34b1.invoke$1L");
                return boolValueOf;
            }
        });
    }

    public static final Object invoke$3(AwS267S0300000_23 awS267S0300000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestMap:");
        sbLIZ.append((Map) awS267S0300000_23.l0);
        sbLIZ.append(" responseMap:");
        sbLIZ.append((Map) awS267S0300000_23.l1);
        sbLIZ.append(" operation: ");
        sbLIZ.append((C1551680qTu) awS267S0300000_23.l2);
        return new C1534750q2b("GeckoUtils", "onCheckServerVersionSuccess", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$4(AwS267S0300000_23 awS267S0300000_23) {
        C1534080q1W.LJIIL((AbstractC1522680pj8) awS267S0300000_23.l0, (C1534070q1V) awS267S0300000_23.l1, (C1533790q13) awS267S0300000_23.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS267S0300000_23 awS267S0300000_23) {
        C1534080q1W.LJIIL((AbstractC1522680pj8) awS267S0300000_23.l0, (C1534070q1V) awS267S0300000_23.l1, (C1533790q13) awS267S0300000_23.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS267S0300000_23 awS267S0300000_23) {
        INetworkChunk iNetworkChunk;
        INetworkChunk iNetworkChunk2 = ((C1516070pYT) awS267S0300000_23.l0).LIZIZ;
        if (iNetworkChunk2 != null) {
            iNetworkChunk2.LIZIZ();
        }
        try {
            ((C0POE) awS267S0300000_23.l1).onNext(awS267S0300000_23.l2);
            iNetworkChunk = ((C1516070pYT) awS267S0300000_23.l0).LIZIZ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ((C1516070pYT) awS267S0300000_23.l0).LIZIZ(new AwS424S0200000_23((C0POE) awS267S0300000_23.l1, th, (Throwable) 37));
                iNetworkChunk = ((C1516070pYT) awS267S0300000_23.l0).LIZIZ;
                if (iNetworkChunk != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                INetworkChunk iNetworkChunk3 = ((C1516070pYT) awS267S0300000_23.l0).LIZIZ;
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

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS267S0300000_23 awS267S0300000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=ordered_block requestId=");
        sbLIZ.append(((C1515820pY4) awS267S0300000_23.l0).LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(((C1516130pYZ) awS267S0300000_23.l1).LIZ);
        sbLIZ.append(" match=");
        C1516040pYQ c1516040pYQ = (C1516040pYQ) awS267S0300000_23.l2;
        C1516060pYS c1516060pYS = ((C1516130pYZ) awS267S0300000_23.l1).LIZLLL;
        c1516040pYQ.getClass();
        sbLIZ.append(C1516040pYQ.LIZIZ(c1516060pYS));
        sbLIZ.append(" deferState=");
        C1516040pYQ c1516040pYQ2 = (C1516040pYQ) awS267S0300000_23.l2;
        EnumC1516190pYf enumC1516190pYf = ((C1516130pYZ) awS267S0300000_23.l1).LJFF;
        c1516040pYQ2.getClass();
        sbLIZ.append(enumC1516190pYf.name());
        sbLIZ.append(" timeoutAt=");
        sbLIZ.append(((C1516130pYZ) awS267S0300000_23.l1).LJI);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS267S0300000_23 awS267S0300000_23) {
        INetworkChunk iNetworkChunk;
        INetworkChunk iNetworkChunk2 = ((C1516010pYN) awS267S0300000_23.l0).LIZIZ;
        if (iNetworkChunk2 != null) {
            iNetworkChunk2.LIZIZ();
        }
        try {
            ((C0POE) awS267S0300000_23.l1).onNext(awS267S0300000_23.l2);
            iNetworkChunk = ((C1516010pYN) awS267S0300000_23.l0).LIZIZ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ((C1516010pYN) awS267S0300000_23.l0).LIZIZ(new AwS424S0200000_23((C0POE) awS267S0300000_23.l1, th, (Throwable) 48));
                iNetworkChunk = ((C1516010pYN) awS267S0300000_23.l0).LIZIZ;
                if (iNetworkChunk != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                INetworkChunk iNetworkChunk3 = ((C1516010pYN) awS267S0300000_23.l0).LIZIZ;
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
    public AwS267S0300000_23(C1515820pY4 c1515820pY4, C1515820pY4<byte[]> c1515820pY42, C1516130pYZ<Object> c1516130pYZ, C1516040pYQ<Object> c1516040pYQ) {
        super(0);
        this.$t = c1516040pYQ;
        this.l0 = c1515820pY4;
        this.l1 = c1515820pY42;
        this.l2 = c1516130pYZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS267S0300000_23(C1516010pYN c1516010pYN, C1516010pYN c1516010pYN2, C0POE<Object> c0poe, Object obj) {
        super(0);
        this.$t = obj;
        this.l0 = c1516010pYN;
        this.l1 = c1516010pYN2;
        this.l2 = c0poe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS267S0300000_23(C1516070pYT c1516070pYT, C1516070pYT c1516070pYT2, C0POE<Object> c0poe, Object obj) {
        super(0);
        this.$t = obj;
        this.l0 = c1516070pYT;
        this.l1 = c1516070pYT2;
        this.l2 = c0poe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS267S0300000_23(AbstractC1522680pj8 abstractC1522680pj8, C1534070q1V c1534070q1V, C1533790q13 c1533790q13, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1522680pj8;
        this.l1 = c1534070q1V;
        this.l2 = c1533790q13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS267S0300000_23(C1527670prB c1527670prB, C1527670prB c1527670prB2, C0WYY c0wyy, List<? extends C0WYW> list) {
        super(0);
        this.$t = list;
        this.l0 = c1527670prB;
        this.l1 = c1527670prB2;
        this.l2 = c0wyy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS267S0300000_23(C1527670prB c1527670prB, C1527670prB c1527670prB2, ArrayList<C0WYW> arrayList, C801490VcJ c801490VcJ) {
        super(0);
        this.$t = c801490VcJ;
        this.l0 = c1527670prB;
        this.l1 = c1527670prB2;
        this.l2 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS267S0300000_23(Iterable iterable, C1533020pzo c1533020pzo, Map map, int i) {
        super(0);
        this.$t = i;
        this.l0 = iterable;
        this.l1 = c1533020pzo;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS267S0300000_23(Map map, Map<String, List<Pair<String, Long>>> map2, Map<String, List<UpdatePackage>> map3, C1551680qTu c1551680qTu) {
        super(0);
        this.$t = c1551680qTu;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
    }
}
