package kotlin.jvm.internal;

import X.C09AY;
import X.C0U3F;
import X.C20441214yg;
import X.C2188811AlT;
import Y.AAListenerS323S0100000_12;
import android.animation.Animator;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS2S1400100_12 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS2S1400100_12 awS2S1400100_12) {
        C0U3F c0u3f = (C0U3F) awS2S1400100_12.l1;
        Animator animatorLIZJ = c0u3f.LIZJ((View) awS2S1400100_12.l2, c0u3f.LIZJ, (View) awS2S1400100_12.l3, awS2S1400100_12.j5);
        if (animatorLIZJ != null) {
            animatorLIZJ.addListener(new AAListenerS323S0100000_12((C0U3F) awS2S1400100_12.l1, 30));
        } else {
            animatorLIZJ = null;
        }
        c0u3f.LJI = animatorLIZJ;
        ((C0U3F) awS2S1400100_12.l1).LJ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS2S1400100_12.s0);
        sbLIZ.append(": animation1 end.");
        C20441214yg.LIZIZ("PlayAnimationHandler", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1400100_12 awS2S1400100_12) {
        C0U3F c0u3f = (C0U3F) awS2S1400100_12.l1;
        Animator animatorLIZJ = c0u3f.LIZJ((View) awS2S1400100_12.l2, c0u3f.LIZLLL, (View) awS2S1400100_12.l3, awS2S1400100_12.j5);
        if (animatorLIZJ != null) {
            animatorLIZJ.addListener(new AAListenerS323S0100000_12((C0U3F) awS2S1400100_12.l1, 31));
        } else {
            animatorLIZJ = null;
        }
        c0u3f.LJII = animatorLIZJ;
        ((C0U3F) awS2S1400100_12.l1).LJFF = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS2S1400100_12.s0);
        sbLIZ.append(": animation2 end.");
        C20441214yg.LIZIZ("PlayAnimationHandler", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000d: IPUT (r9 I:java.lang.String), (r1 I:kotlin.jvm.internal.AwS2S1400100_12) (LINE:117440525) kotlin.jvm.internal.AwS2S1400100_12.s0 java.lang.String, block:B:2:0x0000 */
    public AwS2S1400100_12(C0U3F c0u3f, C0U3F c0u3f2, View view, View view2, List<String> list, long j, String str) {
        String str2;
        super(0);
        this.$t = str;
        this.l1 = c0u3f;
        this.l2 = c0u3f2;
        this.l3 = view;
        this.l4 = view2;
        this.j5 = list;
        this.s0 = str2;
    }
}
