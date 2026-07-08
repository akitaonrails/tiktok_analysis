package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C0R93;
import X.C0SR4;
import X.C0SU6;
import X.C0SZ8;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1209450hZv;
import X.C1361830lXh;
import X.C13LE;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492540owW;
import X.C14EU;
import X.C1514430pVp;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1564710qov;
import X.C1565840qqk;
import X.C1568310quj;
import X.C1573090r2R;
import X.C1577610r9j;
import X.C1578630rBN;
import X.C1578910rBp;
import X.C1591880rWk;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C20673215v0;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C338490DOt;
import X.C446900Hfk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C622680Oba;
import X.C680080Qly;
import X.C687700QyG;
import X.C714060Rzg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1209460hZw;
import X.InterfaceC1561380qjY;
import X.InterfaceC1577580r9g;
import X.InterfaceC1577740r9w;
import X.InterfaceC1577950rAH;
import X.InterfaceC1578820rBg;
import X.InterfaceC1578920rBq;
import X.InterfaceC1581960rGk;
import X.InterfaceC1587520rPi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC737790Swr;
import X.InterfaceC988100bou;
import Y.ARunnableS124S0100000_24;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope;
import com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabVM;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksPanel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksFragment extends BaseFeedListFragment implements InterfaceC1587520rPi, InterfaceC988100bou, InterfaceC1577580r9g, InterfaceC1561380qjY, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final C1577610r9j LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2HELIOSsqLCo3ZjEtK2ElemsIOy4+KRUlKiQgDjctLiI2JjE=";
    public DramaPicksPanel LLIZ;
    public InterfaceC1209460hZw LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public C1578910rBp LLJIJIL;
    public final DramaPicksFragment LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public volatile InterfaceC1577740r9w LLJILLL;
    public volatile InterfaceC1577950rAH LLJJ;
    public InterfaceC665370Q7z LLJJI;
    public C0QSJ LLJJIII;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0r9j] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaPicksFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/v2/DramaPicksVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(DramaPicksFragment.class, "mainAbility", "getMainAbility()Lcom/ss/android/ugc/aweme/minidrama/tab/v2/ability/IDramaTopTabMainAbility;", 0), new C2217381BqS(DramaPicksFragment.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/minidrama/tab/v2/ability/IDramaTopTabHostAbility;", 0)};
        LLJJIJI = new Object() { // from class: X.0r9j
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DramaTopTabMainFragmentScope.class});
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1561380qjY
    public final void lP() {
    }

    @Override // X.InterfaceC1561380qjY
    public final void nd() {
    }

    public DramaPicksFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DramaPicksVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2215);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(315);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1001), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS568S0100000_24((Fragment) this, 1002), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1003), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 998));
        this.LLJILJIL = this;
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        return dramaPicksPanel != null && dramaPicksPanel.LLJJ();
    }

    @Override // X.InterfaceC1587520rPi
    public final void N8() {
        IXTabScrollProfileStrategy iXTabScrollProfileStrategyWC0;
        C0SR4 c0sr4;
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        int count = (dramaPicksPanel == null || (c0sr4 = dramaPicksPanel.LLJL) == null) ? 0 : c0sr4.getCount();
        C19EG activity = getActivity();
        if (activity == null || (iXTabScrollProfileStrategyWC0 = C1591880rWk.LIZIZ.LJIJJ(activity).wC0("Drama")) == null) {
            return;
        }
        iXTabScrollProfileStrategyWC0.S50(count == 0);
    }

    @Override // X.InterfaceC1561380qjY
    public final void VN() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        DramaPicksVM dramaPicksVM = (DramaPicksVM) assemVMLazy.getValue();
        InterfaceC1577950rAH interfaceC1577950rAHZR = ZR();
        dramaPicksVM.xQ2(interfaceC1577950rAHZR != null ? interfaceC1577950rAHZR.mr() : null);
    }

    public final C0QSJ WR() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJIII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{DramaTopTabMainFragmentScope.class});
        this.LLJJIII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1577950rAH ZR() {
        InterfaceC1577950rAH interfaceC1577950rAH = this.LLJJ;
        if (interfaceC1577950rAH == null) {
            synchronized (this) {
                interfaceC1577950rAH = this.LLJJ;
                if (interfaceC1577950rAH == null) {
                    C0QSJ c0qsjWR = WR();
                    InterfaceC1577950rAH interfaceC1577950rAH2 = c0qsjWR != null ? (InterfaceC1577950rAH) c0qsjWR.getAbility(InterfaceC1577950rAH.class) : null;
                    this.LLJJ = interfaceC1577950rAH2;
                    return interfaceC1577950rAH2;
                }
            }
        }
        return interfaceC1577950rAH;
    }

    public final InterfaceC1577740r9w aS() {
        InterfaceC1577740r9w interfaceC1577740r9w = this.LLJILLL;
        if (interfaceC1577740r9w == null) {
            synchronized (this) {
                interfaceC1577740r9w = this.LLJILLL;
                if (interfaceC1577740r9w == null) {
                    C0QSJ c0qsjWR = WR();
                    InterfaceC1577740r9w interfaceC1577740r9w2 = c0qsjWR != null ? (InterfaceC1577740r9w) c0qsjWR.getAbility(InterfaceC1577740r9w.class) : null;
                    this.LLJILLL = interfaceC1577740r9w2;
                    return interfaceC1577740r9w2;
                }
            }
        }
        return interfaceC1577740r9w;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        if (dramaPicksPanel != null) {
            dramaPicksPanel.onDestroyView();
        }
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLIZLLLIL;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C622680Oba.LIZIZ(new C1573090r2R(false));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(DramaPicksFragment.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(SeriesHomeTabVM.LLJIJIL);
            C622680Oba.LIZIZ(new C1573090r2R(true));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        this.LLILLJJLI = "homepage_series";
        int i = C0SU6.LIZJ;
        DramaPicksPanel dramaPicksPanel = new DramaPicksPanel(aS());
        this.LLIZ = dramaPicksPanel;
        sparseArrayRegisterComponents.append(i, dramaPicksPanel);
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        C622680Oba.LIZIZ(new C1573090r2R(false));
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        if (dramaPicksPanel != null) {
            C1440005kM.LIZ(new C1568310quj(2, dramaPicksPanel.LJIIIIZZ(), dramaPicksPanel));
            dramaPicksPanel.h(z);
        }
        NoNetDetectHelper.LIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        C786410Ut5.LJJZZIII(this.LLJILJILJ, new ARunnableS124S0100000_24(this, 66));
        return true;
    }

    public final void S1(boolean z) {
        DramaPicksPanel dramaPicksPanel;
        if (getUserVisibleHint() && (dramaPicksPanel = this.LLIZ) != null) {
            C1440005kM.LIZ(new C1568310quj(1, dramaPicksPanel.LJIIIIZZ(), dramaPicksPanel));
        }
        if (getUserVisibleHint() && isViewValid()) {
            if (isResumed()) {
                C622680Oba.LIZIZ(new C1573090r2R(true));
            }
            NoNetDetectHelper.LIZ(Boolean.TRUE);
            RR();
            DramaPicksPanel dramaPicksPanel2 = this.LLIZ;
            if (dramaPicksPanel2 != null) {
                if (z) {
                    dramaPicksPanel2.tryResumePlay();
                } else {
                    dramaPicksPanel2.g();
                }
            }
            Db(false);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class}).unbindAbility(this.LLJILJIL, InterfaceC1577580r9g.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeChanged(C714060Rzg c714060Rzg) {
        InterfaceC1577740r9w interfaceC1577740r9wAS;
        if (C0R93.LJI(c714060Rzg.LIZLLL) && (interfaceC1577740r9wAS = aS()) != null) {
            interfaceC1577740r9wAS.LIZIZ(!c714060Rzg.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        InterfaceC1577950rAH interfaceC1577950rAHZR = ZR();
        if (interfaceC1577950rAHZR != null) {
            interfaceC1577950rAHZR.Uw();
        }
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Drama", new AwS603S0100000_24(this, 227));
        Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Drama");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LJLIIIL(1);
                    }
                    if (aweme != null) {
                        C1361830lXh.LIZ.LIZ(aweme.getAid());
                        return;
                    }
                    return;
                }
                return;
            }
            NR(true);
            return;
        }
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        if (dramaPicksPanel != null) {
            dramaPicksPanel.setUserVisibleHint(false);
        }
        NR(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    @Override // X.InterfaceC1055110dYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNodeShow(android.os.Bundle r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksFragment.onNodeShow(android.os.Bundle):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DramaTopTabMainFragmentScope.class}).bindAbility(this.LLJILJIL, InterfaceC1577580r9g.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/series/feed/tab/v2/DramaPicksFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wlT83a7V+xYuV4urKzxPp5LrDUPXrW2w1f3ZuVaqQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        if (dramaPicksPanel != null) {
            dramaPicksPanel.setUserVisibleHint(z);
        }
        RootPanelComponent rootPanelComponentLIZJ = C1578630rBN.LIZJ(this);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.setUserVisibleHint(z);
        }
        if (z) {
            DramaPicksPanel dramaPicksPanel2 = this.LLIZ;
            if (dramaPicksPanel2 != null) {
                C1440005kM.LIZ(new C1568310quj(1, dramaPicksPanel2.LJIIIIZZ(), dramaPicksPanel2));
            }
        } else {
            DramaPicksPanel dramaPicksPanel3 = this.LLIZ;
            if (dramaPicksPanel3 != null) {
                C1440005kM.LIZ(new C1568310quj(2, dramaPicksPanel3.LJIIIIZZ(), dramaPicksPanel3));
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(DramaPicksFragment.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0rBW] */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final C1578910rBp c1578910rBp;
        View view2;
        View viewFindViewById;
        IFeedCleanAbility iFeedCleanAbilityLIZ;
        IWatchVideoService iWatchVideoService;
        C19EG activity;
        super.onViewCreated(view, bundle);
        View view3 = view;
        while (true) {
            if (view3 != null) {
                if (view3 instanceof C1578910rBp) {
                    c1578910rBp = (C1578910rBp) view3;
                    break;
                }
                Object parent = view3.getParent();
                if (parent instanceof View) {
                    view3 = (View) parent;
                } else {
                    view3 = null;
                }
            } else {
                c1578910rBp = null;
                break;
            }
        }
        this.LLJIJIL = c1578910rBp;
        InterfaceC1577740r9w interfaceC1577740r9wAS = aS();
        if (interfaceC1577740r9wAS != 0) {
            interfaceC1577740r9wAS.LIZ(new InterfaceC1578820rBg() { // from class: X.0rBW
                @Override // X.InterfaceC1578820rBg
                public final void LIZ(int i, float f, EnumC1578740rBY enumC1578740rBY, EnumC1099050ehr enumC1099050ehr) {
                    C1576740r8K c1576740r8KLIZ;
                    boolean z = true;
                    if (enumC1578740rBY == EnumC1578740rBY.EXPANDED) {
                        C1578910rBp c1578910rBp2 = c1578910rBp;
                        if (c1578910rBp2 != null) {
                            c1578910rBp2.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        }
                        C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
                        if (c1576740r8KLIZ2 != null) {
                            c1576740r8KLIZ2.LJII(true);
                        }
                    } else if (enumC1578740rBY == EnumC1578740rBY.COLLAPSED) {
                        C1578910rBp c1578910rBp3 = c1578910rBp;
                        if (c1578910rBp3 != null) {
                            c1578910rBp3.setRadius(0.0f);
                        }
                        C1576740r8K c1576740r8KLIZ3 = C690440R6k.LIZ();
                        if (c1576740r8KLIZ3 != null) {
                            c1576740r8KLIZ3.LJII(false);
                        }
                    } else if (enumC1578740rBY == EnumC1578740rBY.DRAGGING && (c1576740r8KLIZ = C690440R6k.LIZ()) != null) {
                        if (enumC1099050ehr != EnumC1099050ehr.EXPANDING) {
                            z = false;
                        }
                        c1576740r8KLIZ.LJII(z);
                    }
                    float f2 = i;
                    float f3 = f * f2;
                    FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJI.getValue();
                    if (feedSkylightDrawerLogicAbility != null) {
                        feedSkylightDrawerLogicAbility.zO2(f3, f2, null);
                    }
                }
            });
        }
        if (c1578910rBp != null) {
            c1578910rBp.setListener(new InterfaceC1578920rBq() { // from class: X.0r9t
                @Override // X.InterfaceC1578920rBq
                public final boolean LIZ(EnumC1578110rAX enumC1578110rAX) {
                    int iLJLLJ;
                    InterfaceC1577740r9w interfaceC1577740r9wAS2;
                    DramaPicksPanel dramaPicksPanel = this.LIZ.LLIZ;
                    if (dramaPicksPanel != null) {
                        iLJLLJ = dramaPicksPanel.LJLLJ();
                    } else {
                        iLJLLJ = 0;
                    }
                    if (C1577980rAK.LIZ[enumC1578110rAX.ordinal()] == 1) {
                        if (iLJLLJ == 0 && ((interfaceC1577740r9wAS2 = this.LIZ.aS()) == null || !interfaceC1577740r9wAS2.LIZLLL())) {
                            return true;
                        }
                    } else {
                        InterfaceC1577740r9w interfaceC1577740r9wAS3 = this.LIZ.aS();
                        if (interfaceC1577740r9wAS3 != null && interfaceC1577740r9wAS3.LIZLLL()) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC1578920rBq
                public final void LIZIZ(EnumC1578110rAX enumC1578110rAX) {
                    InterfaceC1577740r9w interfaceC1577740r9wAS2;
                    int i = C1577980rAK.LIZ[enumC1578110rAX.ordinal()];
                    if (i != 1) {
                        if ((i != 2 && i != 3) || (interfaceC1577740r9wAS2 = this.LIZ.aS()) == null) {
                            return;
                        }
                        interfaceC1577740r9wAS2.LJ(false);
                        return;
                    }
                    InterfaceC1577740r9w interfaceC1577740r9wAS3 = this.LIZ.aS();
                    if (interfaceC1577740r9wAS3 == null) {
                        return;
                    }
                    interfaceC1577740r9wAS3.LJ(true);
                }
            });
        }
        NoNetDetectHelper.LIZ(Boolean.TRUE);
        Db(false);
        DramaPicksPanel dramaPicksPanel = this.LLIZ;
        if (dramaPicksPanel != null) {
            HomeFeedComponent homeFeedComponentVR = VR();
            C2189821An6 c2189821An6 = new C2189821An6();
            c2189821An6.setEventType(dramaPicksPanel.a0);
            c2189821An6.setPageType(dramaPicksPanel.b0);
            dramaPicksPanel.LLLLIIIILLL = c2189821An6;
            dramaPicksPanel.LLLII = homeFeedComponentVR;
            dramaPicksPanel.LLLIIII = homeFeedComponentVR;
            dramaPicksPanel.Xl1(homeFeedComponentVR);
            dramaPicksPanel.onViewCreated(view, bundle);
        }
        DramaPicksPanel dramaPicksPanel2 = this.LLIZ;
        if (dramaPicksPanel2 != null) {
            dramaPicksPanel2.d0 = this;
        }
        if (this.LLIZLLLIL == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLIZLLLIL = C1209450hZv.LIZIZ(activity);
        }
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, view, 180), 3);
        C1578910rBp c1578910rBp2 = this.LLJIJIL;
        if (c1578910rBp2 != null && (iWatchVideoService = (IWatchVideoService) PluggableExtentionKt.pluggableSpi$default(IWatchVideoService.class, false, false, false, 14, null)) != null) {
            iWatchVideoService.LJFF(c1578910rBp2, this);
        }
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, LSPassThroughRecordSizeConfig.DEFAULT);
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            final DramaPicksScrollProfileStrategy dramaPicksScrollProfileStrategy = new DramaPicksScrollProfileStrategy(activity2, awS568S0100000_24);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(dramaPicksScrollProfileStrategy));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.series.feed.tab.utils.HomeViewPagerInterceptHelperKt$registerInterceptHomeViewPager$$inlined$registerProtocol$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, dramaPicksScrollProfileStrategy);
                        }
                    }
                });
            }
        }
        AbsFragment absFragment = this.LLILZ;
        if (absFragment != null && (view2 = absFragment.getView()) != null && (viewFindViewById = view2.findViewById(R.id.i_j)) != null && (iFeedCleanAbilityLIZ = C1565840qqk.LIZ(this)) != null) {
            iFeedCleanAbilityLIZ.Cp0(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ = C20673215v0.LIZJ(R.layout.b6p, getActivity());
        C19GS c19gs = null;
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
