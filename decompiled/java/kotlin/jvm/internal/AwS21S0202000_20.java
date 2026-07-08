package kotlin.jvm.internal;

import X.C09AY;
import X.C1665950tSD;
import X.C1665960tSE;
import X.C1666060tSO;
import X.C1666480tT4;
import X.C1666540tTA;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class AwS21S0202000_20 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS21S0202000_20 awS21S0202000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665960tSE.LIZ((C1666540tTA) awS21S0202000_20.l0, (InterfaceC1685750ty9) awS21S0202000_20.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0202000_20.i2 | 1), awS21S0202000_20.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0202000_20 awS21S0202000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665950tSD.LIZ((C1666540tTA) awS21S0202000_20.l0, (InterfaceC1685750ty9) awS21S0202000_20.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0202000_20.i2 | 1), awS21S0202000_20.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S0202000_20 awS21S0202000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666480tT4.LIZ((C1666540tTA) awS21S0202000_20.l0, (InterfaceC1685750ty9) awS21S0202000_20.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0202000_20.i2 | 1), awS21S0202000_20.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S0202000_20 awS21S0202000_20, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666060tSO.LIZ((C1666540tTA) awS21S0202000_20.l0, (InterfaceC1685750ty9) awS21S0202000_20.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS21S0202000_20.i2 | 1), awS21S0202000_20.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0202000_20(C1666540tTA c1666540tTA, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c1666540tTA;
        this.l1 = interfaceC1685750ty9;
        this.i2 = i;
        this.i3 = i2;
    }
}
