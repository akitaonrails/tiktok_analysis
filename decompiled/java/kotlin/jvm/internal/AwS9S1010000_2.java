package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS9S1010000_2 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS9S1010000_2 awS9S1010000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KmpNode[");
        sbLIZ.append(awS9S1010000_2.s0);
        sbLIZ.append("] applyResult: active=");
        sbLIZ.append(awS9S1010000_2.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS9S1010000_2 awS9S1010000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert launch failed, sessionId = ");
        sbLIZ.append(awS9S1010000_2.s0);
        sbLIZ.append(", isForeground = ");
        sbLIZ.append(awS9S1010000_2.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1010000_2(String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
