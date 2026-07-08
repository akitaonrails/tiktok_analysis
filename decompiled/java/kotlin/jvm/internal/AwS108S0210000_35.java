package kotlin.jvm.internal;

import X.C01U6;
import X.C09AY;
import X.C2261111Den;
import X.C2261131Dep;
import Y.AUListenerS5S0100002_35;
import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS108S0210000_35 extends C09AY implements Function0 {
    public final int $t;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS108S0210000_35 awS108S0210000_35) {
        float f;
        C2261111Den c2261111Den = (C2261111Den) awS108S0210000_35.l0;
        boolean z = awS108S0210000_35.z2;
        c2261111Den.getClass();
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float x = ((C2261111Den) awS108S0210000_35.l0).LIZ.getX();
        float fLIZJ = ((C2261111Den) awS108S0210000_35.l0).LIZJ(-74.0f) * f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C2261111Den c2261111Den2 = (C2261111Den) awS108S0210000_35.l0;
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C2261131Dep.LJFF);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS5S0100002_35(c2261111Den2, x, fLIZJ, 3));
        C2261111Den c2261111Den3 = (C2261111Den) awS108S0210000_35.l0;
        Function0 function0 = (Function0) awS108S0210000_35.l1;
        c2261111Den3.getClass();
        C01U6.LIZLLL(new AwS279S0300000_35(c2261111Den3, (C2261111Den) valueAnimatorOfFloat, (Animator) function0, (Function0<Unit>) 11));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS108S0210000_35 awS108S0210000_35) {
        float f;
        C2261111Den c2261111Den = (C2261111Den) awS108S0210000_35.l0;
        boolean z = awS108S0210000_35.z2;
        c2261111Den.getClass();
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float x = ((C2261111Den) awS108S0210000_35.l0).LIZ.getX();
        float fLIZJ = ((C2261111Den) awS108S0210000_35.l0).LIZJ(10.0f) * f;
        float fLIZJ2 = ((C2261111Den) awS108S0210000_35.l0).LIZJ(-160.5f) * f;
        C2261111Den c2261111Den2 = (C2261111Den) awS108S0210000_35.l0;
        C01U6.LIZLLL(new AwS279S0300000_35(c2261111Den2, (C2261111Den) c2261111Den2.LIZ(x, fLIZJ, fLIZJ2, 130L, 200L, C2261131Dep.LIZJ, C2261131Dep.LIZLLL), (Animator) awS108S0210000_35.l1, (Function0<Unit>) 11));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0210000_35(C2261111Den c2261111Den, C2261111Den c2261111Den2, boolean z, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c2261111Den;
        this.z2 = c2261111Den2;
        this.l1 = z;
    }
}
