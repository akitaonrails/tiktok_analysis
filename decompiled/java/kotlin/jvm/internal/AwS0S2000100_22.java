package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS0S2000100_22 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S2000100_22 awS0S2000100_22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parse extra params failed, sessionId = ");
        sbLIZ.append(awS0S2000100_22.s0);
        sbLIZ.append(", pageName = ");
        sbLIZ.append(awS0S2000100_22.s1);
        sbLIZ.append(", duration = ");
        sbLIZ.append(awS0S2000100_22.j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS0S2000100_22 awS0S2000100_22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert page failed, sessionId = ");
        sbLIZ.append(awS0S2000100_22.s0);
        sbLIZ.append(", pageName = ");
        sbLIZ.append(awS0S2000100_22.s1);
        sbLIZ.append(", duration = ");
        sbLIZ.append(awS0S2000100_22.j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2000100_22(String str, String str2, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.j2 = j;
    }
}
