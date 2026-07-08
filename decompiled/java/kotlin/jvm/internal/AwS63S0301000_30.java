package kotlin.jvm.internal;

import X.C09AY;
import X.C20042013bO;
import X.C20055113dV;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1693160uA6;
import X.InterfaceC20055013dU;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS63S0301000_30 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS63S0301000_30 awS63S0301000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20055113dV.LIZ((InterfaceC20055013dU) awS63S0301000_30.l0, (InterfaceC1693160uA6) awS63S0301000_30.l1, (Function2) awS63S0301000_30.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS63S0301000_30.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS63S0301000_30 awS63S0301000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C20042013bO) awS63S0301000_30.l0).LIZLLL(awS63S0301000_30.l1, (Function2) awS63S0301000_30.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS63S0301000_30.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0301000_30(C20042013bO c20042013bO, C20042013bO c20042013bO2, Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20042013bO;
        this.l1 = c20042013bO2;
        this.l2 = obj;
        this.i3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0301000_30(InterfaceC20055013dU interfaceC20055013dU, InterfaceC20055013dU interfaceC20055013dU2, InterfaceC1693160uA6 interfaceC1693160uA6, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC20055013dU;
        this.l1 = interfaceC20055013dU2;
        this.l2 = interfaceC1693160uA6;
        this.i3 = function2;
    }
}
