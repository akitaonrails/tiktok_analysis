package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS4S0200200_15 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S0200200_15 awS4S0200200_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS4S0200200_15.j2), "from_uid");
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS4S0200200_15.j3), "from_room_id");
        interfaceC954910axN.LJIILIIL((List) awS4S0200200_15.l0, "other_uid_list");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS4S0200200_15.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0200200_15 awS4S0200200_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS4S0200200_15.j2), "from_uid");
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS4S0200200_15.j3), "from_room_id");
        interfaceC954910axN.LJIILIIL((List) awS4S0200200_15.l0, "other_uid_list");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS4S0200200_15.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS4S0200200_15) (LINE:83886083) kotlin.jvm.internal.AwS4S0200200_15.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:long), (r1 I:kotlin.jvm.internal.AwS4S0200200_15) (LINE:83886085) kotlin.jvm.internal.AwS4S0200200_15.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0007: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS4S0200200_15) (LINE:83886087) kotlin.jvm.internal.AwS4S0200200_15.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS4S0200200_15] */
    public AwS4S0200200_15(long j, long j2, long j3, List<Long> list, InterfaceC954180awC interfaceC954180awC) {
        long j4;
        long j5;
        Object obj;
        c09ay.$t = interfaceC954180awC;
        c09ay.j2 = j4;
        c09ay.j3 = j5;
        c09ay.l0 = obj;
        c09ay.l1 = list;
        ?? c09ay = new C09AY(1);
    }
}
