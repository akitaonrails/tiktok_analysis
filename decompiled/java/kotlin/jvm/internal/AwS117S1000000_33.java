package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS117S1000000_33 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return this.s0;
            case 2:
                return this.s0;
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$3(AwS117S1000000_33 awS117S1000000_33) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getHeroName, aid: ");
        sbLIZ.append(awS117S1000000_33.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1000000_33(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
