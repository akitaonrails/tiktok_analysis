package kotlin.jvm.internal;

import X.C09AY;
import X.C1294720jnS;
import X.C1683170ttz;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS13S0220000_25 extends C09AY implements Function2 {
    public final int $t;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS13S0220000_25 r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S0220000_25.invoke$0(kotlin.jvm.internal.AwS13S0220000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS13S0220000_25 awS13S0220000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (((C1294720jnS) awS13S0220000_25.l0) == null) {
            interfaceC1680500tpg.LJJIIJZLJL(-1854171206);
            C1683170ttz.LIZIZ(0, 0, interfaceC1680500tpg, (Function0) awS13S0220000_25.l1, awS13S0220000_25.z2, awS13S0220000_25.z3);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(-1854049624);
            C1683170ttz.LIZJ(awS13S0220000_25.z2, (C1294720jnS) awS13S0220000_25.l0, (Function0) awS13S0220000_25.l1, awS13S0220000_25.z3, interfaceC1680500tpg, 0, 0);
            interfaceC1680500tpg.LJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0220000_25(C1294720jnS c1294720jnS, C1294720jnS c1294720jnS2, boolean z, Function0<Unit> function0, boolean z2) {
        super(2);
        this.$t = z2 ? 1 : 0;
        this.l0 = c1294720jnS;
        this.z2 = c1294720jnS2;
        this.l1 = z;
        this.z3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0220000_25(Function0 function0, Function1 function1, boolean z, boolean z2, int i) {
        super(2);
        this.$t = i;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = function1;
        this.l1 = function0;
    }
}
