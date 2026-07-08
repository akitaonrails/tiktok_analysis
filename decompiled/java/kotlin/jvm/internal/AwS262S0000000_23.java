package kotlin.jvm.internal;

import X.C09AY;
import X.C1481290oeN;
import X.C1529670puP;
import X.InterfaceC1485010okN;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS262S0000000_23 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS262S0000000_23(int i, int i2) {
        super(1);
        this.$t = i2;
    }

    public static final Object invoke$0(AwS262S0000000_23 awS262S0000000_23, Object obj) {
        ((InterfaceC1485010okN) obj).LJJLIIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS262S0000000_23 awS262S0000000_23, Object obj) {
        ((InterfaceC1485010okN) obj).Z7();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS262S0000000_23 awS262S0000000_23, Object obj) {
        C1529670puP.LIZJ = false;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS262S0000000_23(C1481290oeN c1481290oeN, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS262S0000000_23(C1529670puP c1529670puP, int i) {
        super(1);
        this.$t = i;
    }
}
