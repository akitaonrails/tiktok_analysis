package com.ss.android.ugc.aweme.feed.landscape;

import X.AbstractC1255880imo;
import X.C00AW;
import X.C01GW;
import X.C0N0Y;
import X.C0RJN;
import X.C0SHX;
import X.C0SXF;
import X.C1012040cRW;
import X.C1345905On;
import X.C1383760m74;
import X.C1389300mG0;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1591860rWi;
import X.C1600700rky;
import X.C1603960rqE;
import X.C1620050sGB;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19EG;
import X.C1A5L;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2530809vu;
import X.C2531909w5;
import X.C2552709zR;
import X.C288410BSd;
import X.C418440Gaw;
import X.C452501pT;
import X.C520680KbS;
import X.C666390QBx;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C713290RyR;
import X.C718190SFd;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C726200SeA;
import X.C726440SeY;
import X.C726680Sew;
import X.C726690Sex;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC726190Se9;
import X.EnumC726810Sf9;
import X.InterfaceC1603360rpG;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC726170Se7;
import X.InterfaceC783040Une;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAutoRotationGuideAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeEntranceAssem extends BaseCellSlotComponent<LandscapeEntranceAssem> implements InterfaceC726170Se7, ComponentPriorityProtocol {
    public static boolean LLLIIII;
    public TuxIconView LLJLLIL;
    public TuxTextView LLJLLL;
    public boolean LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public C1620050sGB LLLI;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 377));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 376));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 378));
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(175));
    public final C726440SeY LLLII = new InterfaceC783040Une() { // from class: X.0SeY
        @Override // X.InterfaceC783040Une
        public final boolean LJJLIIIJL() {
            return false;
        }

        @Override // X.InterfaceC783040Une
        public final AbstractC726480Sec LJJLIIIJLJLI(int i, int i2) {
            return null;
        }

        @Override // X.InterfaceC783040Une
        public final String LJJLIIIJJI() {
            return ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).mEventType;
        }

        @Override // X.InterfaceC783040Une
        public final Aweme LJJLIIIJJIZ() {
            return ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme();
        }

        @Override // X.InterfaceC783040Une
        public final AbstractC726480Sec LJJLIIIJLLLLLLLZ(int i, int i2, int i3) {
            boolean z;
            C1620050sGB c1620050sGB;
            C1620050sGB c1620050sGB2;
            LandscapeAutoRotationGuideAbility landscapeAutoRotationGuideAbility = (LandscapeAutoRotationGuideAbility) this.LIZ.LLJZIJLIL.getValue();
            if (landscapeAutoRotationGuideAbility != null) {
                landscapeAutoRotationGuideAbility.pu();
            }
            LandscapeEntranceAssem landscapeEntranceAssem = this.LIZ;
            C1620050sGB c1620050sGB3 = landscapeEntranceAssem.LLLI;
            if (c1620050sGB3 != null && !c1620050sGB3.LJFF() && (c1620050sGB = landscapeEntranceAssem.LLLI) != null && !c1620050sGB.LIZIZ() && (c1620050sGB2 = landscapeEntranceAssem.LLLI) != null && !c1620050sGB2.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new C726470Seb(((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).mEventType, "pop_up");
            }
            C1620050sGB c1620050sGB4 = this.LIZ.LLLI;
            if (c1620050sGB4 != null && !c1620050sGB4.LJ()) {
                C1620050sGB c1620050sGB5 = this.LIZ.LLLI;
                if (c1620050sGB5 != null && !c1620050sGB5.LJI()) {
                    this.LIZ.Fp(i, i2, i3, "rotate_screen");
                    return new C726460Sea(((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).mEventType);
                }
                return new C726470Seb(((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).mEventType, "pop_up");
            }
            return new C726470Seb(((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).mEventType, "pop_up");
        }
    };

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "top_bottom_container_landscape_entrance";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbk;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC726170Se7
    public final void rl() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // X.InterfaceC726170Se7
    public final boolean xd() {
        return true;
    }

    public final TuxIconView Ep() {
        View viewLIZ = this.LLJLLIL;
        if (viewLIZ == null) {
            View viewLJJIJL = LJJIJL();
            viewLIZ = viewLJJIJL != null ? C520680KbS.LIZ(R.id.ioh, viewLJJIJL) : null;
            this.LLJLLIL = (TuxIconView) viewLIZ;
        }
        return (TuxIconView) viewLIZ;
    }

    public final void Gp() {
        if (!C2552709zR.LIZ) {
            if (C713290RyR.LIZ) {
                LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZIZ(this.LLLII);
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                this.LLLI = c19egLIZ != null ? C0SHX.LIZ(c19egLIZ, null) : null;
                return;
            }
            return;
        }
        if (C713290RyR.LIZ) {
            if (!LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJ()) {
                LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJFF(this.LLLII);
                return;
            }
            LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZIZ(this.LLLII);
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            this.LLLI = c19egLIZ2 != null ? C0SHX.LIZ(c19egLIZ2, null) : null;
        }
    }

    public final boolean Bp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (C1389300mG0.LJFF(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null)) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (C718190SFd.LIZLLL(aweme, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType)) {
                return false;
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        return C0SXF.LJJ(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.InterfaceC726170Se7
    public final boolean M9() {
        return Bp();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // X.InterfaceC726170Se7
    public final C00AW getPriority() {
        return C00AW.FULLSCREEN;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        if (LJJIJL().getVisibility() == 0) {
            C726680Sew.LIZ();
        }
        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJFF(this.LLLII);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Fragment fragmentLJI;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IRootAbility iRootAbility;
        Fragment fragmentLJI2;
        Object obj;
        Object obj2;
        if (this.LLLFF && LJJIJL().getVisibility() == 0 && (fragmentLJI = C724240Sb0.LJI(this)) != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentLJI)) != null && (iRootAbility = (IRootAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IRootAbility.class, null)) != null && iRootAbility.getUserVisibleHint() && (fragmentLJI2 = C724240Sb0.LJI(this)) != null && fragmentLJI2.isResumed()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            C726680Sew.LIZIZ(aweme, ((VideoItemParams) obj2).mEventType, 0, null, 24);
            Gp();
        }
    }

    @Override // X.InterfaceC726170Se7
    public final void f6(EnumC726190Se9 enumC726190Se9) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        int i = C726200SeA.LIZ[enumC726190Se9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    View view = this.LLLFFI;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    View view2 = this.LLLFZ;
                    if (view2 != null) {
                        C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view2);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                View view3 = this.LLLFFI;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
                View view4 = this.LLLFZ;
                if (view4 != null) {
                    C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view4);
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        if (enumC726190Se9 != EnumC726190Se9.HIDE && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZ.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LLLFFI = C520680KbS.LIZ(R.id.ioj, view);
        View viewLIZ = C520680KbS.LIZ(R.id.ioi, view);
        this.LLLFZ = viewLIZ;
        C2271391DvN.LIZ(viewLIZ, (C1A5L) C2271381DvM.LJIIIZ.getValue());
        View view2 = this.LLLFZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 14), view2);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0SeZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJJIL;
            }
        }, null, new AwS625S0100000_11(view, 30), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Rzi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(77), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Rzj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(78), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0SEf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(79), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Rzh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(76), 6);
        if (C2530809vu.LIZ) {
            Ep().setIconRes(R.raw.icon_color_full_screen);
            ViewGroup.LayoutParams layoutParams = Ep().getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            View viewLIZ2 = this.LLJLLL;
            if (viewLIZ2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewLIZ2 = C520680KbS.LIZ(R.id.ioj, viewLJJIJL);
                } else {
                    viewLIZ2 = null;
                }
                this.LLJLLL = (TuxTextView) viewLIZ2;
            }
            ViewGroup.LayoutParams layoutParams2 = viewLIZ2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                return;
            }
            return;
        }
        TuxIconView tuxIconViewEp = Ep();
        if (tuxIconViewEp != null) {
            tuxIconViewEp.setIconRes(R.raw.icon_full_screen);
            tuxIconViewEp.setTintColorRes(R.attr.ef);
        }
        ViewGroup.LayoutParams layoutParams3 = Ep().getLayoutParams();
        layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        View viewLIZ3 = this.LLJLLL;
        if (viewLIZ3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewLIZ3 = C520680KbS.LIZ(R.id.ioj, viewLJJIJL2);
            } else {
                viewLIZ3 = null;
            }
            this.LLJLLL = (TuxTextView) viewLIZ3;
        }
        ViewGroup.LayoutParams layoutParams4 = viewLIZ3.getLayoutParams();
        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.nU(this);
        }
    }

    public final void Fp(int i, int i2, int i3, String str) {
        Object obj;
        Aweme aweme;
        Object viewModel;
        AbstractC1255880imo abstractC1255880imo;
        List<Aweme> arrayList;
        boolean z;
        int brandSafetyType;
        String groupId;
        Object obj2;
        Object obj3;
        String secUid;
        String uid;
        Boolean boolValueOf;
        Object obj4;
        String str2;
        String str3;
        String str4;
        String noticeIdForComment;
        String str5;
        C0RJN c0rjnLIZIZ;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        C0RJN c0rjnLIZIZ2;
        C2189821An6 c2189821An62;
        HashMap<String, String> inboxLogExtra;
        C0RJN c0rjnLIZIZ3;
        C2189821An6 c2189821An63;
        Intent intent;
        C0RJN c0rjnLIZIZ4;
        C2189821An6 c2189821An64;
        C0RJN c0rjnLIZIZ5;
        C2189821An6 c2189821An65;
        Aweme aweme2;
        AwemeRawAd awemeRawAd;
        AwemeCommerceStruct commerceVideoAuthInfo;
        C0N0Y c0n0y;
        DetailPageComponent detailPageComponentDn1;
        InterfaceC1603360rpG interfaceC1603360rpG;
        IVideoCellAbility iVideoCellAbility;
        InterfaceC583650Mup interfaceC583650MupX3;
        Lifecycle lifecycle;
        Object obj5;
        String noticeTemplateIdForComment = null;
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility2 == null || (aweme = iVideoCellAbility2.im()) == null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            aweme = ((VideoItemParams) obj).getAweme();
        }
        String aid = aweme.getAid();
        if (aid != null) {
            C726690Sex c726690Sex = C726690Sex.LIZIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj5 = c724270Sb32.LL;
            } else {
                obj5 = null;
            }
            c726690Sex.LJIIIZ(((VideoItemParams) obj5).mEventType, str, aid, null);
        }
        TranslationAbility translationAbility = (TranslationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TranslationAbility.class, null);
        if (translationAbility != null) {
            translationAbility.eo2();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (lifecycle = c19egLIZ.getLifecycle()) != null) {
            C1383760m74.LIZIZ.LJIJJLI(lifecycle, EnumC726810Sf9.LANDSCAPE);
        }
        if (C288410BSd.LIZ && (iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null)) != null && (interfaceC583650MupX3 = iVideoCellAbility.x3()) != null) {
            interfaceC583650MupX3.C80();
        }
        boolean booleanExtra = false;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(aweme);
        C1345905On.LIZ = 0L;
        ArrayList arrayList2 = (ArrayList) C1345905On.LIZIZ;
        arrayList2.clear();
        arrayList2.addAll(listLJIILJJIL);
        IDetailPageAbility iDetailPageAbilityLIZ = C1600700rky.LIZ(C724240Sb0.LJI(this));
        if (iDetailPageAbilityLIZ != null && (detailPageComponentDn1 = iDetailPageAbilityLIZ.Dn1()) != null && (interfaceC1603360rpG = detailPageComponentDn1.LLLFZ) != null) {
            viewModel = interfaceC1603360rpG.getViewModel();
        } else {
            viewModel = null;
        }
        if (viewModel instanceof AbstractC1255880imo) {
            abstractC1255880imo = (AbstractC1255880imo) viewModel;
        } else {
            abstractC1255880imo = null;
        }
        C1603960rqE.LIZ = abstractC1255880imo;
        C666390QBx.LIZ = aweme;
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (c0n0y = FeedSharePlayerViewModel.Companion.getViewModel(c19egLIZ2).player) != null) {
            C1012040cRW.LIZIZ().LIZ = c0n0y;
        }
        IVideoCellAbility iVideoCellAbility3 = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility3 == null || (arrayList = iVideoCellAbility3.VA1()) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<Aweme> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String groupId2 = it2.next().getGroupId();
            if (groupId2 != null) {
                arrayList3.add(groupId2);
            }
        }
        int iIndexOf = arrayList.indexOf(aweme) + 1;
        Aweme aweme3 = (Aweme) C13LP.LJJJLZIJ(iIndexOf, arrayList);
        if (aweme3 != null && (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isContextualAd()) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme4 = (Aweme) C13LP.LJJJLZIJ(iIndexOf, arrayList);
        if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null) {
            brandSafetyType = awemeRawAd.getBrandSafetyType();
        } else {
            brandSafetyType = 0;
        }
        String str6 = "";
        if (brandSafetyType != 2 || (aweme2 = (Aweme) C13LP.LJJJLZIJ(iIndexOf, arrayList)) == null || (groupId = aweme2.getGroupId()) == null) {
            groupId = "";
        }
        Context context = getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("//aweme/landscape");
        if (i == 8) {
            str6 = "270";
        }
        sbLIZ.append(str6);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("enter_method", str);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj2 = c724270Sb33.LL;
        } else {
            obj2 = null;
        }
        smartRouteBuildRoute.withParam("event_type", ((VideoItemParams) obj2).mEventType);
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj3 = c724270Sb34.LL;
        } else {
            obj3 = null;
        }
        smartRouteBuildRoute.withParam("page_type", ((VideoItemParams) obj3).mPageType);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (c0rjnLIZIZ5 = C1578630rBN.LIZIZ(fragmentLJI)) != null && (c2189821An65 = c0rjnLIZIZ5.LIZJ) != null) {
            secUid = c2189821An65.getSecUid();
        } else {
            secUid = null;
        }
        smartRouteBuildRoute.withParam("sec_userid", secUid);
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (c0rjnLIZIZ4 = C1578630rBN.LIZIZ(fragmentLJI2)) != null && (c2189821An64 = c0rjnLIZIZ4.LIZJ) != null) {
            uid = c2189821An64.getUid();
        } else {
            uid = null;
        }
        smartRouteBuildRoute.withParam("userid", uid);
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CLACaptionAbility.class, null);
        if (cLACaptionAbility != null) {
            boolValueOf = Boolean.valueOf(cLACaptionAbility.w1());
        } else {
            boolValueOf = null;
        }
        smartRouteBuildRoute.withParam("is_original_caption", boolValueOf);
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null && (intent = c19egLIZ3.getIntent()) != null) {
            booleanExtra = intent.getBooleanExtra("block_screen_recording", false);
        }
        smartRouteBuildRoute.withParam("block_screen_recording", booleanExtra);
        smartRouteBuildRoute.withParam("list_item", arrayList3.toString());
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj4 = c724270Sb35.LL;
        } else {
            obj4 = null;
        }
        smartRouteBuildRoute.withParam("from_post_list", ((VideoItemParams) obj4).isFromPostList);
        smartRouteBuildRoute.withParam("orientation", i);
        smartRouteBuildRoute.withParam("is_contextual_ad", z);
        smartRouteBuildRoute.withParam("xy_orientation", i2);
        smartRouteBuildRoute.withParam("z_orientation", i3);
        smartRouteBuildRoute.withParam("landscape_enter_method", str);
        if (LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZJ()) {
            str2 = "user_setting";
        } else {
            str2 = "default";
        }
        smartRouteBuildRoute.withParam("set_method", str2);
        String str7 = "on";
        if (C2531909w5.LIZIZ) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        smartRouteBuildRoute.withParam("default_app_rotate_status", str3);
        if (LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJII()) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        smartRouteBuildRoute.withParam("phone_rotate_status", str4);
        if (!LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL()) {
            str7 = "off";
        }
        smartRouteBuildRoute.withParam("app_rotate_status", str7);
        smartRouteBuildRoute.withParam("brand_safety_type", brandSafetyType);
        smartRouteBuildRoute.withParam("brand_safety_id", groupId);
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null && (c0rjnLIZIZ3 = C1578630rBN.LIZIZ(fragmentLJI3)) != null && (c2189821An63 = c0rjnLIZIZ3.LIZJ) != null) {
            noticeIdForComment = c2189821An63.getNoticeIdForComment();
        } else {
            noticeIdForComment = null;
        }
        smartRouteBuildRoute.withParam("notice_id_for_comment", noticeIdForComment);
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        if (fragmentLJI4 != null && (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI4)) != null && (c2189821An62 = c0rjnLIZIZ2.LIZJ) != null && (inboxLogExtra = c2189821An62.getInboxLogExtra()) != null) {
            str5 = inboxLogExtra.get("account_type");
        } else {
            str5 = null;
        }
        smartRouteBuildRoute.withParam("notice_type_for_comment", str5);
        Fragment fragmentLJI5 = C724240Sb0.LJI(this);
        if (fragmentLJI5 != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI5)) != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            noticeTemplateIdForComment = navArgModel.getNoticeTemplateIdForComment();
        }
        smartRouteBuildRoute.withParam("notice_template_id_for_comment", noticeTemplateIdForComment);
        smartRouteBuildRoute.open();
        LLLIIII = true;
    }
}
