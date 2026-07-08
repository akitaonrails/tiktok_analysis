package kotlin.jvm.internal;

import X.C09AY;
import X.C1728460v52;
import X.C1728990v5t;
import X.C1730290v7z;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS73S0100100_26 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AwS73S0100100_26 awS73S0100100_26) {
        RootData rootData = ((C1728990v5t) awS73S0100100_26.l0).LL;
        C1730290v7z.LIZ.getClass();
        String strLJIIIZ = C1730290v7z.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        C1728460v52.LIZ(rootData, "", strLJIIIZ, "template_msg_update", "display_total_success", "display_total", true, Long.valueOf(System.currentTimeMillis() - awS73S0100100_26.j1), null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS73S0100100_26 awS73S0100100_26) {
        RootData rootData = (RootData) awS73S0100100_26.l0;
        C1730290v7z.LIZ.getClass();
        String strLJIIIZ = C1730290v7z.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        C1728460v52.LIZ(rootData, "", strLJIIIZ, "template_msg_update", "display_total_success", "display_total", true, Long.valueOf(System.currentTimeMillis() - awS73S0100100_26.j1), null, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0100100_26(C1728990v5t c1728990v5t, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1728990v5t;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0100100_26(RootData rootData, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = rootData;
        this.j1 = j;
    }
}
