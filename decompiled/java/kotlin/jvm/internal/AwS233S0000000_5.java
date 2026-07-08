package kotlin.jvm.internal;

import X.C05YF;
import X.C09AY;
import X.C382650EzP;
import X.C382700EzU;
import X.EnumC382750EzZ;
import X.InterfaceC1461350o8D;
import X.InterfaceC376040Eok;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS233S0000000_5 extends C09AY implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0000000_5(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0000000_5(int i, int i2) {
        super(1);
        this.$t = i2;
    }

    public static final Object invoke$0(AwS233S0000000_5 awS233S0000000_5, Object obj) {
        return C382650EzP.LIZ((C382650EzP) obj, 0, new C382700EzU(EnumC382750EzZ.IMAGE), null, null, null, false, false, false, false, 1021);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS233S0000000_5 awS233S0000000_5, Object obj) {
        ((InterfaceC1461350o8D) ((C05YF) obj)).TJ();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS233S0000000_5 awS233S0000000_5, Object obj) {
        ((InterfaceC376040Eok) ((C05YF) obj)).Tx0(null);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS233S0000000_5 awS233S0000000_5, Object obj) {
        ((InterfaceC376040Eok) ((C05YF) obj)).Tx0(null);
        return Unit.LIZ;
    }
}
