package com.ss.android.ugc.aweme.repostfeed.ui;

import X.C01GW;
import X.C0CNO;
import X.C13LE;
import X.C14EU;
import X.C14LC;
import X.C1564680qos;
import X.C1576740r8K;
import X.C1583340rIy;
import X.C19252910Tv;
import X.C197039127h;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C690440R6k;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS158S0100000_24;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostBackToFYPAssem extends FeedBaseAssem<RepostBackToFYPAssem> {
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS257S0000000_19.get$arr$(305));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1786));
    public FrameLayout LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.elz;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        C0CNO.LIZLLL(0L, new AwS568S0100000_24(this, 884));
    }

    public final View tp() {
        return (View) this.LLJLIL.getValue();
    }

    public final void L3() {
        ViewGroup viewGroup;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissGuide containerView.isGone:");
        sbLIZ.append(LJJIJL().getVisibility() == 8);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJJIJL().getVisibility() == 8) {
            return;
        }
        C339190DRl.LIZIZ(LJJIJL());
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LJI(false);
        }
        C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
        if (c1576740r8KLIZ2 != null) {
            c1576740r8KLIZ2.LIZJ(false);
        }
        C1583340rIy.LIZ = "";
        View viewTp = tp();
        if (viewTp != null) {
            C786410Ut5.T4(viewTp, 1.0f);
        }
        View viewTp2 = tp();
        if (viewTp2 != null) {
            viewTp2.setEnabled(true);
        }
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout != null) {
            View viewTp3 = tp();
            if ((viewTp3 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewTp3) != null) {
                C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
            }
            this.LLJLILLLLZIIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onRefreshEvent(C1564680qos c1564680qos) {
        if (c1564680qos.LIZ == 13) {
            L3();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0zpy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS310S0000000_24.get$arr$(51), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0zpz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(52), 6);
        View viewFindViewById = view.findViewById(R.id.t9z);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{0, -16777216});
            viewFindViewById.setBackground(gradientDrawable);
        }
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 128), view);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.t_0);
        this.LLJJLIIIJLLLLLLLZ = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 129));
        }
        C197039127h c197039127h2 = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h2 != null) {
            if (C426750GoL.LIZLLL(c197039127h2.getContext())) {
                i = R.raw.icon_arrow_right_circle_fill;
            } else {
                i = R.raw.icon_arrow_left_circle_fill;
            }
            c197039127h2.setButtonStartIcon(Integer.valueOf(i));
            c197039127h2.setTextColorRes(R.attr.u_);
            c197039127h2.setIconTintColorRes(R.attr.u_);
            c197039127h2.setButtonVariant(1);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c197039127h2.setBackground(c384050F3z.LIZ(c197039127h2.getContext()));
            c197039127h2.setTuxFont(33);
            c197039127h2.LJJLI(true);
        }
        if (C14LC.LJIIIZ || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0) {
            C426750GoL.LJIIL(getContentView(), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIIJ)))), 23);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        EventBus.LIZLLL().LJIJJ(this);
    }
}
