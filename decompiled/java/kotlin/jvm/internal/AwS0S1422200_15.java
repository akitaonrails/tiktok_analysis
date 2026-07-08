package kotlin.jvm.internal;

import X.C09AY;
import X.C925660aCC;
import X.InterfaceC925670aCD;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS0S1422200_15 extends C09AY implements Function1 {
    public final int $t;
    public int i7;
    public int i8;
    public long j10;
    public long j9;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;
    public boolean z6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1422200_15 awS0S1422200_15, Object obj) {
        ((Number) obj).intValue();
        C925660aCC.LIZIZ((InterfaceC925670aCD) awS0S1422200_15.l1, awS0S1422200_15.i7, awS0S1422200_15.j9, awS0S1422200_15.z5, (Function0) awS0S1422200_15.l2, (Function0) awS0S1422200_15.l3, awS0S1422200_15.s0, awS0S1422200_15.z6, awS0S1422200_15.i8, awS0S1422200_15.j10);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1422200_15 awS0S1422200_15, Object obj) {
        ((Number) obj).intValue();
        C925660aCC.LIZIZ((InterfaceC925670aCD) awS0S1422200_15.l1, awS0S1422200_15.i7, awS0S1422200_15.j9, awS0S1422200_15.z5, (Function0) awS0S1422200_15.l2, (Function0) awS0S1422200_15.l3, awS0S1422200_15.s0, awS0S1422200_15.z6, awS0S1422200_15.i8, awS0S1422200_15.j10);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S1422200_15 awS0S1422200_15, Object obj) {
        ((Number) obj).intValue();
        C925660aCC.LIZIZ((InterfaceC925670aCD) awS0S1422200_15.l1, awS0S1422200_15.i7, awS0S1422200_15.j9, awS0S1422200_15.z5, (Function0) awS0S1422200_15.l2, (Function0) awS0S1422200_15.l3, awS0S1422200_15.s0, awS0S1422200_15.z6, awS0S1422200_15.i8, awS0S1422200_15.j10);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:201326592), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000b: IPUT (r7 I:boolean), (r1 I:kotlin.jvm.internal.AwS0S1422200_15) (LINE:201326603) kotlin.jvm.internal.AwS0S1422200_15.z5 boolean, block:B:2:0x0000 */
    public AwS0S1422200_15(InterfaceC925670aCD interfaceC925670aCD, InterfaceC925670aCD<Object> interfaceC925670aCD2, int i, long j, boolean z, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03, String str, boolean z2, int i2, long j2) {
        int i3;
        boolean z3;
        super(1);
        this.$t = i3;
        this.l1 = interfaceC925670aCD;
        this.i7 = interfaceC925670aCD2;
        this.j9 = i;
        this.z5 = z3;
        this.l2 = z;
        this.l3 = function0;
        this.l4 = function02;
        this.s0 = function03;
        this.z6 = str;
        this.i8 = z2 ? 1 : 0;
        this.j10 = i2;
    }
}
