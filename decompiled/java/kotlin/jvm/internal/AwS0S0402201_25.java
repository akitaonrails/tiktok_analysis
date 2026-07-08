package kotlin.jvm.internal;

import X.C09AY;
import X.C1668470tWH;
import X.C1668490tWJ;
import X.C1668880tWw;
import X.C1678670tmj;
import X.C1685910tyP;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680710tq1;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0402201_25 extends C09AY implements Function2 {
    public final int $t;
    public float f8;
    public int i4;
    public int i5;
    public long j6;
    public long j7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS0S0402201_25 awS0S0402201_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1678670tmj.LIZ((InterfaceC1685750ty9) awS0S0402201_25.l0, (InterfaceC1680710tq1) awS0S0402201_25.l1, awS0S0402201_25.j6, awS0S0402201_25.j7, (C1668470tWH) awS0S0402201_25.l2, awS0S0402201_25.f8, (Function2) awS0S0402201_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0402201_25.i4 | 1), awS0S0402201_25.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0402201_25 awS0S0402201_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668490tWJ.LIZLLL((C1668880tWw) awS0S0402201_25.l0, awS0S0402201_25.f8, awS0S0402201_25.j6, awS0S0402201_25.j7, (C1685910tyP) awS0S0402201_25.l1, (InterfaceC1685750ty9) awS0S0402201_25.l2, (InterfaceC1685750ty9) awS0S0402201_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0402201_25.i4 | 1), awS0S0402201_25.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0402201_25(C1668880tWw c1668880tWw, float f, long j, long j2, C1685910tyP c1685910tyP, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c1668880tWw;
        this.f8 = f;
        this.j6 = j;
        this.j7 = j2;
        this.l1 = c1685910tyP;
        this.l2 = interfaceC1685750ty9;
        this.l3 = interfaceC1685750ty92;
        this.i4 = i;
        this.i5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:long), (r1 I:kotlin.jvm.internal.AwS0S0402201_25) (LINE:167837705) kotlin.jvm.internal.AwS0S0402201_25.j7 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000b: IPUT (r9 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S0402201_25) (LINE:167837707) kotlin.jvm.internal.AwS0S0402201_25.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS0S0402201_25(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, C1668470tWH c1668470tWH, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        long j3;
        Object obj;
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.j6 = interfaceC1680710tq1;
        this.j7 = j3;
        this.l2 = obj;
        this.f8 = c1668470tWH;
        this.l3 = f;
        this.i4 = function2;
        this.i5 = i;
    }
}
