package kotlin.jvm.internal;

import X.C09AY;
import X.C1534750q2b;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS12S1010000_23 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S1010000_23 awS12S1010000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS12S1010000_23.s0);
        sbLIZ.append(" reuse status: ");
        sbLIZ.append(awS12S1010000_23.z1);
        return new C1534750q2b("PrefetchService", "prefetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static final Object invoke$1(AwS12S1010000_23 awS12S1010000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS12S1010000_23.s0);
        sbLIZ.append(" reuse finished, result: ");
        sbLIZ.append(awS12S1010000_23.z1);
        return new C1534750q2b("PrefetchService", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1010000_23(String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
