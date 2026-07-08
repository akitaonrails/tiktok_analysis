package kotlin.jvm.internal;

import X.C09AY;
import X.C1667550tUn;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS6S0501000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS6S0501000_12 awS6S0501000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667550tUn.LIZIZ((Function1) awS6S0501000_12.l0, (Function1) awS6S0501000_12.l1, (Function1) awS6S0501000_12.l2, (Function0) awS6S0501000_12.l3, (Function1) awS6S0501000_12.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS6S0501000_12.i5 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0501000_12 awS6S0501000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667550tUn.LIZJ((Function1) awS6S0501000_12.l0, (Function1) awS6S0501000_12.l1, (Function1) awS6S0501000_12.l2, (Function0) awS6S0501000_12.l3, (Function1) awS6S0501000_12.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS6S0501000_12.i5 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S0501000_12(Function1 function1, Function1<? super String, Unit> function12, Function1<? super Boolean, Unit> function13, Function1<? super Boolean, Unit> function14, Function0<Unit> function0, Function1<? super Boolean, Unit> function15, int i) {
        super(2);
        this.$t = i;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function13;
        this.l3 = function14;
        this.l4 = function0;
        this.i5 = function15;
    }
}
