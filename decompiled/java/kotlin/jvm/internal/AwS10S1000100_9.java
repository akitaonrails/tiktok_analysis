package kotlin.jvm.internal;

import X.C09AY;
import X.C0NDE;
import X.C0NDV;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS10S1000100_9 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S1000100_9 awS10S1000100_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentSourceId= ");
        sbLIZ.append(awS10S1000100_9.s0);
        sbLIZ.append(", currentPosition= ");
        sbLIZ.append(awS10S1000100_9.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS10S1000100_9 awS10S1000100_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentSourceId= ");
        sbLIZ.append(awS10S1000100_9.s0);
        sbLIZ.append(", currentPosition= ");
        sbLIZ.append(awS10S1000100_9.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS10S1000100_9 awS10S1000100_9) {
        C0NDE c0nde = C0NDE.LIZ;
        String str = awS10S1000100_9.s0;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS10S1000100_9.j1;
        c0nde.getClass();
        C0NDE.LIZIZ(1, str, "continue_download", 0, jCurrentTimeMillis, false);
        C0NDV c0ndv = C0NDV.LIZ;
        String str2 = awS10S1000100_9.s0;
        if (str2 == null) {
            str2 = "";
        }
        c0ndv.getClass();
        C0NDV.LJIILJJIL(str2, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1000100_9(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
