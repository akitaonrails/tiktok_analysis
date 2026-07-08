package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C2188811AlT;
import X.C839540Wwa;
import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS68S0100100_13 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS68S0100100_13 awS68S0100100_13) {
        Long lInvoke;
        Function0<Long> function0 = ((C839540Wwa) awS68S0100100_13.l0).LIZ.LJJIJ;
        if (function0 == null || (lInvoke = function0.invoke()) == null) {
            return Long.valueOf((SystemClock.elapsedRealtimeNanos() - awS68S0100100_13.j1) / ((long) 1000000000));
        }
        return lInvoke;
    }

    public static final Object invoke$1(AwS68S0100100_13 awS68S0100100_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("httpEngineField tryCost:");
        sbLIZ.append(((C118300cf) awS68S0100100_13.l0).element);
        sbLIZ.append(" bodyDelayInterval:");
        sbLIZ.append(awS68S0100100_13.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0100100_13(C118300cf c118300cf, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0100100_13(C839540Wwa c839540Wwa, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c839540Wwa;
        this.j1 = j;
    }
}
