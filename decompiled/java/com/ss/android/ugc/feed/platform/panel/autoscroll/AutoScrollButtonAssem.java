package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C1386360mBG;
import X.C520680KbS;
import X.C786410Ut5;
import X.EnumC584570MwJ;
import X.EnumC700430Rdh;
import Y.AAListenerS69S0110000_21;
import Y.ACListenerS155S0100000_21;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class AutoScrollButtonAssem extends AutoScrollAssemBase {
    public final long LLLIIIL = 300;
    public FrameLayout LLLIIL;
    public TuxIconView LLLIILIL;
    public TuxIconView LLLIL;

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Jp() {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        Tp((iAutoAScrollAbilityLIZIZ != null ? iAutoAScrollAbilityLIZIZ.xo1() : null) == EnumC584570MwJ.AUTO_SCROLL_STATE_START);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bas;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Bp(boolean z) {
        final TuxIconView tuxIconView;
        final boolean z2 = !z;
        final TuxIconView tuxIconView2 = this.LLLIILIL;
        if (tuxIconView2 != null && (tuxIconView = this.LLLIL) != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(this.LLLIIIL);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06Yw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        boolean z3 = z2;
                        TuxIconView tuxIconView3 = tuxIconView;
                        TuxIconView tuxIconView4 = tuxIconView2;
                        f.floatValue();
                        if (z3) {
                            C786410Ut5.x5(tuxIconView3, 1 - f.floatValue());
                            C786410Ut5.x5(tuxIconView4, f.floatValue());
                        } else {
                            C786410Ut5.x5(tuxIconView3, f.floatValue());
                            C786410Ut5.x5(tuxIconView4, 1 - f.floatValue());
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new AAListenerS69S0110000_21(this, z2, 6));
            valueAnimatorOfFloat.addListener(new AAListenerS69S0110000_21(this, z2, 5));
            valueAnimatorOfFloat.addListener(new AAListenerS69S0110000_21(this, z2, 4));
            valueAnimatorOfFloat.start();
        }
    }

    public final void Tp(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLLIILIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            TuxIconView tuxIconView2 = this.LLLIILIL;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 0.0f);
            }
            TuxIconView tuxIconView3 = this.LLLIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            TuxIconView tuxIconView4 = this.LLLIL;
            if (tuxIconView4 != null) {
                C786410Ut5.x5(tuxIconView4, 1.0f);
                return;
            }
            return;
        }
        TuxIconView tuxIconView5 = this.LLLIILIL;
        if (tuxIconView5 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
        }
        TuxIconView tuxIconView6 = this.LLLIILIL;
        if (tuxIconView6 != null) {
            C786410Ut5.x5(tuxIconView6, 1.0f);
        }
        TuxIconView tuxIconView7 = this.LLLIL;
        if (tuxIconView7 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
        }
        TuxIconView tuxIconView8 = this.LLLIL;
        if (tuxIconView8 == null) {
            return;
        }
        C786410Ut5.x5(tuxIconView8, 0.0f);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) C520680KbS.LIZ(R.id.bei, view);
        this.LLLIIL = frameLayout;
        boolean z = false;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        this.LLLIILIL = (TuxIconView) C520680KbS.LIZ(R.id.wzd, view);
        this.LLLIL = (TuxIconView) C520680KbS.LIZ(R.id.wze, view);
        EnumC584570MwJ enumC584570MwJXo1 = null;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        if (iAutoAScrollAbilityLIZIZ != null) {
            enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1();
        }
        if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
            z = true;
        }
        Tp(z);
        FrameLayout frameLayout2 = this.LLLIIL;
        if (frameLayout2 != null) {
            setComponentClickStatusExperimental(frameLayout2, EnumC700430Rdh.POSITIVE);
        }
        FrameLayout frameLayout3 = this.LLLIIL;
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS155S0100000_21(this, 101));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AutoScrollAssemBase.Qp(this);
    }
}
