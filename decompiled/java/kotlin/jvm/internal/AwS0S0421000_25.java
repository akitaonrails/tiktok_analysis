package kotlin.jvm.internal;

import X.C05NR;
import X.C05P1;
import X.C09AY;
import X.C1350305Qf;
import X.C341440Da2;
import X.InterfaceC1627890sSp;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y5o.n0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0421000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AwS0S0421000_25 awS0S0421000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((n0) awS0S0421000_25.l0).LLLLLLL((InterfaceC1665500tRU) awS0S0421000_25.l1, awS0S0421000_25.z4, (C1350305Qf) awS0S0421000_25.l2, (C05NR) awS0S0421000_25.l3, awS0S0421000_25.z5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0421000_25.i6 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0421000_25 awS0S0421000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((n0) awS0S0421000_25.l0).LLLLLLLLL((InterfaceC1665500tRU) awS0S0421000_25.l1, awS0S0421000_25.z4, (C1350305Qf) awS0S0421000_25.l2, (C05P1) awS0S0421000_25.l3, awS0S0421000_25.z5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0421000_25.i6 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0421000_25(n0 n0Var, n0 n0Var2, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1350305Qf c1350305Qf, C05NR<Unit> c05nr, boolean z2, int i) {
        super(2);
        this.$t = i;
        this.l0 = n0Var;
        this.l1 = n0Var2;
        this.z4 = interfaceC1665500tRU;
        this.l2 = z;
        this.l3 = c1350305Qf;
        this.z5 = c05nr;
        this.i6 = z2 ? 1 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0421000_25(n0 n0Var, n0 n0Var2, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1350305Qf c1350305Qf, C05P1<? extends C05NR<Unit>> c05p1, boolean z2, int i) {
        super(2);
        this.$t = i;
        this.l0 = n0Var;
        this.l1 = n0Var2;
        this.z4 = interfaceC1665500tRU;
        this.l2 = z;
        this.l3 = c1350305Qf;
        this.z5 = c05p1;
        this.i6 = z2 ? 1 : 0;
    }
}
