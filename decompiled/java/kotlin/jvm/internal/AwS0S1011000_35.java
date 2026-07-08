package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S1011000_35 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS0S1011000_35 awS0S1011000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addGeneralPlayerSource providerId: ");
        sbLIZ.append(awS0S1011000_35.s0);
        sbLIZ.append(", existed= ");
        sbLIZ.append(awS0S1011000_35.z1);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS0S1011000_35.i2);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS0S1011000_35.i2 + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS0S1011000_35 awS0S1011000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeFeedPlayerSource providerId: ");
        sbLIZ.append(awS0S1011000_35.s0);
        sbLIZ.append(", existed= ");
        sbLIZ.append(awS0S1011000_35.z1);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS0S1011000_35.i2);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS0S1011000_35.i2 - 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS0S1011000_35 awS0S1011000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeGeneralPlayerSource providerId: ");
        sbLIZ.append(awS0S1011000_35.s0);
        sbLIZ.append(", existed= ");
        sbLIZ.append(awS0S1011000_35.z1);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS0S1011000_35.i2);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS0S1011000_35.i2 - 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1011000_35(String str, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.z1 = z;
        this.i2 = i;
    }
}
