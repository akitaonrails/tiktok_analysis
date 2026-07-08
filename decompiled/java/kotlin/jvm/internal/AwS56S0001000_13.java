package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS56S0001000_13 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1014i0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS56S0001000_13 awS56S0001000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postInvoke error, id=");
        sbLIZ.append(awS56S0001000_13.f1014i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS56S0001000_13 awS56S0001000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preInvoke error, id=");
        sbLIZ.append(awS56S0001000_13.f1014i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS56S0001000_13 awS56S0001000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startNestedScroll: axes=");
        sbLIZ.append(awS56S0001000_13.f1014i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS56S0001000_13 awS56S0001000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopNestedScroll: type=");
        sbLIZ.append(awS56S0001000_13.f1014i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0001000_13(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1014i0 = i;
    }
}
