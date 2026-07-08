package kotlin.jvm.internal;

import X.C09AY;
import X.C1666460tT2;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0122001_25 extends C09AY implements Function2 {
    public final int $t;
    public float f5;
    public int i3;
    public int i4;
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

    public static final Object invoke$0(AwS0S0122001_25 awS0S0122001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666460tT2.LIZ(awS0S0122001_25.z1, awS0S0122001_25.f5, (InterfaceC1685750ty9) awS0S0122001_25.l0, awS0S0122001_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0122001_25.i3 | 1), awS0S0122001_25.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0122001_25 awS0S0122001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666460tT2.LIZ(awS0S0122001_25.z1, awS0S0122001_25.f5, (InterfaceC1685750ty9) awS0S0122001_25.l0, awS0S0122001_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0122001_25.i3 | 1), awS0S0122001_25.i4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0122001_25(boolean z, float f, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z2, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.z1 = z;
        this.f5 = f;
        this.l0 = interfaceC1685750ty9;
        this.z2 = z2;
        this.i3 = i;
        this.i4 = i2;
    }
}
