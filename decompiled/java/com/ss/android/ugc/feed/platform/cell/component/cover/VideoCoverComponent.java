package com.ss.android.ugc.feed.platform.cell.component.cover;

import X.AbstractC1604130rqV;
import X.AbstractC581530MrP;
import X.C01GW;
import X.C0BMF;
import X.C0C64;
import X.C0N0Y;
import X.C0N6Z;
import X.C0R5B;
import X.C0RRP;
import X.C0SFC;
import X.C0SUC;
import X.C1299020juO;
import X.C13LE;
import X.C1473160oRG;
import X.C1558520qew;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2245741Cv6;
import X.C291001Au;
import X.C452501pT;
import X.C582130MsN;
import X.C583420MuS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C708750Rr7;
import X.C724270Sb3;
import X.C729980SkG;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC689860R4e;
import X.InterfaceC691060R8u;
import X.InterfaceC739770T0d;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.TouchEventInterceptAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class VideoCoverComponent extends BaseCellContentComponent<VideoCoverComponent> implements VideoCoverAbility, InterfaceC1554640qYg {
    public static String LLLIIIL = "";
    public SmartImageView LLJZIJLIL;
    public FrameLayout LLL;
    public FrameLayout LLLF;
    public ViewStub LLLFF;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public C0R5B LLLIIIIL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(552));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1171));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1175));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1170));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1177));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(253));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1176));
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1174));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1172));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1173));
    public boolean LLLFFI = true;
    public int LLLIIII = -1;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void LJL() {
        lD2(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void ip() {
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1472213694) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC739770T0d interfaceC739770T0dP2;
        C0N0Y playerManager;
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        SimVideoUrlModel simVideoUrlModelLJJIII;
        String sourceId;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJLLL.getValue();
        String str = null;
        if (iFeedPanelPlatformAbility != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbility.P2()) != null && (playerManager = interfaceC739770T0dP2.getPlayerManager()) != null && (interfaceC1483670oiDLJIILL = playerManager.LJIILL()) != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJIILL.LJIIIZ()) != null && (simVideoUrlModelLJJIII = interfaceC1481730of5LJIIIZ.LJJIII()) != null && (sourceId = simVideoUrlModelLJJIII.getSourceId()) != null) {
            str = sourceId;
        }
        LLLIIIL = str;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        LLLIIIL = "";
    }

    public final C708750Rr7 ep() {
        InterfaceC691060R8u interfaceC691060R8u = new InterfaceC691060R8u() { // from class: X.0R7Y
            @Override // X.InterfaceC691060R8u
            public final void LIZ() {
                this.LIZ.ip();
            }
        };
        C724270Sb3 c724270Sb3 = this.LLJI;
        return new C708750Rr7(interfaceC691060R8u, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), this.LLLIIIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final SmartImageView getVideoCover() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void Er1(String str) {
        Object obj;
        boolean z;
        Object obj2;
        C2189821An6 c2189821An6;
        IVideoCellAbility iVideoCellAbility;
        InterfaceC689860R4e interfaceC689860R4eK9;
        AbstractC581530MrP abstractC581530MrPLJJJLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null && aweme.getAwemeType() == 77) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_0, null);
            int i = C2187451AjH.LIZ;
            return;
        }
        if (C0SUC.LIZ(getContext()).getVideoCurrentPosition() > 0) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_1, null);
            return;
        }
        SmartImageView smartImageView = this.LLJZIJLIL;
        C1299020juO.LIZLLL(C729980SkG.LIZJ(aweme), str);
        if (((this.LLLFFI && ((iVideoCellAbility = (IVideoCellAbility) this.LLJJL.getValue()) == null || (interfaceC689860R4eK9 = iVideoCellAbility.K9()) == null || (abstractC581530MrPLJJJLL = interfaceC689860R4eK9.LJJJLL()) == null || !abstractC581530MrPLJJJLL.LIZIZ(aweme))) || smartImageView == null) && ((!C2245741Cv6.LIZIZ(aweme) || !C0N6Z.LJIIIZ) && !C0SFC.LIZIZ.LJIL(aweme))) {
            z = false;
        } else {
            z = true;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str2 = ((VideoItemParams) obj2).mEventType;
        String desc = aweme.getDesc();
        if (desc == null) {
            desc = "";
        }
        if (z) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_2, null);
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJLILLLLZIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[showCover],");
            sbLIZ.append(str2);
            abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
            return;
        }
        if (this.LLLFZ && (Intrinsics.LJFF(str2, "playlist") || Intrinsics.LJFF(str2, "chat"))) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_3, null);
            return;
        }
        CellSurveyComponentAbility cellSurveyComponentAbility = (CellSurveyComponentAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (cellSurveyComponentAbility != null && cellSurveyComponentAbility.Gg1()) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_4, null);
            return;
        }
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null && c2189821An6.getStoryToPostNeedHideCover()) {
            return;
        }
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            C583420MuS.LIZJ(C729980SkG.LIZJ(aweme), C0RRP.S_COVER);
        }
        TouchEventInterceptAbility touchEventInterceptAbility = (TouchEventInterceptAbility) this.LLJLIL.getValue();
        if (touchEventInterceptAbility != null) {
            touchEventInterceptAbility.t31(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void hp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r23) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent.hp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public void kp(C291001Au<String> c291001Au) {
        if (c291001Au == null) {
            return;
        }
        if (!C0BMF.LIZ(this.LLLII)) {
            Er1("onPreparePlay");
        }
        this.LLLFZ = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void lD2(boolean z) {
        IVideoCellAbility iVideoCellAbility;
        SmartImageView smartImageView;
        Object obj;
        if (z || (iVideoCellAbility = (IVideoCellAbility) this.LLJJL.getValue()) == null || !iVideoCellAbility.Mg() || (smartImageView = this.LLJZIJLIL) == null || this.LLLI || C0C64.LJIILLIIL().LJIJ(31744, 0, "player_setting_show_cover_for_surface_view", true) != 1) {
            return;
        }
        C786410Ut5.LLFF(0, smartImageView);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        String desc = aweme.getDesc();
        if (desc == null) {
            desc = "";
        }
        C582130MsN.LIZ().LJ().getClass();
        C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
    }

    public void lp(C291001Au<String> c291001Au) {
        if (c291001Au == null) {
            return;
        }
        this.LLLFZ = true;
        this.LLLI = true;
        qa1("onRenderFirstFrame");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJZIJLIL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLL = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLLF = (FrameLayout) view.findViewById(R.id.kvf);
        this.LLLFF = (ViewStub) view.findViewById(R.id.x0c);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0R7l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(198), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0R7o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(199), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0R7m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJLIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(200), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0R7n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJIIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(201), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0R7p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(197), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void qa1(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        String strLIZJ = C729980SkG.LIZJ(aweme);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideCover ");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(", source ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        SmartImageView smartImageView = this.LLJZIJLIL;
        if (smartImageView != null) {
            String desc = aweme.getDesc();
            if (desc == null) {
                desc = "";
            }
            C786410Ut5.LLFF(8, smartImageView);
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJLILLLLZIIL.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(str);
            sbLIZ2.append("], ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            sbLIZ2.append(((VideoItemParams) obj2).mEventType);
            abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), aweme);
            C583420MuS.LIZJ(C729980SkG.LIZJ(aweme), C0RRP.H_COVER);
        }
        TouchEventInterceptAbility touchEventInterceptAbility = (TouchEventInterceptAbility) this.LLJLIL.getValue();
        if (touchEventInterceptAbility != null) {
            touchEventInterceptAbility.t31(true);
        }
    }

    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        boolean zLJI = MethodIDManager.LJI(71858);
        hp((VideoItemParams) obj);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        if (this.LLLIIII != i) {
            this.LLLIIII = i;
            this.LLLII = true;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLLIL.getValue();
        if ((iViewPagerComponentAbility != null && iViewPagerComponentAbility.Mo1(i)) || C0BMF.LIZ(this.LLLII)) {
            return;
        }
        Er1("onViewHolderSelected");
    }
}
