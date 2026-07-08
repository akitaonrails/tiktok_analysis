package kotlin.jvm.internal;

import X.C035J;
import X.C03JV;
import X.C03JW;
import X.C09AY;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S0020000_1 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    public static final Object invoke$0(AwS0S0020000_1 awS0S0020000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, new C03JW(awS0S0020000_1.z0, awS0S0020000_1.z1), null, null, null, null, null, null, -1, -1, -1, 1040383);
    }

    public static final Object invoke$1(AwS0S0020000_1 awS0S0020000_1, Object obj) {
        boolean z = awS0S0020000_1.z0;
        boolean z2 = awS0S0020000_1.z1;
        obj.getClass();
        return new C035J(z, false, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0020000_1(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
