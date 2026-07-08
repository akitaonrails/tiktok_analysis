package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0BHP;
import X.C0C64;
import X.C0CN5;
import X.C0QSJ;
import X.C0X35;
import X.C1157804fw;
import X.C1218910hpB;
import X.C1219000hpK;
import X.C1219010hpL;
import X.C1220060hr2;
import X.C128Y;
import X.C1372310lob;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1558740qfI;
import X.C1559300qgC;
import X.C1564220qo8;
import X.C1564250qoB;
import X.C1565890qqp;
import X.C1569320qwM;
import X.C1570100qxc;
import X.C1570120qxe;
import X.C1570130qxf;
import X.C1578630rBN;
import X.C1584420rKi;
import X.C1697810uHb;
import X.C19EG;
import X.C20684815ws;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2296808zG;
import X.C285090BFj;
import X.C296200BjG;
import X.C446900Hfk;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1570140qxg;
import X.InterfaceC1570900qyu;
import X.InterfaceC1570980qz2;
import X.InterfaceC1581600rGA;
import X.InterfaceC1581610rGB;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS57S0300000_24;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.ITemplateDebugService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MFFeedAssem extends UIContentAssem implements IMFFeedAbility, InterfaceC1581610rGB, InterfaceC1581600rGA, IMFIconsProtocol, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public boolean LLJJI;
    public boolean LLJJIJI;
    public Fragment LLJJJ;
    public ViewGroup LLJJJIL;
    public volatile HomeViewPagerAbility LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;
    public final MFFeedAssem LLIZLLLIL = this;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(223));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1570130qxf(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1558740qfI(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1559300qgC(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1570100qxc(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C1569320qwM(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1219010hpL());
    public final C01GW LLJJIII = C452501pT.LIZ(EnumC452301pR.NONE, new C1565890qqp());
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1220060hr2());
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1219000hpK(this));
    public final C1564250qoB LLJJJJ = new InterfaceC1570980qz2() { // from class: X.0qoB
        @Override // X.InterfaceC1570980qz2
        public final void LIZ() {
        }

        @Override // X.InterfaceC1570980qz2
        public final void T1() {
        }

        @Override // X.InterfaceC1570980qz2
        public final void j6() {
        }

        @Override // X.InterfaceC1570980qz2
        public final InterfaceC1570900qyu LIZJ() {
            return (InterfaceC1570900qyu) this.LL.LLJILJILJ.getValue();
        }

        @Override // X.InterfaceC1570980qz2
        public final String LIZLLL() {
            return EnumC1584350rKb.SPECIAL.getTag();
        }

        @Override // X.InterfaceC1570980qz2
        public final MFLeftIconPriority LJ() {
            return MFLeftIconPriority.DEFAULT;
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFFeedAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1581610rGB
    public final void Ae(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final void Pm1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1938039177) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1581610rGB
    public final void u5(int i, boolean z) {
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
    }

    public final HomeViewPagerAbility Go() {
        return (HomeViewPagerAbility) this.LLJILJIL.getValue();
    }

    public final void Ho() {
        ((Handler) this.LLJJIJIIJIL.getValue()).removeCallbacks((Runnable) this.LLJJIJIL.getValue());
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        Fragment fragment = this.LLJJJ;
        if (fragment != null) {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIIJJI(this.LLJJJIL, fragment);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> gD2() {
        return Collections.singletonList(this.LLJJJJ);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility
    public final void Vj0() {
        FeedFragment feedFragment;
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof FeedFragment) && (feedFragment = (FeedFragment) currentFragment) != null && (feedFragment instanceof FeedRecommendFragment)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "back_refresh_to_next", false) == 1) {
                ((FeedRecommendFragment) feedFragment).LLIZLLLIL.LLLIILIL();
                ((AbstractC1604130rqV) this.LLJJIII.getValue()).LJIIIZ("[refreshWhenBack], scrollToNext");
                return;
            }
            IRefreshAbility iRefreshAbilityE80 = ((BaseFeedListFragment) feedFragment).E80();
            if (iRefreshAbilityE80 != null) {
                iRefreshAbilityE80.B10();
            }
            getContext();
            C20684815ws.LJIIIZ(0L, 0L, "click_back_fresh", "homepage_hot");
            ((AbstractC1604130rqV) this.LLJJIII.getValue()).LJIIIZ("[refreshWhenBack], refreshWithAnim");
        }
    }

    public final Fragment getCurrentFragment() {
        IMFAbility iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMFAbility.class, null);
        if (iMFAbility != null) {
            return iMFAbility.getCurrentFragment();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMFIconsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLJJ.getValue(), null);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ((InterfaceC1570900qyu) this.LLJILJILJ.getValue()).onPause();
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJJIFFI();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (C724240Sb0.LIZ(this) == null) {
            return;
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            this.LLJI.getValue();
            iFeedDebugService.LJJIJIIJIL();
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            ITemplateDebugService iTemplateDebugService = (ITemplateDebugService) ServiceManager.get().getService(ITemplateDebugService.class);
            this.LLJI.getValue();
            iTemplateDebugService.LIZIZ();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> Ji0() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainFragmentScope.class}).unbindAbility(this.LLIZLLLIL, IMFFeedAbility.class);
    }

    @C14EU
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        HomePageDataViewModel homePageDataViewModel;
        LiveData liveData;
        if (c1372310lob.LIZIZ == 1 && (homePageDataViewModel = (HomePageDataViewModel) this.LLJILLL.getValue()) != null && (liveData = (LiveData) homePageDataViewModel.LLJJIII.getValue()) != null) {
            liveData.postValue(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeHide(Bundle bundle) {
        FeedFragment feedFragment;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(c19egLIZ).HQ2("HOME");
        String strHQ22 = c446900Hfk.LIZ(c19egLIZ).HQ2(strHQ2);
        if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ2)) {
            if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ22)) {
                Fragment currentFragment = getCurrentFragment();
                if ((currentFragment instanceof FeedFragment) && (feedFragment = (FeedFragment) currentFragment) != null) {
                    feedFragment.SR();
                    return;
                }
                return;
            }
            return;
        }
        ((MainAnimViewModel) ViewModelProviders.of(c19egLIZ).get(MainAnimViewModel.class)).LLILZ.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeShow(Bundle bundle) {
        InterfaceC1740760vOs interfaceC1740760vOs;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C128Y c128yLJI = C724240Sb0.LJI(this);
        if ((c128yLJI instanceof InterfaceC1740760vOs) && (interfaceC1740760vOs = (InterfaceC1740760vOs) c128yLJI) != null) {
            if (!c19egLIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
                C2211631BhB.LJIIL(interfaceC1740760vOs, c19egLIZ);
            }
            String string = bundle.getString("fromStart", "");
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            String strHQ2 = c446900Hfk.LIZ(c19egLIZ).HQ2("HOME");
            String strHQ22 = c446900Hfk.LIZ(c19egLIZ).HQ2(strHQ2);
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ2)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ22)) {
                    InterfaceC1570900qyu interfaceC1570900qyu = (InterfaceC1570900qyu) this.LLJILJILJ.getValue();
                    if (interfaceC1570900qyu != null) {
                        interfaceC1570900qyu.S1(true);
                    }
                    ((MainAnimViewModel) ViewModelProviders.of(c19egLIZ).get(MainAnimViewModel.class)).LLILZ.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            InterfaceC1570900qyu interfaceC1570900qyu2 = (InterfaceC1570900qyu) this.LLJILJILJ.getValue();
            if (interfaceC1570900qyu2 != null) {
                interfaceC1570900qyu2.S1(true);
            }
            ((MainAnimViewModel) ViewModelProviders.of(c19egLIZ).get(MainAnimViewModel.class)).LLILZ.setValue(Boolean.TRUE);
        }
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        if (((Boolean) C285090BFj.LJJIJIIJI.getValue()).booleanValue()) {
            Ho();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0qxj] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Fragment fragmentLJI;
        Integer numValueOf;
        ViewGroup viewGroup;
        Object service;
        super.onViewCreated(view);
        C0X35.LIZ("mf_feed_assem_part_1", false);
        Integer numValueOf2 = null;
        if (!C285090BFj.LIZJ()) {
            C1578630rBN.LJIIJJI(this, new C1218910hpB(this, null));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS119S0100000_19(this, 82));
        }
        C0X35.LJIIJJI("mf_feed_assem_part_1", false);
        C0X35.LIZ("mf_feed_assem_part_2", false);
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        C0X35.LJIIJJI("mf_feed_assem_part_2", false);
        C0X35.LIZ("mf_feed_assem_part_3", false);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            this.LLJI.getValue();
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null) {
                IMainSAFLifecycleKt.findSAFExpLifecycleOwner(fragmentLJI2, (C19EG) null);
            }
            iFeedDebugService.LIZ();
        }
        C0X35.LJIIJJI("mf_feed_assem_part_3", false);
        C0X35.LIZ("mf_feed_assem_part_4", false);
        HomeViewPagerAbility homeViewPagerAbilityGo = Go();
        if (homeViewPagerAbilityGo != null) {
            homeViewPagerAbilityGo.LLJJI(new C1564220qo8() { // from class: X.0qxd
                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    String strUf;
                    C1440005kM.LIZ(new IEvent() { // from class: X.0Szp
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                    HomeViewPagerAbility homeViewPagerAbilityGo2 = this.LL.Go();
                    if (homeViewPagerAbilityGo2 == null || (strUf = homeViewPagerAbilityGo2.uf(i, false)) == null) {
                        strUf = "";
                    }
                    C1440005kM.LIZ(new C0T17(strUf));
                }
            });
        }
        HomeViewPagerAbility homeViewPagerAbilityGo2 = Go();
        if (homeViewPagerAbilityGo2 != 0) {
            homeViewPagerAbilityGo2.B60(new Observer() { // from class: X.0qxj
                /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1570170qxj.onChanged(java.lang.Object):void");
                }
            });
        }
        C0X35.LJIIJJI("mf_feed_assem_part_4", false);
        C0X35.LIZ("mf_feed_assem_part_5", false);
        HomeViewPagerAbility homeViewPagerAbilityGo3 = Go();
        if (homeViewPagerAbilityGo3 != null) {
            numValueOf = Integer.valueOf(homeViewPagerAbilityGo3.Im(0, false));
        } else {
            numValueOf = null;
        }
        HomeViewPagerAbility homeViewPagerAbilityGo4 = Go();
        if (homeViewPagerAbilityGo4 != null) {
            numValueOf2 = Integer.valueOf(homeViewPagerAbilityGo4.yz0());
        }
        this.LLJJI = Intrinsics.LJFF(numValueOf, numValueOf2);
        C0X35.LJIIJJI("mf_feed_assem_part_5", false);
        C0X35.LIZ("mf_feed_assem_part_6", false);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C01GW c01gw = C0BHP.LIZ;
            if (((Number) c01gw.getValue()).longValue() > -1) {
                C0CN5.LIZIZ(Long.valueOf(((Number) c01gw.getValue()).longValue()), new ARunnableS57S0300000_24(c19egLIZ, fragmentLJI, viewGroup, 3));
            } else {
                C1570120qxe.LIZ(c19egLIZ).vQ2(viewGroup, fragmentLJI, c19egLIZ);
            }
            if (((Boolean) C285090BFj.LJJIJIIJI.getValue()).booleanValue()) {
                this.LLJJIJI = false;
                this.LLJJJ = fragmentLJI;
                this.LLJJJIL = viewGroup;
                C786410Ut5.LJLIIL(2000L, (Handler) this.LLJJIJIIJIL.getValue(), (Runnable) this.LLJJIJIL.getValue());
            } else {
                C0X35.LIZ("mf_feed_assem_part_6_1", false);
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIIJJI(viewGroup, fragmentLJI);
                C0X35.LJIIJJI("mf_feed_assem_part_6_1", false);
            }
            C0X35.LIZ("mf_feed_assem_part_6_2", false);
            if (C1157804fw.LIZ()) {
                service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCoinPartial");
                }
            } else {
                service = ServiceManager.get().getService(ISearchService.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCoinPartial");
                }
            }
            ((InterfaceC1570140qxg) service).LJII();
            C0X35.LJIIJJI("mf_feed_assem_part_6_2", false);
        }
        C0X35.LJIIJJI("mf_feed_assem_part_6", false);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            ITemplateDebugService iTemplateDebugService = (ITemplateDebugService) ServiceManager.get().getService(ITemplateDebugService.class);
            this.LLJI.getValue();
            iTemplateDebugService.LIZ();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainFragmentScope.class}).bindAbility(this.LLIZLLLIL, IMFFeedAbility.class);
    }
}
