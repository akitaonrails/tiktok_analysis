package com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C09A1;
import X.C0CNO;
import X.C0DMM;
import X.C0PEM;
import X.C0S4U;
import X.C108000b0;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770320wAY;
import X.C1770360wAc;
import X.C1770370wAd;
import X.C1770380wAe;
import X.C1776090wJr;
import X.C1776160wJy;
import X.C189200o6;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C2296908zH;
import X.C23118094a;
import X.C23119094b;
import X.C446900Hfk;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C708910RrN;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736490Sul;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.EnumC1770140wAG;
import X.EnumC1770450wAl;
import X.InterfaceC1055110dYz;
import X.InterfaceC1583770rJf;
import X.InterfaceC1731706qJ;
import X.InterfaceC1770300wAW;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS312S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchNoCartFeedVideoGuideAssem extends BaseCellSlotComponent<EcSearchNoCartFeedVideoGuideAssem> implements ComponentPriorityProtocol, InterfaceC497601wk, InterfaceC1770300wAW {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public static final Set<Integer> LLLLIL;
    public C708910RrN LLJLLIL;
    public ConstraintLayout LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public ConstraintLayout LLLF;
    public FrameLayout LLLFF;
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS268S0000000_26.get$arr$(285));
    public final C01GW LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS268S0000000_26.get$arr$(286));
    public final C01GW LLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoFavoriteVM.class), AFwS268S0000000_26.get$arr$(287));
    public final C01GW LLLII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoDiggVM.class), AFwS268S0000000_26.get$arr$(288));
    public final C01GW LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS268S0000000_26.get$arr$(289));
    public final InterfaceC1731706qJ LLLIIIIL;
    public CoroutineContext LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public C2252611DEt LLLIILIL;
    public AnonymousClass0956 LLLIL;
    public C2252611DEt LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public boolean LLLJIL;
    public final C1770370wAd LLLJL;
    public final C1776090wJr LLLL;
    public final C1776090wJr LLLLII;
    public final C1770360wAc LLLLIIIILLL;
    public final Map<String, Object> LLLLIIL;
    public boolean LLLLIILL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchNoCartFeedVideoGuideAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/videoguide/vm/EcSearchNoCartFeedVideoGuideVM;", 0);
        C13LE.LIZ.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLIL = new LinkedHashSet();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0wAd] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0wAc] */
    public EcSearchNoCartFeedVideoGuideAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchNoCartFeedVideoGuideVM.class);
        this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 650), null, AFwS268S0000000_26.get$arr$(284));
        this.LLLJL = new InterfaceC1583770rJf() { // from class: X.0wAd
            @Override // X.InterfaceC1583770rJf
            public final void A4(String str, String str2) {
                EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = this.LL;
                if (ecSearchNoCartFeedVideoGuideAssem.LLLILZLLLI) {
                    ecSearchNoCartFeedVideoGuideAssem.Up(Intrinsics.LJFF(str2, "For You"));
                }
            }
        };
        this.LLLL = new C1776090wJr(this, 4);
        this.LLLLII = new C1776090wJr(this, 5);
        this.LLLLIIIILLL = new InterfaceC1055110dYz() { // from class: X.0wAc
            @Override // X.InterfaceC1583780rJg
            public final String getHoxNodeTag() {
                return "";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeHide(Bundle bundle) {
                EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = this.LL;
                if (ecSearchNoCartFeedVideoGuideAssem.LLLILZLLLI) {
                    ecSearchNoCartFeedVideoGuideAssem.Up(true);
                }
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeShow(Bundle bundle) {
                EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = this.LL;
                if (ecSearchNoCartFeedVideoGuideAssem.LLLILZLLLI) {
                    ecSearchNoCartFeedVideoGuideAssem.Up(false);
                    this.LL.Bp(EnumC1770140wAG.TO_FYP_PROFILE);
                }
            }
        };
        this.LLLLIIL = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_container_shop_video_guide";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brj;
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
        return true;
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

    public final FrameLayout Ep() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggf) : null;
            this.LLLFF = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final ConstraintLayout Fp() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggh) : null;
            this.LLLF = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C708910RrN Gp() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggi) : null;
            this.LLJLLIL = (C708910RrN) viewFindViewById;
        }
        return (C708910RrN) viewFindViewById;
    }

    public final int Ip() {
        int i = this.LLLJ;
        if (!this.LLLIZZ) {
            return i;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Video video = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getVideo();
        return video != null ? Math.max(i, video.getDuration()) : i;
    }

    public final EcSearchNoCartFeedVideoGuideVM Jp() {
        return (EcSearchNoCartFeedVideoGuideVM) this.LLLIIIIL.getValue(this, LLLLIILLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLLILZLLLI) {
            Up(true);
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext = this.LLLIIIL;
        if (coroutineContext != null && C23118094a.LJIIIIZZ(coroutineContext)) {
            return coroutineContext;
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        CoroutineContext coroutineContextLIZLLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII());
        this.LLLIIIL = coroutineContextLIZLLL;
        return coroutineContextLIZLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (this.LLLILZLLLI) {
            Up(false);
        }
        if (!this.LLLILZLLLI || C1906580ziK.LJI()) {
            return;
        }
        Bp(EnumC1770140wAG.TO_SUBPAGE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        CoroutineContext coroutineContext = this.LLLIIIL;
        if (coroutineContext != null) {
            C23118094a.LIZJ(coroutineContext, null);
        }
        Vp(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Vp(this);
        Tp(C724240Sb0.LIZ(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return getContentView();
    }

    public static void Vp(EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem) {
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            Unit unit = null;
            if (eventBusLIZLLL.LJIIJ(ecSearchNoCartFeedVideoGuideAssem)) {
                eventBusLIZLLL.LJJI(ecSearchNoCartFeedVideoGuideAssem);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Bp(EnumC1770140wAG enumC1770140wAG) {
        C0CNO.LIZLLL(0L, new AwS427S0200000_26(this, enumC1770140wAG, 38));
    }

    public final void Qp(C1770380wAe c1770380wAe) {
        C2252611DEt c2252611DEt;
        Object obj;
        Object obj2 = null;
        if (LLLLIL.add(Integer.valueOf(c1770380wAe.LIZIZ))) {
            C1770320wAY c1770320wAY = C1770320wAY.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            Integer numValueOf = Integer.valueOf(c1770380wAe.LIZIZ);
            c1770320wAY.getClass();
            C1770320wAY.LIZ(aweme, numValueOf, null, null, "homepage_hot");
        }
        int i = c1770380wAe.LIZ;
        if (i != 1) {
            if (i == 2) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                if (((VideoItemParams) obj2).getAweme().getProductRecallType() == 4) {
                    if (!this.LLLJIL) {
                        this.LLLJIL = true;
                        this.LLLLIIL.put("interest_type", Integer.valueOf(c1770380wAe.LIZIZ));
                        this.LLLLIIL.put("play_duration", Integer.valueOf(Ip()));
                        C1770320wAY c1770320wAY2 = C1770320wAY.LIZ;
                        EnumC1770450wAl enumC1770450wAl = EnumC1770450wAl.CATEGORY_MEDIUM;
                        Map<String, Object> map = this.LLLLIIL;
                        c1770320wAY2.getClass();
                        C1770320wAY.LJIIIIZZ(enumC1770450wAl, map, null, null);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C2252611DEt c2252611DEt2 = this.LLLIILIL;
        if (c2252611DEt2 == null || !c2252611DEt2.isActive() || (c2252611DEt = this.LLLIILIL) == null) {
            return;
        }
        C189200o6.m2constructorimpl(c1770380wAe);
        c2252611DEt.resumeWith(c1770380wAe);
    }

    public final void Tp(C19EG c19eg) {
        HomeTabAbility homeTabAbilityLIZ;
        Unit unit = null;
        if (c19eg != null) {
            try {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                c446900Hfk.LIZ(c19eg).PQ2("page_profile", this.LLLLIIIILLL);
                c446900Hfk.LIZ(c19eg).OQ2(this.LLLJL);
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                    homeTabAbilityLIZ.Ik0(this.LLLL);
                    homeTabAbilityLIZ.tx0(this.LLLLII);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    public final void Up(boolean z) {
        C2252611DEt c2252611DEt;
        C2252611DEt c2252611DEt2;
        this.LLLILZJ = z;
        if (z && (c2252611DEt = this.LLLILZ) != null && c2252611DEt.isActive() && (c2252611DEt2 = this.LLLILZ) != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c2252611DEt2.resumeWith(unit);
        }
    }

    @Override // X.InterfaceC1770300wAW
    public final void h8(boolean z) {
        this.LLLLIILL = z;
    }

    @C14EU
    public final void onScrolledToProfile(C736490Sul c736490Sul) {
        Qp(new C1770380wAe(2, 4));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0Nz3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS312S0000000_26(1), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0Nkq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS312S0000000_26(2), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0SHf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, null, AFwS313S0000000_26.get$arr$(30), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RSo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, null, AFwS313S0000000_26.get$arr$(31), 6);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLI.getValue();
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0Sn6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0Sn9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0SnD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, C1776160wJy.get$arr$(1));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLII.getValue(), new C2217381BqS() { // from class: X.0Snp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILLJJLI;
            }
        }, null, AFwS313S0000000_26.get$arr$(24), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0SCZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJI;
            }
        }, null, AFwS313S0000000_26.get$arr$(25), 6);
        AssemViewModel.asyncSubscribe$default(Jp(), new C2217381BqS() { // from class: X.0gMp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159010gGZ) obj).LL;
            }
        }, this, null, null, null, new AwS601S0100000_22(this, 630), 28, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (((Number) C108000b0.LIZ.getValue()).intValue() == 1 || this.LLLLIILL) {
            return false;
        }
        return super.ur(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaCommonAbility.class, null);
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
