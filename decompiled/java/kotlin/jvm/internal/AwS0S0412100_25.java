package kotlin.jvm.internal;

import X.C09AY;
import X.C1378505aR;
import X.C1378605aS;
import X.C1665840tS2;
import X.C1679750toT;
import X.C341440Da2;
import X.EnumC1308705Af;
import X.InterfaceC1631620sYq;
import X.InterfaceC1665870tS5;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0412100_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public long j7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S0412100_25 awS0S0412100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665840tS2.LIZ((Function0) awS0S0412100_25.l0, (Function0) awS0S0412100_25.l1, (Function1) awS0S0412100_25.l2, (EnumC1308705Af) awS0S0412100_25.l3, awS0S0412100_25.j7, awS0S0412100_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0412100_25.i5 | 1), awS0S0412100_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0412100_25 awS0S0412100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679750toT.LJFF(awS0S0412100_25.j7, (InterfaceC1685750ty9) awS0S0412100_25.l0, awS0S0412100_25.z4, (C1378505aR) awS0S0412100_25.l1, (Function0) awS0S0412100_25.l2, (InterfaceC1631620sYq) awS0S0412100_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0412100_25.i5 | 1), awS0S0412100_25.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS0S0412100_25) (LINE:150994947) kotlin.jvm.internal.AwS0S0412100_25.j7 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S0412100_25) (LINE:150994949) kotlin.jvm.internal.AwS0S0412100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS0S0412100_25] */
    public AwS0S0412100_25(long j, long j2, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, C1378505aR c1378505aR, Function0<Unit> function0, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        long j3;
        Object obj;
        c09ay.$t = i2;
        c09ay.j7 = j3;
        c09ay.l0 = obj;
        c09ay.z4 = interfaceC1685750ty9;
        c09ay.l1 = z;
        c09ay.l2 = c1378505aR;
        c09ay.l3 = function0;
        c09ay.i5 = interfaceC1631620sYq;
        c09ay.i6 = i;
        ?? c09ay = new C09AY(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000d: IPUT (r9 I:boolean), (r1 I:kotlin.jvm.internal.AwS0S0412100_25) (LINE:151060493) kotlin.jvm.internal.AwS0S0412100_25.z4 boolean, block:B:2:0x0000 */
    public AwS0S0412100_25(Function0 function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super C1378605aS, Unit> function1, EnumC1308705Af enumC1308705Af, long j, boolean z, int i, int i2) {
        boolean z2;
        super(2);
        this.$t = i2;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
        this.l3 = function1;
        this.j7 = enumC1308705Af;
        this.z4 = z2;
        this.i5 = z ? 1 : 0;
        this.i6 = i;
    }
}
