package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS54S0000100_24 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S0000100_24 awS54S0000100_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ForegroundTracker] heartbeat disabled (intervalMs=");
        sbLIZ.append(awS54S0000100_24.j0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS54S0000100_24 awS54S0000100_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[OfflinePush] reach bottom over ");
        sbLIZ.append(awS54S0000100_24.j0);
        sbLIZ.append("ms, report STARVE");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS54S0000100_24 awS54S0000100_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[OfflinePush] buffering over ");
        sbLIZ.append(awS54S0000100_24.j0);
        sbLIZ.append("ms, report STUCK");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0000100_24(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
