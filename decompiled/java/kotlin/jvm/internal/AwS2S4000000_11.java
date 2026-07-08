package kotlin.jvm.internal;

import X.C09AY;
import X.C1619720sFe;
import X.C1894320zOY;
import X.C1895820zQy;
import X.C2188811AlT;
import X.InterfaceC1897260zTI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS2S4000000_11 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS2S4000000_11 awS2S4000000_11) {
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        String str = awS2S4000000_11.s0;
        String str2 = awS2S4000000_11.s1;
        String str3 = awS2S4000000_11.s2;
        String str4 = awS2S4000000_11.s3;
        c1895820zQy.getClass();
        C1894320zOY.LIZ.getClass();
        Map<String, String> mapLIZIZ = C1894320zOY.LIZIZ(str, str2, str3, str4);
        mapLIZIZ.put("module_form", "share_button");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("invite_card_show", mapLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S4000000_11 awS2S4000000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4000000_11.s0);
        sbLIZ.append(" -- recordShowProxy#");
        sbLIZ.append(awS2S4000000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4000000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4000000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4000000_11.s3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S4000000_11(String str, String str2, String str3, String str4, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
