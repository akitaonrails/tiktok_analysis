package kotlin.jvm.internal;

import X.C09AY;
import X.C1BF7;
import X.C2213281Bjq;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AwS0S1410200_34 extends C09AY implements Function0 {
    public final int $t;
    public long j6;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

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

    public static final Object invoke$0(AwS0S1410200_34 awS0S1410200_34) {
        C1BF7 c1bf7 = ((C2213281Bjq) awS0S1410200_34.l1).LIZ;
        if (c1bf7 != null) {
            c1bf7.LIZJ((View) awS0S1410200_34.l2, awS0S1410200_34.j6, (List) awS0S1410200_34.l3, awS0S1410200_34.s0, awS0S1410200_34.z5, awS0S1410200_34.j7, (JSONObject) awS0S1410200_34.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1410200_34 awS0S1410200_34) {
        C1BF7 c1bf7 = ((C2213281Bjq) awS0S1410200_34.l1).LIZ;
        if (c1bf7 != null) {
            c1bf7.LIZIZ((View) awS0S1410200_34.l2, awS0S1410200_34.j6, (List) awS0S1410200_34.l3, awS0S1410200_34.s0, awS0S1410200_34.z5, awS0S1410200_34.j7, (JSONObject) awS0S1410200_34.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S1410200_34 awS0S1410200_34) {
        C1BF7 c1bf7 = ((C2213281Bjq) awS0S1410200_34.l1).LIZ;
        if (c1bf7 != null) {
            c1bf7.LIZ((View) awS0S1410200_34.l2, awS0S1410200_34.j6, (List) awS0S1410200_34.l3, awS0S1410200_34.s0, awS0S1410200_34.z5, awS0S1410200_34.j7, (JSONObject) awS0S1410200_34.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S1410200_34 awS0S1410200_34) {
        C1BF7 c1bf7 = ((C2213281Bjq) awS0S1410200_34.l1).LIZ;
        if (c1bf7 != null) {
            c1bf7.LIZLLL((View) awS0S1410200_34.l2, awS0S1410200_34.j6, (List) awS0S1410200_34.l3, awS0S1410200_34.s0, awS0S1410200_34.z5, awS0S1410200_34.j7, (JSONObject) awS0S1410200_34.l4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0011: IPUT (r12 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S1410200_34) (LINE:150994961) kotlin.jvm.internal.AwS0S1410200_34.l4 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S1410200_34) (LINE:150994953) kotlin.jvm.internal.AwS0S1410200_34.l3 java.lang.Object, block:B:2:0x0000 */
    public AwS0S1410200_34(C2213281Bjq c2213281Bjq, C2213281Bjq c2213281Bjq2, View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        super(0);
        this.$t = jSONObject;
        this.l1 = c2213281Bjq;
        this.l2 = c2213281Bjq2;
        this.j6 = view;
        this.l3 = obj;
        this.s0 = list;
        this.z5 = str;
        this.j7 = z ? 1L : 0L;
        this.l4 = obj2;
    }
}
