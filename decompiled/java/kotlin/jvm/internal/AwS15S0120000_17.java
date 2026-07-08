package kotlin.jvm.internal;

import X.C09AY;
import X.C1146260fw0;
import X.C20441214yg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS15S0120000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS15S0120000_17 awS15S0120000_17) {
        C20441214yg.LJIIIZ("lipengwei", "setPowerUp: animstart");
        ((C1146260fw0) awS15S0120000_17.l0).LIZ(awS15S0120000_17.z1, awS15S0120000_17.z2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0120000_17 awS15S0120000_17) {
        C20441214yg.LJIIIZ("lipengwei", "setPowerUp: onvisible");
        ((C1146260fw0) awS15S0120000_17.l0).LIZ(awS15S0120000_17.z1, awS15S0120000_17.z2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0120000_17(C1146260fw0 c1146260fw0, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1146260fw0;
        this.z1 = z;
        this.z2 = z2;
    }
}
