package kotlin.jvm.internal;

import X.C09AY;
import X.C21337418eq;
import X.C21339818fE;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS65S0001000_32 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1024i0;

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

    public static final Object invoke$0(AwS65S0001000_32 awS65S0001000_32) {
        return new C21337418eq(awS65S0001000_32.f1024i0);
    }

    public static final Object invoke$1(AwS65S0001000_32 awS65S0001000_32) {
        return new C21339818fE(awS65S0001000_32.f1024i0);
    }

    public static final Object invoke$2(AwS65S0001000_32 awS65S0001000_32) {
        return new C21339818fE(awS65S0001000_32.f1024i0);
    }

    public static final Object invoke$3(AwS65S0001000_32 awS65S0001000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getResource: loaded from memory cache for tagType=");
        sbLIZ.append(awS65S0001000_32.f1024i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS65S0001000_32 awS65S0001000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getResource: no cached resource for tagType=");
        sbLIZ.append(awS65S0001000_32.f1024i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS65S0001000_32 awS65S0001000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getResource: loaded from Keva cache for tagType=");
        sbLIZ.append(awS65S0001000_32.f1024i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0001000_32(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1024i0 = i;
    }
}
