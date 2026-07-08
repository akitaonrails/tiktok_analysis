package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC20050413ck;
import X.C09AY;
import X.C1909880zne;
import X.C1910150zo5;
import X.C20052113d1;
import X.C20053613dG;
import X.C2097608Jq;
import X.InterfaceC20055013dU;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p2.j1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS48S0200100_30 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS48S0200100_30 awS48S0200100_30) {
        ExecutorService executorService = C1909880zne.LIZ;
        C1909880zne.LIZLLL("nimble_template_load_complete", C2097608Jq.LJIIIIZZ(new Pair("template_id", ((NimbleTemplateContext) awS48S0200100_30.l0).LLILZLL), new Pair("duration", String.valueOf(awS48S0200100_30.j2))), (Map) awS48S0200100_30.l1, C1910150zo5.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS48S0200100_30 awS48S0200100_30) {
        ExecutorService executorService = C1909880zne.LIZ;
        C1909880zne.LIZLLL("nimble_view_tree_create_end", C2097608Jq.LJIIIIZZ(new Pair("template_id", ((NimbleTemplateContext) awS48S0200100_30.l0).LLILZLL), new Pair("duration", String.valueOf(awS48S0200100_30.j2))), (Map) awS48S0200100_30.l1, C1910150zo5.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS48S0200100_30 awS48S0200100_30) {
        AbstractC1683310tuD placementScope;
        AbstractC20050413ck abstractC20050413ckLLIIII;
        if (!C20052113d1.LIZ(((C20053613dG) awS48S0200100_30.l0).LLILZLL.LIZ) && !((C20053613dG) awS48S0200100_30.l0).LLILZLL.LIZJ) {
            j1 j1Var = ((C20053613dG) awS48S0200100_30.l0).LJJLJLI().LLJJIII;
            if (j1Var != null && (abstractC20050413ckLLIIII = j1Var.LLIIII()) != null) {
                placementScope = abstractC20050413ckLLIIII.LLJ;
                if (placementScope == null) {
                }
            }
            placementScope = ((InterfaceC20055013dU) awS48S0200100_30.l1).getPlacementScope();
        } else {
            j1 j1Var2 = ((C20053613dG) awS48S0200100_30.l0).LJJLJLI().LLJJIII;
            if (j1Var2 != null) {
                placementScope = j1Var2.LLJ;
                if (placementScope == null) {
                }
            }
            placementScope = ((InterfaceC20055013dU) awS48S0200100_30.l1).getPlacementScope();
        }
        AbstractC1683310tuD.LJ(placementScope, ((C20053613dG) awS48S0200100_30.l0).LJJLJLI().LLIIII(), awS48S0200100_30.j2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0200100_30(C20053613dG c20053613dG, InterfaceC20055013dU interfaceC20055013dU, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20053613dG;
        this.l1 = interfaceC20055013dU;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS48S0200100_30) (LINE:67174407) kotlin.jvm.internal.AwS48S0200100_30.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS48S0200100_30(NimbleTemplateContext nimbleTemplateContext, NimbleTemplateContext nimbleTemplateContext2, long j, Map<String, String> map) {
        Object obj;
        super(0);
        this.$t = map;
        this.l0 = nimbleTemplateContext;
        this.j2 = nimbleTemplateContext2;
        this.l1 = obj;
    }
}
