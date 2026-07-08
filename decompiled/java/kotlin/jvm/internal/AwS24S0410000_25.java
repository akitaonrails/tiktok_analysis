package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1668650tWZ;
import X.C1685680ty2;
import X.C1685710ty5;
import X.C1691080u6k;
import X.EnumC1308705Af;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS24S0410000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS24S0410000_25 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS24S0410000_25.invoke$0(kotlin.jvm.internal.AwS24S0410000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS24S0410000_25 awS24S0410000_25, Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        C1685710ty5 c1685710ty5 = (C1685710ty5) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(c1685710ty5)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            String str = (String) ((Function2) awS24S0410000_25.l0).invoke(interfaceC1680500tpg, 0);
            if (!(!a0.LJJJIL(str))) {
                C1691080u6k.LIZJ("Label must not be blank");
            }
            C1685680ty2.LIZIZ(str, awS24S0410000_25.z4, c1685710ty5, (InterfaceC1685750ty9) awS24S0410000_25.l1, (InterfaceC1631620sYq) awS24S0410000_25.l2, (Function0) awS24S0410000_25.l3, interfaceC1680500tpg, (iIntValue << 6) & 896, 0);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS24S0410000_25(EnumC1308705Af enumC1308705Af, EnumC1308705Af enumC1308705Af2, boolean z, C05P1<C1668650tWZ> c05p1, C05P1<C1668650tWZ> c05p12, C05P1<Float> c05p13) {
        super(3);
        this.$t = c05p13;
        this.l0 = enumC1308705Af;
        this.z4 = enumC1308705Af2;
        this.l1 = z;
        this.l2 = c05p1;
        this.l3 = c05p12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0410000_25(InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, AwS639S0100000_25 awS639S0100000_25, InterfaceC1631620sYq interfaceC1631620sYq, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS639S0100000_25;
        this.z4 = z;
        this.l1 = interfaceC1685750ty9;
        this.l2 = interfaceC1631620sYq;
        this.l3 = function0;
    }
}
