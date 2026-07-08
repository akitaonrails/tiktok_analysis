package kotlin.jvm.internal;

import X.C09AY;
import X.C1909880zne;
import X.C1910150zo5;
import X.C20053613dG;
import X.C202082145g;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS76S0100100_30 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS76S0100100_30 awS76S0100100_30) {
        boolean z;
        if (System.currentTimeMillis() - awS76S0100100_30.j1 < ((C202082145g) awS76S0100100_30.l0).LLILLL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS76S0100100_30 awS76S0100100_30) {
        ExecutorService executorService = C1909880zne.LIZ;
        String str = ((NimbleTemplateContext) awS76S0100100_30.l0).LLILZLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS76S0100100_30.j1;
        Map<String, String> mapLJ = ((NimbleTemplateContext) awS76S0100100_30.l0).LLJ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1909880zne.LIZLLL("nimble_render_complete", C2097608Jq.LJIIIIZZ(new Pair("template_id", str), new Pair("duration", String.valueOf(jCurrentTimeMillis))), mapLJ, C1910150zo5.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS76S0100100_30 awS76S0100100_30) {
        ((C20053613dG) awS76S0100100_30.l0).LJJLJLI().LLIIII().LJJJJZ(awS76S0100100_30.j1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0100100_30(long j, C202082145g c202082145g, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = c202082145g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0100100_30(C20053613dG c20053613dG, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20053613dG;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0100100_30(NimbleTemplateContext nimbleTemplateContext, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = nimbleTemplateContext;
        this.j1 = j;
    }
}
