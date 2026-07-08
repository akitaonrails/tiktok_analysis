package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC1158440gFe;
import X.AbstractC21673619ry;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C04W7;
import X.C05DF;
import X.C07CF;
import X.C07MS;
import X.C098200Yq;
import X.C0AB3;
import X.C0BK4;
import X.C0HWQ;
import X.C0P0T;
import X.C0PEM;
import X.C1086520eNe;
import X.C1158420gFc;
import X.C1158430gFd;
import X.C1158450gFf;
import X.C1158460gFg;
import X.C118300cf;
import X.C11JF;
import X.C1220000hqw;
import X.C123100dR;
import X.C1257390ipF;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C150D;
import X.C1558520qew;
import X.C1570830qyn;
import X.C1584500rKq;
import X.C1589640rT8;
import X.C15SB;
import X.C15SM;
import X.C15T5;
import X.C15TA;
import X.C15TC;
import X.C15V2;
import X.C15VE;
import X.C15VK;
import X.C1617890sCh;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20521215Rq;
import X.C20522315Sb;
import X.C20523015Si;
import X.C20523315Sl;
import X.C20526015Tm;
import X.C20532515Vz;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C23250099c;
import X.C292320Bd0;
import X.C341940Daq;
import X.C418440Gaw;
import X.C443090HZb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C627260Oiy;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C725950Sdl;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC452301pR;
import X.InterfaceC1340660kzY;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC336510DHd;
import X.InterfaceC487330J9f;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS35S1100000_31;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.common.ExploreStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedComponent extends UIListContentAssem<ExploreFeedListViewModel> implements C15SB, InterfaceC336510DHd, InterfaceC487330J9f, FirstScreenCheckingAbility, MiddleBridgeCellAbility, ExplorePowerListAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public C20522315Sb LLIZLLLIL;
    public C1749280vcc LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 536));
    public C0P0T LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C11JF LLJJI;
    public C20523015Si LLJJIII;
    public boolean LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public TuxSkeletonLayout LLJJJ;
    public final C01GW LLJJJIL;
    public final Set<Integer> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreFeedComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/explore/vm/ExploreFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C15SB
    public final void Z6() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Long l;
        Long l2;
        Long l3;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C15V2 c15v2Ja = ja();
            C1558520qew.LJI(fragmentLJI, ExploreFeedComponentScope.class, this, FirstScreenCheckingAbility.class, this, (c15v2Ja == null || (l3 = c15v2Ja.LIZIZ) == null) ? null : l3.toString());
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C15V2 c15v2Ja2 = ja();
            C1558520qew.LJI(fragmentLJI2, ExploreFragmentContainerScope.class, this, MiddleBridgeCellAbility.class, this, (c15v2Ja2 == null || (l2 = c15v2Ja2.LIZIZ) == null) ? null : l2.toString());
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C15V2 c15v2Ja3 = ja();
            C1558520qew.LJI(fragmentLJI3, ExploreFragmentContainerScope.class, this, ExplorePowerListAbility.class, this, (c15v2Ja3 == null || (l = c15v2Ja3.LIZIZ) == null) ? null : l.toString());
        }
        C15VE c15veXm = ip().xm();
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        c15veXm.LIZIZ = fragmentLJI4;
        c15veXm.LIZJ = fragmentLJI4 != null ? LifecycleOwnerKt.getLifecycleScope(fragmentLJI4) : null;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void rh1(ExploreLynxParams exploreLynxParams) {
    }

    public ExploreFeedComponent() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(159);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(82), new AwS562S0100000_18((AbstractC738140SxQ) this, 221), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreFeedListViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 220), AFwS276S0000000_31.get$arr$(81), null, true);
        this.LLJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS575S0100000_31(this, 538));
        this.LLJJJJ = new LinkedHashSet();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 534));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 533));
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 537));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(158));
        this.LLJL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(160));
    }

    @Override // X.C15SB
    public final C20521215Rq Ek() {
        return (C20521215Rq) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void H00() {
        C0P0T c0p0t = this.LLJIJIL;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = ((Number) C0BK4.LIZ.getValue()).intValue();
        c20603715jn.LIZLLL = ExploreFeedFooterCell.class;
        boolean z = true;
        if (ap()) {
            c20603715jn.LJ = true;
        }
        c20603715jn.LJI = C292320Bd0.LIZ > 0;
        c20603715jn.LJIIIZ = "homepage_explore";
        if (C1584500rKq.LIZ().enable && C1584500rKq.LIZ().enablePreCreateCell) {
            c20603715jn.LJIIIIZZ = new OptimizeAbility(C1584500rKq.LIZ().maxPreloadItemSize, z, null, 4);
        }
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final C1086520eNe Go() {
        return (C1086520eNe) this.LLJI.getValue();
    }

    public final C20522315Sb Oo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.t25) : null;
            this.LLIZLLLIL = (C20522315Sb) viewFindViewById;
        }
        return (C20522315Sb) viewFindViewById;
    }

    public final C1749280vcc Vo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public final ExploreFeedListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (ExploreFeedListViewModel) assemVMLazy.getValue();
    }

    public final boolean ap() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    @Override // X.C15SB
    public final C15V2 ja() {
        return (C15V2) this.LLJJJJJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        Long l;
        Long l2;
        Long l3;
        Unit unit;
        if (((Boolean) C0AB3.LIZ.getValue()).booleanValue()) {
            C20600815jK<InterfaceC1891350zJl> state = Go().getState();
            if (state != null) {
                state.LJFF(null);
            }
            try {
                List<InterfaceC1891350zJl> listItems = Go().getListItems();
                if (listItems != null) {
                    listItems.clear();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            super.onDestroy();
        } else {
            super.onDestroy();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C15V2 c15v2Ja = ja();
            C1558520qew.LJIIJ(fragmentLJI, ExploreFeedComponentScope.class, FirstScreenCheckingAbility.class, (c15v2Ja == null || (l3 = c15v2Ja.LIZIZ) == null) ? null : l3.toString());
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C15V2 c15v2Ja2 = ja();
            C1558520qew.LJIIJ(fragmentLJI2, ExploreFragmentContainerScope.class, MiddleBridgeCellAbility.class, (c15v2Ja2 == null || (l2 = c15v2Ja2.LIZIZ) == null) ? null : l2.toString());
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C15V2 c15v2Ja3 = ja();
            C1558520qew.LJIIJ(fragmentLJI3, ExploreFragmentContainerScope.class, ExplorePowerListAbility.class, (c15v2Ja3 == null || (l = c15v2Ja3.LIZIZ) == null) ? null : l.toString());
        }
        ((C15VK) this.LLJJJIL.getValue()).LIZ();
        ip().xm().LIZLLL();
        C487280J9a.LIZJ(this);
        C1589640rT8.LIZIZ.H2(this.LLJJIII);
        this.LLJJIII = null;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void LD2() {
        ip().LLJI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final boolean LJJIIJZLJL() {
        C15SM c15sm = (C15SM) ip().getState();
        c15sm.getClass();
        return C627260Oiy.LIZLLL(c15sm) instanceof C1623706Xj;
    }

    public final void Lo() {
        if (ap()) {
            Go().setItemAnimator(null);
        } else {
            HandlerHook.viewPost(Go(), new ARunnableS129S0100000_29(this, 202));
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Vq1() {
        ExploreFeedListViewModel exploreFeedListViewModelIp = ip();
        exploreFeedListViewModelIp.setState(new AwS610S0100000_31(exploreFeedListViewModelIp, 363));
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final String getEnterFrom() {
        ip();
        return "homepage_explore";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final Aweme gt() {
        C20526015Tm c20526015Tm;
        List<C150D> list = ((C15SM) ip().getState()).LLILZ.LLILZ;
        C150D c150d = list != null ? (C150D) C13LP.LJJJLZIJ(0, list) : null;
        if (!(c150d instanceof C20526015Tm) || (c20526015Tm = (C20526015Tm) c150d) == null) {
            return null;
        }
        return c20526015Tm.LL;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final C1086520eNe lP2() {
        return Go();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final boolean pJ2() {
        return ip().LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void tw2() {
        ip().LLJLILLLLZIIL = true;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final C15VE xm() {
        return ip().xm();
    }

    public static String So(Aweme aweme) {
        Integer exploreCommunityCommentShowType;
        AwemeStatistics statistics;
        String desc;
        AwemeStatistics statistics2;
        PhotoModeImageInfo photoModeImageInfo;
        if (aweme == null || (exploreCommunityCommentShowType = aweme.getExploreCommunityCommentShowType()) == null || exploreCommunityCommentShowType.intValue() != 1 || !C04W7.LIZ() || (statistics = aweme.getStatistics()) == null || statistics.getCommentCount() <= 0) {
            return null;
        }
        if ((!AwemeExtKt.isPhotoMode(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (desc = photoModeImageInfo.getTitle()) == null || !C123100dR.LIZ(desc)) && (desc = aweme.getDesc()) == null) {
            desc = "";
        }
        if (!C123100dR.LIZ(desc) || (statistics2 = aweme.getStatistics()) == null) {
            return null;
        }
        return Long.valueOf(statistics2.getCommentCount()).toString();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Dt2(int i) {
        ip().LLJJJJLIIL = i;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void E62(ExploreFeedParams exploreFeedParams) {
        ExploreLynxParams exploreLynxParams;
        ExploreFeedParams exploreFeedParams2;
        String str;
        C19EG activity;
        Intent intent;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null || (intent = activity.getIntent()) == null || (exploreLynxParams = (ExploreLynxParams) intent.getParcelableExtra("explore_lynx_params")) == null) {
            exploreLynxParams = new ExploreLynxParams(0);
        }
        ExploreFeedListViewModel exploreFeedListViewModelIp = ip();
        exploreFeedListViewModelIp.LLJI = true;
        exploreFeedListViewModelIp.LLJIJIL = exploreFeedParams;
        exploreFeedListViewModelIp.LLJILLL = null;
        Long l = exploreLynxParams.lynxJumpInterestId;
        if (l != null) {
            AbstractC1158440gFe abstractC1158440gFeLIZ = C1158460gFg.LIZ(exploreLynxParams.lynxIsPinTopic, l, exploreLynxParams.lynxJumpAwemeIds, exploreFeedListViewModelIp.LLJILJIL, exploreFeedListViewModelIp.LLJILJILJ, 0L);
            if (Intrinsics.LJFF(abstractC1158440gFeLIZ, C1158450gFf.LIZIZ)) {
                if (exploreLynxParams.groupId != null) {
                    exploreFeedListViewModelIp.vQ2(exploreFeedListViewModelIp.LLJILJIL, exploreLynxParams);
                    exploreFeedListViewModelIp.LLJJJ = exploreLynxParams.groupId;
                }
            } else if (abstractC1158440gFeLIZ instanceof C1158430gFd) {
                C23250099c.LIZLLL(exploreFeedListViewModelIp.getAssemVMScope(), null, null, new C20523315Sl(exploreFeedListViewModelIp, abstractC1158440gFeLIZ, exploreLynxParams, null), 3);
            } else if (abstractC1158440gFeLIZ instanceof C1158420gFc) {
                exploreFeedListViewModelIp.vQ2(((C1158420gFc) abstractC1158440gFeLIZ).LIZIZ.interestId, exploreLynxParams);
                exploreFeedListViewModelIp.FQ2(exploreLynxParams);
            } else {
                throw new C1954807lC();
            }
        } else {
            exploreFeedListViewModelIp.LLJJ = null;
            exploreFeedListViewModelIp.LLJJI = null;
            exploreFeedListViewModelIp.LLJJIII = null;
            exploreFeedListViewModelIp.LLJJIJI = null;
            exploreFeedListViewModelIp.LLJJIJIL = null;
        }
        ExploreFeedParams exploreFeedParams3 = exploreFeedListViewModelIp.LLJIJIL;
        if (exploreFeedParams3 != null && Intrinsics.LJFF(exploreFeedParams3.previousPage, "explore_preview") && (exploreFeedParams2 = exploreFeedListViewModelIp.LLJIJIL) != null && (str = exploreFeedParams2.awemeId) != null) {
            C15TA.LIZ.getClass();
            C15TA.LJIILLIIL("click_explore_card", str);
        }
        ExploreFeedListViewModel exploreFeedListViewModelIp2 = ip();
        String str2 = exploreFeedListViewModelIp2.LLJJJ;
        exploreFeedListViewModelIp2.LLJJJ = null;
        if (str2 != null) {
            HandlerHook.viewPost(Go(), new ARunnableS35S1100000_31(this, str2, 8));
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void FI(SmartRoute smartRoute) {
        C1257390ipF c1257390ipF = C1257390ipF.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c1257390ipF.getClass();
        C1257390ipF.LIZ(smartRoute, this, fragmentLJI);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Gs2(C15T5 c15t5) {
        ExploreFeedListViewModel exploreFeedListViewModelIp = ip();
        if (C07CF.LIZ()) {
            exploreFeedListViewModelIp.withState(new AwS397S0200000_31(exploreFeedListViewModelIp, c15t5, 82));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final Map<String, String> Ln(String str) {
        C150D c150d;
        C20526015Tm c20526015Tm;
        Object next;
        String aid;
        C20526015Tm c20526015Tm2;
        Aweme aweme;
        List<C150D> list = ((C15SM) ip().getState()).LLILZ.LLILZ;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C150D c150d2 = (C150D) next;
                    if ((c150d2 instanceof C20526015Tm) && (c20526015Tm2 = (C20526015Tm) c150d2) != null && (aweme = c20526015Tm2.LL) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c150d = (C150D) next;
        } else {
            c150d = null;
        }
        if (!(c150d instanceof C20526015Tm) || (c20526015Tm = (C20526015Tm) c150d) == null) {
            return null;
        }
        String strSo = So(c20526015Tm.LL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("model_source", String.valueOf(c20526015Tm.LLILZLL));
        if (strSo != null) {
            linkedHashMap.put("show_comment_number", strSo);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility
    public final void eJ0(long j) {
        Long l;
        RecyclerView.LayoutManager layoutManager;
        C15V2 c15v2Ja = ja();
        if (c15v2Ja != null && (l = c15v2Ja.LIZIZ) != null && j == l.longValue() && (layoutManager = Go().getLayoutManager()) != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility
    public final void kp0(int i) {
        if (ip().LLJJL) {
            this.LLJJJJ.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034e  */
    /* JADX WARN: Type inference failed for: r2v33, types: [X.15Si] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility
    public final boolean xC0(int i) {
        return this.LLJJJJ.contains(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility
    public final void VP(long j, String str) {
        Long l;
        C15V2 c15v2Ja = ja();
        if (c15v2Ja != null && (l = c15v2Ja.LIZIZ) != null && j == l.longValue()) {
            ip().HQ2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void ck1(String str, AwS412S0200000_11 awS412S0200000_11) {
        C23250099c.LIZLLL(ip().getAssemVMScope(), C0PEM.LIZJ, null, new C05DF(str, awS412S0200000_11, null), 2);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        C20522315Sb c20522315SbOo;
        ExploreFeedListViewModel.LLLF = configuration.screenWidthDp;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LLLILZLLLI() && (c20522315SbOo = Oo()) != null) {
            ViewGroup.LayoutParams layoutParams = c20522315SbOo.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(configuration.screenWidthDp))));
                C786410Ut5.W5(c20522315SbOo, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            staggeredGridLayoutManager.LJJJ(C1617890sCh.LIZ());
            Go().invalidateItemDecorations();
            AbstractC21673619ry adapter = Go().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        C0P0T c0p0t = this.LLJIJIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void wY1(long j, String str) {
        ExploreFeedListViewModel exploreFeedListViewModelIp = ip();
        if (C07MS.LIZ()) {
            exploreFeedListViewModelIp.withState(new AwS397S0200000_31(exploreFeedListViewModelIp, (ExploreFeedListViewModel) new C15TC(exploreFeedListViewModelIp, j, str), (Function2<? super Integer, ? super C150D, Unit>) 81));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Fh0(C20526015Tm c20526015Tm, final ViewGroup viewGroup, ExploreFeedCell exploreFeedCell) {
        Object uid;
        String uid2;
        Fragment parentFragment;
        String string;
        String string2;
        BaseExploreFeedFragment baseExploreFeedFragment;
        String string3;
        User author;
        User currentUser;
        C15SM c15sm = (C15SM) ip().getState();
        c15sm.getClass();
        if (c15sm.getListState().LL instanceof C1623706Xj) {
            return;
        }
        ViewParent parent = viewGroup.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = -1;
        }
        Aweme aweme = c20526015Tm.LL;
        String str = "";
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid2 = author.getUid()) == null) {
            uid2 = "";
        }
        String aid = c20526015Tm.LL.getAid();
        if (aid == null) {
            aid = "";
        }
        final String strV5 = exploreFeedCell.V5();
        if (Intrinsics.LJFF(uid, uid2)) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Fragment parentFragment2 = null;
        if (fragmentLJI != null) {
            parentFragment = fragmentLJI.getParentFragment();
        } else {
            parentFragment = null;
        }
        if ((parentFragment instanceof BaseExploreFeedFragment) && parentFragment != null && !BaseExploreFeedFragment.iS(viewGroup)) {
            return;
        }
        C20532515Vz.LIZ(new C725950Sdl(aid, uid2, strV5));
        Context context = getContext();
        if (context == null || (string = context.getString(2131839831)) == null) {
            string = "";
        }
        C443090HZb c443090HZb = new C443090HZb(string, new AwS275S0300000_31(c20526015Tm, viewGroup, this, 19), R.raw.icon_flag, null, 0, null, 0, false, false, null, 1016);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = C341940Daq.LIZ(-6.0d);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            int height = c19egLIZ.getWindow().getDecorView().getHeight();
            View viewLIZ = C1570830qyn.LIZ(c19egLIZ);
            if (viewLIZ == null) {
                viewLIZ = c19egLIZ.findViewById(R.id.nwe);
            }
            int[] iArr = new int[2];
            viewLIZ.getLocationInWindow(iArr);
            c118300cf.element += height - iArr[1];
        }
        Context context2 = getContext();
        if (context2 == null || (string2 = context2.getString(2131839830)) == null) {
            string2 = "";
        }
        C443090HZb c443090HZb2 = new C443090HZb(string2, new AwS275S0300000_31(c20526015Tm, this, c118300cf, 18), R.raw.icon_heart_broken, null, 0, null, 0, false, false, null, 1016);
        Context context3 = getContext();
        if (context3 != null && (string3 = context3.getString(2131839829)) != null) {
            str = string3;
        }
        List listSingletonList = Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZb2, new C443090HZb(str, new AwS275S0300000_31(c20526015Tm, this, c118300cf, 17), R.raw.icon_person_x_mark, null, 0, null, 0, false, false, null, 1016), c443090HZb));
        C0HWQ c0hwq = new C0HWQ(viewGroup.getContext());
        c0hwq.LJIIL(listSingletonList);
        c0hwq.LLJ = true;
        int iLIZ = C341940Daq.LIZ(0.0d);
        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
        c1391600mJi.LJFF = iLIZ;
        c1391600mJi.LIZIZ = viewGroup;
        int iLIZ2 = C341940Daq.LIZ(5.0d);
        C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZ2;
        c1391600mJi2.LJIIL = false;
        c1391600mJi2.LJII = -1001L;
        c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
        C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
        c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.15Sa
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                Fragment parentFragment3;
                BaseExploreFeedFragment baseExploreFeedFragment2;
                Fragment fragmentLJI2 = C724240Sb0.LJI(this.LIZ);
                if (fragmentLJI2 != null) {
                    parentFragment3 = fragmentLJI2.getParentFragment();
                } else {
                    parentFragment3 = null;
                }
                if ((parentFragment3 instanceof BaseExploreFeedFragment) && (baseExploreFeedFragment2 = (BaseExploreFeedFragment) parentFragment3) != null) {
                    baseExploreFeedFragment2.ZR(viewGroup);
                }
                this.LIZ.LLJILJILJ = false;
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                if ((abstractC1391670mJp instanceof C1391690mJr) && !this.LIZ.LLJJIJI) {
                    C20532515Vz.LIZ(new C1565410qq3(strV5));
                }
                this.LIZ.LLJIJIL = null;
            }
        });
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        this.LLJJIJI = false;
        this.LLJIJIL = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            parentFragment2 = fragmentLJI2.getParentFragment();
        }
        if ((parentFragment2 instanceof BaseExploreFeedFragment) && (baseExploreFeedFragment = (BaseExploreFeedFragment) parentFragment2) != null) {
            baseExploreFeedFragment.aS(viewGroup);
        }
    }
}
