package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C1652790t6z;
import X.C533930Kwp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S1400100_25 extends C09AY implements Function0 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS4S1400100_25 awS4S1400100_25) {
        C01TT.LIZLLL(new AwS4S1400100_25((C1652790t6z) awS4S1400100_25.l1, awS4S1400100_25.s0, awS4S1400100_25.j5, (Long) awS4S1400100_25.l2, (Effect) awS4S1400100_25.l3, (Function0) awS4S1400100_25.l4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1400100_25 awS4S1400100_25) {
        if (C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            ((C1652790t6z) awS4S1400100_25.l1).oF0(awS4S1400100_25.s0, awS4S1400100_25.j5, (Long) awS4S1400100_25.l2, (Effect) awS4S1400100_25.l3, (Function0) awS4S1400100_25.l4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS4S1400100_25) (LINE:117440521) kotlin.jvm.internal.AwS4S1400100_25.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS4S1400100_25(C1652790t6z c1652790t6z, C1652790t6z c1652790t6z2, String str, long j, Long l, Effect effect, Function0<Unit> function0) {
        Object obj;
        super(0);
        this.$t = function0;
        this.l1 = c1652790t6z;
        this.s0 = c1652790t6z2;
        this.j5 = str;
        this.l2 = obj;
        this.l3 = l;
        this.l4 = effect;
    }
}
