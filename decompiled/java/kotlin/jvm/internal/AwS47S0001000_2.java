package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS47S0001000_2 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1004i0;

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

    public static final Object invoke$0(AwS47S0001000_2 awS47S0001000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleBody SKIP (RESPONSE_TYPE_PARTIAL) bodySize=");
        sbLIZ.append(awS47S0001000_2.f1004i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS47S0001000_2 awS47S0001000_2) {
        boolean z;
        if (awS47S0001000_2.f1004i0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS47S0001000_2 awS47S0001000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState: ");
        sbLIZ.append(awS47S0001000_2.f1004i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS47S0001000_2 awS47S0001000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newState: ");
        sbLIZ.append(awS47S0001000_2.f1004i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS47S0001000_2 awS47S0001000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Portrait] isInactiveOverNMinutes(");
        sbLIZ.append(awS47S0001000_2.f1004i0);
        sbLIZ.append(") no ts, return false");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0001000_2(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1004i0 = i;
    }
}
