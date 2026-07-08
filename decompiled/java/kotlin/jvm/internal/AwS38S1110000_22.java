package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C1416070mxB;
import X.C1417330mzD;
import X.C1418670n1N;
import X.C1656090tCJ;
import X.C2097608Jq;
import X.EnumC1416050mx9;
import X.InterfaceC1417440mzO;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS38S1110000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S1110000_22 awS38S1110000_22, Object obj) {
        C01TT.LIZLLL(new AwS19S1210000_22((C1656090tCJ) awS38S1110000_22.l1, (C1656090tCJ) obj, (List<String>) awS38S1110000_22.s0, (String) awS38S1110000_22.z2, false));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S1110000_22 awS38S1110000_22, Object obj) {
        String str;
        AutoCutThemeData next;
        InterfaceC1417440mzO interfaceC1417440mzOMc;
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        C1416070mxB c1416070mxB = c1418670n1N.LJIJJ.get(awS38S1110000_22.s0);
        if (c1416070mxB != null) {
            List<AutoCutThemeData> list = ((C1417330mzD) awS38S1110000_22.l1).d;
            String str2 = awS38S1110000_22.s0;
            Iterator<AutoCutThemeData> it2 = list.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.uuid, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AutoCutThemeData autoCutThemeData = next;
            if (autoCutThemeData != null) {
                str = autoCutThemeData.templateId;
            }
            if (!awS38S1110000_22.z2 || !c1416070mxB.LJI || str == null || ((interfaceC1417440mzOMc = ((C1417330mzD) awS38S1110000_22.l1).mc()) != null && interfaceC1417440mzOMc.QH(str))) {
                return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS38S1110000_22.s0, C1416070mxB.LIZ(c1416070mxB, EnumC1416050mx9.IDLE, null, false, 0.0f, 0.0f, 0.0f, false, 126))), false, 3145727);
            }
            return c1418670n1N;
        }
        return c1418670n1N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1110000_22(C1417330mzD c1417330mzD, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1417330mzD;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1110000_22(C1656090tCJ c1656090tCJ, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1656090tCJ;
        this.s0 = str;
        this.z2 = z;
    }
}
