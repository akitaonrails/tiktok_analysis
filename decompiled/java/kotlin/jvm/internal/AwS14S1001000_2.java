package kotlin.jvm.internal;

import X.AbstractC2252651DEx;
import X.C065M;
import X.C09AY;
import X.C2188811AlT;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS14S1001000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object invoke$0(AwS14S1001000_2 awS14S1001000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] widgetsMap CLEAR: removed ");
        sbLIZ.append(awS14S1001000_2.i1);
        sbLIZ.append(" widgets [");
        sbLIZ.append(awS14S1001000_2.s0);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS14S1001000_2 awS14S1001000_2) {
        AbstractC2252651DEx abstractC2252651DEx = C065M.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quick_share_share_rate_");
        sbLIZ.append(awS14S1001000_2.s0);
        List listLJ = C065M.LJ(awS14S1001000_2.i1, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("quick_share_rate_score_");
        sbLIZ2.append(awS14S1001000_2.s0);
        return new Pair(listLJ, C065M.LJ(awS14S1001000_2.i1, C2188811AlT.LIZIZ(sbLIZ2)));
    }

    public static final Object invoke$2(AwS14S1001000_2 awS14S1001000_2) {
        AbstractC2252651DEx abstractC2252651DEx = C065M.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quick_share_share_rate_");
        sbLIZ.append(awS14S1001000_2.s0);
        List listLJ = C065M.LJ(awS14S1001000_2.i1, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("quick_share_rate_score_");
        sbLIZ2.append(awS14S1001000_2.s0);
        return new Pair(listLJ, C065M.LJ(awS14S1001000_2.i1, C2188811AlT.LIZIZ(sbLIZ2)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1001000_2(int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1001000_2(String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
