package com.ss.android.ugc.aweme.autocaption.refactor;

import X.AnonymousClass1602;
import X.AnonymousClass1604;
import X.AnonymousClass1610;
import X.AnonymousClass1612;
import X.AnonymousClass1613;
import X.AnonymousClass1614;
import X.AnonymousClass1615;
import X.AnonymousClass1629;
import X.C01GW;
import X.C09R3;
import X.C0A7T;
import X.C0S4A;
import X.C0S4B;
import X.C0SXF;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C160B;
import X.C160C;
import X.C160D;
import X.C160H;
import X.C160R;
import X.C160V;
import X.C160W;
import X.C161N;
import X.C161T;
import X.C162B;
import X.C1697810uHb;
import X.C1791240wiI;
import X.C19650811uU;
import X.C19670411xe;
import X.C19670511xf;
import X.C20702115zf;
import X.C20703515zt;
import X.C20703915zx;
import X.C207045160d;
import X.C207046160e;
import X.C207048160g;
import X.C207050160i;
import X.C207052160k;
import X.C207053160l;
import X.C207054160m;
import X.C207056160o;
import X.C207060160s;
import X.C207061160t;
import X.C207062160u;
import X.C207067160z;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C2803016r;
import X.C293260BeW;
import X.C295750BiX;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C705590Rm1;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C746760TRa;
import X.EnumC1390800mIQ;
import X.EnumC207058160q;
import X.EnumC715590S5d;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewTreeObserverOnGlobalLayoutListenerC207051160j;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public final class CLACaptionAssemV2 extends BaseCellSlotComponent<CLACaptionAssemV2> implements CLACaptionAbility, ComponentPriorityProtocol, C0S4B, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public String LLLI;
    public C207056160o LLLII;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AnonymousClass1612());
    public final InterfaceC1731706qJ LLJLLL = Ep().LJLJL(this);
    public final C20703915zx LLJZ = new C20703915zx(this);
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new C207062160u(this));
    public final C630740Ooa LLL = C628500Oky.LIZ(new C207061160t(this));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 226));
    public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new AnonymousClass1613());
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new AnonymousClass1614());
    public final C19650811uU LLLFZ = new C19650811uU(LifecycleOwnerKt.getLifecycleScope(this), new C160H(this), new C160D(this), new C207054160m(this));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new C160V(this));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new C207067160z(this));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 225));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new C207060160s(this));
    public final ViewTreeObserverOnGlobalLayoutListenerC207051160j LLLIILIL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.160j
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CLACaptionAssemV2 cLACaptionAssemV2 = this.LL;
            C207056160o c207056160o = cLACaptionAssemV2.LLLII;
            if (c207056160o != null) {
                RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) cLACaptionAssemV2.LLJZIJLIL.getValue();
                Integer numIa = rootCellCommonAbility != null ? rootCellCommonAbility.Ia() : null;
                if (!c207056160o.LJIIIZ || numIa == null || numIa.intValue() <= 0) {
                    return;
                }
                if (c207056160o.LJIILL == null) {
                    Object parent = c207056160o.LIZ.getParent();
                    c207056160o.LJIILL = parent instanceof ViewGroup ? (View) parent : null;
                }
                if (c207056160o.LJIILLIIL != null && Intrinsics.LJFF(c207056160o.LIZ.getParent(), c207056160o.LJIILLIIL)) {
                    View view = c207056160o.LJIILLIIL;
                    Integer numValueOf = view != null ? Integer.valueOf(view.getBottom()) : null;
                    if (numIa.intValue() == c207056160o.LJIJ) {
                        int i = c207056160o.LJIIZILJ;
                        if (numValueOf != null && i == numValueOf.intValue()) {
                            return;
                        }
                    }
                }
                int iIntValue = numIa.intValue();
                if (c207056160o.LIZ.getParent() != null) {
                    if (Intrinsics.LJFF(c207056160o.LIZ.getParent(), c207056160o.LJIILLIIL)) {
                        ViewGroup.LayoutParams layoutParams = c207056160o.LIZ.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                        View view2 = c207056160o.LJIILLIIL;
                        int bottom = view2 != null ? view2.getBottom() : 0;
                        if (layoutParams2 != null && bottom > 0 && layoutParams2.bottomMargin == bottom - iIntValue) {
                            return;
                        }
                    }
                    Object parent2 = c207056160o.LIZ.getParent();
                    while (parent2 != null) {
                        View view3 = (View) parent2;
                        if (view3.getId() == R.id.yeg) {
                            break;
                        } else {
                            parent2 = view3.getParent();
                        }
                    }
                    if (parent2 instanceof RelativeLayout) {
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams3.addRule(14);
                        layoutParams3.addRule(12);
                        ViewGroup viewGroup = (ViewGroup) parent2;
                        layoutParams3.bottomMargin = viewGroup.getBottom() - iIntValue;
                        C1473800oSI.LIZ(c207056160o.LIZ);
                        viewGroup.addView(c207056160o.LIZ, layoutParams3);
                        c207056160o.LJIILLIIL = (View) parent2;
                        c207056160o.LJIIZILJ = viewGroup.getBottom();
                        c207056160o.LJIJ = iIntValue;
                    }
                }
            }
        }
    };
    public final C01GW LLLIL = C452501pT.LIZIZ(new C160W(this));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new C20702115zf(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CLACaptionAssemV2.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CLACaptionAssemV2.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/autocaption/refactor/CLACaptionViewModelV2;", 0);
        c09r3.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_cla_caption";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ad7;
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1841867199) {
            return null;
        }
        return this;
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

    public final CLACaptionViewModelV2 Bp() {
        return (CLACaptionViewModelV2) this.LLJZ.getValue(this, LLLILZJ[1]);
    }

    public final C161N Ep() {
        return (C161N) this.LLJLLIL.getValue();
    }

    public final VideoViewModel Fp() {
        return (VideoViewModel) this.LLLFF.getValue();
    }

    @Override // X.C0S4B
    public final C705590Rm1 j8() {
        C207056160o c207056160o = this.LLLII;
        String str = c207056160o != null && c207056160o.LJ() ? "INVALID_HIDE" : "VALID_HIDE";
        Pair[] pairArr = new Pair[4];
        CLACaptionViewModelV2 cLACaptionViewModelV2Bp = Bp();
        cLACaptionViewModelV2Bp.getClass();
        String strLIZ = AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp);
        if (strLIZ == null) {
            strLIZ = "";
        }
        pairArr[0] = new Pair("aid", strLIZ);
        C207056160o c207056160o2 = this.LLLII;
        pairArr[1] = new Pair("captionRealDisplayState", String.valueOf(c207056160o2 != null ? c207056160o2.LIZIZ() : null));
        CLACaptionViewModelV2 cLACaptionViewModelV2Bp2 = Bp();
        cLACaptionViewModelV2Bp2.getClass();
        pairArr[2] = new Pair("isCLAFeatureEnabled", String.valueOf(AnonymousClass1604.LIZIZ(cLACaptionViewModelV2Bp2)));
        C20703515zt c20703515zt = C20703515zt.LIZ;
        VideoItemParams item = Bp().getItem();
        Aweme aweme = item != null ? item.getAweme() : null;
        c20703515zt.getClass();
        pairArr[3] = new Pair("isCaptionUserSettingOn", String.valueOf(C20703515zt.LJIL(aweme)));
        return new C705590Rm1(str, C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final Rect tZ1() {
        View viewFindViewById;
        View viewFindViewById2;
        C207056160o c207056160o = this.LLLII;
        if ((c207056160o instanceof C207056160o) && c207056160o != null && c207056160o.LJ() && (viewFindViewById = getContentView().findViewById(R.id.dc8)) != null && viewFindViewById.getVisibility() == 0 && (viewFindViewById2 = viewFindViewById.findViewById(R.id.ddb)) != null && viewFindViewById2.getVisibility() == 0) {
            Rect rect = new Rect();
            if (viewFindViewById2.getGlobalVisibleRect(rect)) {
                return rect;
            }
        }
        return null;
    }

    @Override // X.C0S4B
    public final C0S4A x1() {
        C207056160o c207056160o = this.LLLII;
        return (c207056160o == null || !c207056160o.LJ()) ? C0S4A.VALID : C0S4A.INVALID;
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void zy2() {
        C207056160o c207056160o = this.LLLII;
        if (c207056160o != null) {
            CLACaptionViewModelV2 cLACaptionViewModelV2Bp = Bp();
            cLACaptionViewModelV2Bp.getClass();
            c207056160o.LJFF(AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp), C160B.HIDDEN, "", false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbility;
        if (!C2803016r.LIZ() || (interactBizTopAreaAttachAbility = (InteractBizTopAreaAttachAbility) this.LLL.getValue()) == null) {
            return;
        }
        interactBizTopAreaAttachAbility.XT(this.LLLIILIL);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.C0S4B
    public final View U7() {
        return getContentView().findViewById(R.id.ddj);
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void Wf2() {
        Bp().wQ2().LLILLL.LLILZ = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        if (C0A7T.LIZ()) {
            AnonymousClass1602 anonymousClass1602 = Bp().wQ2().LLILLL;
            anonymousClass1602.getClass();
            if (C746760TRa.LIZ().LJFF()) {
                return;
            }
            anonymousClass1602.LIZ(false);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ((InterfaceC665370Q7z) this.LLLIIIIL.getValue(), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLLIL.getValue()));
        C1554610qYd.LIZJ((InterfaceC665370Q7z) this.LLLIIIIL.getValue(), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLLILZ.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final C160B vf() {
        return Bp().wQ2().LLILLJJLI.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final boolean w1() {
        return Bp().w1();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final boolean Cu2(String str) {
        CLACaptionViewModelV2 cLACaptionViewModelV2Bp = Bp();
        cLACaptionViewModelV2Bp.getClass();
        if (Intrinsics.LJFF(AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp), str) && ((C160C) Bp().getState()).LLILLJJLI.LIZ) {
            return true;
        }
        return false;
    }

    public final void Gp(Aweme aweme) {
        if (C162B.LIZIZ.Vg(aweme)) {
            return;
        }
        if (Ep().LLFFF(aweme, false) && C161T.LIZ().LJII(aweme)) {
            C161N c161n = C161N.LIZIZ;
            String strLLIIZ = c161n.LLIIZ();
            if (!c161n.LLIIIL(aweme, strLLIIZ)) {
                return;
            }
            Bp().wQ2().LIZIZ(AnonymousClass1629.LAND_ON_ITEM, !c161n.LJIIJ(aweme, strLLIIZ), false);
            return;
        }
        Bp().wQ2().LIZIZ(AnonymousClass1629.LAND_ON_ITEM, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip(X.C710840RuU r18) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2.Ip(X.0RuU):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C19650811uU c19650811uU = this.LLLFZ;
        c19650811uU.LIZLLL.add(Integer.valueOf(i));
        c19650811uU.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C19650811uU c19650811uU = this.LLLFZ;
        c19650811uU.LIZLLL.remove(Integer.valueOf(i));
        c19650811uU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void UB0(boolean z) {
        Object obj;
        TranslationAbility translationAbility;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        C20703515zt.LIZ.getClass();
        if (C20703515zt.LJIL(aweme) == z) {
            return;
        }
        if (C20703515zt.LJJIII(aweme)) {
            C746760TRa.LIZ().LJIIJ(z);
        } else {
            C746760TRa.LIZ().LJJJI(z);
        }
        if (C746760TRa.LIZ().LJLILLLLZI() && (translationAbility = (TranslationAbility) this.LLLF.getValue()) != null) {
            translationAbility.Ol(EnumC715590S5d.TOGGLE_CAPTION);
        }
        if (z) {
            jS0(AnonymousClass1629.TOGGLE_ENABLE, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAutoGeneratedCaptionToggleEvent(C160R c160r) {
        Aweme aweme;
        if (C293260BeW.LIZ()) {
            String str = c160r.LIZ;
            CLACaptionViewModelV2 cLACaptionViewModelV2Bp = Bp();
            cLACaptionViewModelV2Bp.getClass();
            if (Intrinsics.LJFF(str, AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp))) {
                CLACaptionViewModelV2 cLACaptionViewModelV2Bp2 = Bp();
                cLACaptionViewModelV2Bp2.getClass();
                if (AnonymousClass1604.LIZIZ(cLACaptionViewModelV2Bp2)) {
                    VideoItemParams videoItemParams = Bp().getVideoItemParams();
                    if (videoItemParams != null) {
                        aweme = videoItemParams.getAweme();
                    } else {
                        aweme = null;
                    }
                    C20703515zt c20703515zt = C20703515zt.LIZ;
                    if (aweme != null && !C746760TRa.LIZ().LJJIL(aweme.getAid()) && C20703515zt.LJJII(aweme)) {
                        EnumC1390800mIQ enumC1390800mIQ = c160r.LIZIZ;
                        if (C746760TRa.LIZ() != null) {
                            if (enumC1390800mIQ == EnumC1390800mIQ.SHARE_PANEL) {
                                C1389890mGx c1389890mGx = new C1389890mGx(getContentView());
                                c1389890mGx.LJIIIZ(2131834709);
                                c1389890mGx.LJIIJJI();
                            } else {
                                C1389890mGx c1389890mGx2 = new C1389890mGx(getContentView());
                                c1389890mGx2.LJIIIZ(2131834707);
                                c1389890mGx2.LJIIJJI();
                            }
                        }
                        jS0(AnonymousClass1629.TOGGLE_ENABLE, false);
                    }
                }
            }
            if (C0A7T.LIZ()) {
                Bp().wQ2().LLILLL.LIZ(false);
            }
            Ip(((C160C) Bp().getState()).LL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        EnumC207058160q enumC207058160q;
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.160T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C160C) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C207053160l(), 4);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.160b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C160C) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AnonymousClass1610(), 4);
        FrameLayout frameLayout = (FrameLayout) getContentView().findViewById(R.id.dc8);
        AnonymousClass1615 anonymousClass1615 = (AnonymousClass1615) this.LLLIIII.getValue();
        Context context = getContext();
        if (context != null && C0SXF.LJIL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            enumC207058160q = EnumC207058160q.LANDSCAPE;
        } else {
            C01GW c01gw = C2803016r.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 3 && ((Number) c01gw.getValue()).intValue() != 4) {
                if (C2803016r.LIZ()) {
                    enumC207058160q = EnumC207058160q.PORTRAIT_CENTER_ALIGN;
                } else if (C293260BeW.LIZ()) {
                    enumC207058160q = EnumC207058160q.PORTRAIT_FC2;
                } else {
                    enumC207058160q = EnumC207058160q.PORTRAIT_NON_FC2;
                }
            } else {
                enumC207058160q = EnumC207058160q.PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT;
            }
        }
        CLACaptionViewModelV2 cLACaptionViewModelV2Bp = Bp();
        cLACaptionViewModelV2Bp.getClass();
        this.LLLII = new C207056160o(frameLayout, anonymousClass1615, enumC207058160q, AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp));
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Rsq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJILJILJ;
            }
        }, null, new C207048160g(), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Rsr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJILLL;
            }
        }, null, new C207045160d(), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Nyv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C19670411xe(), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Nkn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C19670511xf(), 6);
        if (C295750BiX.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1791240wiI(this, null), 3);
        }
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Nyu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C207052160k(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0R7q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJ;
            }
        }, null, new C207050160i(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0S99
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJL;
            }
        }, null, AFwS294S0000000_11.get$arr$(8), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(this, LLLILZJ[0]), new C2217381BqS() { // from class: X.0S5H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S5G) obj).LLILLL;
            }
        }, null, new C207046160e(), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void jS0(AnonymousClass1629 anonymousClass1629, boolean z) {
        Bp().wQ2().LIZ(anonymousClass1629, z);
    }
}
