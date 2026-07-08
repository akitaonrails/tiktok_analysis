package kotlin.jvm.internal;

import X.C09AY;
import X.C13DO;
import X.C13Z4;
import X.C13ZT;
import X.C1665430tRN;
import X.C1665530tRX;
import X.C1680340tpQ;
import X.C1680350tpR;
import X.C1685910tyP;
import X.C341440Da2;
import X.InterfaceC1665870tS5;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS7S0201100_25 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public long j3;
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

    public static final Object invoke$0(AwS7S0201100_25 awS7S0201100_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C13ZT.LIZIZ(new C13DO[]{C1680350tpR.LIZ.LIZJ(new C1685910tyP(awS7S0201100_25.j3))}, C13Z4.LIZIZ(interfaceC1680500tpg, -1132188434, new AwS7S0201100_25(awS7S0201100_25.i2, awS7S0201100_25.j3, (Float) awS7S0201100_25.l0, (Function2) awS7S0201100_25.l1, 1)), interfaceC1680500tpg, 56);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0201100_25 awS7S0201100_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (((Float) awS7S0201100_25.l0) != null) {
            interfaceC1680500tpg.LJJIJIIJIL(-452621938);
            C13ZT.LIZIZ(new C13DO[]{C1680340tpQ.LIZ.LIZJ((Float) awS7S0201100_25.l0)}, (Function2) awS7S0201100_25.l1, interfaceC1680500tpg, ((awS7S0201100_25.i2 >> 6) & 112) | 8);
            interfaceC1680500tpg.LJJIJLIJ();
        } else {
            interfaceC1680500tpg.LJJIJIIJIL(-452621758);
            C13ZT.LIZIZ(new C13DO[]{C1680340tpQ.LIZ.LIZJ(Float.valueOf(C1685910tyP.LJFF(awS7S0201100_25.j3)))}, (Function2) awS7S0201100_25.l1, interfaceC1680500tpg, ((awS7S0201100_25.i2 >> 6) & 112) | 8);
            interfaceC1680500tpg.LJJIJLIJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S0201100_25 awS7S0201100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665530tRX.LIZ((InterfaceC1665870tS5) awS7S0201100_25.l0, awS7S0201100_25.j3, (Function0) awS7S0201100_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS7S0201100_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS7S0201100_25 awS7S0201100_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1665430tRN.LIZ(awS7S0201100_25.j3, (InterfaceC1685750ty9) awS7S0201100_25.l0, (Function0) awS7S0201100_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS7S0201100_25.i2 | 1));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS7S0201100_25(int r3, long r4, java.lang.Float r6, kotlin.jvm.functions.Function2 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L12
            r1 = r2
            r1.l0 = r6
            r1.l1 = r7
            r1.i2 = r3
            r1.j3 = r4
            r0 = 2
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.j3 = r4
            r1.l0 = r6
            r1.l1 = r7
            r1.i2 = r3
            r0 = 2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0201100_25.<init>(int, long, java.lang.Float, kotlin.jvm.functions.Function2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS7S0201100_25) (LINE:83951619) kotlin.jvm.internal.AwS7S0201100_25.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS7S0201100_25) (LINE:83951621) kotlin.jvm.internal.AwS7S0201100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS7S0201100_25] */
    public AwS7S0201100_25(long j, long j2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, int i) {
        long j3;
        Object obj;
        c09ay.$t = i;
        c09ay.j3 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = interfaceC1685750ty9;
        c09ay.i2 = function0;
        ?? c09ay = new C09AY(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS7S0201100_25) (LINE:84017159) kotlin.jvm.internal.AwS7S0201100_25.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS7S0201100_25(InterfaceC1665870tS5 interfaceC1665870tS5, InterfaceC1665870tS5 interfaceC1665870tS52, long j, Function0<Unit> function0, int i) {
        Object obj;
        super(2);
        this.$t = i;
        this.l0 = interfaceC1665870tS5;
        this.j3 = interfaceC1665870tS52;
        this.l1 = obj;
        this.i2 = function0;
    }
}
