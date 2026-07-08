package kotlin.jvm.internal;

import X.C09AY;
import X.C938970aXf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS57S2100000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS57S2100000_15 awS57S2100000_15) {
        ((C938970aXf) awS57S2100000_15.l2).LIZ(awS57S2100000_15.s0, awS57S2100000_15.s1, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S2100000_15 awS57S2100000_15) {
        ((C938970aXf) awS57S2100000_15.l2).LIZ(awS57S2100000_15.s0, awS57S2100000_15.s1, false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S2100000_15 awS57S2100000_15) {
        ((C938970aXf) awS57S2100000_15.l2).LIZ(awS57S2100000_15.s0, awS57S2100000_15.s1, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S2100000_15(C938970aXf c938970aXf, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c938970aXf;
        this.s0 = str;
        this.s1 = str2;
    }
}
