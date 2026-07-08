package kotlin.jvm.internal;

import X.C09AY;
import X.C0WR6;
import X.C2188811AlT;
import X.C2261941Dg8;
import X.C823230WRd;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS51S0000100_13 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS51S0000100_13 awS51S0000100_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native doHttpPost[reqId] submitted with req_id: ");
        sbLIZ.append(awS51S0000100_13.j0);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS51S0000100_13 awS51S0000100_13) {
        if (C2261941Dg8.LIZIZ) {
            C2261941Dg8.LJIILIIL = awS51S0000100_13.j0;
        } else {
            C2261941Dg8.LJIIL = awS51S0000100_13.j0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS51S0000100_13 awS51S0000100_13) {
        C0WR6 c0wr6Query = C823230WRd.LIZIZ.query("app_uptime");
        Object objLIZIZ = null;
        if (c0wr6Query != null) {
            objLIZIZ = c0wr6Query.LIZIZ();
        }
        if (!(objLIZIZ instanceof Long) || objLIZIZ == null) {
            return Long.valueOf((SystemClock.elapsedRealtimeNanos() - awS51S0000100_13.j0) / ((long) 1000000000));
        }
        return objLIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0000100_13(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
