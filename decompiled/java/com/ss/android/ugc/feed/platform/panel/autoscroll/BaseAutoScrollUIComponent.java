package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C01GW;
import X.C1735430vGH;
import X.C19252910Tv;
import X.C452501pT;
import X.C520680KbS;
import X.C786410Ut5;
import X.InterfaceC1735440vGI;
import Y.AAListenerS330S0100000_19;
import Y.AAListenerS68S0110000_19;
import Y.ARunnableS119S0100000_19;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseAutoScrollUIComponent extends BasePanelUIComponent {
    public boolean LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public View LLJJ;
    public C1735430vGH LLJJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(336));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1969));

    public boolean Go() {
        return false;
    }

    public abstract String Jo();

    public final boolean No() {
        return !((Keva) this.LLJIJIL.getValue()).getBoolean(Jo(), false);
    }

    public final void Lo() {
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null || viewLJJIJL.getVisibility() != 8) {
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLLI().LJJLIIIJLJLI(false);
            Ho(false);
        }
    }

    public final void So() {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C786410Ut5.T4(LJJIJL(), 1.0f);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19((AutoScrollComponent) this, 94));
    }

    public final void Vo() {
        if (LJJIJL().getVisibility() != 0) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIILL().LLJJJJJIL()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            if (!No()) {
                HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19(this, 96));
                this.LLJILJIL = false;
                TuxIconView tuxIconView = this.LLJILLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                TuxTextView tuxTextView = this.LLJILJILJ;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                Ho(true);
                return;
            }
            c19252910Tv.LIZLLL().LJIJI().LJLLI().LJJLIIIJLJLI(true);
            this.LLJILJIL = true;
            ((Keva) this.LLJIJIL.getValue()).storeBoolean(Jo(), true);
            HandlerHook.viewPost(LJJIJL(), new ARunnableS119S0100000_19(this, 95));
            TuxTextView tuxTextView2 = this.LLJILJILJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            TuxIconView tuxIconView2 = this.LLJILLL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxTextView tuxTextView3 = this.LLJILJILJ;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 1.0f);
            }
            Ho(true);
            this.LLJJI = new C1735430vGH(3000L, 1000L, new InterfaceC1735440vGI() { // from class: X.0hgY
                @Override // X.InterfaceC1735440vGI
                public final void LJJI(long j) {
                }

                @Override // X.InterfaceC1735440vGI
                public final void onStart() {
                }

                @Override // X.InterfaceC1735440vGI
                public final void LIZLLL() {
                    if (this.LL.Go()) {
                        final BaseAutoScrollUIComponent baseAutoScrollUIComponent = this.LL;
                        final TuxTextView tuxTextView4 = baseAutoScrollUIComponent.LLJILJILJ;
                        final View view = baseAutoScrollUIComponent.LLJJ;
                        if (tuxTextView4 != null && view != null) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(300L);
                            final int width = tuxTextView4.getWidth();
                            final int width2 = view.getWidth();
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gzb
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (baseAutoScrollUIComponent.LJJIJL() == null || tuxTextView4 == null) {
                                        return;
                                    }
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    float f = 1.0f - animatedFraction;
                                    C786410Ut5.B5(tuxTextView4, f);
                                    int i = (int) (animatedFraction * width);
                                    if (C426750GoL.LJ(tuxTextView4)) {
                                        tuxTextView4.setScrollX(i);
                                    } else {
                                        tuxTextView4.setScrollX(-i);
                                    }
                                    ViewGroup.LayoutParams layoutParams = tuxTextView4.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.width = (int) (f * width);
                                    }
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        layoutParams2.width = width2 - i;
                                    }
                                    baseAutoScrollUIComponent.LJJIJL().requestLayout();
                                }
                            });
                            valueAnimatorOfFloat.addListener(new AAListenerS330S0100000_19(baseAutoScrollUIComponent, 6));
                            valueAnimatorOfFloat.start();
                        }
                    }
                    C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLLI().LJJLIIIJLJLI(false);
                }
            });
            c19252910Tv.LIZLLL().LJIJI().LJLLI().LJZL(true);
            C1735430vGH c1735430vGH = this.LLJJI;
            if (c1735430vGH != null) {
                c1735430vGH.LJFF();
            }
        }
    }

    public final void Ho(final boolean z) {
        float f;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIILL().LLJJJJJIL()) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        View viewLJJIJL = LJJIJL();
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(viewLJJIJL, f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hgU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                View viewLJJIJL2 = this.LL.LJJIJL();
                if (!z) {
                    animatedFraction = 1.0f - animatedFraction;
                }
                C786410Ut5.T4(viewLJJIJL2, animatedFraction);
                this.LL.LJJIJL().requestLayout();
            }
        });
        valueAnimatorOfFloat.addListener(new AAListenerS68S0110000_19(this, z, 2));
        valueAnimatorOfFloat.start();
    }

    public final void Oo(boolean z) {
        ((Keva) this.LLJIJIL.getValue()).storeBoolean("is_tablet_auto_scroll_on_saved_state", z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJILJ = (TuxTextView) C520680KbS.LIZ(R.id.bem, view);
        this.LLJILLL = (TuxIconView) C520680KbS.LIZ(R.id.bef, view);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIILL().LJLL();
        this.LLJJ = C520680KbS.LIZ(R.id.bed, view);
        c19252910Tv.LIZLLL().LJIILL().LLLIL(this.LLJJ);
    }
}
