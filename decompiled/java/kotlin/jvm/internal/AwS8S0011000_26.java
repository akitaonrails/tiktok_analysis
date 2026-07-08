package kotlin.jvm.internal;

import X.C09AY;
import X.C1761290vvz;
import X.C1761300vw0;
import X.EnumC1754390vkr;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS8S0011000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

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

    public static final Object invoke$0(AwS8S0011000_26 awS8S0011000_26, Object obj) {
        C1761290vvz c1761290vvzLIZ;
        C1761300vw0 c1761300vw0 = (C1761300vw0) obj;
        C1761290vvz c1761290vvz = c1761300vw0.LIZIZ;
        if (c1761290vvz != null) {
            c1761290vvzLIZ = C1761290vvz.LIZ(c1761290vvz, Integer.valueOf(awS8S0011000_26.i1), Boolean.valueOf(awS8S0011000_26.z0), false, null, null, 2147483623);
        } else {
            c1761290vvzLIZ = null;
        }
        return C1761300vw0.LIZ(c1761300vw0, c1761290vvzLIZ);
    }

    public static final Object invoke$1(AwS8S0011000_26 awS8S0011000_26, Object obj) {
        EnumC1754390vkr enumC1754390vkr;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "contact_seller");
        if (awS8S0011000_26.z0) {
            enumC1754390vkr = EnumC1754390vkr.NUMBER;
        } else {
            enumC1754390vkr = EnumC1754390vkr.NONE;
        }
        laneParams.plusAssign("red_dot_type", enumC1754390vkr.getValue());
        laneParams.plusAssign("red_dot_number", Integer.valueOf(awS8S0011000_26.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0011000_26(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0011000_26(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
