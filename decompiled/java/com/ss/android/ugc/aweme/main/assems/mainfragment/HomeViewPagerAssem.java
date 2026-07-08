package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C052X;
import X.C08TN;
import X.C09R3;
import X.C0AG1;
import X.C0BU8;
import X.C0CAU;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0CN5;
import X.C0QSJ;
import X.C0S4G;
import X.C0S78;
import X.C0X35;
import X.C0XQ7;
import X.C10R5;
import X.C10RS;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1569330qwN;
import X.C1570150qxh;
import X.C1570170qxj;
import X.C1570180qxk;
import X.C1570280qxu;
import X.C1570290qxv;
import X.C1570310qxx;
import X.C1576740r8K;
import X.C1581690rGJ;
import X.C1584540rKu;
import X.C1589670rTB;
import X.C1589700rTE;
import X.C1589730rTH;
import X.C1589740rTI;
import X.C1589750rTJ;
import X.C1591350rVt;
import X.C1591880rWk;
import X.C1592450rXf;
import X.C1601090rlb;
import X.C179900mb;
import X.C19EG;
import X.C1A5L;
import X.C1AF0;
import X.C21600219g8;
import X.C21600519gB;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C277200Ati;
import X.C289020BUm;
import X.C296200BjG;
import X.C312240CLu;
import X.C343710Ddh;
import X.C446900Hfk;
import X.C452501pT;
import X.C486860J7k;
import X.C497820Jfg;
import X.C637920P0k;
import X.C687700QyG;
import X.C690440R6k;
import X.C704270Rjt;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799900VZk;
import X.C810650Vr5;
import X.EnumC1581350rFl;
import X.InterfaceC1055440dZW;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1570590qyP;
import X.InterfaceC1581610rGB;
import X.InterfaceC1582030rGr;
import X.InterfaceC1583870rJp;
import X.InterfaceC1589690rTD;
import X.InterfaceC1589720rTG;
import X.InterfaceC1589760rTK;
import X.InterfaceC1589770rTL;
import X.InterfaceC1603190roz;
import X.InterfaceC1770806wc;
import X.InterfaceC21604319gn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObserverS226S0100000_24;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.service.IAccountOutBridgeService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.experiment.TabPreloadTimingConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.homepage.IHomePageExService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.lynx.ActivityTabContainerFragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeViewPagerAssem extends UIContentAssem implements HomeViewPagerAbility, InterfaceC1570590qyP, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public InterfaceC1589720rTG LLJI;
    public View LLJILLL;
    public ScrollSwitchStateManager LLJJIII;
    public Hox LLJJIJI;
    public volatile MainBusinessAbility LLJJJ;
    public volatile HomeTabAbility LLJJJIL;
    public InterfaceC665370Q7z LLJJJJ;
    public C0QSJ LLJJJJJIL;
    public final HomeViewPagerAssem LLIZLLLIL = this;
    public final C01GW LLJ = C452501pT.LIZIZ(new C1570150qxh(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1570280qxu(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1570290qxv(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1570310qxx(this));
    public final List<InterfaceC469360Ias> LLJJ = new ArrayList();
    public final List<Observer<C1570180qxk>> LLJJI = new ArrayList();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1569330qwN(this));
    public int LLJJIJIL = 1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HomeViewPagerAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(HomeViewPagerAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2002560905) {
            return null;
        }
        return this;
    }

    public final C0QSJ Go() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJJJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJJJJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final int Ho() {
        InterfaceC1589690rTD interfaceC1589690rTDOo;
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG == null || (interfaceC1589690rTDOo = Oo()) == null) {
            return -1;
        }
        return interfaceC1589690rTDOo.Vd(interfaceC1589720rTG.getCurrentItemCompat(), false);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final Integer LJIL() {
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG != null) {
            return Integer.valueOf(interfaceC1589720rTG.getCurrentItemCompat());
        }
        return null;
    }

    public final HomeTabAbility Lo() {
        HomeTabAbility homeTabAbility = this.LLJJJIL;
        if (homeTabAbility == null) {
            synchronized (this) {
                homeTabAbility = this.LLJJJIL;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    HomeTabAbility homeTabAbility2 = c0qsjGo != null ? (HomeTabAbility) c0qsjGo.getAbility(HomeTabAbility.class) : null;
                    this.LLJJJIL = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }

    public final HomePageDataViewModel No() {
        return (HomePageDataViewModel) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC1589690rTD Oo() {
        return (InterfaceC1589690rTD) this.LLJILJIL.getValue();
    }

    public final ITabStrip So() {
        return (ITabStrip) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean VM2() {
        return this.LLJI != null;
    }

    public final C21600219g8 Vo() {
        Object obj = this.LLJI;
        if (obj instanceof C21600219g8) {
            return (C21600219g8) obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean Wk() {
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        return interfaceC1589720rTG != null && interfaceC1589720rTG.Wk();
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void sm() {
        C21600219g8 c21600219g8;
        Object obj = this.LLJI;
        if (!(obj instanceof C21600219g8) || (c21600219g8 = (C21600219g8) obj) == null) {
            return;
        }
        c21600219g8.LLILLJJLI.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void F7() {
        ITabStrip iTabStripSo = So();
        C1592450rXf c1592450rXfLV0 = iTabStripSo != null ? iTabStripSo.LV0() : null;
        if (!(c1592450rXfLV0 instanceof InterfaceC1770806wc) || c1592450rXfLV0 == null) {
            return;
        }
        c1592450rXfLV0.LIZ(No().LLJJI, 0);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int Nf0() {
        return No().LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final String P1() {
        HomeTabAbility homeTabAbilityLo = Lo();
        if (homeTabAbilityLo != null) {
            return homeTabAbilityLo.Ct0();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int P81() {
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo == null) {
            return 0;
        }
        IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
        int iIm = interfaceC1589690rTDOo.Im(iHomePageExService != null ? iHomePageExService.LJIL() : 0, false);
        boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
        if (SharePrefCache.inst().getIsChangeFollowTab().LIZ().booleanValue() && zIsLogin) {
            iIm = interfaceC1589690rTDOo.Im(1, false);
        }
        return iIm < 0 ? interfaceC1589690rTDOo.getCount() - 1 : iIm;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean ZF2() {
        if (Vo() != null) {
            return !r0.LLLJIL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int gk1() {
        return Ho();
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean kL1() {
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT;
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo == null) {
            return false;
        }
        Fragment currentFragment = interfaceC1589690rTDOo.getCurrentFragment();
        if (currentFragment instanceof FeedRecommendFragment) {
            RecommendFeedFragmentPanel recommendFeedFragmentPanel = ((FeedRecommendFragment) currentFragment).LLIZLLLIL;
            return (recommendFeedFragmentPanel == null || (awemeLJIIIIZZ2 = recommendFeedFragmentPanel.LJIIIIZZ()) == null || !Zo(awemeLJIIIIZZ2)) ? false : true;
        }
        if (!(currentFragment instanceof SocialFriendsFeedFragment)) {
            return (currentFragment instanceof FeedFollowFragment) && (followFeedFragmentPanelMT = ((FeedFollowFragment) currentFragment).LLJJJ) != null && (awemeLJIIIIZZ = followFeedFragmentPanelMT.LJIIIIZZ()) != null && Zo(awemeLJIIIIZZ);
        }
        Aweme awemeLJIIIIZZ3 = ((SocialFriendsFeedFragment) currentFragment).LLJ.LJIIIIZZ();
        return awemeLJIIIIZZ3 != null && Zo(awemeLJIIIIZZ3);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int lV1() {
        int iYz0 = yz0();
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            return interfaceC1589690rTDOo.Vd(iYz0, false);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void n31() {
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null) {
            iTabStripSo.db1(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        HomeTabAbility homeTabAbilityLo;
        ITabStrip iTabStripSo;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        ITabStrip iTabStripSo2 = So();
        if (iTabStripSo2 != null) {
            iTabStripSo2.onDestroy();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI instanceof AbsFragment) && fragmentLJI != null && (iTabStripSo = So()) != null) {
            iTabStripSo.VP2();
        }
        if (C296200BjG.LIZ()) {
            homeTabAbilityLo = Lo();
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null) {
                return;
            } else {
                homeTabAbilityLo = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), HomeTabAbility.class, null);
            }
        }
        if (homeTabAbilityLo != null) {
            homeTabAbilityLo.nJ1(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG == null) {
            return;
        }
        int currentItemCompat = interfaceC1589720rTG.getCurrentItemCompat();
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null) {
            iTabStripSo.Lc(currentItemCompat, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int yz0() {
        ITabStrip iTabStripSo;
        String strU31;
        HomeTabAbility homeTabAbilityLo;
        List<TopTabProtocol> listB9;
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo == null) {
            return 0;
        }
        IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
        int iIm = interfaceC1589690rTDOo.Im(iHomePageExService != null ? iHomePageExService.LJIL() : 0, false);
        boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
        if (SharePrefCache.inst().getIsChangeFollowTab().LIZ().booleanValue()) {
            if (zIsLogin) {
                iIm = interfaceC1589690rTDOo.Im(1, false);
            }
        } else if (zIsLogin && (iTabStripSo = So()) != null && (strU31 = iTabStripSo.U31(false)) != null && !a0.LJJJIL(strU31)) {
            if (C296200BjG.LIZ()) {
                homeTabAbilityLo = Lo();
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    homeTabAbilityLo = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), HomeTabAbility.class, null);
                }
            }
            if (homeTabAbilityLo != null && (listB9 = homeTabAbilityLo.b9()) != null) {
                Iterator<TopTabProtocol> it2 = listB9.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    String tag = it2.next().getTag();
                    ITabStrip iTabStripSo2 = So();
                    if (Intrinsics.LJFF(tag, iTabStripSo2 != null ? iTabStripSo2.U31(false) : null)) {
                        iIm = i;
                    }
                    i = i2;
                }
            }
        }
        return iIm < 0 ? interfaceC1589690rTDOo.getCount() - 1 : iIm;
    }

    public static boolean Zo(Aweme aweme) {
        User author;
        if (AwemeExtKt.isAdTraffic(aweme) || AwemeExtKt.isPseudoAd(aweme) || ((author = aweme.getAuthor()) != null && author.isAdFake())) {
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null && author2.isAdVirtual()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void A6(InterfaceC21604319gn interfaceC21604319gn) {
        C21600219g8 c21600219g8;
        Object obj = this.LLJI;
        if ((obj instanceof C21600219g8) && (c21600219g8 = (C21600219g8) obj) != null) {
            c21600219g8.LLILLJJLI.LIZLLL(interfaceC21604319gn);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void B60(C1570170qxj c1570170qxj) {
        ((ArrayList) this.LLJJI).add(c1570170qxj);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void F9(boolean z) {
        C21600219g8 c21600219g8;
        Object obj = this.LLJI;
        if ((obj instanceof C21600219g8) && (c21600219g8 = (C21600219g8) obj) != null) {
            c21600219g8.setEnableTouchSlopMultiple(z);
        }
    }

    public final Fragment Jo(int i) {
        try {
            InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
            if (interfaceC1589690rTDOo != null) {
                return interfaceC1589690rTDOo.Nk(i, false);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final Fragment Ki(String str) {
        Integer numValueOf;
        InterfaceC1589690rTD interfaceC1589690rTDOo;
        ITabStrip iTabStripSo = So();
        if (iTabStripSo == null || (numValueOf = Integer.valueOf(iTabStripSo.Jk0(str))) == null || numValueOf.intValue() == -1 || (interfaceC1589690rTDOo = Oo()) == null) {
            return null;
        }
        return interfaceC1589690rTDOo.Nk(numValueOf.intValue(), false);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void LLIFFJFJJ(boolean z) {
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG != null) {
            interfaceC1589720rTG.LLIFFJFJJ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        ((ArrayList) this.LLJJ).add(interfaceC469360Ias);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final String RD0(boolean z) {
        InterfaceC1589690rTD interfaceC1589690rTDOo;
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG == null || (interfaceC1589690rTDOo = Oo()) == null) {
            return null;
        }
        return interfaceC1589690rTDOo.LIZJ(interfaceC1589720rTG.getCurrentItemCompat());
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Ti(int i) {
        this.LLJJIJIL = i;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean Y11(String str) {
        C1581690rGJ c1581690rGJ;
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo instanceof C1581690rGJ) {
            c1581690rGJ = (C1581690rGJ) interfaceC1589690rTDOo;
        } else {
            c1581690rGJ = null;
        }
        if (c1581690rGJ == null || !c1581690rGJ.LJJIL(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[LOOP:0: B:39:0x0090->B:41:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(int r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip r0 = r4.So()
            if (r0 == 0) goto L9
            r0.zg2()
        L9:
            boolean r0 = X.C297720Bli.LIZ()
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLJJJ
            if (r0 != 0) goto L3b
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLJJJ     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            X.0QSJ r1 = r4.Go()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L2a
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L2e
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0     // Catch: java.lang.Throwable -> L2e
        L26:
            r4.LLJJJ = r0     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            goto L39
        L2a:
            r0 = 0
            goto L26
        L2c:
            monitor-exit(r4)
            goto L3b
        L2e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L31:
            X.0Q7z r0 = X.C1558520qew.LJIIL(r4)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1058560deY.LIZJ(r0)
        L39:
            if (r0 == 0) goto L3e
        L3b:
            r0.Ug2()
        L3e:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip r1 = r4.So()
            if (r1 == 0) goto L4b
            r0 = 0
            java.lang.String r3 = r1.uf(r5, r0)
            if (r3 != 0) goto L4d
        L4b:
            java.lang.String r3 = ""
        L4d:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip r0 = r4.So()
            if (r0 == 0) goto L56
            r0.onPageSelected(r5)
        L56:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r4.LLJJIII
            if (r0 == 0) goto L63
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r0.LLJJJJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.setValue(r0)
        L63:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "toPage"
            X.C786410Ut5.LJJJI(r0, r3, r2)
            java.lang.String r1 = "fromStart"
            java.lang.String r0 = "MainFragment"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.lang.String r0 = "scene_tab_top_fragment_page_selected_hox_dispatch"
            X.C1582020rGq.LJ(r0)
            java.lang.String r1 = "HomeViewPagerAssem"
            X.0rTF r0 = new X.0rTF
            r0.<init>(r4, r5, r2)
            X.C0VY3.LIZIZ(r1, r0)
            java.lang.String r0 = "scene_tab_top_fragment_page_selected_hox_dispatch"
            X.C1582020rGq.LIZLLL(r0)
            java.util.List<X.0Ias> r0 = r4.LLJJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L90:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r1.next()
            X.0Ias r0 = (X.InterfaceC469360Ias) r0
            r0.onPageSelected(r5)
            goto L90
        La0:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip r0 = r4.So()
            if (r0 == 0) goto La9
            r0.XQ1()
        La9:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPageSelected: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1581650rGF.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem.ap(int):void");
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        ((ArrayList) this.LLJJ).remove(interfaceC469360Ias);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLIZLLLIL, HomeViewPagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void ju(int i) {
        C21600219g8 c21600219g8;
        Object obj = this.LLJI;
        if ((obj instanceof C21600219g8) && (c21600219g8 = (C21600219g8) obj) != null) {
            c21600219g8.setSlideAngle(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void l8(InterfaceC21604319gn interfaceC21604319gn) {
        C21600219g8 c21600219g8;
        Object obj = this.LLJI;
        if ((obj instanceof C21600219g8) && (c21600219g8 = (C21600219g8) obj) != null) {
            c21600219g8.LLILLJJLI.LIZIZ(interfaceC21604319gn);
        }
    }

    @C14EU(threadMode = ThreadMode.POSTING)
    public final void onRestartAppEvent(C1589730rTH c1589730rTH) {
        Bundle bundle;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        if (!(getContext() instanceof InterfaceC1603190roz)) {
            IAccountOutBridgeService iAccountOutBridgeService = (IAccountOutBridgeService) PluggableExtentionKt.pluggableSpi$default(IAccountOutBridgeService.class, false, false, false, 14, null);
            if (iAccountOutBridgeService != null) {
                if (c1589730rTH == null || (bundle = c1589730rTH.LIZ) == null) {
                    bundle = new Bundle();
                }
                iAccountOutBridgeService.LIZ(bundle);
                return;
            }
            return;
        }
        c19egLIZ.finishAndRemoveTask();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZ, "//main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTimeLineTabEvent(C1589750rTJ c1589750rTJ) {
        AbsFragment absFragment;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof AbsFragment) || (absFragment = (AbsFragment) fragmentLJI) == null || !absFragment.isViewValid()) {
            return;
        }
        Boolean boolLIZ = SharePrefCache.inst().getShowTimeLineTab().LIZ();
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            boolLIZ.booleanValue();
            interfaceC1589690rTDOo.LJ();
        }
        InterfaceC1589690rTD interfaceC1589690rTDOo2 = Oo();
        if (interfaceC1589690rTDOo2 != null) {
            interfaceC1589690rTDOo2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        PagerAdapter pagerAdapter;
        HomeTabAbility homeTabAbilityLo;
        int currentItemCompat;
        String strLJ;
        C1592450rXf c1592450rXfLV0;
        C21600219g8 c21600219g8Vo;
        boolean zLIZ;
        Integer num;
        this.LLJILLL = view.findViewById(R.id.yhw);
        view.findViewById(R.id.viewpager).setBackgroundColor(-16777216);
        InterfaceC1589720rTG interfaceC1589720rTG = (InterfaceC1589720rTG) view.findViewById(R.id.viewpager);
        boolean zBooleanValue = false;
        if (C0S4G.LIZ() && C0BU8.LIZIZ) {
            interfaceC1589720rTG.setDefaultGutterSize(0);
        }
        this.LLJI = interfaceC1589720rTG;
        ((LiveData) No().LLJJIJIL.getValue()).observe(this, new AObserverS226S0100000_24(this, 3));
        C2271391DvN.LIZ((View) this.LLJI, (C1A5L) C2271381DvM.LJJ.getValue());
        Object obj = this.LLJI;
        if (obj instanceof C21600219g8) {
            C21600219g8 c21600219g8 = (C21600219g8) obj;
            c21600219g8.LLLILZJ = (int) (c21600219g8.LLLILZJ * 1.0f);
            c21600219g8.LLLIL = (int) (c21600219g8.LLLIL * 1.0f);
            c21600219g8.setExpDuration(0);
            ((C21600219g8) this.LLJI).setPageOffset(0.0f);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LLJJIII = C486860J7k.LIZIZ(c19egLIZ);
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            this.LLJJIJI = c446900Hfk.LIZ(c19egLIZ);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == 0) {
                return;
            }
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            C10RS.LIZ().LJFF("MainFragment onViewCreated");
            C08TN.LIZ().LJ("main_fragment_misc", false);
            if (((Number) C0AG1.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int iLIZJ = C497820Jfg.LIZJ(c19egLIZ);
                LJJIJL().findViewById(R.id.w0u).getLayoutParams().height = iLIZJ;
                C0S78.LIZJ(new C179900mb(iLIZJ, iLIZJ, false), true);
            } else {
                C799900VZk c799900VZk = C799900VZk.LIZ;
                IPreDrawableInflate iPreDrawableInflateLJJ = C1591880rWk.LIZIZ.LJJ();
                c799900VZk.getClass();
                Object value = ((IPreDrawableInflate) C799900VZk.LIZLLL(iPreDrawableInflateLJJ)).getValue("status_bar_height");
                if (value instanceof Integer) {
                    Number number = (Number) value;
                    LJJIJL().findViewById(R.id.w0u).getLayoutParams().height = number.intValue();
                    C0S78.LIZJ(new C179900mb(C497820Jfg.LIZJ(c19egLIZ), number.intValue(), true), true);
                } else {
                    int iLIZJ2 = C497820Jfg.LIZJ(c19egLIZ);
                    LJJIJL().findViewById(R.id.w0u).getLayoutParams().height = iLIZJ2;
                    C0S78.LIZJ(new C179900mb(iLIZJ2, iLIZJ2, false), true);
                }
            }
            C21600219g8 c21600219g8Vo2 = Vo();
            if (c21600219g8Vo2 != null) {
                C1589670rTB c1589670rTB = new C1589670rTB((InterfaceC1589760rTK) fragmentLJI, (C21600519gB) c21600219g8Vo2);
                if (C1601090rlb.LIZIZ() && C0X35.LJIIL("optimize_boot_perf_delay_tab_ui_top")) {
                    C704270Rjt.LIZ(new ARunnableS93S0200000_24(this, c1589670rTB, 52));
                } else if (C1601090rlb.LIZLLL()) {
                    C0CN5.LIZJ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new ARunnableS93S0200000_24(this, c1589670rTB, 53), false);
                } else {
                    ITabStrip iTabStripSo = So();
                    if (iTabStripSo != null) {
                        iTabStripSo.Xr0(c1589670rTB, C0S4G.LIZ());
                    }
                }
            }
            C21600219g8 c21600219g8Vo3 = Vo();
            if (c21600219g8Vo3 != null) {
                OptValue optValueLIZ = C1589740rTI.LIZ();
                if (optValueLIZ != null && (num = optValueLIZ.isEnableSlideParamsOpt) != null && num.intValue() == 1) {
                    zLIZ = false;
                } else {
                    zLIZ = C0S4G.LIZ();
                }
                c21600219g8Vo3.setOptimizeSlideEnable(zLIZ);
            }
            C19EG c19eg = null;
            if (C052X.LIZIZ()) {
                C0CM3 c0cm3 = new C0CM3();
                c0cm3.LIZ = C0CME.FIRST_UI_FRAME;
                c0cm3.LIZIZ = C052X.LIZIZ();
                c0cm3.LIZJ = C0CMJ.TOP_PRIORITY.getType();
                c0cm3.LJFF = "fyp_fragment_reorder";
                c0cm3.LJI = new C1589700rTE(this);
                C312240CLu.LIZ(c0cm3);
            } else {
                C21600219g8 c21600219g8Vo4 = Vo();
                if (c21600219g8Vo4 != null) {
                    Object objOo = Oo();
                    if (objOo instanceof C1581690rGJ) {
                        pagerAdapter = (PagerAdapter) objOo;
                    } else {
                        pagerAdapter = null;
                    }
                    c21600219g8Vo4.setAdapter(pagerAdapter);
                }
            }
            C21600219g8 c21600219g8Vo5 = Vo();
            if (c21600219g8Vo5 != null) {
                c21600219g8Vo5.LLLLLIL.LJFF(c19egLIZ.getWindow(), ((Boolean) C1591350rVt.LIZIZ.getValue()).booleanValue());
            }
            TabPreloadTimingConfig tabPreloadTimingConfigLIZ = C1584540rKu.LIZ();
            if (tabPreloadTimingConfigLIZ != null && tabPreloadTimingConfigLIZ.topTabPreloadConfig != null && (c21600219g8Vo = Vo()) != null) {
                InterfaceC1055440dZW interfaceC1055440dZW = new InterfaceC1055440dZW() { // from class: X.0rTC
                    @Override // X.InterfaceC1055440dZW
                    public final void LIZ(int i, int i2) {
                        String strUf;
                        HomeTabAbility homeTabAbilityLo2;
                        InterfaceC1583870rJp interfaceC1583870rJpVR1;
                        InterfaceC1589850rTT interfaceC1589850rTTLJII;
                        ITabStrip iTabStripSo2 = this.LIZ.So();
                        if (iTabStripSo2 != null && (strUf = iTabStripSo2.uf(i, false)) != null && !a0.LJJJIL(strUf) && (homeTabAbilityLo2 = this.LIZ.Lo()) != null && (interfaceC1583870rJpVR1 = homeTabAbilityLo2.vR1(strUf)) != null && (interfaceC1589850rTTLJII = interfaceC1583870rJpVR1.LJII()) != null) {
                            ITabStrip iTabStripSo3 = this.LIZ.So();
                            if (iTabStripSo3 != null) {
                                iTabStripSo3.U31(false);
                            }
                            interfaceC1589850rTTLJII.LIZ(new C1589790rTN(strUf));
                        }
                    }
                };
                if (c21600219g8Vo.LLLLLLLZIL == null) {
                    c21600219g8Vo.LLLLLLLZIL = new CopyOnWriteArrayList<>();
                }
                c21600219g8Vo.LLLLLLLZIL.add(interfaceC1055440dZW);
            }
            C21600219g8 c21600219g8Vo6 = Vo();
            if (c21600219g8Vo6 != null) {
                c21600219g8Vo6.LIZLLL(new InterfaceC469360Ias() { // from class: X.0rTA
                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        int iIntValue;
                        List<C0DMT> list = C1582020rGq.LIZ;
                        HomeViewPagerAssem homeViewPagerAssem = this.LL;
                        TabSwitchMetricService.LIZ.getClass();
                        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                        if (tabSwitchMetricServiceLIZ != null) {
                            tabSwitchMetricServiceLIZ.LJI();
                            C1593220rYu c1593220rYu = C1593220rYu.LIZ;
                            Integer numLJIL = homeViewPagerAssem.LJIL();
                            if (numLJIL != null) {
                                iIntValue = numLJIL.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            String strUf = homeViewPagerAssem.uf(iIntValue, false);
                            if (strUf == null) {
                                strUf = "";
                            }
                            C1593220rYu.LIZ(i, strUf);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("scene_tab_top_fragment_page_scroll_state_");
                        sbLIZ.append(i);
                        C1582020rGq.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        ScrollSwitchStateManager scrollSwitchStateManager = this.LL.LLJJIII;
                        if (scrollSwitchStateManager != null) {
                            scrollSwitchStateManager.LLJJJJJIL.setValue(Integer.valueOf(i));
                        }
                        ITabStrip iTabStripSo2 = this.LL.So();
                        if (iTabStripSo2 != null) {
                            iTabStripSo2.onPageScrollStateChanged(i);
                        }
                        Iterator it2 = ((ArrayList) this.LL.LLJJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC469360Ias) it2.next()).onPageScrollStateChanged(i);
                        }
                        List<C0DMT> list2 = C1582020rGq.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("scene_tab_top_fragment_page_scroll_state_");
                        sbLIZ2.append(i);
                        C1582020rGq.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                        String strCt0;
                        C1582020rGq.LJ("scene_tab_top_fragment_page_selected");
                        HomeTabAbility homeTabAbilityLo2 = this.LL.Lo();
                        String strUf = null;
                        if (homeTabAbilityLo2 != null) {
                            strCt0 = homeTabAbilityLo2.Ct0();
                        } else {
                            strCt0 = null;
                        }
                        ITabStrip iTabStripSo2 = this.LL.So();
                        if (iTabStripSo2 != null) {
                            strUf = iTabStripSo2.uf(i, false);
                        }
                        TabSwitchMetricService.LIZ.getClass();
                        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                        if (tabSwitchMetricServiceLIZ != null) {
                            tabSwitchMetricServiceLIZ.LIZLLL(strUf, EnumC1593230rYv.PRELOAD);
                        }
                        this.LL.ap(i);
                        C1582020rGq.LIZLLL("scene_tab_top_fragment_page_selected");
                        TabSwitchMetricService tabSwitchMetricServiceLIZ2 = C1204000hR8.LIZ();
                        if (tabSwitchMetricServiceLIZ2 != null) {
                            tabSwitchMetricServiceLIZ2.LJI();
                            C1593220rYu c1593220rYu = C1593220rYu.LIZ;
                            C1593220rYu.LIZIZ(this.LL.Lo(), strCt0, strUf);
                        }
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                        ScrollSwitchStateManager scrollSwitchStateManager = this.LL.LLJJIII;
                        if (scrollSwitchStateManager != null) {
                            scrollSwitchStateManager.LLJJJJLIIL.setValue(new C443120HZe<>(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
                        }
                        ITabStrip iTabStripSo2 = this.LL.So();
                        if (iTabStripSo2 != null) {
                            iTabStripSo2.onPageScrolled(i, f, i2);
                        }
                        Iterator<InterfaceC469360Ias> it2 = this.LL.LLJJ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onPageScrolled(i, f, i2);
                        }
                    }
                });
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLJJIII;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.LLJJL.observe((LifecycleOwner) this.LLJ.getValue(), new AObserverS226S0100000_24(this, 27));
            }
            if (fragmentLJI.getFragmentManager() == null) {
                C1AF0.LIZ("add protocol, fragment.fragmentManager is null");
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS93S0200000_24(fragmentLJI, this, 54));
            } else {
                if (C296200BjG.LIZ()) {
                    homeTabAbilityLo = Lo();
                } else {
                    homeTabAbilityLo = (HomeTabAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), HomeTabAbility.class, null);
                }
                if (homeTabAbilityLo != null) {
                    homeTabAbilityLo.GM0(this);
                }
            }
            ITabStrip iTabStripSo2 = So();
            if (iTabStripSo2 != null && (c1592450rXfLV0 = iTabStripSo2.LV0()) != null) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LIZJ(c1592450rXfLV0);
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLJJIII;
            if (scrollSwitchStateManager2 != null) {
                scrollSwitchStateManager2.LLJJJJLIIL.observe((LifecycleOwner) this.LLJ.getValue(), new Observer() { // from class: X.0Rsi
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        C19EG c19egLIZ2;
                        Context context;
                        if (((Number) ((C443120HZe) obj2).getThird()).intValue() != 0) {
                            this.LL.LLJJIJIL = 2;
                        }
                        HomeViewPagerAssem homeViewPagerAssem = this.LL;
                        homeViewPagerAssem.getClass();
                        try {
                            if (C0S4G.LIZ() && (c19egLIZ2 = C724240Sb0.LIZ(homeViewPagerAssem)) != null && c19egLIZ2.getWindow() != null) {
                                View decorView = c19egLIZ2.getWindow().getDecorView();
                                if (decorView.getBackground() == null && (context = homeViewPagerAssem.getContext()) != null) {
                                    decorView.setBackgroundColor(C960203pA.LIZ(R.attr.bx, context));
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                });
            }
            ScrollSwitchStateManager scrollSwitchStateManager3 = this.LLJJIII;
            if (scrollSwitchStateManager3 != null) {
                scrollSwitchStateManager3.LLJJJJ.observe((LifecycleOwner) this.LLJ.getValue(), new AObserverS226S0100000_24(this, 26));
            }
            C0CM3 c0cm32 = new C0CM3();
            c0cm32.LIZ = C0CME.FIRST_UI_FRAME;
            c0cm32.LIZIZ = C052X.LIZIZ();
            c0cm32.LIZJ = C0CMJ.TOP_PRIORITY.getType();
            c0cm32.LJFF = "fyp_fragment_reorder";
            c0cm32.LJI = new AwS425S0200000_24(this, c19egLIZ, 80);
            C312240CLu.LIZ(c0cm32);
            InterfaceC1589720rTG interfaceC1589720rTG2 = this.LLJI;
            if (interfaceC1589720rTG2 != null) {
                currentItemCompat = interfaceC1589720rTG2.getCurrentItemCompat();
            } else {
                currentItemCompat = 1;
            }
            No().LLJJI = currentItemCompat;
            C08TN.LIZ().LJI("main_fragment_misc");
            C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
            if (c1576740r8KLIZ != null) {
                c1576740r8KLIZ.LIZJ(false);
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                Bundle bundle = new Bundle();
                String str = "For You";
                if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                    C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
                    c446900Hfk.LIZ(c19egLIZ2).TQ2(bundle, "For You", false);
                } else {
                    C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
                    Hox hoxLIZ = c446900Hfk.LIZ(c19egLIZ2);
                    IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
                    if (iHomePageExService != null && (strLJ = iHomePageExService.LJ()) != null) {
                        str = strLJ;
                    }
                    hoxLIZ.TQ2(bundle, str, false);
                }
            }
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZ);
            scrollSwitchStateManagerLIZIZ.getClass();
            Boolean bool = Boolean.TRUE;
            Pair<Boolean, Boolean> value2 = scrollSwitchStateManagerLIZIZ.LLJJIJI.getValue();
            if (value2 != null) {
                zBooleanValue = value2.getSecond().booleanValue();
            }
            scrollSwitchStateManagerLIZIZ.LLJJIJI.setValue(new Pair<>(bool, Boolean.valueOf(zBooleanValue)));
            FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
            if (c19egLIZ instanceof InterfaceC1603190roz) {
                c19eg = c19egLIZ;
            }
            feedInfraTimingSensor.getClass();
            FeedInfraTimingSensor.LLILLJJLI = new WeakReference<>(c19eg);
            C0CM3 c0cm33 = new C0CM3();
            c0cm33.LIZIZ = true;
            c0cm33.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
            c0cm33.LJFF = "FeedInfra_attachMainActivity";
            c0cm33.LJI = AFwS198S0000000_11.get$arr$(23);
            C312240CLu.LIZ(c0cm33);
            return;
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLIZLLLIL, HomeViewPagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void setBackgroundColor(int i) {
        C21600219g8 c21600219g8Vo = Vo();
        if (c21600219g8Vo != null) {
            c21600219g8Vo.setBackgroundColor(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void AX0(int i, Fragment fragment) {
        InterfaceC1589770rTL interfaceC1589770rTLTO;
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLJJIII;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLJJJIL = new WeakReference<>(fragment);
        }
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null && (interfaceC1589770rTLTO = iTabStripSo.tO()) != null) {
            interfaceC1589770rTLTO.LIZ(i, fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int Im(int i, boolean z) {
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            return interfaceC1589690rTDOo.Im(0, z);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Lc(int i, int i2) {
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null) {
            iTabStripSo.Lc(i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final Fragment Nk(int i, boolean z) {
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            return interfaceC1589690rTDOo.Nk(i, z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int Vd(int i, boolean z) {
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            return interfaceC1589690rTDOo.Vd(i, z);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void sZ(int i, boolean z) {
        InterfaceC1589690rTD interfaceC1589690rTDOo;
        InterfaceC1589720rTG interfaceC1589720rTG;
        String strUf;
        FeedFragment feedFragment;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (interfaceC1589690rTDOo = Oo()) != null && (interfaceC1589720rTG = this.LLJI) != null && i != -1 && interfaceC1589690rTDOo.Vd(interfaceC1589720rTG.getCurrentItemCompat(), false) != i) {
            if (Oo() != null) {
                Fragment currentFragment = interfaceC1589690rTDOo.getCurrentFragment();
                if ((currentFragment instanceof FeedFragment) && (feedFragment = (FeedFragment) currentFragment) != null) {
                    feedFragment.NR(true);
                }
            }
            if (z) {
                Bundle bundle = new Bundle();
                String strLJII = interfaceC1589690rTDOo.LJII(i);
                C786410Ut5.LJJJI("toPage", strLJII, bundle);
                C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
                Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, strLJII, false);
                return;
            }
            int iIm = interfaceC1589690rTDOo.Im(i, false);
            Bundle bundle2 = new Bundle();
            ITabStrip iTabStripSo = So();
            if (iTabStripSo == null || (strUf = iTabStripSo.uf(iIm, false)) == null) {
                strUf = "";
            }
            C786410Ut5.LJJJI("toPage", strUf, bundle2);
            C786410Ut5.LJJJI("fromStart", "MainFragment", bundle2);
            Hox.LLJILJIL.LIZ(c19egLIZ).RQ2(iIm, bundle2, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final String uf(int i, boolean z) {
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null) {
            return iTabStripSo.uf(i, z);
        }
        return null;
    }

    @Override // X.InterfaceC1570590qyP
    public final void x5(List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
        C21600219g8 c21600219g8Vo;
        HomeTabAbility homeTabAbilityLo;
        List listL32;
        TopTabAbility topTabAbility;
        ITabStrip iTabStripSo = So();
        if (iTabStripSo != null) {
            iTabStripSo.dq0();
        }
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo != null) {
            interfaceC1589690rTDOo.notifyDataSetChanged();
        }
        C21600219g8 c21600219g8Vo2 = Vo();
        if (c21600219g8Vo2 != null) {
            c21600219g8Vo2.setCurrentItem(yz0());
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (C296200BjG.LIZ()) {
                homeTabAbilityLo = Lo();
            } else {
                homeTabAbilityLo = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), HomeTabAbility.class, null);
            }
            if (homeTabAbilityLo == null || (listL32 = homeTabAbilityLo.l32()) == null) {
                listL32 = C13BV.INSTANCE;
            }
            C1591880rWk.LIZIZ.LJ(C724240Sb0.LIZ(c19egLIZ), listL32);
            if (!Intrinsics.LJFF(C343710Ddh.LIZ(c19egLIZ).CQ2(), "HOME") && (topTabAbility = (TopTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), TopTabAbility.class, null)) != null) {
                topTabAbility.uC2();
            }
        }
        C01GW c01gw = C277200Ati.LIZ;
        if ((((Number) c01gw.getValue()).intValue() == 0 || ((Number) c01gw.getValue()).intValue() == 1) && (c21600219g8Vo = Vo()) != null) {
            C637920P0k.LIZ(c21600219g8Vo, new ARunnableS124S0100000_24(this, 43));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Cl2(int i, boolean z, boolean z2) {
        Integer numLJIL = LJIL();
        InterfaceC1589720rTG interfaceC1589720rTG = this.LLJI;
        if (interfaceC1589720rTG != null) {
            interfaceC1589720rTG.LLFFF(i, z);
        }
        if (numLJIL != null && numLJIL.intValue() == i && z2) {
            ap(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean rS0(String str, String str2, boolean z) throws JSONException {
        InterfaceC1589720rTG interfaceC1589720rTG;
        FeedFragment feedFragment;
        EnumC1581350rFl enumC1581350rFl;
        AssemSupervisor assemSupervisorLIZJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        InterfaceC1589690rTD interfaceC1589690rTDOo = Oo();
        if (interfaceC1589690rTDOo == null || (interfaceC1589720rTG = this.LLJI) == null) {
            return false;
        }
        Fragment currentFragment = interfaceC1589690rTDOo.getCurrentFragment();
        if (!(currentFragment instanceof FeedFragment) || (feedFragment = (FeedFragment) currentFragment) == 0) {
            return false;
        }
        int iVd = interfaceC1589690rTDOo.Vd(interfaceC1589720rTG.getCurrentItemCompat(), false);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI instanceof MainFragment) && fragmentLJI != null && (assemSupervisorLIZJ = C724240Sb0.LIZJ(fragmentLJI)) != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1581610rGB) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1581610rGB) it2.next()).u5(iVd, z);
            }
        }
        if (iVd != 0) {
            if (iVd != 1) {
                if (iVd == 33) {
                    C810650Vr5.LIZ(getContext(), str, "homepage_popular");
                }
            } else {
                C810650Vr5.LIZ(getContext(), str, "homepage_follow");
            }
        } else {
            C810650Vr5.LIZ(getContext(), str, "homepage_hot");
        }
        if (feedFragment instanceof FeedFollowFragment) {
            return ((FeedFollowFragment) feedFragment).Bl(str, str2, z);
        }
        if (feedFragment instanceof InterfaceC1582030rGr) {
            if (Intrinsics.LJFF(str, "refresh")) {
                if (((InterfaceC1582030rGr) feedFragment).oe()) {
                    return true;
                }
                feedFragment.Oi(z);
                return true;
            }
            feedFragment.Oi(z);
            return true;
        }
        if ((feedFragment instanceof SocialFriendsFeedFragment) && ((Intrinsics.LJFF(str, "refresh") || Intrinsics.LJFF(str, "homepage_refresh")) && (Intrinsics.LJFF(str2, "click_top_icon") || Intrinsics.LJFF(str2, "click_bottom_icon")))) {
            if (!C289020BUm.LIZ()) {
                return true;
            }
            ((SocialFriendsFeedFragment) feedFragment).xK(str2, z);
            return true;
        }
        if (feedFragment instanceof FeedRecommendFragment) {
            if (Intrinsics.LJFF(str2, "click_top_icon")) {
                enumC1581350rFl = EnumC1581350rFl.CLICK_TOP;
            } else if (Intrinsics.LJFF(str2, "click_bottom_icon")) {
                enumC1581350rFl = EnumC1581350rFl.CLICK_BOTTOM;
            } else {
                enumC1581350rFl = EnumC1581350rFl.PULL_DOWN_REFRESH;
            }
            return ((FeedRecommendFragment) feedFragment).Xo(enumC1581350rFl);
        }
        if (feedFragment instanceof ActivityTabContainerFragment) {
            ((ActivityTabContainerFragment) feedFragment).ZR(str2, z);
            return true;
        }
        return feedFragment.Oi(z);
    }
}
