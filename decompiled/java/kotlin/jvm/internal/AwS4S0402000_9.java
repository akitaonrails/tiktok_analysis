package kotlin.jvm.internal;

import X.C09AY;
import X.C1668860tWu;
import X.C1670140tYy;
import X.C1690050u55;
import X.C1690080u58;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC636240OxS;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS4S0402000_9 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS4S0402000_9 awS4S0402000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668860tWu.LIZIZ((InterfaceC636240OxS) awS4S0402000_9.l0, (C1690080u58) awS4S0402000_9.l1, (Function0) awS4S0402000_9.l2, (InterfaceC1685750ty9) awS4S0402000_9.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0402000_9.i4 | 1), awS4S0402000_9.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0402000_9 awS4S0402000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670140tYy.LIZIZ((InterfaceC636240OxS) awS4S0402000_9.l0, (C1690050u55) awS4S0402000_9.l1, (InterfaceC1685750ty9) awS4S0402000_9.l2, (Function0) awS4S0402000_9.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0402000_9.i4 | 1), awS4S0402000_9.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0402000_9(InterfaceC636240OxS interfaceC636240OxS, InterfaceC636240OxS<?> interfaceC636240OxS2, C1690050u55 c1690050u55, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC636240OxS;
        this.l1 = interfaceC636240OxS2;
        this.l2 = c1690050u55;
        this.l3 = interfaceC1685750ty9;
        this.i4 = function0;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0402000_9(InterfaceC636240OxS interfaceC636240OxS, InterfaceC636240OxS<T> interfaceC636240OxS2, C1690080u58 c1690080u58, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC636240OxS;
        this.l1 = interfaceC636240OxS2;
        this.l2 = c1690080u58;
        this.l3 = function0;
        this.i4 = interfaceC1685750ty9;
        this.i5 = i;
    }
}
