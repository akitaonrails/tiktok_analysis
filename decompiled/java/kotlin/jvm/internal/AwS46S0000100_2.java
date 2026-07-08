package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS46S0000100_2 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switch callback --, leftUid = ");
        sbLIZ.append(awS46S0000100_2.j0);
        C20441214yg.LIZIZ("MultiMatchLayoutUtil", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryFireAllFirstScreenRendered → FIRE onFirstScreenDrawEnd maxTs=");
        sbLIZ.append(awS46S0000100_2.j0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageGroupLoadFinish firstScreenMaxDrawEnd=");
        sbLIZ.append(awS46S0000100_2.j0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkRenderCallback.onPageGroupLoadFinish sparkDrawEnd=");
        sbLIZ.append(awS46S0000100_2.j0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pbNaPrefetch readBytes hit, declaredLength=");
        sbLIZ.append(awS46S0000100_2.j0);
        sbLIZ.append(", threshold=262144");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS46S0000100_2 awS46S0000100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pbNaPrefetch readBytes fallback, declaredLength=");
        sbLIZ.append(awS46S0000100_2.j0);
        sbLIZ.append(", threshold=262144");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS46S0000100_2 awS46S0000100_2) {
        return Long.valueOf(awS46S0000100_2.j0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0000100_2(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
