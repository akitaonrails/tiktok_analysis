package kotlin.jvm.internal;

import X.C09AY;
import X.C15YW;
import X.C2188811AlT;
import X.C288680BTe;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS66S0010000_31 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AwS66S0010000_31 awS66S0010000_31) {
        return Boolean.valueOf(awS66S0010000_31.z0);
    }

    public static final Object invoke$1(AwS66S0010000_31 awS66S0010000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShow=");
        sbLIZ.append(awS66S0010000_31.z0);
        sbLIZ.append(" | activeFlag=");
        C15YW.LIZ.getClass();
        sbLIZ.append(C15YW.LJIIIIZZ);
        sbLIZ.append(", lynxExp=");
        sbLIZ.append(C288680BTe.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0010000_31(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
