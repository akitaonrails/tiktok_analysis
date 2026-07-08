package com.ss.android.ugc.aweme.homepage.msadapt;

import X.AbstractC1583710rJZ;
import X.C01GW;
import X.C0QSJ;
import X.C0SPE;
import X.C0T2Y;
import X.C1308910kAL;
import X.C148G;
import X.C14EU;
import X.C15PK;
import X.C1620350sGf;
import X.C1697810uHb;
import X.C19212010Ec;
import X.C19EH;
import X.C2188811AlT;
import X.C23053091n;
import X.C2411309cd;
import X.C299020Bno;
import X.C335910DEv;
import X.C446900Hfk;
import X.C452501pT;
import X.C486860J7k;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C740740T3w;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC335920DEw;
import X.InterfaceC1146704e9;
import X.InterfaceC1209250hZb;
import X.InterfaceC1218550hob;
import X.InterfaceC1399350mWD;
import X.InterfaceC1570710qyb;
import X.InterfaceC1585180rLw;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1603190roz;
import X.InterfaceC1767820w6W;
import X.InterfaceC687730QyJ;
import X.InterfaceC817550W5h;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DoubleFragmentMainActivity extends BaseActivity implements InterfaceC1603190roz, InterfaceC1218550hob, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0jJCojKSIpZyHELIOSIgKSEtOTt9DCo5KyM2DjctLiI2JjEBKCY9CSY4IDk6PDw=";
    public C15PK LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(188));
    public InterfaceC817550W5h LLILLL;
    public Fragment LLILZ;
    public AmeBaseFragment LLILZIL;
    public Fragment LLILZLL;
    public int LLIZ;
    public HomeTabAbility LLIZLLLIL;
    public BackRefreshStrategyAbility LLJ;
    public HomePageViewPagerAbility LLJI;
    public MainBusinessAbility LLJIJIL;
    public MainDialogAbility LLJILJIL;
    public BottomTabAbility LLJILJILJ;
    public HomeViewPagerAbility LLJILLL;
    public MainPageBusinessAbility LLJJ;
    public InterfaceC1767820w6W LLJJI;
    public PhotoClearModeOwnerAbility LLJJIII;
    public IPerformanceAbility LLJJIJI;

    public final void LLLLLZL() {
        Fragment fragmentLLLLZI = LLLLZI(false);
        if (fragmentLLLLZI == null) {
            return;
        }
        if (!TextUtils.equals(fragmentLLLLZI.getTag(), "duo_detail")) {
            getSupportFragmentManager().LJLLILLLL();
            return;
        }
        int i = this.LLIZ;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                getSupportFragmentManager().LJLLILLLL();
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.LLIZ = 0;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == HomeTabAbility.class) {
            this.LLIZLLLIL = (HomeTabAbility) obj;
        } else if (cls == BackRefreshStrategyAbility.class) {
            this.LLJ = (BackRefreshStrategyAbility) obj;
        } else if (cls == HomePageViewPagerAbility.class) {
            this.LLJI = (HomePageViewPagerAbility) obj;
        } else if (cls == MainBusinessAbility.class) {
            this.LLJIJIL = (MainBusinessAbility) obj;
        } else if (cls == MainDialogAbility.class) {
            this.LLJILJIL = (MainDialogAbility) obj;
        } else if (cls == BottomTabAbility.class) {
            this.LLJILJILJ = (BottomTabAbility) obj;
        } else if (cls == HomeViewPagerAbility.class) {
            this.LLJILLL = (HomeViewPagerAbility) obj;
        } else if (cls == MainPageBusinessAbility.class) {
            this.LLJJ = (MainPageBusinessAbility) obj;
        } else if (cls == InterfaceC1767820w6W.class) {
            this.LLJJI = (InterfaceC1767820w6W) obj;
        } else if (cls == PhotoClearModeOwnerAbility.class) {
            this.LLJJIII = (PhotoClearModeOwnerAbility) obj;
        } else if (cls == IPerformanceAbility.class) {
            this.LLJJIJI = (IPerformanceAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == HomeTabAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == BackRefreshStrategyAbility.class) {
            return this.LLJ;
        }
        if (cls == HomePageViewPagerAbility.class) {
            return this.LLJI;
        }
        if (cls == MainBusinessAbility.class) {
            return this.LLJIJIL;
        }
        if (cls == MainDialogAbility.class) {
            return this.LLJILJIL;
        }
        if (cls == BottomTabAbility.class) {
            return this.LLJILJILJ;
        }
        if (cls == HomeViewPagerAbility.class) {
            return this.LLJILLL;
        }
        if (cls == MainPageBusinessAbility.class) {
            return this.LLJJ;
        }
        if (cls == InterfaceC1767820w6W.class) {
            return this.LLJJI;
        }
        if (cls == PhotoClearModeOwnerAbility.class) {
            return this.LLJJIII;
        }
        if (cls == IPerformanceAbility.class) {
            return this.LLJJIJI;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1603190roz
    public final void onKeyBack() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == HomeTabAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == BackRefreshStrategyAbility.class) {
            this.LLJ = null;
        } else if (cls == HomePageViewPagerAbility.class) {
            this.LLJI = null;
        } else if (cls == MainBusinessAbility.class) {
            this.LLJIJIL = null;
        } else if (cls == MainDialogAbility.class) {
            this.LLJILJIL = null;
        } else if (cls == BottomTabAbility.class) {
            this.LLJILJILJ = null;
        } else if (cls == HomeViewPagerAbility.class) {
            this.LLJILLL = null;
        } else if (cls == MainPageBusinessAbility.class) {
            this.LLJJ = null;
        } else if (cls == InterfaceC1767820w6W.class) {
            this.LLJJI = null;
        } else if (cls == PhotoClearModeOwnerAbility.class) {
            this.LLJJIII = null;
        } else if (cls == IPerformanceAbility.class) {
            this.LLJJIJI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1603190roz
    public final Fragment getCurFragment() {
        return (Fragment) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1603190roz
    public final InterfaceC1570710qyb getMainHelper() {
        return new InterfaceC1570710qyb() { // from class: X.0rn4
            @Override // X.InterfaceC1570710qyb
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1570710qyb
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1570710qyb
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1570710qyb
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1570710qyb
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.InterfaceC1570710qyb
            public final void onCreate() {
            }
        };
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", true);
        super.onResume();
        if (!C148G.LJFF(this)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", false);
    }

    @Override // X.InterfaceC1603190roz
    public final String getEnterFrom() {
        InterfaceC1593630rZZ interfaceC1593630rZZLJIIIIZZ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJIIIIZZ(this);
        if (!(interfaceC1593630rZZLJIIIIZZ != null && interfaceC1593630rZZLJIIIIZZ.Ik()) && interfaceC1593630rZZLJIIIIZZ != null) {
            if (interfaceC1593630rZZLJIIIIZZ.Vp()) {
                return "homepage_follow";
            }
            if (interfaceC1593630rZZLJIIIIZZ.UH()) {
                return "homepage_nearby";
            }
        }
        return "homepage_hot";
    }

    @Override // X.InterfaceC1218550hob
    public final InterfaceC1209250hZb getHelper() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).obtainSwitchHelper(this, null, null);
    }

    @Override // X.InterfaceC1603190roz
    public final boolean isDuoDualMode() {
        if (C148G.LJ(this)) {
            return C148G.LJFF(this);
        }
        return false;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(this)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//duo");
            smartRouteBuildRoute.withParam("duo_type", "duo_back");
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    public final Fragment LLLLZI(boolean z) {
        boolean z2;
        for (Fragment fragment : getSupportFragmentManager().LJJLIIIJL()) {
            if (fragment != null && fragment.isVisible()) {
                if (!TextUtils.equals(fragment.getTag(), "HOME") && !TextUtils.equals(fragment.getTag(), "duo_detail")) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        return fragment;
                    }
                } else if (z2) {
                    return fragment;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C148G.LJ(this) && C148G.LJFF(this) && getResources().getConfiguration().orientation == 1 && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        if (!C148G.LJFF(this) && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        InterfaceC817550W5h interfaceC817550W5h;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", true);
        activityConfiguration(AFwS264S0000000_24.get$arr$(168));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.is);
        TabAbilityAssem tabAbilityAssemLIZLLL = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LIZLLL();
        AmeBaseFragment ameBaseFragment = null;
        if ((tabAbilityAssemLIZLLL instanceof InterfaceC1585180rLw) && tabAbilityAssemLIZLLL != null) {
            tabAbilityAssemLIZLLL.Sf(this);
        }
        C723850SaN.LIZIZ(this, new AwS390S0200000_24(this, tabAbilityAssemLIZLLL, 11));
        AbstractC1583710rJZ rootNode = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getRootNode(this);
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        c446900Hfk.LIZ(this).IQ2(this, rootNode, this);
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(this);
        if (scrollSwitchStateManagerLIZIZ == null) {
            scrollSwitchStateManagerLIZIZ = null;
        }
        scrollSwitchStateManagerLIZIZ.LL.setValue(scrollSwitchStateManagerLIZIZ.EQ2("page_feed"));
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle2);
        c446900Hfk.LIZ(this).TQ2(bundle2, "HOME", false);
        this.LLILLL = C2411309cd.LIZIZ.LIZ();
        if (getApplication() != null && (interfaceC817550W5h = this.LLILLL) != null) {
            interfaceC817550W5h.LIZ(getApplication());
        }
        C740740T3w.LIZJ(this, this, new C0T2Y() { // from class: X.0rn2
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
                DoubleFragmentMainActivity doubleFragmentMainActivity = this.LL;
                String str = DoubleFragmentMainActivity._pnsPageId;
                iProfileService.updateUserInfo(doubleFragmentMainActivity.LLLLZI(true), aweme);
                if (aweme != null) {
                    ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJII(aweme);
                }
            }
        });
        C15PK c15pk = (C15PK) findViewById(R.id.h6w);
        this.LL = c15pk;
        if (c15pk != null) {
            viewFindViewById = c15pk.findViewById(R.id.i4o);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("end   ");
            C15PK c15pk2 = this.LL;
            if (c15pk2 != null) {
                viewFindViewById2 = c15pk2.findViewById(R.id.i4o);
            } else {
                viewFindViewById2 = null;
            }
            sbLIZ.append(viewFindViewById2);
            C2188811AlT.LIZIZ(sbLIZ);
            LLLLZIL(R.id.i4o, (Fragment) this.LLILLJJLI.getValue());
            ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZ((Fragment) this.LLILLJJLI.getValue());
            this.LLILZ = ((IMainService) ServiceManager.get().getService(IMainService.class)).obtainSecondTabFragment();
            Class clsLJJII = C19212010Ec.LIZJ.LJJII();
            if (clsLJJII != null) {
                ameBaseFragment = (AmeBaseFragment) clsLJJII.newInstance();
            }
            this.LLILZIL = ameBaseFragment;
            this.LLILZLL = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).obtainMyProfileFragment();
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.i4q, this.LLILZ, "DISCOVER");
            c19ehLJIIJ.LIZJ(R.id.i4q, this.LLILZIL, "NOTIFICATION");
            c19ehLJIIJ.LIZJ(R.id.i4q, this.LLILZLL, "USER");
            c19ehLJIIJ.LJJIFFI(this.LLILZ);
            c19ehLJIIJ.LJIILL(this.LLILZIL);
            c19ehLJIIJ.LJIILL(this.LLILZLL);
            c19ehLJIIJ.LJIIIZ();
        } else if (this.LLILLJJLI.getValue() != null) {
            LLLLZIL(R.id.i4q, (Fragment) this.LLILLJJLI.getValue());
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        boolean zEquals;
        String stringExtra2;
        super.onNewIntent(intent);
        setIntent(intent);
        Fragment fragmentLJIILL = null;
        fragment = null;
        fragment = null;
        fragment = null;
        Fragment fragment = null;
        Bundle extras = null;
        String tag = null;
        try {
            stringExtra = intent.getStringExtra("duo_type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        Fragment fragmentLLLLZI = LLLLZI(false);
        if (fragmentLLLLZI == null) {
            zEquals = false;
        } else {
            zEquals = TextUtils.equals(fragmentLLLLZI.getTag(), "duo_detail");
        }
        boolean z = !TextUtils.equals("duo_back", stringExtra);
        if (TextUtils.equals(stringExtra, "duo_detail") || (z && zEquals)) {
            this.LLIZ++;
        }
        try {
            String stringExtra3 = intent.getStringExtra("duo_type");
            if (stringExtra3 != null) {
                switch (stringExtra3.hashCode()) {
                    case -2080291192:
                        if (stringExtra3.equals("duo_back")) {
                            LLLLLZL();
                        }
                        break;
                    case -1938590286:
                        if (stringExtra3.equals("duo_detail")) {
                            C23053091n.LIZ.getClass();
                            IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
                            C844470XAv.LIZ.getClass();
                            if (iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
                                fragmentLJIILL = ((DetailFeedService) C23053091n.LIZJ.getValue()).LJIILL(this);
                            }
                            LLLLZLL(fragmentLJIILL, "duo_detail", false);
                        }
                        break;
                    case -1833904024:
                        if (stringExtra3.equals("duo_profile")) {
                            Fragment fragmentLLLLZI2 = LLLLZI(true);
                            if (fragmentLLLLZI2 != null) {
                                tag = fragmentLLLLZI2.getTag();
                            }
                            if (!TextUtils.equals(tag, "duo_profile")) {
                                Fragment fragmentObtainUserProfileFragment = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).obtainUserProfileFragment();
                                Aweme awemeLJFF = C740740T3w.LJFF(this);
                                LLLLZLL(fragmentObtainUserProfileFragment, "duo_profile", true);
                                C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(awemeLJFF, fragmentObtainUserProfileFragment, 57));
                                break;
                            }
                        }
                        break;
                    case -300053832:
                        if (stringExtra3.equals("duo_webview")) {
                            CrossPlatformFragment crossPlatformFragment = new CrossPlatformFragment();
                            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 191);
                            crossPlatformFragment.LLILLL = aRunnableS112S0100000_12;
                            MixActivityContainer mixActivityContainer = crossPlatformFragment.LL;
                            if (mixActivityContainer != null) {
                                mixActivityContainer.LLIZLLLIL = aRunnableS112S0100000_12;
                            }
                            try {
                                extras = getIntent().getExtras();
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            crossPlatformFragment.setArguments(extras);
                            LLLLZLL(crossPlatformFragment, "duo_webview", true);
                        }
                        break;
                    case -30215092:
                        if (stringExtra3.equals("duo_music_detail")) {
                            LLLLZLL(((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJII(getIntent()), "duo_music_detail", true);
                        }
                        break;
                    case 962860898:
                        if (stringExtra3.equals("duo_challenge")) {
                            LLLLZLL(C1620350sGf.LIZJ.LIZLLL(getIntent()), "duo_challenge", true);
                        }
                        break;
                    case 971786005:
                        if (stringExtra3.equals("duo_bottom_click")) {
                            try {
                                stringExtra2 = intent.getStringExtra("duo_clicked_tab_name");
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                            if (stringExtra2 == null) {
                                stringExtra2 = "";
                            }
                            if (TextUtils.equals(stringExtra2, "PUBLISH")) {
                                C786410Ut5.re(Toast.makeText(this, getString(2131832497), 0));
                            } else if (!TextUtils.equals(stringExtra2, "HOME")) {
                                int iHashCode = stringExtra2.hashCode();
                                if (iHashCode != -1382453013) {
                                    if (iHashCode != 2614219) {
                                        if (iHashCode == 1055811561 && stringExtra2.equals("DISCOVER")) {
                                            fragment = this.LLILZ;
                                        }
                                    } else if (stringExtra2.equals("USER")) {
                                        fragment = this.LLILZLL;
                                    }
                                } else if (stringExtra2.equals("NOTIFICATION")) {
                                    fragment = this.LLILZIL;
                                }
                                LLLLZLL(fragment, stringExtra2, true);
                            }
                        }
                        break;
                }
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    @C14EU
    public final void onScrollToProfileEvent(C0SPE c0spe) {
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(this)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//duo");
            smartRouteBuildRoute.withParam("duo_type", "duo_profile");
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLZIL(int i, Fragment fragment) {
        if (this.LL != null && findViewById(i) != null && fragment != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(i, fragment, "HOME");
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void LLLLZLL(Fragment fragment, String str, boolean z) {
        int i;
        if (fragment == null) {
            return;
        }
        if (z) {
            i = R.id.i4q;
        } else {
            i = R.id.i4o;
        }
        Fragment fragmentLLLLZI = LLLLZI(z);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (fragmentLLLLZI != null) {
            c19ehLJIIJ.LJIILL(fragmentLLLLZI);
        }
        if (!Intrinsics.LJFF(str, "DISCOVER") && !Intrinsics.LJFF(str, "SERIES_DISCOVER") && !Intrinsics.LJFF(str, "NOTIFICATION") && !Intrinsics.LJFF(str, "USER")) {
            c19ehLJIIJ.LIZJ(i, fragment, str);
        } else {
            c19ehLJIIJ.LJJIFFI(fragment);
        }
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIIZ();
    }
}
