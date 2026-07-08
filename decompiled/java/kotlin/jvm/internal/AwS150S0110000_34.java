package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C2190761Aoc;
import X.C2190781Aoe;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS150S0110000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS150S0110000_34 awS150S0110000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track session launch (sessionId = ");
        sbLIZ.append(((C2190781Aoe) awS150S0110000_34.l0).LIZ);
        sbLIZ.append(") inserted: ");
        sbLIZ.append(awS150S0110000_34.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS150S0110000_34 awS150S0110000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track session terminate (sessionId = ");
        sbLIZ.append(((C2190761Aoc) awS150S0110000_34.l0).LIZ);
        sbLIZ.append(") inserted: ");
        sbLIZ.append(awS150S0110000_34.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0110000_34(C2190761Aoc c2190761Aoc, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2190761Aoc;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0110000_34(C2190781Aoe c2190781Aoe, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2190781Aoe;
        this.z1 = z;
    }
}
