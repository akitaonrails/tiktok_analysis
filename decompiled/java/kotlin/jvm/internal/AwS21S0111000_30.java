package kotlin.jvm.internal;

import X.C09AY;
import X.C20279514Wr;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS21S0111000_30 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S0111000_30 awS21S0111000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20279514Wr.LIZ(awS21S0111000_30.z1, (Function0) awS21S0111000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0111000_30.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0111000_30 awS21S0111000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20279514Wr.LIZJ(awS21S0111000_30.z1, (Function0) awS21S0111000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0111000_30.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S0111000_30 awS21S0111000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20279514Wr.LIZJ(awS21S0111000_30.z1, (Function0) awS21S0111000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0111000_30.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0111000_30(int i, boolean z, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.z1 = z;
        this.l0 = function0;
        this.i2 = i;
    }
}
