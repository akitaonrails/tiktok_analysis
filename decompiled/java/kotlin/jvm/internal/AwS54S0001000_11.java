package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS54S0001000_11 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1012i0;

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

    public static final Object invoke$0(AwS54S0001000_11 awS54S0001000_11) {
        return Integer.valueOf(awS54S0001000_11.f1012i0);
    }

    public static final Object invoke$1(AwS54S0001000_11 awS54S0001000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected ");
        sbLIZ.append(awS54S0001000_11.f1012i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS54S0001000_11 awS54S0001000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLoadStart skipped, already SUCCESS, pos:==> ");
        sbLIZ.append(awS54S0001000_11.f1012i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS54S0001000_11 awS54S0001000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLoadStart, pos:==> ");
        sbLIZ.append(awS54S0001000_11.f1012i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0001000_11(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1012i0 = i;
    }
}
