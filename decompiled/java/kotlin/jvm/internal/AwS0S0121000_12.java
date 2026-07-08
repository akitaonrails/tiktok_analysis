package kotlin.jvm.internal;

import X.C09AY;
import X.C1667550tUn;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS0S0121000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0121000_12 awS0S0121000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667550tUn.LJFF(awS0S0121000_12.z1, awS0S0121000_12.z2, (Function1) awS0S0121000_12.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0121000_12.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0121000_12 awS0S0121000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667550tUn.LJI(awS0S0121000_12.z1, awS0S0121000_12.z2, (Function1) awS0S0121000_12.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0121000_12.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0121000_12(int i, Function1 function1, boolean z, boolean z2, int i2) {
        super(2);
        this.$t = i2;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = function1;
        this.i3 = i;
    }
}
