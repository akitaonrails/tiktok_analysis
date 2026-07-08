package kotlin.jvm.internal;

import X.C09AY;
import X.C0N23;
import X.C0OPQ;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS65S0100100_9 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS65S0100100_9 awS65S0100100_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedMeasurementTargetBuild= ");
        sbLIZ.append((C0N23) awS65S0100100_9.l0);
        sbLIZ.append(", vl= ");
        sbLIZ.append(awS65S0100100_9.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS65S0100100_9 awS65S0100100_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inOutFlowMeasurementTargetBuild ");
        sbLIZ.append((C0N23) awS65S0100100_9.l0);
        sbLIZ.append(", vl= ");
        sbLIZ.append(awS65S0100100_9.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS65S0100100_9 awS65S0100100_9) {
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS65S0100100_9.j1);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "bulletin_board_detail_page"), new Pair("action_type", "click"), new Pair("click_type", "cancel"));
        c0opq.getClass();
        C0OPQ.LJIJI(strValueOf, mapLJIIIIZZ);
        ((Function0) awS65S0100100_9.l0).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS65S0100100_9) (LINE:50331651) kotlin.jvm.internal.AwS65S0100100_9.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS65S0100100_9) (LINE:50331653) kotlin.jvm.internal.AwS65S0100100_9.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS65S0100100_9] */
    public AwS65S0100100_9(long j, long j2, Function0<Unit> function0) {
        long j3;
        Object obj;
        c09ay.$t = function0;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0100100_9(C0N23 c0n23, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0n23;
        this.j1 = j;
    }
}
