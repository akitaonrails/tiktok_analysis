package kotlin.jvm.internal;

import X.C09AY;
import X.C1684420tw0;
import X.C1684430tw1;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class AwS180S0101000_20 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S0101000_20(int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function0;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS180S0101000_20 awS180S0101000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684420tw0.LIZ((C1684430tw1) awS180S0101000_20.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS180S0101000_20.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS180S0101000_20 awS180S0101000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684420tw0.LJFF((Function0) awS180S0101000_20.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS180S0101000_20.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS180S0101000_20 awS180S0101000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684420tw0.LJIIIIZZ((Function0) awS180S0101000_20.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS180S0101000_20.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS180S0101000_20 awS180S0101000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684420tw0.LJIIJ((Integer) awS180S0101000_20.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS180S0101000_20.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S0101000_20(C1684430tw1 c1684430tw1, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1684430tw1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S0101000_20(Integer num, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = num;
        this.i1 = i;
    }
}
