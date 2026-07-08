package kotlin.jvm.internal;

import X.C09AY;
import X.C1515820pY4;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS13S0101100_23 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS13S0101100_23 awS13S0101100_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=parse_failed requestId=");
        sbLIZ.append(((C1515820pY4) awS13S0101100_23.l0).LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(awS13S0101100_23.i1);
        sbLIZ.append(" parsedAt=");
        sbLIZ.append(awS13S0101100_23.j2);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS13S0101100_23 awS13S0101100_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=chunk_received requestId=");
        sbLIZ.append(((C1515820pY4) awS13S0101100_23.l0).LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(awS13S0101100_23.i1);
        sbLIZ.append(" recvTs=");
        sbLIZ.append(awS13S0101100_23.j2);
        sbLIZ.append(" parallelParseCandidate=true thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS13S0101100_23) (LINE:67108864) kotlin.jvm.internal.AwS13S0101100_23.$t int, block:B:2:0x0000 */
    public AwS13S0101100_23(C1515820pY4 c1515820pY4, C1515820pY4<byte[]> c1515820pY42, int i, long j) {
        int i2;
        super(0);
        this.$t = i2;
        this.l0 = c1515820pY4;
        this.i1 = c1515820pY42;
        this.j2 = i;
    }
}
