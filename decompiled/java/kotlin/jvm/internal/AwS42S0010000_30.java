package kotlin.jvm.internal;

import X.C09AY;
import X.C14XB;
import X.C14XI;
import X.C1863810ybL;
import X.C294300BgC;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS42S0010000_30 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0010000_30(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        return C14XB.LIZ((C14XB) obj, false, awS42S0010000_30.z0, false, null, null, 29);
    }

    public static final Object invoke$1(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        return C14XB.LIZ((C14XB) obj, false, false, awS42S0010000_30.z0, null, null, 27);
    }

    public static final Object invoke$2(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        ((C1863810ybL) obj).LIZJ = !awS42S0010000_30.z0;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        boolean z = awS42S0010000_30.z0;
        return C14XI.LIZ((C14XI) obj, z, false, false, false, z, z, null, null, false, null, null, null, null, 16285);
    }

    public static final Object invoke$4(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        return C14XI.LIZ((C14XI) obj, false, true, C294300BgC.LIZ(), awS42S0010000_30.z0, false, false, null, null, false, null, null, null, null, 16354);
    }

    public static final Object invoke$5(AwS42S0010000_30 awS42S0010000_30, Object obj) {
        return C14XB.LIZ((C14XB) obj, awS42S0010000_30.z0, false, false, null, null, 30);
    }
}
