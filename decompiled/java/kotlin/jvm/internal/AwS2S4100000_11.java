package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS2S4100000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l4;
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
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S4100000_11 awS2S4100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(" -- checkOutreachStrategy#");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s3);
        sbLIZ.append(", ");
        sbLIZ.append((RuleHitState) awS2S4100000_11.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS2S4100000_11 awS2S4100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(" -- updateTempCache isPassStrategy: true #");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s3);
        sbLIZ.append(", ");
        sbLIZ.append((RuleHitState) awS2S4100000_11.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS2S4100000_11 awS2S4100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(" -- updateRealCache isPassStrategy: false #");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s3);
        sbLIZ.append(", ");
        sbLIZ.append((RuleHitState) awS2S4100000_11.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS2S4100000_11 awS2S4100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(" -- updateRealCache isSolidifyHit: true #");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s3);
        sbLIZ.append(", ");
        sbLIZ.append((RuleHitState) awS2S4100000_11.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS2S4100000_11 awS2S4100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(" -- updateRealCache isPassStrategy: true #");
        sbLIZ.append(awS2S4100000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s1);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s2);
        sbLIZ.append(", ");
        sbLIZ.append(awS2S4100000_11.s3);
        sbLIZ.append(", ");
        sbLIZ.append((RuleHitState) awS2S4100000_11.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S4100000_11(RuleHitState ruleHitState, String str, String str2, String str3, String str4, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l4 = ruleHitState;
    }
}
