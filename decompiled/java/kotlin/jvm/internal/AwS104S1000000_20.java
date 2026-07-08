package kotlin.jvm.internal;

import X.C09AY;
import X.C1325700kbQ;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class AwS104S1000000_20 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS104S1000000_20 awS104S1000000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetch image onFailure: ");
        sbLIZ.append(awS104S1000000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS104S1000000_20 awS104S1000000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetch image success: ");
        sbLIZ.append(awS104S1000000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS104S1000000_20 awS104S1000000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hit cache images: ");
        sbLIZ.append(awS104S1000000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS104S1000000_20 awS104S1000000_20) {
        return C1325700kbQ.LIZLLL(UriProtector.parse(awS104S1000000_20.s0));
    }

    public static final Object invoke$4(AwS104S1000000_20 awS104S1000000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("illegal colorStr in parseColor, ");
        sbLIZ.append(awS104S1000000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS104S1000000_20 awS104S1000000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uri.parse happen error. url:");
        sbLIZ.append(awS104S1000000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S1000000_20(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
