package com.ss.android.ugc.aweme.main.assems;

import X.AbstractActivityC1602020rn6;
import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C036E;
import X.C06KV;
import X.C07GX;
import X.C098200Yq;
import X.C09JN;
import X.C0CCZ;
import X.C0CLM;
import X.C0CN5;
import X.C0H62;
import X.C0QSJ;
import X.C0SHX;
import X.C0XPD;
import X.C0XQ7;
import X.C1030680cva;
import X.C1150504el;
import X.C1154980gA4;
import X.C123100dR;
import X.C1336210ksN;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1563110qmL;
import X.C1563170qmR;
import X.C1563200qmU;
import X.C1563210qmV;
import X.C1563730qnL;
import X.C1570330qxz;
import X.C1570640qyU;
import X.C1583460rJA;
import X.C1583510rJF;
import X.C1584420rKi;
import X.C1586430rNx;
import X.C1589950rTd;
import X.C1589980rTg;
import X.C1590000rTi;
import X.C1590010rTj;
import X.C1590020rTk;
import X.C1590040rTm;
import X.C1590110rTt;
import X.C1590120rTu;
import X.C1591880rWk;
import X.C1593730rZj;
import X.C1593820rZs;
import X.C1594160raQ;
import X.C15O7;
import X.C1617800sCY;
import X.C1618440sDa;
import X.C189200o6;
import X.C19212010Ec;
import X.C19724912Fj;
import X.C19EG;
import X.C1D0F;
import X.C1EE2;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2217381BqS;
import X.C2277881EDy;
import X.C2426709f7;
import X.C296200BjG;
import X.C343710Ddh;
import X.C443120HZe;
import X.C452501pT;
import X.C486860J7k;
import X.C520040KaQ;
import X.C581760Mrm;
import X.C591970NJr;
import X.C680080Qly;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799900VZk;
import X.C810670Vr7;
import X.C823050WQl;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC1589930rTb;
import X.EnumC992240bva;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1571580r00;
import X.InterfaceC1577600r9i;
import X.InterfaceC1577930rAF;
import X.InterfaceC1582030rGr;
import X.InterfaceC1583930rJv;
import X.InterfaceC1587410rPX;
import X.InterfaceC1603190roz;
import X.InterfaceC1670800ta2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACallableS411S0100000_3;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS30S0201000_24;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.bytedance.provider.impl.GScope;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.aweme.spi.IHomeTabSavedStateService;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class MainActivityBusinessAssem extends BaseMainContainerAssem implements MainBusinessAbility, MainActivityGlobalAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public String LL;
    public boolean LLILLJJLI;
    public boolean LLILZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public Intent LLJJI;
    public volatile IPerformanceAbility LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;
    public volatile boolean LLILLL = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1590000rTi());
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(221));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1589980rTg(this));
    public final MainActivityBusinessAssem LLJI = this;
    public final ArrayList<InterfaceC1571580r00> LLJJIII = new ArrayList<>();
    public final C1590110rTt LLJJIJI = new C0H62() { // from class: X.0rTt
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            final MainActivityBusinessAssem mainActivityBusinessAssem = this.LL;
            C09UZ.LIZ(new Runnable() { // from class: X.0rTs
                public final void LIZ() {
                    try {
                        NetworkInfo networkInfoY4 = C786410Ut5.y4((ConnectivityManager) mainActivityBusinessAssem.LLIZ.getValue(), 1);
                        mainActivityBusinessAssem.LLJ = networkInfoY4 != null && networkInfoY4.isConnected();
                        mainActivityBusinessAssem.fo();
                        if (mainActivityBusinessAssem.LLJ) {
                            return;
                        }
                        C1D0F.LIZ.LJIIL();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainActivityBusinessAssem@dc1b.networkResumeObservable$1$onChange$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityBusinessAssem@dc1b.networkResumeObservable$1$onChange$1");
                }
            });
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainActivityBusinessAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem.onCreate():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Intent intent;
        Intent intent2;
        Object c098200Yq;
        Window window;
        View decorView;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1590020rTk c1590020rTk;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityBusinessAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        this.LLILLL = false;
        String strBo = null;
        if (!this.LLILLJJLI && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C1590020rTk.class, null)) != null && (c1590020rTk = (C1590020rTk) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            c1590020rTk.LL = true;
        }
        this.LLILLJJLI = false;
        String str = this.LLJJ;
        if (str != null && (intent2 = this.LLJJI) != null) {
            this.LLJJ = null;
            this.LLJJI = null;
            try {
                m259do(intent2, EnumC992240bva.ON_NEW_INTENT, str);
                String strBo2 = bo(intent2, "extra_back_url");
                if (strBo2 != null && strBo2.length() != 0) {
                    this.LLJILLL = true;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        HandlerHook.viewPost(decorView, new ARunnableS119S0100000_19(this, 167));
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        fo();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (intent = c19egLIZ2.getIntent()) != null) {
            strBo = bo(intent, "pendingPopup");
        }
        if (C123100dR.LIZ(strBo) && !this.LLJIJIL) {
            SmartRouter.buildRoute(C724240Sb0.LIZ(this), strBo).open();
            this.LLJIJIL = true;
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 391341784) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility
    public final boolean RY0() {
        C1590020rTk c1590020rTk;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C1590020rTk.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1590020rTk = (C1590020rTk) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return false;
        }
        return c1590020rTk.LL;
    }

    public final void fo() {
        if (this.LLIZLLLIL && this.LLJ && !this.LLILLL) {
            C1D0F.LIZ.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String uP1() {
        String str = this.LL;
        return str == null ? getEnterFrom() : str;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final Aweme LJIIIIZZ() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return null;
        }
        return C680080Qly.LIZIZ(c19egLIZ).LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean Q6() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        return C0SHX.LIZ(c19egLIZ, null).LJI();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean QQ1() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        return cl0() && C486860J7k.LIZIZ(c19egLIZ).FQ2("page_feed");
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void Ug2() {
        this.LL = getEnterFrom();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean Wm() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        return C0SHX.LIZ(c19egLIZ, null).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean cl0() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ);
        if (!TextUtils.equals("HOME", tabChangeManagerLIZ.CQ2())) {
            C1593730rZj c1593730rZj = C1593730rZj.LIZIZ;
            String strCQ2 = tabChangeManagerLIZ.CQ2();
            if (strCQ2 == null) {
                strCQ2 = "";
            }
            if (!c1593730rZj.LIZLLL(strCQ2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String getEnterFrom() {
        InterfaceC1603190roz interfaceC1603190roz;
        String enterFrom;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        return (interfaceC1670800ta2LIZ == null || !(interfaceC1670800ta2LIZ instanceof InterfaceC1603190roz) || (interfaceC1603190roz = (InterfaceC1603190roz) interfaceC1670800ta2LIZ) == null || (enterFrom = interfaceC1603190roz.getEnterFrom()) == null) ? "" : enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean iq1() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ);
        return Intrinsics.LJFF("DISCOVER", tabChangeManagerLIZ.CQ2()) || Intrinsics.LJFF("FRIENDS_TAB", tabChangeManagerLIZ.CQ2()) || Intrinsics.LJFF("SERIES_DISCOVER", tabChangeManagerLIZ.CQ2());
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean isADShowing() {
        AbstractActivityC1602020rn6 abstractActivityC1602020rn6;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!(c19egLIZ instanceof MainActivity) || (abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) c19egLIZ) == null) {
            return false;
        }
        return abstractActivityC1602020rn6.isADShowing();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String jr0() {
        String strLJJLIIIJJI;
        FeedFragment feedFragmentUx;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return "";
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ);
        String strBQ2 = Hox.LLJILJIL.LIZ(c19egLIZ).BQ2();
        if (!TextUtils.isEmpty(strBQ2)) {
            return strBQ2;
        }
        if (TextUtils.isEmpty(tabChangeManagerLIZ.CQ2())) {
            return "homepage_hot";
        }
        String strCQ2 = tabChangeManagerLIZ.CQ2();
        if (TextUtils.equals(strCQ2, "HOME")) {
            Fragment fragmentBQ2 = tabChangeManagerLIZ.BQ2();
            if ((fragmentBQ2 instanceof MainFragment) && (feedFragmentUx = ((MainFragment) fragmentBQ2).ux()) != null) {
                if (feedFragmentUx instanceof FeedFollowFragment) {
                    return "homepage_follow";
                }
                if (feedFragmentUx instanceof FeedRecommendFragment) {
                    return "homepage_hot";
                }
                if (feedFragmentUx instanceof InterfaceC1577930rAF) {
                    return feedFragmentUx.LLILLJJLI;
                }
                if (feedFragmentUx instanceof InterfaceC1587410rPX) {
                    return "homepage_friends";
                }
                if (feedFragmentUx instanceof InterfaceC1582030rGr) {
                    return "homepage_nearby";
                }
                if (feedFragmentUx instanceof InterfaceC1577600r9i) {
                    return "homepage_series";
                }
                String enterFrom = feedFragmentUx.getEnterFrom();
                if (enterFrom != null && enterFrom.length() != 0) {
                    return feedFragmentUx.getEnterFrom();
                }
            }
        } else {
            if (TextUtils.equals(strCQ2, "DISCOVER")) {
                return "discovery";
            }
            if (TextUtils.equals(strCQ2, "SERIES_DISCOVER")) {
                return "series_discover";
            }
            if (TextUtils.equals(strCQ2, "FRIENDS_TAB")) {
                IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZ, null));
                return (iFriendsTabLayoutAbilityLIZLLL == null || (strLJJLIIIJJI = iFriendsTabLayoutAbilityLIZLLL.LJJLIIIJJI()) == null) ? "" : strLJJLIIIJJI;
            }
            if (TextUtils.equals(strCQ2, "Following")) {
                return "homepage_follow";
            }
            if (TextUtils.equals(strCQ2, "NOTIFICATION")) {
                return "notification_page";
            }
            if (TextUtils.equals(strCQ2, "USER")) {
                return C2277881EDy.LIZIZ.isI18nUserProfileFragment(tabChangeManagerLIZ.BQ2()) ? "others_homepage" : tabChangeManagerLIZ.BQ2() instanceof InterfaceC1583930rJv ? ((InterfaceC1583930rJv) tabChangeManagerLIZ.BQ2()).getEnterFrom() : "personal_homepage";
            }
            if (TextUtils.equals(strCQ2, "homepage_explore")) {
                return "homepage_explore";
            }
            if (TextUtils.equals(strCQ2, "Drama")) {
                return "homepage_series";
            }
        }
        return "homepage_hot";
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean oi2() {
        AdHomePageDataVM adHomePageDataVM;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        MainActivity mainActivity = c19egLIZ instanceof MainActivity ? (MainActivity) c19egLIZ : null;
        if (mainActivity == null || (adHomePageDataVM = mainActivity.adHomePageDataVM) == null) {
            return false;
        }
        return adHomePageDataVM.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0rTh] */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAssemLoaded() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem.onAssemLoaded():void");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onBeforeCreate() {
        super.onBeforeCreate();
        C19212010Ec.LIZJ.LJJJJLL();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewModelStore viewModelStore;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        ViewModelStore viewModelStore2;
        super.onDestroy();
        this.LLJILJILJ++;
        ((ArrayList) this.LLILZIL.getValue()).clear();
        C1591880rWk.LIZIZ.LIZLLL().LIZIZ();
        C581760Mrm.LIZ.getClass();
        if (C2214201BlK.LJIIJJI) {
            C581760Mrm.LIZIZ = true;
        }
        C1618440sDa.LIZIZ.clear();
        if (((Boolean) C1617800sCY.LIZJ.getValue()).booleanValue()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null && (viewModelStore2 = fragmentLIZLLL.getViewModelStore()) != null) {
                viewModelStore2.clear();
            }
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (viewModelStore = c19egLIZ.getViewModelStore()) != null) {
                viewModelStore.clear();
            }
        }
        ((ArrayList) C1590040rTm.LIZ).clear();
        GScope gScope = GScope.LL;
        C1558520qew.LJIIJJI(gScope, MainActivityGlobalAbility.class, null);
        C1554960qZC.LIZLLL(gScope, C1590020rTk.class, "source_default_key");
        C591970NJr.LIZIZ().LJI();
        C036E.LIZ.LIZLLL(this.LLJJIJI);
        EventBus.LIZLLL().LJJI(this);
        C1563730qnL.LLJ = null;
        C1563170qmR.LLJ = null;
        C1563210qmV.LLJ = null;
        C1563200qmU.LLJ = null;
        C1563110qmL.LLJ = null;
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        if (c1ee2.LJIJ()) {
            c1ee2.LJIILL();
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if ((c19egLIZ2 != null ? C960203pA.LIZIZ(c19egLIZ2) : false) != this.LLJILJIL) {
            IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
            if (iECommerceMallService != null) {
                iECommerceMallService.LJIJJ();
            }
            ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
            if (iTabIconService != null) {
                iTabIconService.LJFF();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        EventBus.LIZLLL().LJIJJ(this);
        C036E.LIZ.LIZ(this.LLJJIJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C1590020rTk c1590020rTk;
        super.onPause();
        this.LLILLL = true;
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.MAIN_LOSE_FOCUS);
        C581760Mrm.LIZIZ = false;
        C581760Mrm.LIZ.getClass();
        if (!C0CLM.LIZIZ) {
            C0CLM.LIZIZ = true;
            C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0CLL
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BootTypeLogger@94c8.monitorLifecycle$1");
                    if (((Boolean) obj).booleanValue()) {
                        C0CLM.LIZJ = true;
                    }
                    C1C7U.LIZIZ("BootTypeLogger@94c8.monitorLifecycle$1");
                }
            });
        }
        try {
            if (C1589950rTd.LIZIZ > 0) {
                C1589950rTd c1589950rTd = C1589950rTd.LIZ;
                String str = C1589950rTd.LIZJ;
                long jCurrentTimeMillis = System.currentTimeMillis() - C1589950rTd.LIZIZ;
                c1589950rTd.getClass();
                C1589950rTd.LIZ(jCurrentTimeMillis, str, "background");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C1590020rTk.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1590020rTk = (C1590020rTk) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            c1590020rTk.LL = false;
        }
        C1D0F.LIZ.LJIIL();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C19EG c19egLIZ;
        super.onStop();
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.MAIN_LOSE_FOCUS);
        C581760Mrm.LIZIZ = false;
        C1594160raQ.LIZ.LIZIZ = false;
        if (C1336210ksN.LIZ() || ((Boolean) C07GX.LIZJ.getValue()).booleanValue() || (c19egLIZ = C724240Sb0.LIZ(this)) == null || C2426709f7.LIZ) {
            return;
        }
        C15O7.LIZIZ(new ACallableS411S0100000_3(C786410Ut5.N3(c19egLIZ), 1), C823050WQl.LIZLLL(), null);
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String uP2() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return null;
        }
        return C680080Qly.LIZIZ(c19egLIZ).LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean cF0() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void XA(C1583460rJA c1583460rJA) {
        this.LLJJIII.remove(c1583460rJA);
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void allowSwipeLeft(boolean z) {
        AbstractActivityC1602020rn6 abstractActivityC1602020rn6;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if ((c19egLIZ instanceof MainActivity) && (abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) c19egLIZ) != null) {
            abstractActivityC1602020rn6.allowSwipeLeft(false);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLJI, MainBusinessAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean kh2(Context context) {
        return context instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strBo;
        String strBo2;
        String strBo3;
        String strBo4;
        String strBo5;
        boolean z;
        String strLJFF;
        List listLIZIZ;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityBusinessAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Intent intent = c19egLIZ.getIntent();
            try {
                strBo = bo(intent, FollowStatusChangeMethod.PARAM_UID);
            } catch (Throwable th) {
                th = th;
                strBo = null;
            }
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parsePushIntentParams push");
                sbLIZ.append(strBo);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                bo(intent, "insert_relation");
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                strBo2 = bo(intent, "ids");
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                strBo2 = null;
            }
            try {
                strBo3 = bo(intent, "push_params");
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                strBo3 = null;
            }
            try {
                strBo4 = bo(intent, "push_id");
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                strBo4 = null;
            }
            try {
                strBo5 = bo(intent, "gd_label");
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                strBo5 = null;
            }
            try {
            } catch (Throwable th8) {
                TryCatchGuardChecker.doCheck(th8);
            }
            if (intent.getIntExtra("with_filter_code", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            C1570330qxz c1570330qxz = C680080Qly.LIZIZ(c19egLIZ).LL;
            c1570330qxz.LIZIZ = strBo;
            c1570330qxz.LIZJ = strBo2;
            c1570330qxz.LIZLLL = strBo3;
            c1570330qxz.LJ = strBo4;
            c1570330qxz.LJFF = strBo5;
            c1570330qxz.LIZ = intent.getIntExtra("extra_push_flag", 0);
            c1570330qxz.LJI = z;
            C844470XAv.LIZ.getClass();
            String string = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "applog_stats").getString("app_track", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    C19724912Fj.LIZLLL().LJI(c19egLIZ, new JSONObject(string).optString("openurl"));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (bundle != null) {
                HomePageDataViewModel homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19egLIZ);
                bundle.getBoolean("should_show_slide_setting");
                homePageDataViewModelLIZIZ.getClass();
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                if (c19egLIZ3 == null) {
                    strLJFF = C1593730rZj.LIZIZ.LJFF();
                } else {
                    Intent intent2 = c19egLIZ3.getIntent();
                    if (intent2 != null && (strLJFF = bo(intent2, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) != null && strLJFF.length() != 0) {
                        if (C06KV.LIZIZ == null) {
                            C06KV.LIZIZ = new C06KV();
                        }
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ3);
                        if (c19egLIZIZ != null && (listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(c19egLIZIZ, null), DefaultBottomTabProtocol.class, false)) != null) {
                            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((DefaultBottomTabProtocol) it2.next()).op1();
                            }
                        }
                    } else {
                        IHomeTabSavedStateService.LIZ.getClass();
                        IHomeTabSavedStateService iHomeTabSavedStateServiceLIZ = C1586430rNx.LIZ();
                        if (iHomeTabSavedStateServiceLIZ == null || (strLJFF = iHomeTabSavedStateServiceLIZ.LIZIZ()) == null || strLJFF.length() == 0) {
                            C06KV c06kv = C06KV.LIZIZ;
                            if (c06kv == null) {
                                c06kv = new C06KV();
                                C06KV.LIZIZ = c06kv;
                            }
                            AtomicBoolean atomicBoolean = C06KV.LIZJ;
                            C1590010rTj c1590010rTj = new C1590010rTj(c06kv, c19egLIZ3);
                            if (!atomicBoolean.compareAndSet(false, true) || (strLJFF = (String) c1590010rTj.invoke()) == null) {
                                strLJFF = C1593730rZj.LIZIZ.LJFF();
                            }
                        }
                    }
                }
                if (!Intrinsics.LJFF("HOME", strLJFF)) {
                    C1030680cva.LJIILLIIL(c19egLIZ2, true);
                }
                if (Intrinsics.LJFF("NOTIFICATION", strLJFF) && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C0XPD.LIZIZ(c19egLIZ2, getEnterFrom(), "click_message", null, null);
                } else {
                    if (Intrinsics.LJFF("DISCOVER", strLJFF)) {
                        C486860J7k.LIZIZ(c19egLIZ2).KQ2(false);
                    }
                    if (bundle == null) {
                        m259do(c19egLIZ2.getIntent(), EnumC992240bva.COLD_BOOT, strLJFF);
                    }
                }
            }
            C1150504el.LIZ().LJI(strJ4, false);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        boolean z;
        super.onNewIntent(intent);
        String strBo = bo(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        String strBo2 = bo(intent, "multi_publish_id");
        String strBo3 = bo(intent, "extra_back_url");
        if ((strBo2 == null || strBo2.length() == 0) && (strBo3 == null || strBo3.length() == 0)) {
            z = false;
        } else {
            z = true;
        }
        if (this.LLJJIII.isEmpty() && strBo != null && strBo.length() != 0 && z && !C1593730rZj.LIZIZ.LJIIL(intent)) {
            this.LLJJ = strBo;
            this.LLJJI = intent;
        }
        ((ArrayList) this.LLILZIL.getValue()).add(intent);
        Iterator<InterfaceC1571580r00> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().onNewIntent(intent);
        }
        this.LLJIJIL = false;
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        this.LLIZLLLIL = true;
        fo();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLJI, MainBusinessAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void sC1(InterfaceC1571580r00 interfaceC1571580r00) {
        this.LLJJIII.add(interfaceC1571580r00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void yW0(C1593820rZs c1593820rZs) {
        Iterator it2 = ((ArrayList) this.LLILZIL.getValue()).iterator();
        while (it2.hasNext()) {
            c1593820rZs.invoke(it2.next());
        }
    }

    public static String bo(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean ho(Intent intent, String str) {
        if (intent.getIntExtra(str, 0) != 1 && !intent.getBooleanExtra(str, false) && !Intrinsics.LJFF(bo(intent, str), "1") && !u.LJIJI(bo(intent, str), "true", true)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void kE0(String str, boolean z) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C486860J7k.LIZIZ(c19egLIZ).kE0("page_feed", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (z && z2) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            C1590120rTu c1590120rTu = C1590120rTu.LIZIZ;
            C0CCZ c0cczLIZLLL = c1590120rTu.LIZLLL();
            c799900VZk.getClass();
            C799900VZk.LIZJ(c0cczLIZLLL);
            C799900VZk.LIZJ(c1590120rTu.LIZ());
            UserAccountImpl.LIZIZ().LIZ();
            C0CN5.LIZJ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new Runnable() { // from class: X.0rZz
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [T, X.19EG, android.content.Context] */
                public final void LIZ() {
                    Activity activity;
                    ?? LIZ = C724240Sb0.LIZ(this.LL);
                    String str = C2273301DyS.LJFF;
                    try {
                        if (C2162308dZ.LJI(LIZ) && C447530Hgl.LIZIZ.LIZ(false, true)) {
                            C259800zU c259800zU = new C259800zU();
                            c259800zU.element = LIZ;
                            if (LIZ == 0) {
                                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                Activity activityLIZIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null;
                                c259800zU.element = activityLIZIZ instanceof Activity ? activityLIZIZ : 0;
                            }
                            int i = C2273351DyX.LIZ;
                            if (i != 1) {
                                if (i != 2 || (activity = (Activity) c259800zU.element) == null) {
                                    return;
                                }
                                C447530Hgl.LIZ.getClass();
                                C447530Hgl.LIZ(activity);
                                return;
                            }
                            Activity activity2 = (Activity) c259800zU.element;
                            if (activity2 != null) {
                                activity2.runOnUiThread(new RunnableC514801zW(c259800zU, 4));
                            }
                            try {
                                C20684815ws.onEventV3("lang_update_toast_show");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainActivityBusinessAssem@dc1b.onWindowFocusChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityBusinessAssem@dc1b.onWindowFocusChanged$1");
                }
            }, false);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m259do(final Intent intent, EnumC992240bva enumC992240bva, String str) {
        final C19EG c19egLIZ;
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
        if (!Intrinsics.LJFF("HOME", str)) {
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ChangeTabProtocol.class, false);
            if (listLIZIZ == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                if (((ChangeTabProtocol) it2.next()).IW(c19egLIZ2, intent, str, enumC992240bva)) {
                    return;
                }
            }
        }
        if (C1593730rZj.LIZIZ.LJIILIIL(str)) {
            TabChangeManager.xQ2(C343710Ddh.LIZ(c19egLIZ2), str, false, null, 30);
        } else {
            Hox.LLJILJIL.LIZ(c19egLIZ2).TQ2(bundle, str, false);
        }
        if (!Intrinsics.LJFF(str, "HOME") || !ho(intent, "show_feed_sidebar") || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        final ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZ);
        final C1154980gA4 c1154980gA4 = new C1154980gA4(bo(intent, "minis_entrance_from"), ho(intent, "first_minis_guide"), ho(intent, "show_feed_sidebar_guide"));
        final int i = this.LLJILJILJ + 1;
        this.LLJILJILJ = i;
        C1570640qyU.LIZ.LIZ();
        C786410Ut5.LJJZZIII((Handler) this.LLILZLL.getValue(), new Runnable() { // from class: X.0qyJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainActivityBusinessAssem@dc1b.openRevisitFeedSidebarIfNeeded$1");
                try {
                    final MainActivityBusinessAssem mainActivityBusinessAssem = this;
                    final C19EG c19eg = c19egLIZ;
                    final Intent intent2 = intent;
                    final C1154980gA4 c1154980gA42 = c1154980gA4;
                    final ScrollSwitchStateManager scrollSwitchStateManager = scrollSwitchStateManagerLIZIZ;
                    final int i2 = i;
                    if (mainActivityBusinessAssem.LLJILJILJ == i2) {
                        if (scrollSwitchStateManager.GQ2()) {
                            mainActivityBusinessAssem.ko(c19eg, intent2, c1154980gA42, scrollSwitchStateManager, i2);
                        } else {
                            scrollSwitchStateManager.LLJJIJI.observe(c19eg, new Observer<Pair<? extends Boolean, ? extends Boolean>>() { // from class: X.0qyI
                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(Pair<? extends Boolean, ? extends Boolean> pair) {
                                    Pair<? extends Boolean, ? extends Boolean> pair2 = pair;
                                    MainActivityBusinessAssem mainActivityBusinessAssem2 = mainActivityBusinessAssem;
                                    if (mainActivityBusinessAssem2.LLJILJILJ == i2) {
                                        if (pair2.getFirst().booleanValue() && pair2.getSecond().booleanValue()) {
                                            scrollSwitchStateManager.LLJJIJI.removeObserver(this);
                                            mainActivityBusinessAssem.ko(c19eg, intent2, c1154980gA42, scrollSwitchStateManager, i2);
                                            return;
                                        }
                                        return;
                                    }
                                    scrollSwitchStateManager.LLJJIJI.removeObserver(this);
                                }
                            });
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainActivityBusinessAssem@dc1b.openRevisitFeedSidebarIfNeeded$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void k62(C19EG c19eg, String str, Object obj) {
        Integer numValueOf;
        MainActivity mainActivity;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putDataCenter: activity hashcode:");
        Integer numValueOf2 = null;
        if (c19eg != null) {
            numValueOf = Integer.valueOf(c19eg.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if ((c19eg instanceof MainActivity) && (mainActivity = (MainActivity) c19eg) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("putDataCenter: datacenter hashcode:");
            DataCenter dataCenter = mainActivity.mDataCenter;
            if (dataCenter != null) {
                numValueOf2 = Integer.valueOf(dataCenter.hashCode());
            }
            sbLIZ2.append(numValueOf2);
            C2188811AlT.LIZIZ(sbLIZ2);
            DataCenter dataCenter2 = mainActivity.mDataCenter;
            if (dataCenter2 != null) {
                dataCenter2.zQ2(obj, str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void ks0(Intent intent, EnumC992240bva enumC992240bva, String str) {
        m259do(intent, enumC992240bva, str);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        HomePageDataViewModel homePageDataViewModelLIZIZ;
        boolean zOnActivityResult = super.onActivityResult(i, i2, intent);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19egLIZ)) != null) {
            ((LiveData) homePageDataViewModelLIZIZ.LLJJIJI.getValue()).setValue(new C443120HZe(Integer.valueOf(i), Integer.valueOf(i2), intent));
        }
        return zOnActivityResult;
    }

    public final void ko(C19EG c19eg, Intent intent, C1154980gA4 c1154980gA4, ScrollSwitchStateManager scrollSwitchStateManager, int i) {
        if (this.LLJILJILJ == i) {
            if (!c19eg.isFinishing() && !c19eg.isDestroyed()) {
                IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
                if (iHomeSidebarService != null && iHomeSidebarService.LIZIZ(c1154980gA4)) {
                    intent.removeExtra("show_feed_sidebar");
                    intent.removeExtra("first_minis_guide");
                    intent.removeExtra("show_feed_sidebar_guide");
                    intent.removeExtra("minis_entrance_from");
                    C786410Ut5.LJLIIL(800L, (Handler) this.LLILZLL.getValue(), new ARunnableS30S0201000_24(i, this, scrollSwitchStateManager, 6));
                    return;
                }
                if (this.LLJILJILJ == i) {
                    intent.removeExtra("show_feed_sidebar");
                    intent.removeExtra("first_minis_guide");
                    intent.removeExtra("show_feed_sidebar_guide");
                    intent.removeExtra("minis_entrance_from");
                    C1570640qyU.LIZ.LIZ();
                    return;
                }
                return;
            }
            if (this.LLJILJILJ == i) {
                intent.removeExtra("show_feed_sidebar");
                intent.removeExtra("first_minis_guide");
                intent.removeExtra("show_feed_sidebar_guide");
                intent.removeExtra("minis_entrance_from");
                C1570640qyU.LIZ.LIZ();
            }
        }
    }
}
