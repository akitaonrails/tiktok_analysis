package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS11S0020000_32 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;
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

    public static final Object invoke$0(AwS11S0020000_32 awS11S0020000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: trigger drag, lrMove=");
        sbLIZ.append(awS11S0020000_32.z0);
        sbLIZ.append(", hitSlot=");
        sbLIZ.append(awS11S0020000_32.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS11S0020000_32 awS11S0020000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: trigger drag, lrMove=");
        sbLIZ.append(awS11S0020000_32.z0);
        sbLIZ.append(", hitSlot=");
        sbLIZ.append(awS11S0020000_32.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0020000_32(boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
