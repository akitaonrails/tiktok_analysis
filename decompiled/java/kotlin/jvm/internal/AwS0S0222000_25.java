package kotlin.jvm.internal;

import X.C09AY;
import X.C0NV4;
import X.C1294720jnS;
import X.C1678920tn8;
import X.C1683170ttz;
import X.C341440Da2;
import X.InterfaceC1679000tnG;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0222000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S0222000_25 awS0S0222000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1678920tn8 c1678920tn8 = C1678920tn8.LIZ;
            boolean z = awS0S0222000_25.z2;
            boolean z2 = awS0S0222000_25.z3;
            C0NV4 c0nv4 = (C0NV4) awS0S0222000_25.l0;
            InterfaceC1679000tnG interfaceC1679000tnG = (InterfaceC1679000tnG) awS0S0222000_25.l1;
            int i = awS0S0222000_25.i4;
            c1678920tn8.LIZ(z, z2, c0nv4, interfaceC1679000tnG, null, 0.0f, 0.0f, interfaceC1680500tpg, ((i >> 9) & 896) | ((i >> 6) & 14) | 12582912 | ((i >> 15) & 112) | ((awS0S0222000_25.i5 << 6) & 7168), 112);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0222000_25 awS0S0222000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683170ttz.LIZJ(awS0S0222000_25.z2, (C1294720jnS) awS0S0222000_25.l0, (Function0) awS0S0222000_25.l1, awS0S0222000_25.z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0222000_25.i4 | 1), awS0S0222000_25.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0222000_25(int i, int i2, C0NV4 c0nv4, InterfaceC1679000tnG interfaceC1679000tnG, boolean z, boolean z2, int i3) {
        super(2);
        this.$t = i3;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = c0nv4;
        this.l1 = interfaceC1679000tnG;
        this.i4 = i;
        this.i5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0222000_25(boolean z, boolean z2, C1294720jnS c1294720jnS, Function0<Unit> function0, boolean z3, int i, int i2) {
        super(2);
        this.$t = i2;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c1294720jnS;
        this.z3 = function0;
        this.i4 = z3 ? 1 : 0;
        this.i5 = i;
    }
}
