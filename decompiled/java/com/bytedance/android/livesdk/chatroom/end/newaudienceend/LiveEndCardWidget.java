package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.C09JN;
import X.C0IH6;
import X.C0III;
import X.C0IJT;
import X.C0ILR;
import X.C0IMV;
import X.C0KVU;
import X.C0PEM;
import X.C1099610eil;
import X.C1121670fIL;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1308910kAL;
import X.C1324720kZq;
import X.C16F5;
import X.C1701940uOG;
import X.C19ME;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C23250099c;
import X.C417850GZz;
import X.C464740IKi;
import X.C465060ILo;
import X.C468800IZy;
import X.C474500IjA;
import X.C497740JfY;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC420801kM;
import X.InterfaceC465090ILr;
import X.InterfaceC500940Jki;
import X.ViewOnAttachStateChangeListenerC521700Kd6;
import Y.ACListenerS74S0300000_7;
import Y.ALAdapterS0S0201000_7;
import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageFullToHalfOptSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEndCardWidget extends LiveRecyclableWidget implements InterfaceC465090ILr {
    public static final float LLLFF = (int) C497740JfY.LIZIZ(319.0f);
    public static final float LLLFFI = (int) C497740JfY.LIZIZ(413.0f);
    public static final float LLLFZ = (int) C497740JfY.LIZIZ(12.0f);
    public ConstraintLayout LL;
    public View LLILLJJLI;
    public ConstraintLayout LLILLL;
    public Animator LLILZ;
    public ValueAnimator LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Bitmap LLJILJIL;
    public C464740IKi LLJILJILJ;
    public boolean LLJILLL;
    public C1324720kZq LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C1099610eil LLJJIJIL;
    public View LLJJJ;
    public LiveIconView LLJJJIL;
    public C16F5 LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public C465060ILo LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C16F5 LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public C16F5 LLJLL;
    public C468800IZy LLJLLIL;
    public InterfaceC500940Jki LLJLLL;
    public boolean LLJZ;
    public C11JF LLJZIJLIL;
    public Animator LLL;
    public float LLLF;
    public final boolean LLILZIL = LiveEndPageFullToHalfOptSetting.INSTANCE.isEnable();
    public float LLJJ = LLLFFI;

    @Override // X.InterfaceC465090ILr
    public final void Fc() {
    }

    @Override // X.InterfaceC465090ILr
    public final void ed(Room room) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gfj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC465090ILr
    public final void xg(Room room) {
    }

    @Override // X.InterfaceC465090ILr
    public final void xw(List<Room> list) {
    }

    public final boolean C1() {
        final View view;
        ViewGroup.LayoutParams layoutParams;
        if (!this.LLJIJIL || (view = this.contentView) == null) {
            return false;
        }
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.ed(view, 0.0f);
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJJJLIIL;
        if (view3 != null) {
            C786410Ut5.T4(view3, 1.0f);
        }
        View view4 = this.LLILLJJLI;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        int iX1 = x1(view);
        if (iX1 > 0 && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = iX1;
            C786410Ut5.W5(view, layoutParams);
        }
        if (this.LLIZ) {
            return true;
        }
        if (!this.LLJI) {
            this.LLJIJIL = true;
            return true;
        }
        this.LLJIJIL = false;
        int i = (int) this.LLJJ;
        if (i <= 0) {
            return false;
        }
        int iX12 = x1(view);
        if (iX12 <= 0) {
            if (!this.LLIZLLLIL) {
                this.LLIZLLLIL = true;
                HandlerHook.viewPost(view, new ARunnableS107S0100000_7(this, 29));
            }
            return true;
        }
        if (iX12 <= i) {
            return false;
        }
        this.LLIZ = true;
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZLL = null;
        Animator animator = this.LLILZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLILZ = null;
        Animator animator2 = this.LLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLL = null;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            this.LLIZ = false;
            return false;
        }
        layoutParams2.height = iX12;
        C786410Ut5.W5(view, layoutParams2);
        View view5 = this.LLJJJJJIL;
        if (view5 != null) {
            view5.setClipToOutline(true);
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), view5);
            C786410Ut5.LJLLLLLL(0, view5);
        }
        C1324720kZq c1324720kZq = this.LLJJI;
        if (c1324720kZq != null) {
            c1324720kZq.setClipToOutline(true);
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), c1324720kZq);
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        final float translationY = view.getTranslationY();
        final float f = LLLFZ;
        View view6 = this.LLJJJJJIL;
        if (view6 != null) {
            C786410Ut5.ed(view6, iX12 + translationY + f);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iX12, i);
        this.LLILZLL = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(320L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        final float fLIZIZ = (int) C497740JfY.LIZIZ(127.0f);
        final float fLIZIZ2 = (int) C497740JfY.LIZIZ(32.0f);
        final float fLIZIZ3 = (int) C497740JfY.LIZIZ(120.0f);
        final float fLIZIZ4 = (int) C497740JfY.LIZIZ(80.0f);
        final float fLIZIZ5 = (int) C497740JfY.LIZIZ(71.0f);
        final float f2 = this.LLLF;
        final float fLIZIZ6 = (int) C497740JfY.LIZIZ(48.0f);
        final float fLIZIZ7 = (int) C497740JfY.LIZIZ(40.0f);
        final float fLIZIZ8 = (int) C497740JfY.LIZIZ(56.0f);
        final float fLIZIZ9 = (int) C497740JfY.LIZIZ(32.0f);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0IKg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Integer num;
                ViewGroup.LayoutParams layoutParams3;
                ViewGroup.LayoutParams layoutParams4;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2;
                ViewGroup.MarginLayoutParams marginLayoutParams3;
                ViewGroup.MarginLayoutParams marginLayoutParams4;
                ViewGroup.MarginLayoutParams marginLayoutParams5;
                ViewGroup.MarginLayoutParams marginLayoutParams6;
                Object animatedValue = valueAnimator2.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams5 = null;
                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                    int iIntValue = num.intValue();
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                    if (layoutParams6 != null) {
                        layoutParams6.height = iIntValue;
                        C786410Ut5.W5(view, layoutParams6);
                    }
                    C16F5 c16f5 = this.LLJJIJIIJIL;
                    if (c16f5 != null) {
                        layoutParams3 = c16f5.getLayoutParams();
                    } else {
                        layoutParams3 = null;
                    }
                    if ((layoutParams3 instanceof C19ME) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        float f3 = fLIZIZ;
                        marginLayoutParams6.topMargin = (int) (f3 + ((fLIZIZ2 - f3) * animatedFraction));
                        C16F5 c16f52 = this.LLJJIJIIJIL;
                        if (c16f52 != null) {
                            C786410Ut5.y6(c16f52, marginLayoutParams6);
                        }
                    }
                    C1099610eil c1099610eil = this.LLJJIJIL;
                    if (c1099610eil != null) {
                        layoutParams4 = c1099610eil.getLayoutParams();
                    } else {
                        layoutParams4 = null;
                    }
                    if ((layoutParams4 instanceof C19ME) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        float f4 = fLIZIZ3;
                        int i2 = (int) (f4 + ((fLIZIZ4 - f4) * animatedFraction));
                        marginLayoutParams5.width = i2;
                        marginLayoutParams5.height = i2;
                        float f5 = fLIZIZ5;
                        marginLayoutParams5.topMargin = (int) (f5 + ((f2 - f5) * animatedFraction));
                        C1099610eil c1099610eil2 = this.LLJJIJIL;
                        if (c1099610eil2 != null) {
                            C786410Ut5.B6(c1099610eil2, marginLayoutParams5);
                        }
                    }
                    View view7 = this.LLJJJ;
                    if (view7 != null) {
                        layoutParams5 = view7.getLayoutParams();
                    }
                    if ((layoutParams5 instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                        float f6 = fLIZIZ6;
                        marginLayoutParams4.height = (int) (f6 + ((fLIZIZ7 - f6) * animatedFraction));
                        View view8 = this.LLJJJ;
                        if (view8 != null) {
                            C786410Ut5.W5(view8, marginLayoutParams4);
                        }
                    }
                    View view9 = this.LLJJLIIIJLLLLLLLZ;
                    if (view9 != null) {
                        float f7 = fLIZIZ8;
                        float f8 = fLIZIZ9;
                        ViewGroup.LayoutParams layoutParams7 = view9.getLayoutParams();
                        if ((layoutParams7 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                            marginLayoutParams3.topMargin = (int) (f7 + ((f8 - f7) * animatedFraction));
                            C786410Ut5.W5(view9, marginLayoutParams3);
                        }
                    }
                    ConstraintLayout constraintLayout = this.LLILLL;
                    if (constraintLayout != null) {
                        float f9 = fLIZIZ8;
                        float f10 = fLIZIZ9;
                        ViewGroup.LayoutParams layoutParams8 = constraintLayout.getLayoutParams();
                        if ((layoutParams8 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                            marginLayoutParams2.topMargin = (int) (f9 + ((f10 - f9) * animatedFraction));
                            C786410Ut5.m6(constraintLayout, marginLayoutParams2);
                        }
                    }
                    View view10 = this.LLJL;
                    if (view10 != null) {
                        float f11 = fLIZIZ8;
                        float f12 = fLIZIZ9;
                        ViewGroup.LayoutParams layoutParams9 = view10.getLayoutParams();
                        if ((layoutParams9 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                            marginLayoutParams.topMargin = (int) (f11 + ((f12 - f11) * animatedFraction));
                            C786410Ut5.W5(view10, marginLayoutParams);
                        }
                    }
                    View view11 = this.LLJJJJJIL;
                    if (view11 != null) {
                        C786410Ut5.ed(view11, translationY + iIntValue + f);
                    }
                    View view12 = this.LLJJJJJIL;
                    if (view12 != null) {
                        view12.invalidateOutline();
                    }
                    C1324720kZq c1324720kZq2 = this.LLJJI;
                    if (c1324720kZq2 != null) {
                        c1324720kZq2.invalidateOutline();
                    }
                }
            }
        });
        valueAnimatorOfInt.addListener(new ALAdapterS0S0201000_7(this, view, i, 0));
        valueAnimatorOfInt.start();
        C0IH6.LIZ(C0III.FINISH_CARD_START_ANIM);
        return true;
    }

    public final void z1() {
        ViewGroup.LayoutParams layoutParams;
        if (!this.LLILZIL) {
            Animator animator = this.LLILZ;
            if (animator != null) {
                animator.cancel();
            }
            this.LLILZ = null;
            Animator animator2 = this.LLL;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.LLL = null;
            View view = this.LLJJJJJIL;
            if (view != null) {
                C786410Ut5.ed(view, 0.0f);
            }
            View view2 = this.contentView;
            if (view2 != null) {
                C786410Ut5.ed(view2, -this.LLJJ);
            }
            View view3 = this.contentView;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLJJJJJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            View view5 = this.LLILLJJLI;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            ConstraintLayout constraintLayout = this.LL;
            if (constraintLayout != null) {
                constraintLayout.setBackground(null);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = 0;
        this.LLJI = false;
        this.LLJIJIL = false;
        View view6 = this.contentView;
        if (view6 != null && (layoutParams = view6.getLayoutParams()) != null) {
            layoutParams.height = (int) this.LLJJ;
            View view7 = this.contentView;
            if (view7 != null) {
                C786410Ut5.W5(view7, layoutParams);
            }
        }
        View view8 = this.LLJJJJJIL;
        if (view8 != null) {
            C786410Ut5.ed(view8, 0.0f);
        }
        View view9 = this.contentView;
        if (view9 != null) {
            C786410Ut5.ed(view9, 0.0f);
        }
        View view10 = this.contentView;
        if (view10 != null) {
            C786410Ut5.LJLLLLLL(8, view10);
        }
        View view11 = this.LLJJJJJIL;
        if (view11 != null) {
            C786410Ut5.LJLLLLLL(0, view11);
        }
        View view12 = this.LLILLJJLI;
        if (view12 != null) {
            C786410Ut5.LJLLLLLL(8, view12);
        }
        ConstraintLayout constraintLayout2 = this.LL;
        if (constraintLayout2 != null) {
            constraintLayout2.setBackground(null);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        z1();
        C11JF c11jf = this.LLJZIJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJZ = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        int iX1;
        ViewGroup.LayoutParams layoutParams;
        super.show();
        if (!this.LLILZIL) {
            C465060ILo c465060ILo = this.LLJJL;
            if (c465060ILo != null) {
                C464740IKi c464740IKi = this.LLJILJILJ;
                c465060ILo.LIZJ(c464740IKi != null ? c464740IKi.LIZ : 0L);
            }
            C464740IKi c464740IKi2 = this.LLJILJILJ;
            if (c464740IKi2 != null) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0ILR(this, c464740IKi2.LIZIZ, null), 2);
            }
            View view = this.contentView;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            C1324720kZq c1324720kZq = this.LLJJI;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exu, new ContextThemeWrapper(this.context, R.style.z4));
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                ConstraintLayout constraintLayout = this.LL;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(iIntValue);
                }
            }
            C0IH6.LIZ(C0III.FINISH_WIDGET_REAL_LOADED);
            return;
        }
        C465060ILo c465060ILo2 = this.LLJJL;
        if (c465060ILo2 != null) {
            C464740IKi c464740IKi3 = this.LLJILJILJ;
            c465060ILo2.LIZJ(c464740IKi3 != null ? c464740IKi3.LIZ : 0L);
        }
        C464740IKi c464740IKi4 = this.LLJILJILJ;
        if (c464740IKi4 != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0ILR(this, c464740IKi4.LIZIZ, null), 2);
        }
        this.LLJ = 0;
        this.LLJI = false;
        C464740IKi c464740IKi5 = this.LLJILJILJ;
        this.LLJIJIL = c464740IKi5 != null && c464740IKi5.LJII && LiveEndPageFullToHalfOptSetting.INSTANCE.isAnimationEnable();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        Animator animator = this.LLL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLL = null;
        View view3 = this.contentView;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        y1("show");
        View view4 = this.LLJJJJJIL;
        if (view4 != null) {
            C786410Ut5.ed(view4, 0.0f);
        }
        ConstraintLayout constraintLayout2 = this.LL;
        if (constraintLayout2 != null) {
            constraintLayout2.setBackground(null);
        }
        View view5 = this.contentView;
        if (view5 != null) {
            HandlerHook.viewPost(view5, new ARunnableS107S0100000_7(this, 28));
        }
        View view6 = this.contentView;
        if (view6 != null) {
            view6.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC521700Kd6(this, 1));
        }
        View view7 = this.LLJJJJLIIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(0, view7);
        }
        View view8 = this.LLJJJJLIIL;
        if (view8 != null) {
            C786410Ut5.T4(view8, 1.0f);
        }
        View view9 = this.LLILLJJLI;
        if (view9 != null) {
            C786410Ut5.LJLLLLLL(8, view9);
        }
        View view10 = this.contentView;
        if (view10 != null && (iX1 = x1(view10)) > 0 && (layoutParams = view10.getLayoutParams()) != null) {
            layoutParams.height = iX1;
            C786410Ut5.W5(view10, layoutParams);
        }
        C1324720kZq c1324720kZq2 = this.LLJJI;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.exu, new ContextThemeWrapper(this.context, R.style.z4));
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            ConstraintLayout constraintLayout3 = this.LL;
            if (constraintLayout3 != null) {
                constraintLayout3.setBackgroundColor(iIntValue2);
            }
        }
        C0IH6.LIZ(C0III.FINISH_WIDGET_REAL_LOADED);
    }

    public final void A1(boolean z) {
        if (getContext() == null) {
            return;
        }
        if (z) {
            View view = this.LLJJJ;
            if (view != null) {
                view.setBackgroundResource(R.drawable.dz6);
            }
            LiveIconView liveIconView = this.LLJJJIL;
            if (liveIconView != null) {
                liveIconView.setIcon(R.raw.icon_bell_fill);
            }
            C16F5 c16f5 = this.LLJJJJ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131842790));
                return;
            }
            return;
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.dz3);
        }
        LiveIconView liveIconView2 = this.LLJJJIL;
        if (liveIconView2 != null) {
            liveIconView2.setIcon(C20736316Cj.LJ(R.attr.e_6, getContext()));
        }
        C16F5 c16f52 = this.LLJJJJ;
        if (c16f52 == null) {
            return;
        }
        c16f52.setText(C497740JfY.LJIJI(2131852435));
    }

    public final void B1(View view) {
        this.LLJJJJJIL = view;
        if (this.LLILZIL && view != null) {
            view.setClipToOutline(true);
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), view);
            view.requestLayout();
            view.invalidate();
        }
    }

    public final void D1(String str) {
        Map<String, String> map;
        boolean z;
        String str2;
        if (this.LLJZ) {
            C464740IKi c464740IKi = this.LLJILJILJ;
            if (c464740IKi != null) {
                map = c464740IKi.LJI;
            } else {
                map = null;
            }
            if (c464740IKi != null && c464740IKi.LJIIIIZZ) {
                z = true;
            } else {
                z = false;
            }
            if (map != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_exit");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJJII(1, "is_half_screen");
                c474500IjALIZ.LJJII(str, "exit_type");
                if (z) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str2, "is_guest_spec");
                c474500IjALIZ.LIZ();
            }
            this.LLJZ = false;
        }
    }

    public final void E1(boolean z) {
        int i;
        int i2;
        C16F5 c16f5 = this.LLJLL;
        if (c16f5 != null) {
            if (z) {
                i2 = 2131851061;
            } else {
                i2 = 2131851060;
            }
            c16f5.setText(C497740JfY.LJIJI(i2));
        }
        C16F5 c16f52 = this.LLJLL;
        if (c16f52 != null) {
            if (z) {
                i = R.drawable.dkc;
            } else {
                i = R.drawable.dka;
            }
            c16f52.setBackground(C497740JfY.LJIIJ(i));
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void az(Room room) {
        C464740IKi c464740IKi;
        User owner;
        boolean z;
        ImageModel avatarMedium;
        User user;
        int i;
        if (room == null || room.getOwner() == null || (c464740IKi = this.LLJILJILJ) == null || (owner = room.getOwner()) == null) {
            return;
        }
        C0IH6.LIZ(C0III.FINISH_WIDGET_DATA_READY);
        if (room.getOwner().getFollowInfo().getFollowStatus() != 1 && room.getOwner().getFollowInfo().getFollowStatus() != 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        this.LLJILLL = z2;
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS74S0300000_7(this, room, c464740IKi, 0), view);
        }
        A1(z2);
        if (room.getStats() != null && (i = room.getStats().replayViewers) > 0) {
            String strLIZ = C0IMV.LIZ(i);
            C16F5 c16f5 = this.LLJJIII;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16F5 c16f52 = this.LLJJIII;
            if (c16f52 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append(' ');
                sbLIZ.append(C497740JfY.LJIJI(2131852421));
                c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            C16F5 c16f53 = this.LLJJIII;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 4);
            }
        }
        User user2 = null;
        if (c464740IKi.LJ) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && (user = officialChannelInfo.channelUser) != null) {
                avatarMedium = user.getAvatarMedium();
            } else {
                avatarMedium = null;
            }
            C1121670fIL.LJIIL(this.LLJJIJIL, avatarMedium, 2130975647);
        } else {
            C1121670fIL.LJIIL(this.LLJJIJIL, owner.getAvatarMedium(), 2130975647);
        }
        C1099610eil c1099610eil = this.LLJJIJIL;
        if (c1099610eil != null) {
            C786410Ut5.H8(c1099610eil, new ACListenerS74S0300000_7(this, room, c464740IKi, 1));
        }
        if (c464740IKi.LJ) {
            C16F5 c16f54 = this.LLJJIJI;
            if (c16f54 != null) {
                OfficialChannelInfo officialChannelInfo2 = room.officialChannelInfo;
                if (officialChannelInfo2 != null) {
                    user2 = officialChannelInfo2.channelUser;
                }
                String strLIZ2 = C0KVU.LIZ(user2);
                if (strLIZ2 == null) {
                    strLIZ2 = "";
                }
                c16f54.setText(strLIZ2);
                return;
            }
            return;
        }
        C16F5 c16f55 = this.LLJJIJI;
        if (c16f55 != null) {
            c16f55.setText(C0KVU.LIZ(owner));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1324720kZq c1324720kZq;
        C19ME c19me;
        this.LLJJL = new C465060ILo(this);
        this.LLJJI = (C1324720kZq) findViewById(R.id.bo6);
        this.LLJJIJIIJIL = (C16F5) findViewById(R.id.mx7);
        this.LLJJIJIL = (C1099610eil) findViewById(R.id.azx);
        this.LLJJIJI = (C16F5) findViewById(R.id.b0x);
        this.LLJJIII = (C16F5) findViewById(R.id.mx4);
        this.LLJJJ = findViewById(R.id.idv);
        this.LLJJJJLIIL = findViewById(R.id.h4k);
        this.LLJJJIL = (LiveIconView) findViewById(R.id.iet);
        this.LLJJJJ = (C16F5) findViewById(R.id.ifj);
        this.LLJLLIL = new C468800IZy();
        this.LLJLLL = UserService.getInstance().user();
        if (this.LLILZIL && (c1324720kZq = this.LLJJI) != null) {
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).height = -1;
                c19me.topToTop = 0;
                C786410Ut5.u6(c1324720kZq, c19me);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long lValueOf;
        long j;
        Bitmap bitmap;
        show();
        if (this.LLILZIL && (bitmap = this.LLJILJIL) != null && !bitmap.isRecycled()) {
            C1324720kZq c1324720kZq = this.LLJJI;
            if (c1324720kZq != null) {
                c1324720kZq.setImageBitmap(this.LLJILJIL);
            }
            C1324720kZq c1324720kZq2 = this.LLJJI;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setClipToOutline(true);
                C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), c1324720kZq2);
                c1324720kZq2.invalidateOutline();
            }
            C1324720kZq c1324720kZq3 = this.LLJJI;
            if (c1324720kZq3 != null) {
                C786410Ut5.LLJJIII(c1324720kZq3, 0);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad: register followStatusChanged anchorId = ");
        C464740IKi c464740IKi = this.LLJILJILJ;
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if (c464740IKi != null) {
            lValueOf = Long.valueOf(c464740IKi.LIZJ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C11JF c11jf = this.LLJZIJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        InterfaceC500940Jki interfaceC500940Jki = this.LLJLLL;
        if (interfaceC500940Jki != null) {
            C464740IKi c464740IKi2 = this.LLJILJILJ;
            if (c464740IKi2 != null) {
                j = c464740IKi2.LIZJ;
            } else {
                j = 0;
            }
            C11NZ<FollowPair> c11nzLIZIZ = interfaceC500940Jki.LIZIZ(j);
            if (c11nzLIZIZ != null) {
                interfaceC420801kMLJJLL = c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 26), new C09JN() { // from class: X.0IKh
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LiveEndCardWidget@8614.onLoad$3");
                        C1C7U.LIZIZ("LiveEndCardWidget@8614.onLoad$3");
                    }
                });
            }
        }
        this.LLJZIJLIL = (C11JF) interfaceC420801kMLJJLL;
    }

    public final int x1(View view) {
        int iIntValue;
        Resources resources;
        DisplayMetrics displayMetrics;
        Integer numValueOf;
        Integer numValueOf2;
        int i = this.LLJ;
        if (i > 0) {
            return i;
        }
        ConstraintLayout constraintLayout = this.LL;
        if (constraintLayout != null) {
            iIntValue = constraintLayout.getHeight();
        } else {
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                iIntValue = view2.getHeight();
            } else {
                View rootView = view.getRootView();
                if (rootView != null && (numValueOf2 = Integer.valueOf(rootView.getHeight())) != null) {
                    iIntValue = numValueOf2.intValue();
                } else {
                    Context context = getContext();
                    if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (numValueOf = Integer.valueOf(displayMetrics.heightPixels)) != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                }
            }
        }
        this.LLJ = iIntValue;
        return iIntValue;
    }

    public final void y1(String str) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        boolean z;
        C19ME c19me;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceResetLayout from ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveEndSmallCardWidget", C2188811AlT.LIZIZ(sbLIZ));
        View view2 = this.contentView;
        if (view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        Object parent = view2.getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        C786410Ut5.ed(view2, 0.0f);
        C786410Ut5.T4(view2, 1.0f);
        C786410Ut5.LJLLLLLL(0, view2);
        if (view != null) {
            if (view.getTranslationY() != 0.0f) {
                C786410Ut5.ed(view, 0.0f);
            }
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                if (((ViewGroup.MarginLayoutParams) c19me).topMargin != 0) {
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((ViewGroup.MarginLayoutParams) c19me).bottomMargin != 0) {
                    ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                    z2 = true;
                }
                if (c19me.topToTop != 0) {
                    c19me.topToTop = 0;
                    z2 = true;
                }
                if (c19me.bottomToTop != -1) {
                    c19me.bottomToTop = -1;
                } else if (z2) {
                }
                C786410Ut5.W5(view, c19me);
                view.requestLayout();
            }
        }
        if (marginLayoutParams != null) {
            if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = true;
            } else {
                z = false;
            }
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
            } else if (!z) {
                return;
            }
            C786410Ut5.W5(view2, marginLayoutParams);
        }
    }
}
