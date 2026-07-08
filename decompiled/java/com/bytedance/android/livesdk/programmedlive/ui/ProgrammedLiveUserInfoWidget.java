package com.bytedance.android.livesdk.programmedlive.ui;

import X.C0IJT;
import X.C0IZP;
import X.C1096340edU;
import X.C1099380eiO;
import X.C1099610eil;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C1834150xpV;
import X.C19MB;
import X.C19ME;
import X.C342780DcC;
import X.C427340GpI;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1096020ecy;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceToastOpt;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ProgrammedLiveUserInfoWidget extends ClearScreenUserInfoWidget {
    public boolean m0;
    public C1324720kZq n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public LiveIconView f318o0;
    public boolean p0;

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, X.InterfaceC1087920ePu
    public final String JA() {
        return "ProgrammedLiveUserInfoWidget";
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget
    public final void d3() {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f322h0 == 0) {
            Animator animatorB3 = b3();
            this.b0 = animatorB3;
            animatorSet.playTogether(animatorB3);
        }
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 14));
        animatorSet.start();
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget
    public final void e3() {
        AnimatorSet animatorSet = new AnimatorSet();
        C1096340edU c1096340edU = this.LLLZ;
        EnumC1096020ecy enumC1096020ecy = c1096340edU.LJIILL;
        if (enumC1096020ecy != EnumC1096020ecy.FOLLOW_ANIM) {
            if (enumC1096020ecy != EnumC1096020ecy.FOLLOWED) {
                Animator animatorA3 = a3();
                this.c0 = animatorA3;
                animatorSet.playTogether(animatorA3);
            }
            animatorSet.addListener(new ALAdapterS13S0100000_17(this, 89));
            animatorSet.start();
        }
        c1096340edU.LJIIJ();
        this.LLLZ.LJIILL = EnumC1096020ecy.FOLLOWED;
        animatorSet.addListener(new ALAdapterS13S0100000_17(this, 89));
        animatorSet.start();
    }

    public final void g3(boolean z) {
        if (!C1099380eiO.LIZ(C500260Jjc.LJIIZILJ(this.dataChannel))) {
            return;
        }
        if (LiveUserInfoMuteUIAudienceToastOpt.enable() && !this.LLLLLL && z) {
            C766270U4b.LIZLLL(2131854878);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_audience_mute_mic");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_mute");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9;
        ViewGroup.LayoutParams layoutParams10;
        ViewGroup.LayoutParams layoutParams11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C19ME c19me;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        super.onInit(objArr);
        View view = getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams12 = view.getLayoutParams();
            layoutParams12.height = (int) C497740JfY.LIZIZ(24.0f);
            C786410Ut5.W5(view, layoutParams12);
        }
        C1099610eil c1099610eil = this.LLLJ;
        if (c1099610eil != null) {
            layoutParams = c1099610eil.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(18.0f);
                layoutParams.height = (int) C497740JfY.LIZIZ(18.0f);
            }
        } else {
            layoutParams = null;
        }
        C1099610eil c1099610eil2 = this.LLLJ;
        if (c1099610eil2 != null) {
            C786410Ut5.B6(c1099610eil2, layoutParams);
        }
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) C497740JfY.LIZIZ(24.0f);
            }
        } else {
            layoutParams2 = null;
        }
        ViewGroup viewGroup2 = this.LLILZ;
        if (viewGroup2 != null) {
            C786410Ut5.X5(layoutParams2, viewGroup2);
        }
        C1099610eil c1099610eil3 = this.LLILZLL;
        if (c1099610eil3 != null) {
            layoutParams3 = c1099610eil3.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 != null) {
            layoutParams3.width = (int) C497740JfY.LIZIZ(22.0f);
            layoutParams3.height = (int) C497740JfY.LIZIZ(22.0f);
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams5.setMarginStart((int) C497740JfY.LIZIZ(1.0f));
            }
        }
        C1099610eil c1099610eil4 = this.LLILZLL;
        if (c1099610eil4 != null) {
            C786410Ut5.B6(c1099610eil4, layoutParams3);
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            layoutParams4 = view2.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = -2;
                boolean z = layoutParams4 instanceof ViewGroup.MarginLayoutParams;
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams6 != null) {
                        marginLayoutParams6.topMargin = 0;
                    }
                    if (z && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        marginLayoutParams4.bottomMargin = 0;
                    }
                }
            }
        } else {
            layoutParams4 = null;
        }
        View view3 = this.LLJI;
        if (view3 != null) {
            C786410Ut5.W5(view3, layoutParams4);
        }
        ViewGroup viewGroup3 = this.LLLIIII;
        if (viewGroup3 != null) {
            layoutParams5 = viewGroup3.getLayoutParams();
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 != null) {
            boolean z2 = layoutParams5 instanceof ViewGroup.MarginLayoutParams;
            if (z2) {
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams5;
                if (marginLayoutParams7 != null) {
                    marginLayoutParams7.topMargin = (int) C497740JfY.LIZIZ(3.0f);
                }
                if (z2 && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    marginLayoutParams3.bottomMargin = (int) C497740JfY.LIZIZ(3.0f);
                }
            }
            if ((layoutParams5 instanceof C19ME) && (c19me = (C19ME) layoutParams5) != null) {
                c19me.constrainedHeight = true;
            }
        }
        ViewGroup viewGroup4 = this.LLLIIII;
        if (viewGroup4 != null) {
            C786410Ut5.X5(layoutParams5, viewGroup4);
        }
        this.LLLIIIIL.setMinimumWidth(0);
        C16F5 c16f5 = this.LLLIIL;
        if (c16f5 != null) {
            c16f5.LJJJI(R.style.a9m);
            c16f5.setTextSize(1, 12.0f);
            c16f5.setIncludeFontPadding(false);
            c16f5.setReduceFont(true);
        }
        View view4 = this.LLLII;
        if (view4 != null) {
            layoutParams6 = view4.getLayoutParams();
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 != null) {
            layoutParams6.height = (int) C497740JfY.LIZIZ(16.0f);
        }
        View view5 = this.LLLII;
        if (view5 != null) {
            C786410Ut5.W5(view5, layoutParams6);
        }
        ImageView imageView = this.LLLILZJ;
        if (imageView != null) {
            layoutParams7 = imageView.getLayoutParams();
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 != null) {
            layoutParams7.width = (int) C497740JfY.LIZIZ(16.0f);
            layoutParams7.height = (int) C497740JfY.LIZIZ(16.0f);
            if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                marginLayoutParams2.topMargin = 0;
                marginLayoutParams2.bottomMargin = 0;
                marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
                marginLayoutParams2.leftMargin = (int) C497740JfY.LIZIZ(6.0f);
            }
        }
        ImageView imageView2 = this.LLLILZJ;
        if (imageView2 != null) {
            C786410Ut5.c6(imageView2, layoutParams7);
        }
        TextView textView = this.LLLIZZ;
        if (textView != null) {
            layoutParams8 = textView.getLayoutParams();
            if (layoutParams8 != null && (layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(6.0f));
                marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(6.0f);
            }
        } else {
            layoutParams8 = null;
        }
        TextView textView2 = this.LLLIZZ;
        if (textView2 != null) {
            C786410Ut5.g6(textView2, layoutParams8);
        }
        ImageView imageView3 = this.LLLILZLLLI;
        if (imageView3 != null) {
            layoutParams9 = imageView3.getLayoutParams();
            if (layoutParams9 != null) {
                layoutParams9.width = (int) C497740JfY.LIZIZ(16.0f);
                layoutParams9.height = (int) C497740JfY.LIZIZ(16.0f);
            }
        } else {
            layoutParams9 = null;
        }
        ImageView imageView4 = this.LLLILZLLLI;
        if (imageView4 != null) {
            C786410Ut5.c6(imageView4, layoutParams9);
        }
        View view6 = this.LLLIL;
        if (view6 != null) {
            layoutParams10 = view6.getLayoutParams();
            if (layoutParams10 != null) {
                layoutParams10.width = (int) C497740JfY.LIZIZ(48.0f);
                layoutParams10.height = (int) C497740JfY.LIZIZ(22.0f);
            }
        } else {
            layoutParams10 = null;
        }
        View view7 = this.LLLIL;
        if (view7 != null) {
            C786410Ut5.W5(view7, layoutParams10);
        }
        C1324720kZq c1324720kZq = this.LLIZ;
        if (c1324720kZq != null) {
            layoutParams11 = c1324720kZq.getLayoutParams();
            if (layoutParams11 != null) {
                layoutParams11.width = (int) C497740JfY.LIZIZ(22.0f);
                layoutParams11.height = (int) C497740JfY.LIZIZ(22.0f);
            }
        } else {
            layoutParams11 = null;
        }
        C1324720kZq c1324720kZq2 = this.LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.u6(c1324720kZq2, layoutParams11);
        }
        if (this.LLILZ instanceof ConstraintLayout) {
            if (C1099380eiO.LIZ(C500260Jjc.LJIIZILJ(this.dataChannel))) {
                C1324720kZq c1324720kZq3 = new C1324720kZq(C1834150xpV.LJII(this.context));
                c1324720kZq3.setId(View.generateViewId());
                this.LLILZ.addView(c1324720kZq3);
                c1324720kZq3.setImageDrawable(C342780DcC.LIZ(C1834150xpV.LJII(c1324720kZq3.getContext())));
                C19ME c19me2 = new C19ME((int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                c19me2.setMarginStart((int) C497740JfY.LIZIZ(3.0f));
                C786410Ut5.u6(c1324720kZq3, c19me2);
                C500260Jjc.LJIILLIIL(c1324720kZq3);
                this.n0 = c1324720kZq3;
            } else {
                LiveIconView liveIconView = new LiveIconView(C1834150xpV.LJII(this.context), null);
                liveIconView.setId(View.generateViewId());
                this.LLILZ.addView(liveIconView);
                liveIconView.setIconAttr(R.attr.e3x);
                liveIconView.setIconTintAttr(R.attr.ezq);
                C19ME c19me3 = new C19ME((int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f));
                c19me3.setMarginStart((int) C497740JfY.LIZIZ(3.0f));
                C786410Ut5.w6(liveIconView, c19me3);
                C500260Jjc.LJIILLIIL(liveIconView);
                this.f318o0 = liveIconView;
            }
        }
        Room room = this.LLLLLJLJLL;
        if (room != null) {
            C0IZP.LIZJ(room, "programmedlive_anchor_info");
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        boolean zN42;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int iLIZIZ;
        super.onLoad(objArr);
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        View view = this.LLJJIJI;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        C427340GpI c427340GpI = this.LLJJJJLIIL;
        if (c427340GpI != null) {
            C500260Jjc.LJIILIIL(c427340GpI);
        }
        View view2 = this.LLJLL;
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null) {
            zN42 = iMicRoomService.n42((Room) this.dataChannel.gg0(RoomChannel.class));
        } else {
            zN42 = false;
        }
        this.m0 = zN42;
        C16F5 c16f52 = this.LLJIJIL;
        float f = 12.0f;
        if (c16f52 != null) {
            c16f52.LJJJI(R.style.a9i);
            if (!this.m0) {
                c16f52.setTextSize(12.0f);
            }
            c16f52.setIncludeFontPadding(false);
            c16f52.setReduceFont(true);
            if (this.m0) {
                c16f52.setMaxWidth((int) C497740JfY.LIZIZ(53.0f));
            } else {
                c16f52.setMaxWidth((int) C497740JfY.LIZIZ(90.0f));
            }
            c16f52.LJJJI(R.style.a91);
            c16f52.setTextSize(12.0f);
        }
        if (!this.LLLLLL) {
            LiveIconView liveIconView = this.LLLIILIL;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (liveIconView != null) {
                layoutParams = liveIconView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.m0) {
                    iLIZIZ = 0;
                } else {
                    iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
                }
                marginLayoutParams3.setMarginStart(iLIZIZ);
                if (this.m0) {
                    marginLayoutParams3.setMarginEnd(0);
                    this.LLLIIIL.setPadding(0, 0, 0, 0);
                    f = 20.0f;
                } else {
                    f = 14.0f;
                }
            }
            if (layoutParams != null) {
                layoutParams.height = (int) C497740JfY.LIZIZ(f);
                layoutParams.width = (int) C497740JfY.LIZIZ(f);
            }
            LiveIconView liveIconView2 = this.LLLIILIL;
            if (liveIconView2 != null) {
                C786410Ut5.w6(liveIconView2, layoutParams);
            }
            ViewGroup viewGroup = this.LLLIIII;
            if (viewGroup != null) {
                layoutParams2 = viewGroup.getLayoutParams();
            }
            if (this.m0) {
                if (layoutParams2 != null && ((z2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams))) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams4 != null) {
                        marginLayoutParams4.topMargin = (int) C497740JfY.LIZIZ(2.0f);
                    }
                    if (z2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams5 != null) {
                            marginLayoutParams5.bottomMargin = (int) C497740JfY.LIZIZ(2.0f);
                        }
                        if (z2 && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams2.rightMargin = (int) C497740JfY.LIZIZ(2.0f);
                        }
                    }
                }
            } else if (layoutParams2 != null && ((z = layoutParams2 instanceof ViewGroup.MarginLayoutParams))) {
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.topMargin = (int) C497740JfY.LIZIZ(1.0f);
                }
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams7 != null) {
                        marginLayoutParams7.bottomMargin = (int) C497740JfY.LIZIZ(1.0f);
                    }
                    if (z) {
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams8 != null) {
                            marginLayoutParams8.rightMargin = (int) C497740JfY.LIZIZ(1.0f);
                        }
                        if (z && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(1.0f));
                        }
                    }
                }
            }
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.constrainedHeight = true;
            }
            ViewGroup viewGroup2 = this.LLLIIII;
            if (viewGroup2 != null) {
                C786410Ut5.X5(layoutParams2, viewGroup2);
            }
        }
        View view3 = this.LLJLILLLLZIIL;
        if (view3 != null) {
            C500260Jjc.LJIILIIL(view3);
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void x2(boolean z) {
        View view;
        View view2;
        if (z) {
            if (!this.p0) {
                this.p0 = true;
                g3(true);
                if (C1099380eiO.LIZ(C500260Jjc.LJIIZILJ(this.dataChannel))) {
                    view2 = this.n0;
                } else {
                    view2 = this.f318o0;
                }
                if (view2 != null) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJII((ConstraintLayout) this.LLILZ);
                    c19mb.LJIIIIZZ(view2.getId(), 3, 0, 3);
                    c19mb.LJIIIIZZ(view2.getId(), 4, 0, 4);
                    c19mb.LJIIIIZZ(view2.getId(), 6, this.LLILZLL.getId(), 7);
                    c19mb.LJIIIIZZ(this.LLJI.getId(), 6, view2.getId(), 7);
                    c19mb.LIZIZ((ConstraintLayout) this.LLILZ);
                    C500260Jjc.LLFFF(view2);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.p0) {
            return;
        }
        this.p0 = false;
        g3(false);
        if (C1099380eiO.LIZ(C500260Jjc.LJIIZILJ(this.dataChannel))) {
            view = this.n0;
        } else {
            view = this.f318o0;
        }
        if (view == null) {
            return;
        }
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII((ConstraintLayout) this.LLILZ);
        c19mb2.LJFF(view.getId());
        c19mb2.LJIIIIZZ(this.LLILZ.getId(), 6, this.LLILZLL.getId(), 7);
        c19mb2.LIZIZ((ConstraintLayout) this.LLILZ);
        C500260Jjc.LJIILIIL(view);
    }
}
