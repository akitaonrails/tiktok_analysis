package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C2268608ui;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS28S2000000_3 extends C09AY implements Function0 {
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
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S2000000_3 awS28S2000000_3) {
        return new Pair(awS28S2000000_3.s0, awS28S2000000_3.s1);
    }

    public static final Object invoke$1(AwS28S2000000_3 awS28S2000000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle response skipped reason=apiData_null uniqueId=");
        sbLIZ.append(awS28S2000000_3.s0);
        sbLIZ.append(" apiPath=");
        sbLIZ.append(awS28S2000000_3.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS28S2000000_3 awS28S2000000_3) {
        return new C2268608ui(awS28S2000000_3.s0, false, awS28S2000000_3.s1, null, null, 15358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S2000000_3(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
