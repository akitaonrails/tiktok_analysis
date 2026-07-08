package com.ss.android.ugc.aweme.repostfeed.ui;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C09JN;
import X.C0SU6;
import X.C0SZ8;
import X.C1209450hZv;
import X.C1361830lXh;
import X.C1388190mED;
import X.C13LE;
import X.C1440005kM;
import X.C1492500owS;
import X.C1514430pVp;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564710qov;
import X.C1568310quj;
import X.C1576740r8K;
import X.C1578000rAM;
import X.C1583220rIm;
import X.C1583510rJF;
import X.C1590830rV3;
import X.C1593830rZt;
import X.C1593850rZv;
import X.C1595430rcT;
import X.C1620930sHb;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2217381BqS;
import X.C338490DOt;
import X.C343710Ddh;
import X.C446900Hfk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C680080Qly;
import X.C690440R6k;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.EnumC1584370rKd;
import X.InterfaceC1055110dYz;
import X.InterfaceC1209460hZw;
import X.InterfaceC1581960rGk;
import X.InterfaceC1591870rWj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.repostfeed.feed.RepostFeedPanel;
import com.ss.android.ugc.aweme.repostfeed.feed.RepostScrollProfileStrategy;
import com.ss.android.ugc.aweme.repostfeed.interfaces.IRepostFeedAbility;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import com.ss.android.ugc.aweme.service.IRepostFeedDebugService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC1591870rWj, IRepostFeedAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpOSHELIOSAgPCMpLCt9PSxiGyojJzY4Dyo2LAM+KCg+LSs4";
    public final RepostFeedPanel LLIZ = new RepostFeedPanel();
    public final AssemVMLazy LLIZLLLIL;
    public InterfaceC1209460hZw LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostFeedFragment.class, "feedVM", "getFeedVM()Lcom/ss/android/ugc/aweme/repostfeed/viewmodel/RepostFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "RepostFeedFragment";
    }

    public RepostFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostFeedViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2187);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(266);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2188), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 2189), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 2190), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.interfaces.IRepostFeedAbility
    public final void Kb() {
        C1593830rZt.LIZIZ.LIZLLL(195).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS193S0100000_24(this, 55), new C09JN() { // from class: X.06cj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RepostFeedFragment@91d0.filterAlreadyReadFeedData$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filterAlreadyReadFeedData error and ");
                sbLIZ.append(((Throwable) obj).getStackTrace());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("RepostFeedFragment@91d0.filterAlreadyReadFeedData$2");
            }
        });
    }

    public final RepostFeedViewModel ZR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (RepostFeedViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        Window window;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZIZ;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(RepostFeedFragment.class.getName());
        }
        Context context = getContext();
        boolean zUw = (context == null || (iFriendsTabLayoutAbilityLIZIZ = C1583510rJF.LIZIZ(context)) == null) ? false : iFriendsTabLayoutAbilityLIZIZ.uw("REPOST_FEED");
        if (!Intrinsics.LJFF(C343710Ddh.LIZ(getActivity()).CQ2(), "FRIENDS_TAB") || !zUw) {
            this.LLIZ.f373J = false;
            super.onResume();
            setUserVisibleHint(false);
            this.LLIZ.setUserVisibleHint(false);
            return;
        }
        this.LLIZ.f373J = true;
        super.onResume();
        this.LLIZ.f373J = false;
        setUserVisibleHint(true);
        this.LLIZ.setUserVisibleHint(true);
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(EnumC1584370rKd.REPOST);
            C1440005kM.LIZ(new C1568310quj(1, this.LLIZ.LJIIIIZZ(), this.LLIZ));
        }
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(C960203pA.LIZ(R.attr.e1, activity)));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, this.LLIZ);
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        SR();
        C1440005kM.LIZ(new C1568310quj(2, this.LLIZ.LJIIIIZZ(), this.LLIZ));
        this.LLIZ.h(z);
        NoNetDetectHelper.LJIJ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        ZR().refresh();
        C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("REPOST_FEED");
        return true;
    }

    public final void S1(boolean z) {
        if (getUserVisibleHint() && isViewValid()) {
            NoNetDetectHelper.LJIJ.set(true);
            RR();
            C1440005kM.LIZ(new C1568310quj(1, this.LLIZ.LJIIIIZZ(), this.LLIZ));
            if (z) {
                this.LLIZ.tryResumePlay();
            } else {
                this.LLIZ.g();
            }
            C0SZ8 c0sz8K4 = k4();
            if (c0sz8K4 != null) {
                c0sz8K4.LJLLILLLL();
            }
            Db(false);
        }
    }

    public final void WR(Bundle bundle) {
        Bundle bundleEQ2;
        String string = bundle.getString("fromStart", "");
        if ((string == null || string.length() == 0) && (bundleEQ2 = C343710Ddh.LIZ(getActivity()).EQ2()) != null) {
            C786410Ut5.LJJIIJZLJL(bundle, bundleEQ2);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) throws Throwable {
        String string;
        C1583220rIm.LIZ(3);
        WR(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.TAB_HOX_AND_PROTOCOL_TAG");
        } else {
            string = null;
        }
        C1564710qov.LIZ(this, bundle, string, new AwS603S0100000_24(this, 187));
        String string2 = bundle.getString("fromStart", "");
        boolean z = bundle.getBoolean("slide", false);
        boolean z2 = bundle.getBoolean("click_top_tab", false);
        if (!Intrinsics.LJFF(string2, "MainPage") && !z && !z2) {
            if (Intrinsics.LJFF(string2, "MainFragment")) {
                NR(false);
            } else if (Intrinsics.LJFF(string2, "RootNode")) {
                C0SZ8 c0sz8K4 = k4();
                if (c0sz8K4 != null) {
                    c0sz8K4.LJLIIIL(1);
                }
                Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
                if (aweme != null) {
                    C1361830lXh.LIZ.LIZ(aweme.getAid());
                }
            }
        } else {
            NR(true);
        }
        setUserVisibleHint(false);
        this.LLIZ.setUserVisibleHint(false);
        C1578000rAM.LIZIZ = System.currentTimeMillis();
        C1593850rZv c1593850rZv = C1593850rZv.LIZ;
        int i = C1578000rAM.LIZLLL;
        int i2 = C1578000rAM.LIZJ;
        long j = (C1578000rAM.LIZIZ - C1578000rAM.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        c1593850rZv.getClass();
        C20684815ws.LJIJI("repost_feed_view_action", new Pair(Integer.valueOf(i + i2), "view_count"), new Pair(Integer.valueOf(i2), "view_unread_count"), new Pair(Integer.valueOf(i), "view_history_read_count"), new Pair(Long.valueOf(j), "stay_duration"));
        C1578000rAM.LIZJ = 0;
        C1578000rAM.LIZLLL = 0;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) throws Throwable {
        String string;
        WR(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.TAB_HOX_AND_PROTOCOL_TAG");
        } else {
            string = null;
        }
        C1564710qov.LIZ(this, bundle, string, new AwS603S0100000_24(this, 188));
        if (isResumed()) {
            C1514430pVp.LJFF(EnumC1584370rKd.REPOST);
            C1590830rV3 c1590830rV3 = new C1590830rV3();
            c1590830rV3.LJIILLIIL = "homepage_friends";
            c1590830rV3.LJIILJJIL();
        }
        setUserVisibleHint(true);
        this.LLIZ.setUserVisibleHint(true);
        String string2 = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("REPOST_FEED");
        c446900Hfk.LIZ(requireActivity()).HQ2(c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2));
        if (bundle.getBoolean("friends_tab_inner_switch", false)) {
            S1(true);
        } else if (!Intrinsics.LJFF(string2, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            S1(true);
            C1578000rAM.LJIIIZ = true;
        } else {
            S1(false);
        }
        if (!Intrinsics.LJFF(string2, "RootNode")) {
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("REPOST_FEED");
        }
        C1578000rAM.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IRepostFeedAbility.class, null, null);
        ZR().LLILLJJLI = this.LLIZ;
        if (this.LLILLL == 0) {
            this.LLILLL = 195;
            this.LLILLJJLI = "repost_feed";
        }
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setEventType("repost_feed");
        c2189821An6.setPageType(195);
        RepostFeedPanel repostFeedPanel = this.LLIZ;
        repostFeedPanel.LLLL(c2189821An6);
        repostFeedPanel.Xl1(VR());
        repostFeedPanel.LLLII = VR();
        repostFeedPanel.LLLIIII = VR();
        repostFeedPanel.onViewCreated(view, bundle);
        repostFeedPanel.setUserVisibleHint(true);
        Db(false);
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LJI(false);
        }
        if (this.LLJ == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLJ = C1209450hZv.LIZIZ(activity);
        }
        NoNetDetectHelper.LJIJ.set(true);
        this.LLIZ.LLJJI(new C1620930sHb(this, 18));
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 1079), 3);
        final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        final RepostScrollProfileStrategy repostScrollProfileStrategy = new RepostScrollProfileStrategy(requireActivity());
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(repostScrollProfileStrategy));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.repostfeed.ui.RepostFeedFragment$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, repostScrollProfileStrategy);
                    }
                }
            });
        }
        IRepostFeedDebugService iRepostFeedDebugService = (IRepostFeedDebugService) ServiceManager.get().getService(IRepostFeedDebugService.class);
        if (iRepostFeedDebugService != null) {
            getActivity();
            iRepostFeedDebugService.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19EG c19egLIZIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        View viewLIZJ = C20673215v0.LIZJ(R.layout.em1, c19egLIZIZ);
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }
}
