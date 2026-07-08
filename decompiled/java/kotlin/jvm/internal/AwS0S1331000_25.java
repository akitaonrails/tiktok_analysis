package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1661930tLj;
import X.C1666860tTg;
import X.C1675920tiI;
import X.C1675930tiJ;
import X.C341440Da2;
import X.InterfaceC1461640o8g;
import X.InterfaceC1660090tIl;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1331000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i7;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;
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

    public static final Object invoke$0(AwS0S1331000_25 awS0S1331000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666860tTg.LIZIZ((C1661930tLj) awS0S1331000_25.l1, awS0S1331000_25.s0, awS0S1331000_25.z4, awS0S1331000_25.z5, awS0S1331000_25.z6, (C05P1) awS0S1331000_25.l2, (Function2) awS0S1331000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1331000_25.i7 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1331000_25 awS0S1331000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675920tiI.LIZLLL(awS0S1331000_25.s0, awS0S1331000_25.z4, awS0S1331000_25.z5, awS0S1331000_25.z6, (Function0) awS0S1331000_25.l1, (Function0) awS0S1331000_25.l2, (C1675930tiJ) awS0S1331000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1331000_25.i7 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1331000_25(C1661930tLj c1661930tLj, C1661930tLj<T, InterfaceC1461640o8g<? extends T>> c1661930tLj2, String str, boolean z, boolean z2, boolean z3, C05P1<Float> c05p1, Function2<? super T, ? super InterfaceC1660090tIl, Unit> function2, int i) {
        super(2);
        this.$t = i;
        this.l1 = c1661930tLj;
        this.s0 = c1661930tLj2;
        this.z4 = str;
        this.z5 = z;
        this.z6 = z2;
        this.l2 = z3;
        this.l3 = c05p1;
        this.i7 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1331000_25(String str, String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, C1675930tiJ c1675930tiJ, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.z4 = str2;
        this.z5 = z;
        this.z6 = z2;
        this.l1 = z3;
        this.l2 = function0;
        this.l3 = function02;
        this.i7 = c1675930tiJ;
    }
}
