package com.ss.android.ugc.aweme.friendstab.educate;

import X.C01GW;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C14LC;
import X.C1564680qos;
import X.C1576740r8K;
import X.C1589640rT8;
import X.C19252910Tv;
import X.C19EG;
import X.C1A5L;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C446900Hfk;
import X.C690440R6k;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS309S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class BackToFYPGuideAssem extends FeedBaseAssem<BackToFYPGuideAssem> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS264S0000000_24.get$arr$(134));
    public C1295960jpS LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ca9;
    }

    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return Intrinsics.LJFF(aweme != null ? aweme.getAid() : null, C1589640rT8.LIZIZ.U1());
    }

    public final void L3() {
        if (LJJIJL().getVisibility() == 0) {
            C1589640rT8.LIZIZ.e3();
            C1295960jpS c1295960jpS = this.LLJL;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
            C339190DRl.LIZIZ(LJJIJL());
            C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
            if (c1576740r8KLIZ != null) {
                c1576740r8KLIZ.LJ(false);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onRefreshEvent(C1564680qos c1564680qos) {
        if (c1564680qos.LIZ == 3) {
            L3();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        EventBus.LIZLLL().LJIJJ(this);
        if (!(LJJIJL() instanceof FrameLayout)) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0zpw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS309S0000000_24(this, 0), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0zpx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS309S0000000_24(this, 1), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        View viewLJJIJL = LJJIJL();
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 112), LJJIJL());
        View viewFindViewById = viewLJJIJL.findViewById(R.id.v_gradient);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, viewFindViewById.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            gradientDrawable.setColors(new int[]{0, iIntValue});
            viewFindViewById.setBackground(gradientDrawable);
        }
        C2271391DvN.LIZ(viewLJJIJL, (C1A5L) C2271381DvM.I.getValue());
        ConstraintLayout constraintLayout = (ConstraintLayout) viewLJJIJL.findViewById(R.id.dv7);
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS126S0200000_24(this, viewLJJIJL, 38));
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJJIJL.findViewById(R.id.cnd);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS126S0200000_24(this, viewLJJIJL, 39));
            if (C1589640rT8.LIZIZ.F2()) {
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_left_ltr;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ej, tuxTextView.getContext());
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(c419910GdJ.LIZ(tuxTextView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
        }
        if (C14LC.LJIIIZ || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0) {
            int i = C14LC.LJIIJ;
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.findViewById(R.id.nij).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i + 16)));
            }
        }
        C1295960jpS c1295960jpS = (C1295960jpS) viewLJJIJL.findViewById(R.id.nra);
        this.LLJL = c1295960jpS;
        if (c1295960jpS != null) {
            c1295960jpS.setRepeatCount(-1);
        }
    }

    public final void up(String str) {
        Pair pair;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("homepage_friends", "enter_from");
        pairArr[1] = new Pair(str, "action_type");
        if (C1589640rT8.LIZIZ.F2()) {
            pair = new Pair(1, "is_top_tab");
        } else {
            pair = new Pair(0, "is_top_tab");
        }
        pairArr[2] = pair;
        pairArr[3] = new Pair("return_fyp_guide", "button_type");
        pairArr[4] = new Pair(0, "is_friends_tab_v2");
        C20684815ws.LJIJI("homepage_return_guide", pairArr);
    }

    public final void yp(View view) {
        L3();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            Hox hoxLIZ = c446900Hfk.LIZ(c19egLIZIZ);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            hoxLIZ.TQ2(bundle, "HOME", false);
            Hox hoxLIZ2 = c446900Hfk.LIZ(c19egLIZIZ);
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle2);
            hoxLIZ2.TQ2(bundle2, "For You", false);
        }
        up("click_button");
    }
}
