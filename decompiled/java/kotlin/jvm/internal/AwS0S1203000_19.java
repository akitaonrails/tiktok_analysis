package kotlin.jvm.internal;

import X.C09AY;
import X.C1667550tUn;
import X.C1670820ta4;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS0S1203000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS0S1203000_19 awS0S1203000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667550tUn.LJ(awS0S1203000_19.s0, (InterfaceC1685750ty9) awS0S1203000_19.l1, awS0S1203000_19.i3, (Function0) awS0S1203000_19.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1203000_19.i4 | 1), awS0S1203000_19.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1203000_19 awS0S1203000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670820ta4.LIZLLL(awS0S1203000_19.s0, (InterfaceC1685750ty9) awS0S1203000_19.l1, awS0S1203000_19.i3, (Function0) awS0S1203000_19.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1203000_19.i4 | 1), awS0S1203000_19.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1203000_19(String str, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, int i, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.s0 = str;
        this.l1 = str2;
        this.i3 = interfaceC1685750ty9;
        this.l2 = i;
        this.i4 = function0;
        this.i5 = i2;
    }
}
