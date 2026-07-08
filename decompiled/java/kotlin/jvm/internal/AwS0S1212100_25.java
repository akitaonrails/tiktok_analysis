package kotlin.jvm.internal;

import X.C09AY;
import X.C1668880tWw;
import X.C1670050tYp;
import X.C1676290tit;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1212100_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public long j6;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S1212100_25 awS0S1212100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1676290tit.LIZJ((C1668880tWw) awS0S1212100_25.l1, awS0S1212100_25.s0, awS0S1212100_25.j6, awS0S1212100_25.z3, (Function0) awS0S1212100_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1212100_25.i4 | 1), awS0S1212100_25.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1212100_25 awS0S1212100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670050tYp.LIZ((List) awS0S1212100_25.l1, awS0S1212100_25.s0, awS0S1212100_25.j6, awS0S1212100_25.z3, (Function0) awS0S1212100_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1212100_25.i4 | 1), awS0S1212100_25.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:boolean), (r1 I:kotlin.jvm.internal.AwS0S1212100_25) (LINE:134217737) kotlin.jvm.internal.AwS0S1212100_25.z3 boolean, block:B:2:0x0000 */
    public AwS0S1212100_25(C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, String str, long j, boolean z, Function0<Unit> function0, int i, int i2) {
        boolean z2;
        super(2);
        this.$t = i2;
        this.l1 = c1668880tWw;
        this.s0 = c1668880tWw2;
        this.j6 = str;
        this.z3 = z2;
        this.l2 = z;
        this.i4 = function0;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:boolean), (r1 I:kotlin.jvm.internal.AwS0S1212100_25) (LINE:134283273) kotlin.jvm.internal.AwS0S1212100_25.z3 boolean, block:B:2:0x0000 */
    public AwS0S1212100_25(List list, List<String> list2, String str, long j, boolean z, Function0<Unit> function0, int i, int i2) {
        boolean z2;
        super(2);
        this.$t = i2;
        this.l1 = list;
        this.s0 = list2;
        this.j6 = str;
        this.z3 = z2;
        this.l2 = z;
        this.i4 = function0;
        this.i5 = i;
    }
}
