package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1309760kBi;
import X.C1537480q70;
import X.C649470Pdh;
import X.C651970Phj;
import X.C651980Phk;
import X.C651990Phl;
import X.C665240Q7m;
import X.C683390QrJ;
import X.EnumC668970QLv;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS98S0110000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS98S0110000_10 awS98S0110000_10, Object obj) {
        return C683390QrJ.LIZ((C683390QrJ) obj, null, null, null, 0, new Pair(Boolean.valueOf(awS98S0110000_10.z1), (EnumC668970QLv) awS98S0110000_10.l0), 15);
    }

    public static final Object invoke$1(AwS98S0110000_10 awS98S0110000_10, Object obj) {
        Map linkedHashMap;
        C651970Phj c651970Phj = (C651970Phj) obj;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (awS98S0110000_10.z1) {
            C651970Phj.LLILLL.getClass();
            C651990Phl c651990Phl = C651990Phl.LL;
            C651970Phj c651970Phj2 = (C651970Phj) C665240Q7m.LIZJ(C651970Phj.class);
            if (c651970Phj2 == null || (linkedHashMap = c651970Phj2.LL) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap2.putAll(linkedHashMap);
        } else {
            C651980Phk c651980Phk = C651970Phj.LLILLL;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            c651980Phk.getClass();
            C651980Phk.LJ(linkedHashMap3);
        }
        Map map = (Map) awS98S0110000_10.l0;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "pass_through_log_params")) {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.putAll(linkedHashMap4);
        Map<String, Map<String, String>> map2 = c651970Phj.LLILLJJLI;
        c651970Phj.getClass();
        return new C651970Phj(linkedHashMap2, map2);
    }

    public static final Object invoke$2(AwS98S0110000_10 awS98S0110000_10, Object obj) {
        C1309760kBi c1309760kBi = (C1309760kBi) obj;
        if (awS98S0110000_10.z1) {
            c1309760kBi.LJIIIZ = true;
            c1309760kBi.LJIIJ = true;
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String strLJIJI = ((C1537480q70) ((C01GW) awS98S0110000_10.l0).getValue()).LJIJI();
        c649470Pdh.getClass();
        C649470Pdh.LJJIIZ(c1309760kBi, strLJIJI);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S0110000_10(boolean z, boolean z2, C01GW<? extends C1537480q70> c01gw) {
        super(1);
        this.$t = c01gw;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0110000_10(boolean z, EnumC668970QLv enumC668970QLv, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC668970QLv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S0110000_10(boolean z, boolean z2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
