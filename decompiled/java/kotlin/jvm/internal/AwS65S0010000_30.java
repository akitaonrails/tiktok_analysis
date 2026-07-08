package kotlin.jvm.internal;

import X.C09AY;
import X.C13VP;
import X.C202120146s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS65S0010000_30 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0010000_30(int i) {
        super(0);
        this.$t = i;
        this.z0 = true;
    }

    public static final Object invoke$0(AwS65S0010000_30 awS65S0010000_30) {
        C202120146s.LIZ().storeBoolean("dex2oat_cmd_has_triggered", awS65S0010000_30.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS65S0010000_30 awS65S0010000_30) {
        C202120146s.LIZ().storeBoolean("dex2oat_task_has_triggered", awS65S0010000_30.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS65S0010000_30 awS65S0010000_30) {
        boolean z;
        if (awS65S0010000_30.z0) {
            C13VP.LIZ.getClass();
            z = C13VP.LIZIZ;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0010000_30(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
