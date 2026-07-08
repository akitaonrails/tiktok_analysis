package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS30S2000000_11 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS30S2000000_11 awS30S2000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNodeExposureDetector --- aid: ");
        sbLIZ.append(awS30S2000000_11.s0);
        sbLIZ.append(", component: ");
        sbLIZ.append(awS30S2000000_11.s1);
        sbLIZ.append(", slotView is onViewAttachedToWindow.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS30S2000000_11 awS30S2000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNodeExposureDetector --- aid: ");
        sbLIZ.append(awS30S2000000_11.s0);
        sbLIZ.append(", component: ");
        sbLIZ.append(awS30S2000000_11.s1);
        sbLIZ.append(", slotView is onViewDetachedFromWindow.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2000000_11(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
