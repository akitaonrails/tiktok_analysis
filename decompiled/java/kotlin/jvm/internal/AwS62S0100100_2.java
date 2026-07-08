package kotlin.jvm.internal;

import X.C09AY;
import X.C1397705dX;
import X.C15438062q;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS62S0100100_2 extends C09AY implements Function0 {
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
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S0100100_2 awS62S0100100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: remove whitelist section type=");
        sbLIZ.append(awS62S0100100_2.j1);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZLLL.size());
        sbLIZ.append(" (new data delivered but items empty)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS62S0100100_2 awS62S0100100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: replace whitelist section type=");
        sbLIZ.append(awS62S0100100_2.j1);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZLLL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS62S0100100_2 awS62S0100100_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: add whitelist section type=");
        sbLIZ.append(awS62S0100100_2.j1);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS62S0100100_2.l0).LIZLLL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS62S0100100_2 awS62S0100100_2) {
        StringBuilder sb = new StringBuilder("MixVoListModelStore: refreshFromStartTypeByOrder: configured section type=");
        sb.append(awS62S0100100_2.j1);
        sb.append(" not found in old data, original section types=");
        List list = (List) awS62S0100100_2.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C1397705dX) it2.next()).LIZIZ));
        }
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0100100_2(long j, C1397705dX c1397705dX, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1397705dX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS62S0100100_2) (LINE:50397187) kotlin.jvm.internal.AwS62S0100100_2.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS62S0100100_2) (LINE:50397189) kotlin.jvm.internal.AwS62S0100100_2.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS62S0100100_2] */
    public AwS62S0100100_2(long j, long j2, List<C1397705dX> list) {
        long j3;
        Object obj;
        c09ay.$t = list;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(0);
    }
}
