package kotlin.jvm.internal;

import X.C09AY;
import X.C14IN;
import X.C1778130wN9;
import X.C1816080xMM;
import X.C1833430xoL;
import X.C1854760yMk;
import X.C1855550yO1;
import X.C1855630yO9;
import X.C1855650yOB;
import X.C1863380yae;
import X.C1863420yai;
import X.C19319810iC;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1778380wNY;
import X.EnumC1855560yO2;
import X.EnumC993120bx0;
import X.InterfaceC1844880y6o;
import Y.ACListenerS161S0100000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS113S0110000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS113S0110000_27 r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS113S0110000_27.invoke$0(kotlin.jvm.internal.AwS113S0110000_27, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        View viewFindViewById;
        if (awS113S0110000_27.z1 && (viewFindViewById = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).LJJIJL().findViewById(R.id.uqb)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        InterfaceC1844880y6o interfaceC1844880y6o = (InterfaceC1844880y6o) obj;
        int width = 0;
        if (awS113S0110000_27.z1) {
            ConstraintLayout constraintLayoutWp = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).Wp();
            if (constraintLayoutWp != null) {
                float f = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).LLLJIL;
                float progress = 1 - interfaceC1844880y6o.getProgress();
                TuxTextView tuxTextViewAq = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).aq();
                if (tuxTextViewAq != null) {
                    width = tuxTextViewAq.getWidth();
                }
                ViewGroup.LayoutParams layoutParams = constraintLayoutWp.getLayoutParams();
                layoutParams.width = (int) (f + (progress * width));
                C786410Ut5.W5(constraintLayoutWp, layoutParams);
            }
        } else {
            ConstraintLayout constraintLayoutWp2 = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).Wp();
            if (constraintLayoutWp2 != null) {
                float f2 = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).LLLJIL;
                float progress2 = interfaceC1844880y6o.getProgress();
                TuxTextView tuxTextViewAq2 = ((ExploreRecommendTopicListComponent) awS113S0110000_27.l0).aq();
                if (tuxTextViewAq2 != null) {
                    width = tuxTextViewAq2.getWidth();
                }
                ViewGroup.LayoutParams layoutParams2 = constraintLayoutWp2.getLayoutParams();
                layoutParams2.width = (int) (f2 + (progress2 * width));
                C786410Ut5.W5(constraintLayoutWp2, layoutParams2);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        final C1855630yO9 c1855630yO9 = (C1855630yO9) obj;
        if (!awS113S0110000_27.z1) {
            ((C1855550yO1) awS113S0110000_27.l0).LIZJ(EnumC1855560yO2.KEYBOARD);
        } else {
            C1854760yMk c1854760yMk = c1855630yO9.LIZJ;
            if (c1854760yMk != null) {
                C786410Ut5.W0(c1854760yMk, 0);
            }
            C1855550yO1 c1855550yO1 = (C1855550yO1) awS113S0110000_27.l0;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(60L);
            valueAnimatorOfFloat.setStartDelay(20L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1855630yO9, 13));
            valueAnimatorOfFloat.addListener(new C1855650yOB() { // from class: X.0yO8
                @Override // X.C1855650yOB, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    View view = c1855630yO9.LIZ;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                }
            });
            c1855550yO1.LIZLLL = valueAnimatorOfFloat;
            C1855550yO1 c1855550yO12 = (C1855550yO1) awS113S0110000_27.l0;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.setDuration(40L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1855630yO9, 14));
            c1855550yO12.LJ = valueAnimatorOfFloat2;
            C1855550yO1 c1855550yO13 = (C1855550yO1) awS113S0110000_27.l0;
            AnimatorSet animatorSet = new AnimatorSet();
            final C1855550yO1 c1855550yO14 = (C1855550yO1) awS113S0110000_27.l0;
            animatorSet.addListener(new C1855650yOB() { // from class: X.0yO6
                @Override // X.C1855650yOB, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    c1855550yO14.LIZJ(EnumC1855560yO2.KEYBOARD);
                }

                @Override // X.C1855650yOB, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c1855550yO14.LIZJ(EnumC1855560yO2.KEYBOARD);
                }
            });
            animatorSet.play(c1855550yO14.LIZLLL).with(c1855550yO14.LJ);
            c1855550yO13.LJFF = animatorSet;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        if (awS113S0110000_27.z1) {
            C1863380yae c1863380yae = (C1863380yae) awS113S0110000_27.l0;
            String strLJIIIIZZ = C1863420yai.LJIIIIZZ(c1863380yae.LJIIIIZZ, c1863380yae.LJII, c1863380yae.LJIILIIL);
            C1863380yae.LJJIJ.put(strLJIIIIZZ, obj);
            C1863380yae.LJJIIZI.put(strLJIIIIZZ, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, Intrinsics.LJFF(((C1833430xoL) awS113S0110000_27.l0).LJI, Boolean.TRUE), null, new ACListenerS161S0100000_27((C1833430xoL) awS113S0110000_27.l0, 164), true, null, false, false, false, false, null, awS113S0110000_27.z1, 65522);
    }

    public static final Object invoke$6(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        Rect rect;
        Rect rect2;
        C14IN c14in = (C14IN) obj;
        if (((TakoMiddlePageSugAssem) awS113S0110000_27.l0).tp().LJ == EnumC993120bx0.WRAP_CONTENT_HIGH) {
            c14in.LJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            if (awS113S0110000_27.z1) {
                rect2 = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            } else {
                rect2 = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            }
            c14in.LJIIJ = rect2;
        } else if (((TakoMiddlePageSugAssem) awS113S0110000_27.l0).tp().LJ == EnumC993120bx0.WRAP_CONTENT_LOW) {
            c14in.LJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            if (awS113S0110000_27.z1) {
                rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            } else {
                rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            c14in.LJIIJ = rect;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS113S0110000_27 awS113S0110000_27, Object obj) {
        return C1816080xMM.LIZ((C1816080xMM) obj, new C1778130wN9((EnumC1778380wNY) awS113S0110000_27.l0, awS113S0110000_27.z1), 0, 0, null, null, null, null, 126);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(EnumC1778380wNY enumC1778380wNY, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1778380wNY;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(C1833430xoL c1833430xoL, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1833430xoL;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(TakoMiddlePageSugAssem takoMiddlePageSugAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = takoMiddlePageSugAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(boolean z, C1855550yO1 c1855550yO1, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1855550yO1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(boolean z, C1863380yae c1863380yae, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1863380yae;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(boolean z, ExploreRecommendTopicListComponent exploreRecommendTopicListComponent, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = exploreRecommendTopicListComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0110000_27(boolean z, MessageViewModel messageViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = messageViewModel;
    }
}
