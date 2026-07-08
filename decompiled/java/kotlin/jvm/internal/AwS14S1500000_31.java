package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.C09AY;
import X.C15DF;
import X.C15DO;
import X.C20361214lm;
import X.C2188811AlT;
import X.C334801Rq;
import X.C786410Ut5;
import X.C978440bZK;
import X.C985820blE;
import X.InterfaceC953350aur;
import Y.ALAdapterS3S0100000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaAnimationTimingSettings;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS14S1500000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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

    public static final Object invoke$0(AwS14S1500000_31 awS14S1500000_31) {
        ((AbstractC20356314kz) awS14S1500000_31.l1).LJJIZ((C20361214lm) awS14S1500000_31.l2, awS14S1500000_31.s0, (C334801Rq) awS14S1500000_31.l3, (InterfaceC953350aur) awS14S1500000_31.l4, (Context) awS14S1500000_31.l5);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS14S1500000_31 awS14S1500000_31) {
        int width;
        int width2;
        TuxTextView tuxTextView;
        ((TuxTextView) awS14S1500000_31.l1).setText(awS14S1500000_31.s0);
        C15DF c15df = (C15DF) awS14S1500000_31.l2;
        if (c15df.LLJJIJIL) {
            TuxTextView tuxTextView2 = c15df.LLJZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            View view = ((C15DF) awS14S1500000_31.l2).LLJLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView3 = ((C15DF) awS14S1500000_31.l2).LLLLL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                C786410Ut5.B5(tuxTextView3, 0.0f);
            }
        } else if (c15df.LLLJL) {
            String strLIZIZ = C978440bZK.LIZIZ((C985820blE) awS14S1500000_31.l3, ((C15DO) awS14S1500000_31.l4).LIZ, ((C15DO) awS14S1500000_31.l5).LIZ, true, false);
            TuxTextView tuxTextView4 = (TuxTextView) awS14S1500000_31.l1;
            ((C15DF) awS14S1500000_31.l2).getClass();
            if (C15DF.LJIILJJIL()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(" x");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            tuxTextView4.setText(strLIZIZ);
            View view2 = ((C15DF) awS14S1500000_31.l2).LLJLL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            if (((C15DO) awS14S1500000_31.l4).LIZIZ && (tuxTextView = ((C15DF) awS14S1500000_31.l2).LLJZ) != null && tuxTextView.getVisibility() == 8) {
                TuxTextView tuxTextView5 = ((C15DF) awS14S1500000_31.l2).LLJZ;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
                TuxTextView tuxTextView6 = ((C15DF) awS14S1500000_31.l2).LLLLL;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                    C786410Ut5.B5(tuxTextView6, 1.0f);
                }
            }
            C15DF c15df2 = (C15DF) awS14S1500000_31.l2;
            c15df2.LJJIJIL(c15df2.LLLLL, false);
        } else {
            View view3 = c15df.LLJLL;
            if (view3 != null && view3.getVisibility() == 8 && ((C15DO) awS14S1500000_31.l4).LIZIZ) {
                C15DF c15df3 = (C15DF) awS14S1500000_31.l2;
                if (!c15df3.LLLILZJ) {
                    c15df3.LLLILZJ = true;
                    LiveMatchEnigmaAnimationTimingSettings liveMatchEnigmaAnimationTimingSettings = LiveMatchEnigmaAnimationTimingSettings.INSTANCE;
                    long opponentScoreBarPlusAndXDuration = liveMatchEnigmaAnimationTimingSettings.getOpponentScoreBarPlusAndXDuration();
                    TuxTextView tuxTextView7 = c15df3.LLJZ;
                    if (tuxTextView7 != null) {
                        C786410Ut5.B5(tuxTextView7, 0.0f);
                        C786410Ut5.LLLLZLL(tuxTextView7, 0);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView7, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setDuration(opponentScoreBarPlusAndXDuration);
                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        C786410Ut5.Pd(objectAnimatorOfFloat);
                    }
                    View view4 = c15df3.LLJLL;
                    if (view4 != null) {
                        C786410Ut5.T4(view4, 0.0f);
                        C786410Ut5.LJLLLLLL(0, view4);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat2.setDuration(opponentScoreBarPlusAndXDuration);
                        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                        C786410Ut5.Pd(objectAnimatorOfFloat2);
                    }
                    TuxTextView tvRightMatchScoreTextFromXml = c15df3.getTvRightMatchScoreTextFromXml();
                    if (tvRightMatchScoreTextFromXml != null) {
                        long opponentScoreBarTranslationDuration = liveMatchEnigmaAnimationTimingSettings.getOpponentScoreBarTranslationDuration();
                        TuxTextView tuxTextView8 = c15df3.LLJZ;
                        if (tuxTextView8 != null) {
                            width = tuxTextView8.getWidth();
                        } else {
                            width = 0;
                        }
                        View view5 = c15df3.LLJLL;
                        if (view5 != null) {
                            width2 = view5.getWidth();
                        } else {
                            width2 = 0;
                        }
                        float f = width + width2;
                        C786410Ut5.Vc(tvRightMatchScoreTextFromXml, f);
                        ObjectAnimator objectAnimator = c15df3.LLLLLLJ;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        ObjectAnimator objectAnimator2 = c15df3.LLLLLLJ;
                        if (objectAnimator2 != null) {
                            objectAnimator2.removeAllListeners();
                        }
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tvRightMatchScoreTextFromXml, (Property<TuxTextView, Float>) View.TRANSLATION_X, f, 0.0f);
                        objectAnimatorOfFloat3.setDuration(opponentScoreBarTranslationDuration);
                        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                        c15df3.LLLLLLJ = objectAnimatorOfFloat3;
                        objectAnimatorOfFloat3.addListener(new ALAdapterS3S0100000_6(tvRightMatchScoreTextFromXml, 24));
                        C786410Ut5.Pd(c15df3.LLLLLLJ);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1500000_31(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC20356314kz;
        this.l2 = c20361214lm;
        this.s0 = str;
        this.l3 = c334801Rq;
        this.l4 = interfaceC953350aur;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1500000_31(TuxTextView tuxTextView, String str, C15DF c15df, C985820blE c985820blE, C15DO c15do, C15DO c15do2, int i) {
        super(0);
        this.$t = i;
        this.l1 = tuxTextView;
        this.s0 = str;
        this.l2 = c15df;
        this.l3 = c985820blE;
        this.l4 = c15do;
        this.l5 = c15do2;
    }
}
