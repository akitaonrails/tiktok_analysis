package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1665710tRp;
import X.C1674160tfS;
import X.C1679800toY;
import X.C341440Da2;
import X.EnumC587240N1m;
import X.InterfaceC1680040tow;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0202100_25 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public long j4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0202100_25 awS0S0202100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674160tfS.LIZIZ((EnumC587240N1m) awS0S0202100_25.l0, (InterfaceC1685750ty9) awS0S0202100_25.l1, awS0S0202100_25.j4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0202100_25.i2 | 1), awS0S0202100_25.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0202100_25 awS0S0202100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679800toY.LIZ((InterfaceC1680040tow) awS0S0202100_25.l0, (InterfaceC1685750ty9) awS0S0202100_25.l1, awS0S0202100_25.j4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0202100_25.i2 | 1), awS0S0202100_25.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0202100_25 awS0S0202100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665710tRp.LIZIZ((C05P1) awS0S0202100_25.l0, awS0S0202100_25.j4, (InterfaceC1685750ty9) awS0S0202100_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0202100_25.i2 | 1), awS0S0202100_25.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S0202100_25) (LINE:100663303) kotlin.jvm.internal.AwS0S0202100_25.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS0S0202100_25(C05P1 c05p1, C05P1<Integer> c05p12, long j, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        Object obj;
        super(2);
        this.$t = i2;
        this.l0 = c05p1;
        this.j4 = c05p12;
        this.l1 = obj;
        this.i2 = interfaceC1685750ty9;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0202100_25(EnumC587240N1m enumC587240N1m, InterfaceC1685750ty9 interfaceC1685750ty9, long j, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = enumC587240N1m;
        this.l1 = interfaceC1685750ty9;
        this.j4 = j;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0202100_25(InterfaceC1680040tow interfaceC1680040tow, InterfaceC1685750ty9 interfaceC1685750ty9, long j, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC1680040tow;
        this.l1 = interfaceC1685750ty9;
        this.j4 = j;
        this.i2 = i;
        this.i3 = i2;
    }
}
