package com.ss.android.ugc.feed.platform.tablet;

import X.C01GW;
import X.C0RF0;
import X.C0SXF;
import X.C1389340mG4;
import X.C13LE;
import X.C1558520qew;
import X.C19252910Tv;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C299070Bnt;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C726550Sej;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TabletFakeLandscapeInteractAssem extends BaseCellSlotComponent<TabletFakeLandscapeInteractAssem> implements TabletFakeLandscapeAbility, InterfaceC1554640qYg {
    public TuxIconView LLJLLIL;
    public TuxTextView LLJLLL;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public Aweme LLLF;
    public View LLLFF;
    public C726550Sej LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(584));
    public final C630740Ooa LLLIIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1309));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1310));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1311));
    public final ViewTreeObserverOnGlobalLayoutListenerC738830SyX LLLIIL = new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(this, 4);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbk;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 328263962) {
            return null;
        }
        return this;
    }

    public final TuxIconView Ep() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ioh) : null;
            this.LLJLLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final void Gp() {
        C726550Sej c726550Sej;
        if (this.LLL && (c726550Sej = this.LLLFFI) != null) {
            c726550Sej.LIZIZ();
        }
        this.LLL = false;
        this.LLLFZ = false;
        Fp();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeAbility
    public final void LJJLIIIIJ() {
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        View view = this.LLLFF;
        boolean z = false;
        if (view != null) {
            C786410Ut5.LJLLLLLL(Bp(this.LLLF) ? 0 : 8, view);
        }
        C726550Sej c726550Sej = this.LLLFFI;
        Float fValueOf = c726550Sej != null ? Float.valueOf(c726550Sej.LJIIIIZZ) : null;
        if (this.LLL && fValueOf != null && fValueOf.floatValue() > 0.0f) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "did_rotate_landscape");
            c2344009Gk.LIZIZ(fValueOf.floatValue(), "aspect_ratio_x100");
            C0RF0 c0rf0 = jm().LIZLLL;
            c2344009Gk.LJIIIIZZ("enter_from", c0rf0 != null ? c0rf0.LJIIIZ : null);
            Aweme aweme = this.LLLF;
            c2344009Gk.LJ((aweme == null || (video = aweme.getVideo()) == null || (fakeLandscapeInfo = video.getFakeLandscapeInfo()) == null) ? null : Integer.valueOf(fakeLandscapeInfo.getFakeLandscapeVideoType()), "fake_landscape_type");
            Aweme aweme2 = this.LLLF;
            c2344009Gk.LJIIIIZZ("aweme_id", aweme2 != null ? aweme2.getAid() : null);
            C20684815ws.LJIILLIIL("exit_tablet_fullscreen", c2344009Gk.LIZ);
        }
        Gp();
        if (this.LLJZIJLIL && C1389340mG4.LIZJ(getContext(), null).LJFF && C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLFF().LLIIZ()) {
            z = true;
        }
        this.LLLFZ = z;
        this.LLLII = z;
    }

    public final void Fp() {
        C786410Ut5.LJLLLLLL(this.LLL ^ true ? 0 : 8, Ep());
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ioj) : null;
            this.LLJLLL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(this.LLL ? 2131849544 : 2131849545);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        RootCellCommonAbility rootCellCommonAbility;
        if (!C299070Bnt.LIZ() || (rootCellCommonAbility = (RootCellCommonAbility) this.LLLIIII.getValue()) == null) {
            return;
        }
        rootCellCommonAbility.ek(this.LLLIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeAbility
    public final void NA1() {
        Gp();
    }

    public final boolean Bp(Aweme aweme) {
        Integer numValueOf;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        String aid = null;
        if (C1389340mG4.LIZJ(getContext(), null).LJFF && C0SXF.LJIJ(aweme) && C735370Ssx.LJJIIJZLJL(aweme)) {
            if (this.LLLI) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (aweme != null && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null) {
                    numValueOf = Integer.valueOf(fakeLandscapeInfo.getFakeLandscapeVideoType());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "fake_landscape_type");
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                c2344009Gk.LJIIIIZZ("aweme_id", aid);
                C20684815ws.LJIILLIIL("tablet_fake_landscape_encourage_fullscreen", c2344009Gk.LIZ);
                this.LLLI = false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = view.findViewById(R.id.ioi);
        this.LLLFF = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View view2 = this.LLLFF;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 43), view2);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Seh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(222), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Sek
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(223), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Sel
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(224), 6);
        Ep().setIconRes(R.raw.icon_full_screen);
        ViewGroup.LayoutParams layoutParams = Ep().getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        View viewFindViewById2 = this.LLJLLL;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.ioj);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJLLL = (TuxTextView) viewFindViewById2;
        }
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        }
        Fp();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
