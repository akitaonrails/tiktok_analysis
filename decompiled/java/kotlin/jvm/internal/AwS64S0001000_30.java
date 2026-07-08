package kotlin.jvm.internal;

import X.C09AY;
import X.C202120146s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS64S0001000_30 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1023i0;

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

    public static final Object invoke$0(AwS64S0001000_30 awS64S0001000_30) {
        C202120146s.LIZ().storeInt("dex2oat_cmd_not_triggered_reason", awS64S0001000_30.f1023i0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S0001000_30 awS64S0001000_30) {
        C202120146s.LIZ().storeInt("dex2oat_cmd_execute_result", awS64S0001000_30.f1023i0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS64S0001000_30 awS64S0001000_30) {
        C202120146s.LIZ().storeInt("dex2oat_cmd_triggered_type", awS64S0001000_30.f1023i0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0001000_30(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1023i0 = i;
    }
}
