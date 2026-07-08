package kotlin.jvm.internal;

import X.C09AY;
import X.C1661930tLj;
import X.C1666810tTb;
import X.C341440Da2;
import X.InterfaceC1461640o8g;
import X.InterfaceC1660090tIl;
import X.InterfaceC1660190tIv;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0522000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i7;
    public int i8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

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

    public static final Object invoke$0(AwS0S0522000_25 awS0S0522000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666810tTb.LIZIZ((InterfaceC1665500tRU) awS0S0522000_25.l0, (InterfaceC1665500tRU) awS0S0522000_25.l1, (InterfaceC1685750ty9) awS0S0522000_25.l2, (Function2) awS0S0522000_25.l3, (Function1) awS0S0522000_25.l4, awS0S0522000_25.z5, awS0S0522000_25.z6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0522000_25.i7 | 1), awS0S0522000_25.i8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0522000_25 awS0S0522000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666810tTb.LIZJ((InterfaceC1665500tRU) awS0S0522000_25.l0, (InterfaceC1665500tRU) awS0S0522000_25.l1, (InterfaceC1685750ty9) awS0S0522000_25.l2, (Function2) awS0S0522000_25.l3, (Function1) awS0S0522000_25.l4, awS0S0522000_25.z5, awS0S0522000_25.z6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0522000_25.i7 | 1), awS0S0522000_25.i8);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0522000_25(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU2, InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU3, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2, Function1<? super Boolean, Unit> function1, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1665500tRU;
        this.l1 = interfaceC1665500tRU2;
        this.l2 = interfaceC1665500tRU3;
        this.l3 = interfaceC1685750ty9;
        this.l4 = function2;
        this.z5 = function1;
        this.z6 = z;
        this.i7 = z2 ? 1 : 0;
        this.i8 = i;
    }
}
