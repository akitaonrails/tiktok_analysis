package kotlin.jvm.internal;

import X.C09AY;
import X.C13MA;
import X.C13MG;
import X.C13NV;
import X.C13NY;
import X.C13PN;
import X.C13PO;
import X.C2278408wI;
import X.InterfaceC1634240sd4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS15S0101100_30 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S0101100_30 awS15S0101100_30) {
        C13NY c13ny;
        String strExpectedMd5;
        CopyOnWriteArraySet<C13NY> copyOnWriteArraySet;
        C13NV c13nv = (C13NV) awS15S0101100_30.l0;
        C13MG c13mg = c13nv.LIZIZ.LJJJI;
        Effect effect = c13nv.LIZ;
        int i = awS15S0101100_30.i1;
        long j = awS15S0101100_30.j2;
        c13mg.getClass();
        if (effect != null && (strExpectedMd5 = EffectKt.expectedMd5(effect)) != null && (copyOnWriteArraySet = C13MG.LIZJ.get(strExpectedMd5)) != null) {
            Iterator<C13NY> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onProgress(effect, i, j);
            }
        }
        C13NV c13nv2 = (C13NV) awS15S0101100_30.l0;
        C13MA c13maLIZ = c13nv2.LIZIZ.LJJJIL.LIZ(c13nv2.LIZJ);
        if (!(c13maLIZ instanceof C13NY) || (c13ny = (C13NY) c13maLIZ) == null) {
            return null;
        }
        c13ny.onProgress(((C13NV) awS15S0101100_30.l0).LIZ, awS15S0101100_30.i1, awS15S0101100_30.j2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0101100_30 awS15S0101100_30) {
        InterfaceC1634240sd4 interfaceC1634240sd4;
        C13PN c13pn = (C13PN) awS15S0101100_30.l0;
        C13MA c13maLIZ = c13pn.LIZ.LJJJIL.LIZ(c13pn.LIZJ);
        ArrayList arrayList = null;
        if ((c13maLIZ instanceof InterfaceC1634240sd4) && (interfaceC1634240sd4 = (InterfaceC1634240sd4) c13maLIZ) != null) {
            interfaceC1634240sd4.onProgress(((C13PN) awS15S0101100_30.l0).LIZIZ, awS15S0101100_30.i1, awS15S0101100_30.j2);
        }
        C2278408wI c2278408wI = C13PN.LIZLLL;
        C13PN c13pn2 = (C13PN) awS15S0101100_30.l0;
        c2278408wI.LIZ();
        try {
            ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) C13PN.LJ).get(c13pn2.LIZIZ.getId());
            if (arrayList2 != null) {
                arrayList = new ArrayList(arrayList2);
            }
            c2278408wI.LIZIZ();
            if (arrayList != null) {
                C13PN c13pn3 = (C13PN) awS15S0101100_30.l0;
                int i = awS15S0101100_30.i1;
                long j = awS15S0101100_30.j2;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1634240sd4) it2.next()).onProgress(c13pn3.LIZIZ, i, j);
                }
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public static final Object invoke$2(AwS15S0101100_30 awS15S0101100_30) {
        InterfaceC1634240sd4 interfaceC1634240sd4;
        C13PO c13po = (C13PO) awS15S0101100_30.l0;
        C13MA c13maLIZ = c13po.LIZ.LJJJIL.LIZ(c13po.LIZJ);
        if ((c13maLIZ instanceof InterfaceC1634240sd4) && (interfaceC1634240sd4 = (InterfaceC1634240sd4) c13maLIZ) != null) {
            interfaceC1634240sd4.onProgress(((C13PO) awS15S0101100_30.l0).LIZIZ, awS15S0101100_30.i1, awS15S0101100_30.j2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0101100_30(C13NV c13nv, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c13nv;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0101100_30(C13PN c13pn, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c13pn;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0101100_30(C13PO c13po, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c13po;
        this.i1 = i;
        this.j2 = j;
    }
}
