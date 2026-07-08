package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS11S1010000_11 extends C09AY implements Function0 {
    public final int $t;
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
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S1010000_11 awS11S1010000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpChecker[");
        sbLIZ.append(awS11S1010000_11.s0);
        sbLIZ.append("] activeUpdater: canApplySlot=");
        sbLIZ.append(awS11S1010000_11.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS11S1010000_11 awS11S1010000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpChecker[");
        sbLIZ.append(awS11S1010000_11.s0);
        sbLIZ.append("] densityUpdater: outreach=");
        sbLIZ.append(awS11S1010000_11.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS11S1010000_11 awS11S1010000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpChecker[");
        sbLIZ.append(awS11S1010000_11.s0);
        sbLIZ.append("] enableUpdater: inPriorityList=");
        sbLIZ.append(awS11S1010000_11.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS11S1010000_11 awS11S1010000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runtime ability mount fcp node: ");
        sbLIZ.append(awS11S1010000_11.s0);
        sbLIZ.append(": mount state: ");
        sbLIZ.append(awS11S1010000_11.z1);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1010000_11(String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
