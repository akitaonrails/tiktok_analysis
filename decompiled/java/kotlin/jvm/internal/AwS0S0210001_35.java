package kotlin.jvm.internal;

import X.C01U6;
import X.C09AY;
import X.C1DHY;
import X.C1DHZ;
import X.C2261111Den;
import X.C2261131Dep;
import X.C786410Ut5;
import Y.AUListenerS5S0100002_35;
import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S0210001_35 extends C09AY implements Function0 {
    public final int $t;
    public float f3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS0S0210001_35 awS0S0210001_35) {
        C1DHZ c1dhz = ((C1DHY) awS0S0210001_35.l0).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LJIIIIZZ((List) awS0S0210001_35.l1, awS0S0210001_35.z2, awS0S0210001_35.f3);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS0S0210001_35 awS0S0210001_35) {
        float f;
        C2261111Den c2261111Den = (C2261111Den) awS0S0210001_35.l0;
        boolean z = awS0S0210001_35.z2;
        c2261111Den.getClass();
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float fLIZJ = ((C2261111Den) awS0S0210001_35.l0).LIZJ(74.0f) * f;
        float f2 = awS0S0210001_35.f3 - fLIZJ;
        C786410Ut5.Fd(((C2261111Den) awS0S0210001_35.l0).LIZ, f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C2261111Den c2261111Den2 = (C2261111Den) awS0S0210001_35.l0;
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C2261131Dep.LJ);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS5S0100002_35(c2261111Den2, f2, fLIZJ, 2));
        C2261111Den c2261111Den3 = (C2261111Den) awS0S0210001_35.l0;
        Function0 function0 = (Function0) awS0S0210001_35.l1;
        c2261111Den3.getClass();
        C01U6.LIZLLL(new AwS279S0300000_35(c2261111Den3, (C2261111Den) valueAnimatorOfFloat, (Animator) function0, (Function0<Unit>) 11));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS0S0210001_35 awS0S0210001_35) {
        float f;
        C2261111Den c2261111Den = (C2261111Den) awS0S0210001_35.l0;
        boolean z = awS0S0210001_35.z2;
        c2261111Den.getClass();
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float fLIZJ = ((C2261111Den) awS0S0210001_35.l0).LIZJ(170.0f) * f;
        float fLIZJ2 = ((C2261111Den) awS0S0210001_35.l0).LIZJ(160.0f) * f;
        float f2 = awS0S0210001_35.f3 - fLIZJ2;
        C786410Ut5.Fd(((C2261111Den) awS0S0210001_35.l0).LIZ, f2);
        C2261111Den c2261111Den2 = (C2261111Den) awS0S0210001_35.l0;
        C01U6.LIZLLL(new AwS279S0300000_35(c2261111Den2, (C2261111Den) c2261111Den2.LIZ(f2, fLIZJ, fLIZJ2, 200L, 133L, C2261131Dep.LIZ, C2261131Dep.LIZIZ), (Animator) awS0S0210001_35.l1, (Function0<Unit>) 11));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0210001_35(C1DHY c1dhy, C1DHY c1dhy2, boolean z, float f, List<Integer> list) {
        super(0);
        this.$t = list;
        this.l0 = c1dhy;
        this.z2 = c1dhy2;
        this.f3 = z ? 1.0f : 0.0f;
        this.l1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0210001_35(C2261111Den c2261111Den, C2261111Den c2261111Den2, boolean z, float f, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c2261111Den;
        this.z2 = c2261111Den2;
        this.f3 = z ? 1.0f : 0.0f;
        this.l1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0210001_35(C2261111Den c2261111Den, boolean z, float f, AwS572S0100000_28 awS572S0100000_28, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2261111Den;
        this.z2 = z;
        this.f3 = f;
        this.l1 = awS572S0100000_28;
    }
}
