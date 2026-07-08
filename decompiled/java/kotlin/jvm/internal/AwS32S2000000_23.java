package kotlin.jvm.internal;

import X.C09AY;
import X.C1535250q3P;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS32S2000000_23 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS32S2000000_23 awS32S2000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitToPreloaderManager#preloadName=");
        sbLIZ.append(awS32S2000000_23.s0);
        sbLIZ.append(", scene=");
        sbLIZ.append(awS32S2000000_23.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS32S2000000_23 awS32S2000000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real action invoke directly preloadName=");
        sbLIZ.append(awS32S2000000_23.s0);
        sbLIZ.append(", scene=");
        sbLIZ.append(awS32S2000000_23.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS32S2000000_23 awS32S2000000_23) {
        String str = awS32S2000000_23.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url: ");
        sbLIZ.append(awS32S2000000_23.s1);
        return new C1535250q3P("ResourceGroup", str, C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S2000000_23(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
