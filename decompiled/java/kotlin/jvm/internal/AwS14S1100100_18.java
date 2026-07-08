package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C09AY;
import X.C1161820gL6;
import X.C18Z8;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS14S1100100_18 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S1100100_18 awS14S1100100_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordDrawEnd [");
        sbLIZ.append(awS14S1100100_18.s0);
        sbLIZ.append("] ts=");
        sbLIZ.append(awS14S1100100_18.j2);
        sbLIZ.append(" count=");
        sbLIZ.append(((C1161820gL6) awS14S1100100_18.l1).LIZLLL);
        sbLIZ.append(" maxDrawEnd=");
        sbLIZ.append(((C1161820gL6) awS14S1100100_18.l1).LIZJ);
        sbLIZ.append(" seen=");
        sbLIZ.append(((C1161820gL6) awS14S1100100_18.l1).LJIIIZ.size());
        sbLIZ.append('/');
        sbLIZ.append(((C1161820gL6) awS14S1100100_18.l1).LJIIJ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS14S1100100_18 awS14S1100100_18) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        AbstractC21673619ry adapter;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBodyResponseUpdate visibilityObserver.");
        sbLIZ.append(awS14S1100100_18.s0);
        sbLIZ.append(" → post VISIBLE ts=");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" elapsed=");
        sbLIZ.append(System.currentTimeMillis() - awS14S1100100_18.j2);
        sbLIZ.append("ms adapterCount=");
        C18Z8 c18z8 = ((RavenFragment) awS14S1100100_18.l1).LLJILJIL;
        if (c18z8 != null && (adapter = c18z8.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" childCount=");
        C18Z8 c18z82 = ((RavenFragment) awS14S1100100_18.l1).LLJILJIL;
        if (c18z82 != null) {
            numValueOf2 = Integer.valueOf(c18z82.getChildCount());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" bodyList.visibility_before=");
        C18Z8 c18z83 = ((RavenFragment) awS14S1100100_18.l1).LLJILJIL;
        if (c18z83 != null) {
            numValueOf3 = Integer.valueOf(c18z83.getVisibility());
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(numValueOf3);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS14S1100100_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1100100_18(String str, long j, C1161820gL6 c1161820gL6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.l1 = c1161820gL6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS14S1100100_18) (LINE:67174407) kotlin.jvm.internal.AwS14S1100100_18.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS14S1100100_18(String str, String str2, long j, RavenFragment<Object> ravenFragment) {
        Object obj;
        super(0);
        this.$t = ravenFragment;
        this.s0 = str;
        this.j2 = str2;
        this.l1 = obj;
    }
}
