package kotlin.jvm.internal;

import X.C09AY;
import X.C1574060r40;
import X.C1574070r41;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS1S2000100_24 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
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

    public static final Object invoke$0(AwS1S2000100_24 awS1S2000100_24) {
        return C23250099c.LJ(C23271099x.INSTANCE, new C1574060r40(awS1S2000100_24.s0, awS1S2000100_24.j2, awS1S2000100_24.s1, null));
    }

    public static final Object invoke$1(AwS1S2000100_24 awS1S2000100_24) {
        return C23250099c.LJ(C23271099x.INSTANCE, new C1574070r41(awS1S2000100_24.s0, awS1S2000100_24.j2, awS1S2000100_24.s1, null));
    }

    public static final Object invoke$2(AwS1S2000100_24 awS1S2000100_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to add session ");
        sbLIZ.append(awS1S2000100_24.s0);
        sbLIZ.append(", page: ");
        sbLIZ.append(awS1S2000100_24.s1);
        sbLIZ.append(", duration: ");
        sbLIZ.append(awS1S2000100_24.j2);
        sbLIZ.append(" ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2000100_24(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.s1 = "anchor";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2000100_24(String str, long j, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2000100_24(String str, String str2, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.j2 = j;
    }
}
