package kotlin.jvm.internal;

import X.C09AY;
import X.C1218610hoh;
import X.C1222560hv4;
import X.C1651206dK;
import X.C291001Au;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS6S0011000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0011000_19 awS6S0011000_19, Object obj) {
        return C1651206dK.LIZ((C1651206dK) obj, null, null, !awS6S0011000_19.z0, null, awS6S0011000_19.i1, false, 0, null, false, false, false, false, null, null, 524207);
    }

    public static final Object invoke$1(AwS6S0011000_19 awS6S0011000_19, Object obj) {
        return C1218610hoh.LIZ((C1218610hoh) obj, null, new C291001Au(new C1222560hv4(awS6S0011000_19.i1, awS6S0011000_19.z0)), null, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0011000_19(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0011000_19(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
