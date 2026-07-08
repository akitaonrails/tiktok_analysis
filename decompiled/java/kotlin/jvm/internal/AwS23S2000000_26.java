package kotlin.jvm.internal;

import X.C09AY;
import X.C1710290ubj;
import X.C1717630unZ;
import X.C1717920uo2;
import X.C291001Au;
import X.EnumC1717850unv;
import X.EnumC488160JCk;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS23S2000000_26 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S2000000_26 awS23S2000000_26, Object obj) {
        return C1717920uo2.LIZ((C1717920uo2) obj, null, null, null, false, EnumC1717850unv.API_ERROR, null, awS23S2000000_26.s0, awS23S2000000_26.s1, 0, null, 815);
    }

    public static final Object invoke$1(AwS23S2000000_26 awS23S2000000_26, Object obj) {
        return C1717630unZ.LIZ((C1717630unZ) obj, EnumC488160JCk.ERROR, awS23S2000000_26.s0, awS23S2000000_26.s1, true, null, null, 48);
    }

    public static final Object invoke$2(AwS23S2000000_26 awS23S2000000_26, Object obj) {
        C1710290ubj c1710290ubj = (C1710290ubj) obj;
        String str = awS23S2000000_26.s0;
        if (str == null && (str = awS23S2000000_26.s1) == null) {
            str = "";
        }
        return C1710290ubj.LIZ(c1710290ubj, null, false, false, new C291001Au(str), null, null, null, null, null, 1003);
    }

    public static final Object invoke$3(AwS23S2000000_26 awS23S2000000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS23S2000000_26.s0);
        laneParams.plusAssign("review_id", awS23S2000000_26.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S2000000_26(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
