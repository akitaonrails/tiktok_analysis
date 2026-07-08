package kotlin.jvm.internal;

import X.C09AY;
import X.C1680300tpM;
import X.C1680510tph;
import X.C20279814Wu;
import X.C612270Nzt;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680320tpO;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC595010NVj;
import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.foundation.selection.ToggleableElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS5S0320000_9 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS5S0320000_9 awS5S0320000_9, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-1525724089);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = new C612270Nzt();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, (InterfaceC1680320tpO) awS5S0320000_9.l0).LIZ(new SelectableElement(awS5S0320000_9.z3, interfaceC595010NVj, null, awS5S0320000_9.z4, (C20279814Wu) awS5S0320000_9.l1, (Function0) awS5S0320000_9.l2));
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS5S0320000_9 awS5S0320000_9, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-1525724089);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = new C612270Nzt();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, (InterfaceC1680320tpO) awS5S0320000_9.l0).LIZ(new ToggleableElement(awS5S0320000_9.z3, interfaceC595010NVj, null, awS5S0320000_9.z4, (C20279814Wu) awS5S0320000_9.l1, (Function1) awS5S0320000_9.l2));
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0320000_9(InterfaceC1680320tpO interfaceC1680320tpO, boolean z, boolean z2, C20279814Wu c20279814Wu, Function0 function0, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC1680320tpO;
        this.z3 = z;
        this.z4 = z2;
        this.l1 = c20279814Wu;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0320000_9(InterfaceC1680320tpO interfaceC1680320tpO, boolean z, boolean z2, C20279814Wu c20279814Wu, Function1 function1, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC1680320tpO;
        this.z3 = z;
        this.z4 = z2;
        this.l1 = c20279814Wu;
        this.l2 = function1;
    }
}
