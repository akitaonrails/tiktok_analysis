package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C1308910kAL;
import X.C1386360mBG;
import X.C1388190mED;
import X.C19252910Tv;
import X.C520680KbS;
import X.C786410Ut5;
import X.EnumC584570MwJ;
import X.EnumC700430Rdh;
import Y.AAListenerS69S0110000_21;
import Y.ACListenerS155S0100000_21;
import Y.AUListenerS256S0100000_6;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class AutoScrollButtonAssemV2NoText extends AutoScrollAssemBase {
    public final long LLLIIIL = 300;
    public FrameLayout LLLIIL;
    public TuxIconView LLLIILIL;
    public ValueAnimator LLLIL;

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Jp() {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        Tp((iAutoAScrollAbilityLIZIZ != null ? iAutoAScrollAbilityLIZIZ.xo1() : null) == EnumC584570MwJ.AUTO_SCROLL_STATE_START);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.baq;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Bp(boolean z) {
        Context context;
        Integer numLIZJ;
        Integer numLIZJ2;
        boolean z2 = !z;
        TuxIconView tuxIconView = this.LLLIILIL;
        if (tuxIconView != null && (context = getContext()) != null) {
            ValueAnimator valueAnimator = this.LLLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context);
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, context);
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), numLIZJ, numLIZJ2);
            valueAnimatorOfObject.setDuration(this.LLLIIIL);
            valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(tuxIconView, 72));
            valueAnimatorOfObject.addListener(new AAListenerS69S0110000_21(this, z2, 12));
            valueAnimatorOfObject.addListener(new AAListenerS69S0110000_21(this, z2, 11));
            valueAnimatorOfObject.addListener(new AAListenerS69S0110000_21(this, z2, 10));
            this.LLLIL = valueAnimatorOfObject;
            valueAnimatorOfObject.start();
        }
    }

    public final void Tp(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLLIILIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.a09);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLLIILIL;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setTintColorRes(R.attr.zi);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        GradientDrawable gradientDrawable;
        super.onViewCreated(view);
        this.LLLIIL = (FrameLayout) C520680KbS.LIZ(R.id.beh, view);
        this.LLLIILIL = (TuxIconView) C520680KbS.LIZ(R.id.wz_, view);
        FrameLayout frameLayout = this.LLLIIL;
        boolean z = false;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
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
        TuxIconView tuxIconView = this.LLLIILIL;
        if (tuxIconView != null && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, C1388190mED.LJ(Gp(context), context))) != null) {
            numLIZJ.intValue();
            Drawable drawableMutate = tuxIconView.getBackground().mutate();
            if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIIL(this.LLLIIL, this.LLLIILIL);
        FrameLayout frameLayout3 = this.LLLIIL;
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS155S0100000_21(this, 103));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AutoScrollAssemBase.Qp(this);
    }
}
