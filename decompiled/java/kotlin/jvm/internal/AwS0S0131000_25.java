package kotlin.jvm.internal;

import X.C09AY;
import X.C1688950u3J;
import X.C1689160u3e;
import X.C2017707vL;
import X.C2025007wW;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0131000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l0;
    public boolean z1;
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

    public static final Object invoke$0(AwS0S0131000_25 awS0S0131000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689160u3e.LIZ((C2025007wW) awS0S0131000_25.l0, awS0S0131000_25.z1, awS0S0131000_25.z2, awS0S0131000_25.z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0131000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0131000_25 awS0S0131000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688950u3J.LIZ((C2017707vL) awS0S0131000_25.l0, awS0S0131000_25.z1, awS0S0131000_25.z2, awS0S0131000_25.z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0131000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0131000_25(C2017707vL c2017707vL, boolean z, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2017707vL;
        this.z1 = z;
        this.z2 = z2;
        this.z3 = z3;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0131000_25(C2025007wW c2025007wW, boolean z, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2025007wW;
        this.z1 = z;
        this.z2 = z2;
        this.z3 = z3;
        this.i4 = i;
    }
}
