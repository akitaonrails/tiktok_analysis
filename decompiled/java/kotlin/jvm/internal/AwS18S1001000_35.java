package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS18S1001000_35 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS18S1001000_35 awS18S1001000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addFeedExposureSource providerId: ");
        sbLIZ.append(awS18S1001000_35.s0);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS18S1001000_35.i1);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS18S1001000_35.i1 + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS18S1001000_35 awS18S1001000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addGeneralExposureSource providerId: ");
        sbLIZ.append(awS18S1001000_35.s0);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS18S1001000_35.i1);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS18S1001000_35.i1 + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS18S1001000_35 awS18S1001000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeFeedExposureSourceGroup sourceGroupUniqueId: ");
        sbLIZ.append(awS18S1001000_35.s0);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(awS18S1001000_35.i1);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS18S1001000_35.i1 - 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1001000_35(String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
