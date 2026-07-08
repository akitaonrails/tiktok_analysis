package kotlin.jvm.internal;

import X.C09AY;
import X.C0RFV;
import X.C291001Au;
import X.C690670R7h;
import X.C690680R7i;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS5S0011000_11 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS5S0011000_11 awS5S0011000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C690670R7h(awS5S0011000_11.z0, awS5S0011000_11.i1)), null, null, null, null, null, null, null, 534773759);
    }

    public static final Object invoke$1(AwS5S0011000_11 awS5S0011000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C690680R7i(awS5S0011000_11.z0, awS5S0011000_11.i1)), null, null, null, null, null, null, null, null, 535822335);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0011000_11(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
