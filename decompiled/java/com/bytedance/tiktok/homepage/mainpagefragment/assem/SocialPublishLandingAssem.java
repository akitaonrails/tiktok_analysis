package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C09R3;
import X.C0AGO;
import X.C0CWK;
import X.C0CWL;
import X.C0IVP;
import X.C0LAB;
import X.C0PEM;
import X.C0QSJ;
import X.C0S78;
import X.C0SPF;
import X.C1076020e6i;
import X.C1311805Bk;
import X.C1388190mED;
import X.C13LE;
import X.C1433940nQ0;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1569350qwP;
import X.C1569360qwQ;
import X.C1570190qxl;
import X.C1570470qyD;
import X.C1583440rJ8;
import X.C1583510rJF;
import X.C1584320rKY;
import X.C1588570rRP;
import X.C1589640rT8;
import X.C1590800rV0;
import X.C1594980rbk;
import X.C1595430rcT;
import X.C1599640rjG;
import X.C15WT;
import X.C1601110rld;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C189200o6;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C2344809Gs;
import X.C260270AHx;
import X.C295190Bhd;
import X.C296080Bj4;
import X.C297720Bli;
import X.C313640CRe;
import X.C319860CgK;
import X.C446900Hfk;
import X.C452501pT;
import X.C563770M9f;
import X.C571860Mbo;
import X.C687700QyG;
import X.C703302op;
import X.C724240Sb0;
import X.C729450SjP;
import X.C735840Sti;
import X.C786410Ut5;
import X.C994010byR;
import X.EnumC696090RSd;
import X.InterfaceC1146704e9;
import X.InterfaceC1433950nQ1;
import X.InterfaceC1554640qYg;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1593660rZc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.story.StoryDelayPublishData;
import com.ss.android.ugc.aweme.story.api.IStoryPublishLandingAbility;
import com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialPublishLandingAssem extends BaseMainPageFragmentUIAssem implements IStoryPublishLandingAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C054G LLJ;
    public View LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public InterfaceC1433950nQ1 LLJJIII;
    public String LLJJIJI;
    public volatile MainPageBusinessAbility LLJJIJIIJIL;
    public volatile HomeViewPagerAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialPublishLandingAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SocialPublishLandingAssem.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1994490971) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Lo() {
        Object c098200Yq;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager;
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        c1589640rT8.q2();
        c1589640rT8.f3(true);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, "HOME", false);
        }
        MainPageBusinessAbility mainPageBusinessAbilityHo = Ho();
        if (mainPageBusinessAbilityHo != null) {
            mainPageBusinessAbilityHo.Db(false);
        }
        try {
            Fragment fragmentBQ2 = ((TabChangeManager) this.LLJILJILJ.getValue()).BQ2();
            if (fragmentBQ2 != 0) {
                IMFPubAbility iMFPubAbilityLIZJ = C1561720qk6.LIZJ(fragmentBQ2);
                if (iMFPubAbilityLIZJ != null) {
                    iMFPubAbilityLIZJ.gB1(31);
                }
                if (C297720Bli.LIZ()) {
                    HomeViewPagerAbility homeViewPagerAbilityDp = dp();
                    if (homeViewPagerAbilityDp != null) {
                        homeViewPagerAbilityDp.sZ(31, false);
                    }
                } else {
                    HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(fragmentBQ2);
                    if (homeViewPagerAbilityLIZIZ != null) {
                        homeViewPagerAbilityLIZIZ.sZ(31, false);
                    }
                }
                if ((fragmentBQ2 instanceof InterfaceC1593630rZZ) && ((InterfaceC1593630rZZ) fragmentBQ2).Qc()) {
                    C1440005kM.LIZ(new C1076020e6i());
                    hp();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeTabAfterPublishFriendsTabOnTop error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || !fragmentLJI.isAdded() || (baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJJ.getValue()) == null) {
            return;
        }
        baseScrollSwitchStateManager.KQ2(true);
    }

    public final C0QSJ cp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeViewPagerAbility dp() {
        HomeViewPagerAbility homeViewPagerAbility = this.LLJJIJIL;
        if (homeViewPagerAbility == null) {
            synchronized (this) {
                homeViewPagerAbility = this.LLJJIJIL;
                if (homeViewPagerAbility == null) {
                    C0QSJ c0qsjCp = cp();
                    HomeViewPagerAbility homeViewPagerAbility2 = c0qsjCp != null ? (HomeViewPagerAbility) c0qsjCp.getAbility(HomeViewPagerAbility.class) : null;
                    this.LLJJIJIL = homeViewPagerAbility2;
                    return homeViewPagerAbility2;
                }
            }
        }
        return homeViewPagerAbility;
    }

    public final void hp() {
        MutableLiveData<Boolean> mutableLiveData;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        if (c446900Hfk.LIZ(C724240Sb0.LIZ(this)).KQ2("HOME")) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            C786410Ut5.LJJJI("enterMethod", "publish_landing", bundle);
            c446900Hfk.LIZ(C724240Sb0.LIZ(this)).yQ2(bundle, "HOME");
            MainAnimViewModel mainAnimViewModel = (MainAnimViewModel) this.LLJILLL.getValue();
            if (mainAnimViewModel == null || (mutableLiveData = mainAnimViewModel.LLILZ) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.TRUE);
        }
    }

    public final void kp() throws JSONException {
        if (C1589640rT8.LIZIZ.F2()) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            c1584320rKY.getClass();
            C1584320rKY.LIZLLL(c19egLIZ, "FRIENDS_FEED");
            Lo();
        } else {
            C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            c1584320rKY2.getClass();
            C1584320rKY.LIZLLL(c19egLIZ2, "FRIENDS_TAB");
            Vo();
        }
        C1584320rKY.LIZ.getClass();
        C1584320rKY.LJ();
    }

    public SocialPublishLandingAssem() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LLJILJIL = C452501pT.LIZIZ(new C1590800rV0(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new C1569360qwQ(this));
        this.LLJILLL = C452501pT.LIZIZ(new C1570190qxl(this));
        this.LLJJ = C452501pT.LIZIZ(new C1570470qyD(this));
        this.LLJJI = C452501pT.LIZIZ(new C1569350qwP(this));
    }

    public final MainPageBusinessAbility Ho() {
        if (!C297720Bli.LIZ()) {
            return (MainPageBusinessAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MainPageBusinessAbility.class, null);
        }
        MainPageBusinessAbility mainPageBusinessAbility = this.LLJJIJIIJIL;
        if (mainPageBusinessAbility == null) {
            synchronized (this) {
                mainPageBusinessAbility = this.LLJJIJIIJIL;
                if (mainPageBusinessAbility == null) {
                    C0QSJ c0qsjCp = cp();
                    MainPageBusinessAbility mainPageBusinessAbility2 = c0qsjCp != null ? (MainPageBusinessAbility) c0qsjCp.getAbility(MainPageBusinessAbility.class) : null;
                    this.LLJJIJIIJIL = mainPageBusinessAbility2;
                    return mainPageBusinessAbility2;
                }
            }
        }
        return mainPageBusinessAbility;
    }

    public final void Vo() {
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZ, null));
            if (iBottomTabLayoutAbilityLJIIIZ != null) {
                iBottomTabLayoutAbilityLJIIIZ.vd0(true);
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            C786410Ut5.LJJJI("enter_method", "publish_landing", bundle);
            C1589640rT8.LIZIZ.f3(true);
            if (((Boolean) C260270AHx.LIZ.getValue()).booleanValue()) {
                C1599640rjG.LIZIZ.Wu();
            }
            Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, "FRIENDS_TAB", false);
            IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL2 = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZ, null));
            String strNk0 = iFriendsTabLayoutAbilityLIZLLL2 != null ? iFriendsTabLayoutAbilityLIZLLL2.nk0() : null;
            IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ2 = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZ, null));
            boolean zHv0 = iBottomTabLayoutAbilityLJIIIZ2 != null ? iBottomTabLayoutAbilityLJIIIZ2.hv0() : false;
            if (!Intrinsics.LJFF(strNk0, "FRIENDS_FEED") && zHv0 && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZ, null))) != null) {
                iFriendsTabLayoutAbilityLIZLLL.On0("FRIENDS_FEED");
            }
        }
        Context context = getContext();
        if (context != null) {
            C1595430rcT.LIZIZ.LIZJ().social2TabPublishLanding(context);
        }
    }

    public final void Zo() {
        if (C295190Bhd.LIZIZ()) {
            ap();
            return;
        }
        if (C0IVP.LIZ()) {
            mp("For You");
            return;
        }
        NoticeAbility noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), NoticeAbility.class, null);
        if (noticeAbility != null) {
            noticeAbility.GJ1();
        }
    }

    public final void ap() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            String strDQ2 = c446900Hfk.LIZ(c19egLIZ).DQ2("RootNode", false);
            String strDQ22 = c446900Hfk.LIZ(c19egLIZ).DQ2(strDQ2, false);
            if (Intrinsics.LJFF(strDQ2, "USER")) {
                return;
            }
            Hox hoxLIZ = c446900Hfk.LIZ(c19egLIZ);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", strDQ22, bundle);
            hoxLIZ.TQ2(bundle, "USER", false);
        }
    }

    public final void ep() throws JSONException {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getFollowerCount() < 5000) {
            if (C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab()) {
                if (C1589640rT8.LIZIZ.F2()) {
                    C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    c1584320rKY.getClass();
                    C1584320rKY.LIZLLL(c19egLIZ, "FRIENDS_FEED");
                    Lo();
                } else {
                    C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    c1584320rKY2.getClass();
                    C1584320rKY.LIZLLL(c19egLIZ2, "FRIENDS_TAB");
                    Vo();
                }
                C1584320rKY.LIZ.getClass();
                C1584320rKY.LJ();
                return;
            }
            if (C1601110rld.LIZ()) {
                Zo();
                return;
            } else if (C1588570rRP.LIZ()) {
                mp("Following");
                return;
            }
        } else if (C1588570rRP.LIZ()) {
            mp("Following");
            return;
        } else if (C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab()) {
            kp();
            return;
        } else if (C1601110rld.LIZ()) {
            Zo();
            return;
        }
        ap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1618440sDa.LIZIZ.LJJIFFI().LIZJ();
        C0S78.LJFF(true, new C0CWL(this));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0CWK(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C313640CRe(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyService = (IPublishResourceFirstPolicyService) PluggableExtentionKt.pluggableSpi$default(IPublishResourceFirstPolicyService.class, false, false, false, 14, null);
        if (iPublishResourceFirstPolicyService != null) {
            iPublishResourceFirstPolicyService.stop();
        }
        IPublishTelemetry iPublishTelemetry = (IPublishTelemetry) C1433940nQ0.LIZ.getValue();
        if (iPublishTelemetry != null) {
            iPublishTelemetry.LIZLLL(this.LLJJIJI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jo(boolean z) {
        Object c098200Yq;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager;
        IMFPubAbility iMFPubAbilityLIZJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, "HOME", false);
        }
        MainPageBusinessAbility mainPageBusinessAbilityHo = Ho();
        if (mainPageBusinessAbilityHo != null) {
            mainPageBusinessAbilityHo.Db(false);
        }
        try {
            Fragment fragmentBQ2 = ((TabChangeManager) this.LLJILJILJ.getValue()).BQ2();
            if (fragmentBQ2 != 0) {
                if (!z && (iMFPubAbilityLIZJ = C1561720qk6.LIZJ(fragmentBQ2)) != null) {
                    iMFPubAbilityLIZJ.gB1(35);
                }
                if (C297720Bli.LIZ()) {
                    HomeViewPagerAbility homeViewPagerAbilityDp = dp();
                    if (homeViewPagerAbilityDp != null) {
                        homeViewPagerAbilityDp.sZ(35, false);
                    }
                } else {
                    HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(fragmentBQ2);
                    if (homeViewPagerAbilityLIZIZ != null) {
                        homeViewPagerAbilityLIZIZ.sZ(35, false);
                    }
                }
                if ((fragmentBQ2 instanceof InterfaceC1593630rZZ) && ((InterfaceC1593630rZZ) fragmentBQ2).lm()) {
                    hp();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeTabAfterPublishExploreTabOnTop error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isAdded() && (baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJJ.getValue()) != null) {
            baseScrollSwitchStateManager.KQ2(true);
        }
    }

    public final boolean No(String str) {
        if (!Intrinsics.LJFF(str, "personal_homepage") && !Intrinsics.LJFF(str, "story_archive")) {
            if (!Intrinsics.LJFF(str, "notification_page") && !Intrinsics.LJFF(str, "chat") && !Intrinsics.LJFF(str, "member_list") && !Intrinsics.LJFF(str, "chat_page") && !Intrinsics.LJFF(str, "chat_room") && !Intrinsics.LJFF(str, "on_this_day_page")) {
                if (Intrinsics.LJFF(str, "homepage_hot") && C994010byR.LIZ.LIZ()) {
                    mp("For You");
                    return true;
                }
                if (Intrinsics.LJFF(str, "homepage_friends") && C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab() && (!C0IVP.LIZ() || !C319860CgK.LIZ())) {
                    Vo();
                    return true;
                }
                if (!Intrinsics.LJFF(str, "homepage_follow") || !C1588570rRP.LIZ()) {
                    return false;
                }
                mp("Following");
                return true;
            }
            Zo();
            return true;
        }
        ap();
        return true;
    }

    public final void So(boolean z) {
        Fragment fragmentKi;
        IMFPubAbility iMFPubAbilityLIZJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (!z && (fragmentKi = Hox.LLJILJIL.LIZ(c19egLIZ).Ki("HOME")) != null && (iMFPubAbilityLIZJ = C1561720qk6.LIZJ(fragmentKi)) != null) {
                iMFPubAbilityLIZJ.gB1(35);
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            if (!z) {
                C786410Ut5.LJJJI("enter_method", "publish_landing", bundle);
            } else {
                C786410Ut5.LJJJI("enter_method", "restore_back_to_detail", bundle);
            }
            Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, "homepage_explore", false);
        }
    }

    public final void bp(Intent intent) {
        C563770M9f c563770M9fLIZLLL;
        Context context = getContext();
        if (context != null && intent != null) {
            int intExtra = intent.getIntExtra("intent_story_widget_action", -1);
            String strGo = Go(intent, "enter_from");
            String str = "";
            if (strGo == null) {
                strGo = "";
            }
            String strGo2 = Go(intent, "enter_method");
            if (strGo2 != null) {
                str = strGo2;
            }
            if (intExtra == 2) {
                mp("HOME");
                EnterStoryParam enterStoryParam = new EnterStoryParam(null, str, strGo, null, null, strGo, null, null, null, false, false, false, 0, 0.0f, 0, null, null, null, null, null, null, false, null, false, null, null, 67108825, null);
                SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
                if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                    c563770M9fLIZLLL.openStoryRecordingPageDirectly(context, enterStoryParam, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.11JF] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, X.0nQ2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(android.content.Intent r21) throws org.json.JSONException {
        /*
            r20 = this;
            java.lang.String r0 = "enter_method"
            r5 = r21
            java.lang.String r4 = Go(r5, r0)
            java.lang.String r3 = ""
            if (r4 != 0) goto Ld
            r4 = r3
        Ld:
            java.lang.String r0 = "enter_from"
            java.lang.String r0 = Go(r5, r0)
            if (r0 == 0) goto L16
            r3 = r0
        L16:
            java.lang.String r0 = "multi_publish_id"
            java.lang.String r6 = Go(r5, r0)
            if (r6 == 0) goto Lb2
            r8 = r20
            r8.LLJJIJI = r6
            X.01GW r0 = X.C1433260nOu.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService r0 = (com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService) r0
            r2 = 0
            if (r0 == 0) goto Lb5
            X.0nQ1 r0 = r0.LIZIZ(r6)
        L31:
            r8.LLJJIII = r0
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r9 = com.ss.android.ugc.aweme.services.IExternalService.class
            r10 = 0
            r1 = 0
            r13 = 14
            r11 = r10
            r12 = r10
            r14 = r2
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r2 = r0.getPublishModel(r6)
        L4e:
            X.0nQ1 r9 = r8.LLJJIII
            if (r9 == 0) goto Lb3
            java.lang.String r0 = "creation_id"
            Go(r5, r0)
            com.ss.android.ugc.aweme.story.StoryDelayPublishData r0 = X.C571860Mbo.LIZ
            boolean r0 = r0.enable
            if (r0 == 0) goto Lb3
            X.19EG r7 = X.C724240Sb0.LIZ(r8)
            if (r7 == 0) goto Lb3
            X.00zU r12 = new X.00zU
            r12.<init>()
            X.00zU r11 = new X.00zU
            r11.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r1)
            X.0nQ2 r6 = new X.0nQ2
            r5 = r11
            r6.<init>()
            r11.element = r6
            X.0ziL r0 = X.C1906580ziK.LIZJ()
            X.09Pw r0 = r0.LJII()
            X.0nQ3 r13 = new X.0nQ3
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            r18 = r12
            r19 = r5
            r13.<init>()
            X.11JF r0 = r0.LJLLLLLL(r13)
            r12.element = r0
            androidx.fragment.app.FragmentManager r1 = r7.getSupportFragmentManager()
            T r0 = r5.element
            X.0VvC r0 = (X.AbstractC813200VvC) r0
            r5 = 1
            r1.LJZL(r0, r5)
        La3:
            com.ss.android.ugc.aweme.story.StoryDelayPublishData r0 = X.C571860Mbo.LIZ
            boolean r0 = r0.enableDelayPublishLanding
            if (r0 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            boolean r0 = r2.isStoryPublish
            if (r0 != r5) goto Lb2
            r8.Oo(r2, r3, r4)
        Lb2:
            return
        Lb3:
            r5 = 1
            goto La3
        Lb5:
            r0 = r2
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem.ip(android.content.Intent):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void mp(String str) {
        String str2;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            if (!Intrinsics.LJFF(c446900Hfk.LIZ(c19egLIZ).DQ2("RootNode", false), str)) {
                if (C0IVP.LIZ()) {
                    str2 = "For You";
                } else {
                    str2 = str;
                }
                switch (str2.hashCode()) {
                    case -1525083535:
                        if (str2.equals("Following")) {
                            if (FollowingSkylightAbilityOptConfig.LIZ()) {
                                Zo();
                            } else {
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJJI("enter_method", "publish_landing", bundle);
                                c19egLIZ.getIntent().putExtra("story_publish_landing_tab", "Following");
                                c446900Hfk.LIZ(c19egLIZ).TQ2(bundle, str, false);
                            }
                        }
                        break;
                    case -1309089240:
                        if (str2.equals("FRIENDS_FEED")) {
                            Bundle bundle2 = new Bundle();
                            C1589640rT8.LIZIZ.f3(true);
                            C786410Ut5.LJJJI("enter_method", "publish_landing", bundle2);
                            c446900Hfk.LIZ(c19egLIZ).TQ2(bundle2, str, false);
                        }
                        break;
                    case 2223327:
                        if (str2.equals("HOME")) {
                            c446900Hfk.LIZ(c19egLIZ).TQ2(new Bundle(), str, false);
                        }
                        break;
                    case 984907784:
                        if (str2.equals("For You")) {
                            if (!C0IVP.LIZ() && C1594980rbk.LIZ().avatarType > 0) {
                                Zo();
                            } else {
                                c446900Hfk.LIZ(c19egLIZ).TQ2(new Bundle(), str2, false);
                            }
                        }
                        break;
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC1570850qyp
    public final void onNewIntent(Intent intent) {
        Bundle bundle;
        C19EG c19egLIZIZ;
        FeedFragment feedFragment;
        try {
            StoryDelayPublishData storyDelayPublishData = C571860Mbo.LIZ;
            if (storyDelayPublishData.enable || storyDelayPublishData.enableDelayPublishLanding) {
                ip(intent);
            }
            String strGo = Go(intent, "shoot_way");
            if (!intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                String strGo2 = Go(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                String str = "";
                if (strGo2 == null) {
                    strGo2 = "";
                }
                if (C296080Bj4.LIZ()) {
                    String strGo3 = Go(intent, "extra_explore_back_detail");
                    if (strGo3 != null) {
                        str = strGo3;
                    }
                    if (C703302op.LIZ(str) && Intrinsics.LJFF(str, "1")) {
                        if (C1583440rJ8.LIZ()) {
                            So(true);
                        } else {
                            Jo(true);
                        }
                        if (((Number) C0AGO.LIZ.getValue()).intValue() != 0) {
                            C15WT.LIZIZ.LJJII();
                            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                            C19EG c19egLIZ = C724240Sb0.LIZ(this);
                            c1584320rKY.getClass();
                            C1584320rKY.LIZLLL(c19egLIZ, "homepage_explore");
                        }
                    }
                }
                if (strGo2.length() == 0) {
                    bp(intent);
                }
                if (Intrinsics.LJFF("FRIENDS_FEED", strGo2)) {
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                    if (c1589640rT8.l2()) {
                        C446900Hfk c446900Hfk = Hox.LLJILJIL;
                        Context context = getContext();
                        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                            Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
                            if ((fragmentKi instanceof FeedFragment) && (feedFragment = (FeedFragment) fragmentKi) != null) {
                                feedFragment.Oi(false);
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (c1589640rT8.F2()) {
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                        if (c19egLIZ2 != null) {
                            Hox.LLJILJIL.LIZ(c19egLIZ2).TQ2(bundle, "FRIENDS_TAB", false);
                            return;
                        }
                        return;
                    }
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                    if (c19egLIZ3 != null) {
                        Hox.LLJILJIL.LIZ(c19egLIZ3).TQ2(bundle, "FRIENDS_TAB", false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(strGo, "educate_phase_iii")) {
                ap();
            } else if (Intrinsics.LJFF(strGo, "educate_phase_iii_feedback")) {
                Zo();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2344809Gs.LJ(e2.getMessage());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        int iHashCode;
        Activity activityLIZ;
        super.onViewCreated(view);
        this.LLJI = view.findViewById(R.id.nwe);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initDataCenter: activity = ");
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Intent intent = null;
        if (c19egLIZ != null) {
            numValueOf = Integer.valueOf(c19egLIZ.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", dataCenter = ");
        Object value = this.LLJILJIL.getValue();
        if (value != null) {
            iHashCode = value.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C2188811AlT.LIZIZ(sbLIZ);
        DataCenter dataCenter = (DataCenter) this.LLJILJIL.getValue();
        if (dataCenter != null) {
            dataCenter.yQ2("changeTabAfterPublish", new Observer() { // from class: X.0rZY
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
                /* JADX WARN: Type inference failed for: r6v4 */
                /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v6 */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r12) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 573
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1593620rZY.onChanged(java.lang.Object):void");
                }
            }, true);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (activityLIZ = C1388190mED.LIZ(c19egLIZ2)) != null) {
            intent = activityLIZ.getIntent();
        }
        bp(intent);
    }

    public static String Go(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryPublishLandingAbility
    public final void Yo0(String str, String str2) throws JSONException {
        Oo(null, str, str2);
        lp(Boolean.TRUE, null, str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0134, code lost:
    
        if (r5.equals("click_view_lists_panel_camera_button") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0156, code lost:
    
        if (r5.equals("click_head_plus") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r5.equals("click_publish_card_create_new_story") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c4, code lost:
    
        if (r5.equals("friends_top_cell_camera") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01ce, code lost:
    
        if (r5.equals("friends_top_cell_avatar") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d8, code lost:
    
        if (r5.equals("click_publish_card_plus") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01dc, code lost:
    
        r0 = (com.ss.android.ugc.aweme.story.IStoryService) com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(com.ss.android.ugc.aweme.story.IStoryService.class, false, false, false, 14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ea, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01f0, code lost:
    
        if (r0.LJJJJLL() != true) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f2, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01f3, code lost:
    
        r0 = X.C994010byR.LIZ.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01f9, code lost:
    
        if (r13 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r0 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0203, code lost:
    
        if (X.C1589640rT8.LIZIZ.LIZ() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0205, code lost:
    
        kp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0237, code lost:
    
        ap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x023b, code lost:
    
        mp("FRIENDS_FEED");
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x023f, code lost:
    
        mp("Following");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ec, code lost:
    
        if (r5.equals("click_view_lists_panel_profile_plus") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        if (r5.equals("click_view_lists_panel_camera_icon") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011f, code lost:
    
        if (r5.equals("click_profile_photo") == false) goto L73;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[PHI: r9
      0x0052: PHI (r9v7 java.lang.String) = (r9v1 java.lang.String), (r9v8 java.lang.String) binds: [B:29:0x0050, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c A[PHI: r8 r9
      0x006c: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String) binds: [B:57:0x0098, B:36:0x0060, B:38:0x0064, B:40:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String) binds: [B:57:0x0098, B:36:0x0060, B:38:0x0064, B:40:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[PHI: r7 r8 r9
      0x0070: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:42:0x006e, B:40:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:42:0x006e, B:40:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r9v5 java.lang.String) = (r9v3 java.lang.String), (r9v6 java.lang.String) binds: [B:42:0x006e, B:40:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r9
      0x0097: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v7 java.lang.String), (r9v7 java.lang.String) binds: [B:29:0x0050, B:31:0x0054, B:33:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r19, java.lang.String r20, java.lang.String r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem.Oo(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void lp(Boolean bool, PublishModel publishModel, String str, String str2) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        StoryShootModel storyShootModel;
        String pipelineEnterFrom;
        String str3;
        C0SPF next;
        String scheduleId;
        String str4;
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ;
        String strCQ2 = ((TabChangeManager) this.LLJILJILJ.getValue()).CQ2();
        if (strCQ2 != null) {
            switch (strCQ2.hashCode()) {
                case -1965615457:
                    if (strCQ2.equals("Nearby")) {
                        strCQ2 = "homepage_nearby";
                    }
                    break;
                case -1382453013:
                    if (strCQ2.equals("NOTIFICATION")) {
                        strCQ2 = "notification_page";
                    }
                    break;
                case -734952021:
                    if (strCQ2.equals("FRIENDS_TAB")) {
                        strCQ2 = "homepage_friends";
                    }
                    break;
                case 2223327:
                    if (strCQ2.equals("HOME")) {
                        if (C297720Bli.LIZ()) {
                            homeViewPagerAbilityLIZIZ = dp();
                        } else {
                            Fragment fragmentBQ2 = ((TabChangeManager) this.LLJILJILJ.getValue()).BQ2();
                            if (fragmentBQ2 != null) {
                                homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(fragmentBQ2);
                            }
                        }
                        strCQ2 = homeViewPagerAbilityLIZIZ != null ? homeViewPagerAbilityLIZIZ.RD0(false) : null;
                    }
                    break;
                case 2614219:
                    if (strCQ2.equals("USER")) {
                        strCQ2 = "personal_homepage";
                    }
                    break;
            }
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC1593660rZc interfaceC1593660rZcLJ = c1618440sDa.LJJIFFI().LJ();
        if (interfaceC1593660rZcLJ != null) {
            if (publishModel != null) {
                str4 = publishModel.creationId;
            } else {
                str4 = null;
            }
            interfaceC1593660rZcLJ.LIZIZ(str4, strCQ2, Intrinsics.LJFF(bool, Boolean.TRUE));
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            if (publishModel != null) {
                str3 = publishModel.creationId;
            } else {
                str3 = null;
            }
            c735840Sti.getClass();
            List<C0SPF> listLIZ = c1618440sDa.LJJIFFI().LIZ();
            if (listLIZ != null) {
                Iterator<C0SPF> it2 = listLIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C729450SjP c729450SjP = next.LIZIZ;
                        if (c729450SjP.LIZIZ == EnumC696090RSd.UPLOADING) {
                            Aweme aweme = c729450SjP.LJ;
                            if (aweme != null) {
                                scheduleId = AwemeBizExtKt.getScheduleId(aweme);
                            } else {
                                scheduleId = null;
                            }
                            if (Intrinsics.LJFF(scheduleId, str3)) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                C0SPF c0spf = next;
                if (c0spf != null) {
                    C0LAB c0lab = new C0LAB();
                    C1609930rzr.LIZJ(c0lab, c0spf.LIZIZ, "head_status");
                    C20684815ws.LJIILLIIL("publish_landing_status_show", c0lab.LIZ);
                }
            }
        }
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return;
        }
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
            if (shootEnterMethod != null) {
                str2 = shootEnterMethod;
            }
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && (storyShootModel = creativeModel.storyModel) != null && (pipelineEnterFrom = storyShootModel.getPipelineEnterFrom()) != null) {
                str = pipelineEnterFrom;
            } else {
                String enterFrom = videoPublishEditModel.getEnterFrom();
                if (enterFrom != null) {
                    str = enterFrom;
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1311805Bk(str, strCQ2, str2, null), 3);
    }
}
