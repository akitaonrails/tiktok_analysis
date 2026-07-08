package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS59S0010000_16 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AwS59S0010000_16 awS59S0010000_16) {
        return String.valueOf(awS59S0010000_16.z0);
    }

    public static final Object invoke$1(AwS59S0010000_16 awS59S0010000_16) {
        return String.valueOf(awS59S0010000_16.z0);
    }

    public static final Object invoke$2(AwS59S0010000_16 awS59S0010000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init ");
        sbLIZ.append(awS59S0010000_16.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0010000_16(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
