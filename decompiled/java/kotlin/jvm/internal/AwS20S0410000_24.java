package kotlin.jvm.internal;

import X.C09AY;
import X.C1606970rv5;
import X.C1608980ryK;
import X.C1608990ryL;
import X.C1609000ryM;
import X.C1609060ryS;
import X.C1612160s3S;
import X.C1612930s4h;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.EnumC1612690s4J;
import X.InterfaceC1606880ruw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS20S0410000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0410000_24 awS20S0410000_24) {
        C1612930s4h.LIZIZ.LIZ(((C1612160s3S) awS20S0410000_24.l0).LLILLJJLI.LIZ(), Boolean.valueOf(awS20S0410000_24.z4), ((SeriesDetailDescriptionAssem) awS20S0410000_24.l1).Jo().LLILLJJLI, ((EnumC1612690s4J) awS20S0410000_24.l2).getKey(), null, Boolean.FALSE, null, (List) awS20S0410000_24.l3, Boolean.valueOf(((SeriesDetailDescriptionAssem) awS20S0410000_24.l1).Jo().LLJJIJI));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0410000_24 awS20S0410000_24) {
        EnumC1607270rvZ enumC1607270rvZ;
        C1608980ryK c1608980ryK = (C1608980ryK) awS20S0410000_24.l0;
        ConcurrentHashMap<EnumC1608710rxt, List<C1609000ryM>> concurrentHashMap = c1608980ryK.LJII;
        boolean z = awS20S0410000_24.z4;
        Object obj = awS20S0410000_24.l1;
        EnumC1607270rvZ enumC1607270rvZ2 = (EnumC1607270rvZ) awS20S0410000_24.l2;
        Function2 function2 = (Function2) awS20S0410000_24.l3;
        synchronized (concurrentHashMap) {
            try {
                c1608980ryK.LJIIJ = false;
                if (z) {
                    Iterator<Map.Entry<EnumC1608710rxt, List<C1609000ryM>>> it2 = c1608980ryK.LJII.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().clear();
                    }
                    c1608980ryK.LJIIIIZZ.clear();
                    c1608980ryK.LJIIIZ.clear();
                    c1608980ryK.LJIIJ = true;
                }
                c1608980ryK.LIZIZ(obj, !z, enumC1607270rvZ2);
                HashMap map = new HashMap();
                for (Map.Entry<EnumC1608710rxt, C1609000ryM> entry : c1608980ryK.LJIIIIZZ.entrySet()) {
                    entry.getKey();
                    C1609000ryM value = entry.getValue();
                    if (value != null && (enumC1607270rvZ = value.LIZ) != null) {
                        InterfaceC1606880ruw interfaceC1606880ruw = value.LIZIZ;
                        if (value.LIZJ.LIZ() instanceof C1606970rv5) {
                            map.put(enumC1607270rvZ, interfaceC1606880ruw);
                        }
                    }
                }
                ConcurrentHashMap<EnumC1608710rxt, C1609000ryM> concurrentHashMap2 = c1608980ryK.LJIIIIZZ;
                map.isEmpty();
                function2.invoke(new C1608990ryL(concurrentHashMap2, map), Boolean.valueOf(c1608980ryK.LJIIJ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0410000_24(C1608980ryK c1608980ryK, boolean z, Object obj, EnumC1607270rvZ enumC1607270rvZ, C1609060ryS c1609060ryS, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1608980ryK;
        this.z4 = z;
        this.l1 = obj;
        this.l2 = enumC1607270rvZ;
        this.l3 = c1609060ryS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0410000_24(C1612160s3S c1612160s3S, C1612160s3S c1612160s3S2, boolean z, SeriesDetailDescriptionAssem seriesDetailDescriptionAssem, EnumC1612690s4J enumC1612690s4J, List<PurchaseOption> list) {
        super(0);
        this.$t = list;
        this.l0 = c1612160s3S;
        this.z4 = c1612160s3S2;
        this.l1 = z;
        this.l2 = seriesDetailDescriptionAssem;
        this.l3 = enumC1612690s4J;
    }
}
