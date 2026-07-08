package kotlin.jvm.internal;

import X.C05NR;
import X.C05P1;
import X.C09AY;
import X.C1350305Qf;
import X.C1690080u58;
import X.C341440Da2;
import X.InterfaceC1627890sSp;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y5o.n0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0721000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i9;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public boolean z7;
    public boolean z8;

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

    public static final Object invoke$0(AwS0S0721000_25 awS0S0721000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((n0) awS0S0721000_25.l0).LLLLLJIL((InterfaceC1665500tRU) awS0S0721000_25.l1, awS0S0721000_25.z7, (C1690080u58) awS0S0721000_25.l2, (C1350305Qf) awS0S0721000_25.l3, (Function1) awS0S0721000_25.l4, (C05NR) awS0S0721000_25.l5, awS0S0721000_25.z8, (InterfaceC1685750ty9) awS0S0721000_25.l6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0721000_25.i9 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0721000_25 awS0S0721000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((n0) awS0S0721000_25.l0).LLLLLJLJLL((InterfaceC1665500tRU) awS0S0721000_25.l1, awS0S0721000_25.z7, (C1690080u58) awS0S0721000_25.l2, (C1350305Qf) awS0S0721000_25.l3, (Function1) awS0S0721000_25.l4, (C05P1) awS0S0721000_25.l5, awS0S0721000_25.z8, (InterfaceC1685750ty9) awS0S0721000_25.l6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0721000_25.i9 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0721000_25(n0 n0Var, n0 n0Var2, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1690080u58 c1690080u58, C1350305Qf c1350305Qf, Function1<? super Integer, Unit> function1, C05NR<Unit> c05nr, boolean z2, InterfaceC1685750ty9 interfaceC1685750ty9, int i) {
        super(2);
        this.$t = i;
        this.l0 = n0Var;
        this.l1 = n0Var2;
        this.z7 = interfaceC1665500tRU;
        this.l2 = z;
        this.l3 = c1690080u58;
        this.l4 = c1350305Qf;
        this.l5 = function1;
        this.z8 = c05nr;
        this.l6 = z2;
        this.i9 = interfaceC1685750ty9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0721000_25(n0 n0Var, n0 n0Var2, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, boolean z, C1690080u58 c1690080u58, C1350305Qf c1350305Qf, Function1<? super Integer, Unit> function1, C05P1<? extends C05NR<Unit>> c05p1, boolean z2, InterfaceC1685750ty9 interfaceC1685750ty9, int i) {
        super(2);
        this.$t = i;
        this.l0 = n0Var;
        this.l1 = n0Var2;
        this.z7 = interfaceC1665500tRU;
        this.l2 = z;
        this.l3 = c1690080u58;
        this.l4 = c1350305Qf;
        this.l5 = function1;
        this.z8 = c05p1;
        this.l6 = z2;
        this.i9 = interfaceC1685750ty9;
    }
}
