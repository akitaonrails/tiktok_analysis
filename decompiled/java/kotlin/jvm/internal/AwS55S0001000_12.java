package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS55S0001000_12 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1013i0;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S0001000_12 awS55S0001000_12) {
        boolean z;
        if (awS55S0001000_12.f1013i0 != -1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS55S0001000_12 awS55S0001000_12) {
        return Integer.valueOf(awS55S0001000_12.f1013i0);
    }

    public static final Object invoke$2(AwS55S0001000_12 awS55S0001000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[scrollToNext] ");
        sbLIZ.append(awS55S0001000_12.f1013i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS55S0001000_12 awS55S0001000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[scrollToPrev] ");
        sbLIZ.append(awS55S0001000_12.f1013i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS55S0001000_12 awS55S0001000_12) {
        boolean z;
        if (awS55S0001000_12.f1013i0 == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS55S0001000_12 awS55S0001000_12) {
        boolean z;
        if (awS55S0001000_12.f1013i0 == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS55S0001000_12 awS55S0001000_12) {
        return Integer.valueOf(awS55S0001000_12.f1013i0);
    }

    public static final Object invoke$7(AwS55S0001000_12 awS55S0001000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count: ");
        sbLIZ.append(awS55S0001000_12.f1013i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0001000_12(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1013i0 = i;
    }
}
