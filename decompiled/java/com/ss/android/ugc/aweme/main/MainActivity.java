package com.ss.android.ugc.aweme.main;

import X.AbstractActivityC1602020rn6;
import X.AbstractC738140SxQ;
import X.AnonymousClass0716;
import X.AnonymousClass1995;
import X.C01GW;
import X.C06W2;
import X.C06W4;
import X.C07A7;
import X.C07KE;
import X.C08TN;
import X.C0CCZ;
import X.C0CXL;
import X.C0J4N;
import X.C0QSJ;
import X.C0S78;
import X.C0SSZ;
import X.C0VPL;
import X.C0X35;
import X.C1017370ca7;
import X.C104100aN;
import X.C1074300e3w;
import X.C10ZF;
import X.C1150504el;
import X.C1192870h9B;
import X.C1244404tu;
import X.C1256610inz;
import X.C1268304xl;
import X.C1308910kAL;
import X.C1492110ovp;
import X.C1514430pVp;
import X.C1563710qnJ;
import X.C1563870qnZ;
import X.C1583610rJP;
import X.C1589640rT8;
import X.C1590120rTu;
import X.C1591530rWB;
import X.C1591880rWk;
import X.C1593730rZj;
import X.C1601110rld;
import X.C1601420rm8;
import X.C1601810rml;
import X.C1601820rmm;
import X.C1601860rmq;
import X.C1602170rnL;
import X.C1606580ruS;
import X.C1618230sDF;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C1913090zsp;
import X.C19270610aG;
import X.C1959507lx;
import X.C198H;
import X.C1C7U;
import X.C1EDN;
import X.C20629915o1;
import X.C2188271Akb;
import X.C2188811AlT;
import X.C2241008qG;
import X.C2344809Gs;
import X.C260390AIj;
import X.C261170ALj;
import X.C274700Apg;
import X.C294740Bgu;
import X.C299020Bno;
import X.C305230Bxp;
import X.C335910DEv;
import X.C486860J7k;
import X.C673150Qan;
import X.C680080Qly;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C794420VEi;
import X.C799900VZk;
import X.C810560Vqw;
import X.EnumC335920DEw;
import X.InterfaceC1058480deQ;
import X.InterfaceC1146704e9;
import X.InterfaceC1209250hZb;
import X.InterfaceC1218550hob;
import X.InterfaceC1591870rWj;
import X.InterfaceC1593530rZP;
import X.InterfaceC1767820w6W;
import X.InterfaceC1848690yCx;
import X.InterfaceC20622815ms;
import X.InterfaceC214902198i;
import X.InterfaceC21498219Bk;
import X.InterfaceC342470Dbh;
import X.InterfaceC687730QyJ;
import X.InterfaceC836750Ws5;
import Y.AObjectS123S0000000_24;
import Y.AObjectS398S0100000_24;
import Y.AObjectS74S0000000_24;
import Y.ARunnableS124S0100000_24;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class MainActivity extends AbstractActivityC1602020rn6 implements InterfaceC1218550hob, InterfaceC836750Ws5, C07KE, InterfaceC1848690yCx, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7HELIOSLCI2ZigtICF9BSQlJw4wPCw6IDsq";
    public AdHomePageDataVM adHomePageDataVM;
    public HomeTabAbility communication_gen_field_com_bytedance_tiktok_homepage_mainfragment_HomeTabAbility;
    public BackRefreshStrategyAbility communication_gen_field_com_ss_android_ugc_aweme_base_BackRefreshStrategyAbility;
    public HomePageViewPagerAbility communication_gen_field_com_ss_android_ugc_aweme_base_HomePageViewPagerAbility;
    public MainBusinessAbility communication_gen_field_com_ss_android_ugc_aweme_base_MainBusinessAbility;
    public MainDialogAbility communication_gen_field_com_ss_android_ugc_aweme_base_MainDialogAbility;
    public BottomTabAbility communication_gen_field_com_ss_android_ugc_aweme_base_activity_BottomTabAbility;
    public HomeViewPagerAbility communication_gen_field_com_ss_android_ugc_aweme_base_mainfragment_HomeViewPagerAbility;
    public MainPageBusinessAbility communication_gen_field_com_ss_android_ugc_aweme_base_mainpagefragment_MainPageBusinessAbility;
    public InterfaceC1767820w6W communication_gen_field_com_ss_android_ugc_aweme_ecommerce_mall_service_ability_ShopManuallyPushLifeCycleAbility;
    public PhotoClearModeOwnerAbility communication_gen_field_com_ss_android_ugc_aweme_feed_photos_clearmode_PhotoClearModeOwnerAbility;
    public IPerformanceAbility communication_gen_field_com_ss_android_ugc_aweme_main_IPerformanceAbility;
    public boolean hasForbiddedFocusCallback;
    public HomePageDataViewModel homeViewModel;
    public C0J4N layoutInflaterWithDecorCache;
    public DataCenter mDataCenter;
    public boolean mLastFocusValue;
    public boolean showToast;
    public ScrollSwitchStateManager stateManager;
    public C1591880rWk homePageService = C1591880rWk.LIZIZ;
    public boolean mIsFirstVisible = true;
    public AtomicBoolean lazyDoItCalled = new AtomicBoolean(false);
    public C1017370ca7 mCommerceActivityObserver = null;
    public InterfaceC342470Dbh mActivityResultListener = null;

    public static /* synthetic */ void lambda$semisugar$callLazyDoIt$0(MainActivity mainActivity) {
        C1C7U.LIZ("MainActivity@93b6.ensureLazyDoItFinallyCalled$1L");
        mainActivity.callLazyDoIt();
        C1C7U.LIZIZ("MainActivity@93b6.ensureLazyDoItFinallyCalled$1L");
    }

    private synchronized void tryInitInflaterWithCache() {
        LayoutInflater layoutInflater;
        if (this.layoutInflaterWithDecorCache == null && (layoutInflater = (LayoutInflater) super.getSystemService("layout_inflater")) != null) {
            this.layoutInflaterWithDecorCache = new C0J4N(this, layoutInflater);
        }
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        if (cls == HomeTabAbility.class) {
            this.communication_gen_field_com_bytedance_tiktok_homepage_mainfragment_HomeTabAbility = (HomeTabAbility) obj;
        } else if (cls == BackRefreshStrategyAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_BackRefreshStrategyAbility = (BackRefreshStrategyAbility) obj;
        } else if (cls == HomePageViewPagerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_HomePageViewPagerAbility = (HomePageViewPagerAbility) obj;
        } else if (cls == MainBusinessAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_MainBusinessAbility = (MainBusinessAbility) obj;
        } else if (cls == MainDialogAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_MainDialogAbility = (MainDialogAbility) obj;
        } else if (cls == BottomTabAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_activity_BottomTabAbility = (BottomTabAbility) obj;
        } else if (cls == HomeViewPagerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_mainfragment_HomeViewPagerAbility = (HomeViewPagerAbility) obj;
        } else if (cls == MainPageBusinessAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_mainpagefragment_MainPageBusinessAbility = (MainPageBusinessAbility) obj;
        } else if (cls == InterfaceC1767820w6W.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_ecommerce_mall_service_ability_ShopManuallyPushLifeCycleAbility = (InterfaceC1767820w6W) obj;
        } else if (cls == PhotoClearModeOwnerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_feed_photos_clearmode_PhotoClearModeOwnerAbility = (PhotoClearModeOwnerAbility) obj;
        } else if (cls == IPerformanceAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_main_IPerformanceAbility = (IPerformanceAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    public void com_ss_android_ugc_aweme_main_MainActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == HomeTabAbility.class) {
            return this.communication_gen_field_com_bytedance_tiktok_homepage_mainfragment_HomeTabAbility;
        }
        if (cls == BackRefreshStrategyAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_BackRefreshStrategyAbility;
        }
        if (cls == HomePageViewPagerAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_HomePageViewPagerAbility;
        }
        if (cls == MainBusinessAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_MainBusinessAbility;
        }
        if (cls == MainDialogAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_MainDialogAbility;
        }
        if (cls == BottomTabAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_activity_BottomTabAbility;
        }
        if (cls == HomeViewPagerAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_mainfragment_HomeViewPagerAbility;
        }
        if (cls == MainPageBusinessAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_base_mainpagefragment_MainPageBusinessAbility;
        }
        if (cls == InterfaceC1767820w6W.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_ecommerce_mall_service_ability_ShopManuallyPushLifeCycleAbility;
        }
        if (cls == PhotoClearModeOwnerAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_feed_photos_clearmode_PhotoClearModeOwnerAbility;
        }
        if (cls == IPerformanceAbility.class) {
            return this.communication_gen_field_com_ss_android_ugc_aweme_main_IPerformanceAbility;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    public View getVisionSearchRect() {
        return null;
    }

    @Override // X.AbstractActivityC1602020rn6, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
    }

    @Override // X.AbstractActivityC1602020rn6, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        boolean zLJI = MethodIDManager.LJI(71646);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onStart", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        boolean zLJI = MethodIDManager.LJI(71628);
        com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0QSJ
    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.AbstractActivityC1602020rn6, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        if (cls == HomeTabAbility.class) {
            this.communication_gen_field_com_bytedance_tiktok_homepage_mainfragment_HomeTabAbility = null;
        } else if (cls == BackRefreshStrategyAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_BackRefreshStrategyAbility = null;
        } else if (cls == HomePageViewPagerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_HomePageViewPagerAbility = null;
        } else if (cls == MainBusinessAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_MainBusinessAbility = null;
        } else if (cls == MainDialogAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_MainDialogAbility = null;
        } else if (cls == BottomTabAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_activity_BottomTabAbility = null;
        } else if (cls == HomeViewPagerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_mainfragment_HomeViewPagerAbility = null;
        } else if (cls == MainPageBusinessAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_base_mainpagefragment_MainPageBusinessAbility = null;
        } else if (cls == InterfaceC1767820w6W.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_ecommerce_mall_service_ability_ShopManuallyPushLifeCycleAbility = null;
        } else if (cls == PhotoClearModeOwnerAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_feed_photos_clearmode_PhotoClearModeOwnerAbility = null;
        } else if (cls == IPerformanceAbility.class) {
            this.communication_gen_field_com_ss_android_ugc_aweme_main_IPerformanceAbility = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    private void callLazyDoIt() {
        if (this.lazyDoItCalled.compareAndSet(false, true)) {
            lazyDoItMainThread();
        }
    }

    private void ensureLazyDoItFinallyCalled() {
        C810560Vqw.LIZLLL(new ARunnableS124S0100000_24(this, 52), 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$beforeSuperOnCreate$1() {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.getTag() != 0) {
            return null;
        }
        c1618440sDa.LJIIZILJ(hashCode());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beforeSuperOnCreate$2() {
        C1C7U.LIZ("MainActivity@93b6.beforeSuperOnCreate$1L");
        C1601420rm8.LIZLLL(getIntent());
        C1C7U.LIZIZ("MainActivity@93b6.beforeSuperOnCreate$1L");
    }

    public static C06W4 lambda$beforeSuperOnCreate$3() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZIZ;
    }

    public static /* synthetic */ C06W4 lambda$beforeSuperOnCreate$4() {
        return new C1268304xl(false, false);
    }

    private void tryCheckSplashAdsAdvance() {
        if (((Boolean) C274700Apg.LIZ.getValue()).booleanValue()) {
            C1017370ca7 c1017370ca7 = this.mCommerceActivityObserver;
            Intent intent = getIntent();
            c1017370ca7.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MainActivity checkSplashAdsForColdStart intent!=null? ");
            sbLIZ.append(intent == null);
            C2188811AlT.LIZIZ(sbLIZ);
            IMainAdScene iMainAdScene = c1017370ca7.LIZJ;
            if (iMainAdScene != null) {
                iMainAdScene.checkSplashAdsForColdStart(intent);
            }
        }
    }

    public void com_ss_android_ugc_aweme_main_MainActivity__onStop$___twin___() {
        C1913090zsp.LIZ.getClass();
        C1913090zsp.LJIIJ = true;
        Function0<Unit> function0 = C1913090zsp.LJIIL;
        if (function0 != null) {
            function0.invoke();
            C1913090zsp.LJIIL = null;
        }
        super.onStop();
    }

    @Override // X.InterfaceC1848690yCx
    public boolean enableSkipGatherRegion() {
        return ((Boolean) C260390AIj.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1848690yCx
    public boolean enableSkipInset() {
        return ((Boolean) C07A7.LIZ.getValue()).booleanValue();
    }

    private HomePageViewPagerAbility homepageViewPagerAbilityWithKnitExp() {
        return C1256610inz.LIZ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$beforeSuperOnCreate$0() {
        if (!C1601110rld.LIZ()) {
            return null;
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.getTag() == hashCode()) {
            return null;
        }
        c1618440sDa.LJIIZILJ(hashCode());
        c1618440sDa.clear();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setAllowPrepareVideo() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.setAllowPrepareVideo():void");
    }

    @Override // X.InterfaceC1218550hob
    public InterfaceC1209250hZb getHelper() {
        return C1256610inz.LIZ(this).w8();
    }

    @Override // X.C199Y
    public InterfaceC21498219Bk getStateSaveStrategy() {
        if (!C294740Bgu.LIZ()) {
            return super.getStateSaveStrategy();
        }
        final ClassLoader classLoader = getClassLoader();
        return new InterfaceC21498219Bk(classLoader) { // from class: X.0uND
            public final ClassLoader LIZ;
            public final String LIZIZ = UUID.randomUUID().toString();
            public final String LIZJ = UUID.randomUUID().toString();
            public String LIZLLL;
            public String LJ;

            @Override // X.InterfaceC21498219Bk
            public final void LJJIJIIJIL() {
                Map<String, Bundle> map = C08DJ.LIZ;
                C19719512Dh.LIZJ(map).remove(this.LIZLLL);
                ((HashMap) map).remove(this.LIZIZ);
                C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                String str = this.LIZLLL;
                String str2 = this.LJ;
                ExecutorService executorService = C1701170uN1.LIZJ;
                executorService.execute(new RunnableC1699920uL0(str, str2));
                executorService.execute(new RunnableC1699920uL0(this.LIZIZ, this.LIZJ));
            }

            {
                this.LIZ = classLoader;
            }

            public final void LIZIZ(Bundle bundle) {
                String name;
                int i = Build.VERSION.SDK_INT;
                if (i == 29 || i == 28) {
                    ClassLoader classLoader2 = bundle.getClassLoader();
                    if (classLoader2 != null) {
                        name = classLoader2.getClass().getName();
                    } else {
                        name = null;
                    }
                    if (Intrinsics.LJFF(name, "java.lang.BootClassLoader")) {
                        bundle.setClassLoader(this.LIZ);
                    }
                }
            }

            @Override // X.InterfaceC21498219Bk
            public final Bundle onRestoreInstanceState(Bundle bundle) {
                String string;
                Bundle bundle2 = bundle.getBundle("saf_state_save_directly");
                if (bundle2 != null) {
                    LIZIZ(bundle2);
                    return bundle2;
                }
                String string2 = bundle.getString("Key_SAFStateSaveStrategy_Scene");
                if (string2 == null || (string = bundle.getString("Key_SAFStateSaveStrategy_Verify")) == null) {
                    return null;
                }
                this.LIZLLL = string2;
                this.LJ = string;
                HashMap map = (HashMap) C08DJ.LIZ;
                Bundle bundle3 = (Bundle) map.get(string2);
                if (bundle3 != null) {
                    map.remove(string2);
                    return bundle3;
                }
                C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                Bundle bundleLIZ = C1701170uN1.LIZ(string2, string);
                if (bundleLIZ == null || bundleLIZ.size() <= 0) {
                    return null;
                }
                LIZIZ(bundleLIZ);
                return bundleLIZ;
            }

            @Override // X.InterfaceC21498219Bk
            public final void LIZ(Bundle bundle, Bundle bundle2) {
                String string;
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService != null && !iCreativeSAAService.hasCreativeToolContainerScene()) {
                    C786410Ut5.LJJIIZI(bundle, bundle2, "saf_state_save_directly");
                    return;
                }
                if (!bundle.containsKey("Key_SAFStateSaveStrategy_Scene") && !bundle.containsKey("Key_SAFStateSaveStrategy_Verify")) {
                    C786410Ut5.LJJJI("Key_SAFStateSaveStrategy_Scene", this.LIZIZ, bundle);
                    C786410Ut5.LJJJI("Key_SAFStateSaveStrategy_Verify", this.LIZJ, bundle);
                    ((HashMap) C08DJ.LIZ).put(this.LIZIZ, C571310Mav.LIZ(bundle2));
                    try {
                        C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                        C1701170uN1.LIZIZ(this.LIZIZ, this.LIZJ, bundle2, ((Number) C258450AAx.LIZ.getValue()).longValue(), 16);
                        return;
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        HashMap map = new HashMap();
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ == null || (string = abstractC1387200mCcLIZIZ.toString()) == null) {
                            string = "";
                        }
                        map.put("root_page", string);
                        Npth.reportBizException("SAFStateSaveLargeTransactionStrategy", e, "writeBundleToDiskAsync fail ", map);
                        return;
                    }
                }
                throw new IllegalStateException("Host have multi scene environment");
            }
        };
    }

    public void lazyDoItMainThread() {
        if (isDestroyed() || !this.showToast || this.adHomePageDataVM.wQ2()) {
            return;
        }
        this.homePageService.LJIIZILJ().LIZIZ(this);
        this.showToast = false;
    }

    public void prepareActivityVM() {
        this.stateManager = C486860J7k.LIZIZ(this);
        this.homeViewModel = C680080Qly.LIZIZ(this);
    }

    public void refreshSlideSwitchCanScrollRight() {
        MainRootFragment mainSAFFragment = getMainSAFFragment();
        HomePageViewPagerAbility homePageViewPagerAbilityMS = mainSAFFragment.mS();
        if (homePageViewPagerAbilityMS == null || !homePageViewPagerAbilityMS.O82()) {
            return;
        }
        Fragment fragmentBQ2 = mainSAFFragment.uS().BQ2();
        if (C1593730rZj.LIZIZ.LJIIJ(fragmentBQ2, mainSAFFragment.LLJLILLLLZIIL, mainSAFFragment.sS(), mainSAFFragment.rS())) {
            return;
        }
        if (fragmentBQ2 == null || !(fragmentBQ2 instanceof MainFragment)) {
            mainSAFFragment.LLJLILLLLZIIL.LQ2(mainSAFFragment.sS());
            return;
        }
        ComponentCallbacks componentCallbacks = (FeedFragment) mainSAFFragment.LLJLILLLLZIIL.OQ2();
        if (componentCallbacks instanceof InterfaceC1591870rWj) {
            InterfaceC1591870rWj interfaceC1591870rWj = (InterfaceC1591870rWj) componentCallbacks;
            if ("FeedFollowFragment".equals(interfaceC1591870rWj.wm()) || "MallMainFragment".equals(interfaceC1591870rWj.wm()) || "FeedLearnFragment".equals(interfaceC1591870rWj.wm()) || "FeedRecommendFragment".equals(interfaceC1591870rWj.wm()) || "SocialFriendsFeedFragment".equals(interfaceC1591870rWj.wm()) || "TTDspFragmentV2".equals(interfaceC1591870rWj.wm()) || "NearByFragment".equals(interfaceC1591870rWj.wm()) || "FeedPopularFragment".equals(interfaceC1591870rWj.wm()) || "LiveFeedFragment".equals(interfaceC1591870rWj.wm()) || C1591530rWB.LIZIZ.N7(((MainFragment) fragmentBQ2).f3()) || "PlaymodeTopFeedFragment".equals(interfaceC1591870rWj.wm()) || "PlaymodeNewFeedFragment".equals(interfaceC1591870rWj.wm()) || "PlaymodeMoodBoostFeedFragment".equals(interfaceC1591870rWj.wm()) || "ActivityTabContainerFragment".equals(interfaceC1591870rWj.wm()) || "BaseExploreFeedFragment".equals(interfaceC1591870rWj.wm()) || "SeriesFeedFragment".equals(interfaceC1591870rWj.wm())) {
                mainSAFFragment.LLJLL.setEventType(((MainFragment) fragmentBQ2).f3());
                mainSAFFragment.nS().mCommerceActivityObserver.LIZIZ();
                return;
            }
        }
        mainSAFFragment.LLJLILLLLZIIL.LQ2(mainSAFFragment.sS());
    }

    public void setAdScrollRightControl() {
        getMainSAFFragment().nS().mCommerceActivityObserver.LIZIZ();
    }

    public void setStatusBarColor() {
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024 | 256);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        getWindow().setFlags(0, Integer.MIN_VALUE);
    }

    public void tryPreloadDecorView() {
        tryInitInflaterWithCache();
        C0J4N c0j4n = this.layoutInflaterWithDecorCache;
        if (c0j4n != null) {
            if (C0J4N.LJI.get()) {
                c0j4n.LIZIZ = null;
            } else {
                c0j4n.LIZIZ = C786410Ut5.Sd(((Number) c0j4n.LJFF.getValue()).intValue(), c0j4n.LIZ, null);
            }
            C0J4N c0j4n2 = this.layoutInflaterWithDecorCache;
            c0j4n2.getClass();
            if (C0J4N.LJII.get()) {
                c0j4n2.LIZJ = null;
            } else {
                c0j4n2.LIZJ = C786410Ut5.Sd(R.layout.hz, c0j4n2.LIZ, null);
            }
        }
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_main_MainActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(MainActivity mainActivity) {
        mainActivity.com_ss_android_ugc_aweme_main_MainActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                mainActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(MainActivity mainActivity) {
        com_ss_android_ugc_aweme_main_MainActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(mainActivity);
        try {
            mainActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static /* synthetic */ Unit lambda$beforeSuperOnCreate$5(C06W2 c06w2) {
        c06w2.Dw2(new AObjectS74S0000000_24(3));
        c06w2.Dw2(new AObjectS74S0000000_24(4));
        return null;
    }

    public void beforeCallSceneActivityCreated(Bundle bundle) {
        C0X35.LJIIJJI("main_act_super_duration", true);
        C0X35.LIZ("main_act_super_to_contentview", true);
        C08TN.LIZ().LJ("main_act_create_part2", false);
        C1017370ca7 c1017370ca7 = this.mCommerceActivityObserver;
        c1017370ca7.getClass();
        ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi(ISplashAdService.class);
        c1017370ca7.LIZIZ = C680080Qly.LIZIZ(c1017370ca7.LIZ);
        C1074300e3w.LIZ(c1017370ca7.LIZ);
        if (((Boolean) AnonymousClass0716.LJJII.getValue()).booleanValue() && iSplashAdService != null && iSplashAdService.LJ() && !iSplashAdService.LJJIJIL()) {
            iSplashAdService.LJJIJ();
        }
        c1017370ca7.LIZJ.onCreate();
        C0S78.LIZJ(new AObjectS398S0100000_24(c1017370ca7, 22), true);
        if (!C1601820rmm.LIZ) {
            Object obj = C1601820rmm.LIZIZ;
            synchronized (obj) {
                try {
                    C1601820rmm.LIZ = true;
                    obj.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        setAllowPrepareVideo();
        if (SplashSettingServiceImpl.LIZJ().LIZIZ()) {
            C1601420rm8.LIZLLL(getIntent());
        }
        C08TN.LIZ().LJI("main_act_create_part2");
        C0X35.LJIIJJI("main_act_super_to_contentview", true);
        C0X35.LIZ("main_act_contentview_duration", true);
    }

    @Override // X.AbstractActivityC1602020rn6, X.C199Y, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2344809Gs.LJI(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("message", th.getMessage());
            C794420VEi.LIZIZ("main_activity_dispatch_error", "", c2241008qG.LJ());
            return false;
        }
    }

    @Override // X.AbstractActivityC1602020rn6, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (((Boolean) C1244404tu.LIZIZ.getValue()).booleanValue() && "layout_inflater".equals(str)) {
            tryInitInflaterWithCache();
            C0J4N c0j4n = this.layoutInflaterWithDecorCache;
            if (c0j4n != null) {
                return c0j4n;
            }
        }
        return super.getSystemService(str);
    }

    @Override // X.AbstractActivityC1602020rn6, X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z;
        boolean z2;
        C2344809Gs.LJ("saf: MainActivity onNewIntent Start");
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("from_new_user_journey", false)) {
            getIntent().putExtra("INTENT_BTM", INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent).getBundle("INTENT_BTM"));
            getIntent().putExtra("pre_mainactivity_first_enter", Boolean.valueOf(intent.getBooleanExtra("pre_mainactivity_first_enter", false)));
            return;
        }
        if (intent != null && intent.getData() != null) {
            C10ZF.LIZ.getClass();
            if (C10ZF.LIZ(intent)) {
                C19270610aG.LIZ(this, intent, "saf_main_on_new_intent", true);
                return;
            }
        }
        if (getNavigationScene() != null) {
            String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "saf_main_intent_target");
            if (TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                C01GW c01gw = C261170ALj.LIZ;
                if (((Boolean) c01gw.getValue()).booleanValue() && intent.getAction() == null && intent.getCategories() == null && (intent.getFlags() & 4194304) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Boolean) c01gw.getValue()).booleanValue() && (SAFExtensionKt.LJIILLIIL(this) instanceof InterfaceC1058480deQ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    return;
                }
                if (intent != null && TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER")) {
                    if (!(SAFExtensionKt.LJIILLIIL(this) instanceof MainRootFragment) && (intent.getFlags() & 67108864) == 0) {
                        return;
                    }
                } else if (getIntent().getBooleanExtra("from_share", false)) {
                    getIntent().removeExtra("from_share");
                    return;
                }
                strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "saf_home_target";
            }
            if ("saf_creative_tool_target".equals(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
                if ((c198hLIZLLL instanceof InterfaceC20622815ms) && (c198hLIZLLL instanceof AnonymousClass1995)) {
                    ((AnonymousClass1995) c198hLIZLLL).LLLLIILLL(INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
                    return;
                }
            }
            if ("saf_home_target".equals(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                setIntent(intent);
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("main_on_new_intent_try_jump_to_main_enable", true) && getRootFragmentClz() != MainRootFragment.class && C19270610aG.LIZIZ(this)) {
                    return;
                }
            }
            navigateAccordingConfiguration(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        } else {
            InterfaceC214902198i interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(this);
            if (interfaceC214902198iLJIILLIIL instanceof MainRootFragment) {
                setIntent(intent);
            }
            interfaceC214902198iLJIILLIIL.LLLLIILLL(INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
        }
        C2344809Gs.LJ("saf: MainActivity onNewIntent End");
    }

    @Override // X.AbstractActivityC1602020rn6, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        this.homePageService.LJIIZILJ().LIZJ(this, bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) throws IllegalAccessException {
        Class<?> cls;
        Class<?> cls2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
        C1602170rnL c1602170rnLLegacyTrackers = legacyTrackers();
        if (z) {
            if (C305230Bxp.LIZ() && ((!C305230Bxp.LIZIZ() || (C305230Bxp.LIZIZ() && !((BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class)).isOriginalWindowFocusExecuted())) && !this.hasForbiddedFocusCallback && this.mLastFocusValue)) {
                this.hasForbiddedFocusCallback = true;
                if (((Boolean) C1601860rmq.LJI.getValue()).booleanValue() && C305230Bxp.LIZ()) {
                    super.onWindowFocusChanged(z);
                    return;
                }
                return;
            }
            if (C1601860rmq.LIZIZ() && C305230Bxp.LIZ() && this.mIsFirstVisible && C1601860rmq.LIZIZ() && C1601810rml.LJ != null) {
                ViewParent viewParent = C1601810rml.LIZLLL;
                Class<?> cls3 = null;
                if (viewParent != null) {
                    cls = viewParent.getClass();
                } else {
                    cls = null;
                }
                Field fieldLIZ = C1959507lx.LIZ(cls, "mWindowFocusChanged");
                if (fieldLIZ != null) {
                    fieldLIZ.setAccessible(true);
                    fieldLIZ.set(C1601810rml.LIZLLL, Boolean.valueOf(C1601810rml.LIZ));
                }
                ViewParent viewParent2 = C1601810rml.LIZLLL;
                if (viewParent2 != null) {
                    cls2 = viewParent2.getClass();
                } else {
                    cls2 = null;
                }
                Field fieldLIZ2 = C1959507lx.LIZ(cls2, "mAdded");
                if (fieldLIZ2 != null) {
                    fieldLIZ2.setAccessible(true);
                    fieldLIZ2.set(C1601810rml.LIZLLL, Boolean.valueOf(C1601810rml.LIZIZ));
                }
                ViewParent viewParent3 = C1601810rml.LIZLLL;
                if (viewParent3 != null) {
                    cls3 = viewParent3.getClass();
                }
                Field fieldLIZ3 = C1959507lx.LIZ(cls3, "mUpcomingWindowFocus");
                if (fieldLIZ3 != null) {
                    fieldLIZ3.setAccessible(true);
                    fieldLIZ3.set(C1601810rml.LIZLLL, Boolean.valueOf(C1601810rml.LIZJ));
                }
            }
        }
        if (c1602170rnLLegacyTrackers != null) {
            C1602170rnL.LIZJ(z);
        }
        this.mLastFocusValue = z;
        super.onWindowFocusChanged(z);
        boolean z2 = this.mIsFirstVisible;
        if (z && z2) {
            this.mIsFirstVisible = false;
        }
        if (c1602170rnLLegacyTrackers != null) {
            c1602170rnLLegacyTrackers.LIZ(z, z2);
        }
    }

    @Override // X.InterfaceC836750Ws5
    public void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.mActivityResultListener = interfaceC342470Dbh;
    }

    @Override // X.C07KE
    public void onDrawFirstFrame(Map<String, Object> map) {
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(MainActivity mainActivity, int i) {
        boolean z;
        mainActivity.com_ss_android_ugc_aweme_main_MainActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, mainActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, mainActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    mainActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    mainActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    mainActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    mainActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            mainActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            mainActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterCallSceneActivityCreated(android.os.Bundle r7, X.C724220Say r8) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.afterCallSceneActivityCreated(android.os.Bundle, X.0Say):void");
    }

    public void beforeSuperOnCreate(Bundle bundle, boolean z) {
        TabAbilityAssem tabAbilityAssemLIZLLL;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beforeSuperOnCreate start, fromFragment: ");
        sbLIZ.append(z);
        C1606580ruS.LIZ(this, C2188811AlT.LIZIZ(sbLIZ));
        C0X35.LJIIJJI("cold_boot_main_create_dispatch_scene_create_to_main_root_fragment", false);
        C0X35.LIZ("cold_boot_main_create_commerce_observer_create_duration", false);
        if (z) {
            prepareActivityVM();
        }
        if (!IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()) {
            this.mCommerceActivityObserver = new C1017370ca7(this, this, getMainSAFFragment());
        } else {
            MainRootFragment mainSAFFragment = getMainSAFFragment();
            this.mCommerceActivityObserver = new C1017370ca7(this, mainSAFFragment, mainSAFFragment);
        }
        C0X35.LJIIJJI("cold_boot_main_create_commerce_observer_create_duration", false);
        C0X35.LIZ("main_act_assemble_duration", false);
        C08TN.LIZ().LJ("main_act_assemble_get_friend", false);
        C0X35.LIZ("main_act_assemble_get_friend", false);
        if (((Boolean) C1244404tu.LIZIZ.getValue()).booleanValue()) {
            C104100aN.LIZ().LJJIJL(new Runnable() { // from class: X.0rmk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainActivityAssemKt@195a.preloadDecorView$1");
                    try {
                        JatoXL.setPriority(-10);
                        this.LL.tryPreloadDecorView();
                        JatoXL.setPriority(0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityAssemKt@195a.preloadDecorView$1");
                }
            });
        }
        if (((Boolean) C1EDN.LIZJ.getValue()).booleanValue()) {
            C104100aN.LIZ().LJJIJL(new ARunnableS124S0100000_24(this, 55));
        }
        C0CXL.LIZ.getClass();
        if (C0CXL.LIZJ) {
            C0CXL.LIZJ = false;
            C0CXL.LIZIZ = null;
        }
        AbstractC738140SxQ abstractC738140SxQLJ = C1563710qnJ.LJ(this);
        C0X35.LJIIJJI("main_act_assemble_get_friend", false);
        C08TN.LIZ().LJI("main_act_assemble_get_friend");
        C08TN.LIZ().LJ("main_act_assemble_commit", false);
        C0X35.LIZ("main_act_assemble_commit", false);
        IHomePageService iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null);
        if (iHomePageService != null) {
            tabAbilityAssemLIZLLL = iHomePageService.LIZLLL();
        } else {
            tabAbilityAssemLIZLLL = null;
        }
        if ((tabAbilityAssemLIZLLL instanceof TabAbilityAssem) && tabAbilityAssemLIZLLL != null) {
            tabAbilityAssemLIZLLL.Sf(this);
        } else {
            tabAbilityAssemLIZLLL = null;
        }
        C0X35.LJIIJJI("main_act_assemble_commit", false);
        C08TN.LIZ().LJI("main_act_assemble_commit");
        C0X35.LIZ("main_act_assemble_preload_top_friend_tab", false);
        C1589640rT8.LIZIZ.P2(this);
        C0X35.LJIIJJI("main_act_assemble_preload_top_friend_tab", false);
        C08TN.LIZ().LJ("main_act_assemble_ensureassem", false);
        C0X35.LIZ("main_act_assemble_ensureassem", false);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        C0CCZ c0cczLIZJ = C1590120rTu.LIZIZ.LIZJ();
        c799900VZk.getClass();
        C799900VZk.LIZJ(c0cczLIZJ);
        C0X35.LJIIJJI("main_act_assemble_ensureassem", false);
        C08TN.LIZ().LJI("main_act_assemble_ensureassem");
        C0X35.LIZ("main_act_assemble_invoke", false);
        MainRootFragment mainSAFFragment2 = getMainSAFFragment();
        if (mainSAFFragment2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MainActivity applyAssem begin assemble: ");
            sbLIZ2.append(mainSAFFragment2);
            C2344809Gs.LJFF("AssemSupervisor", C2188811AlT.LIZIZ(sbLIZ2));
            C723850SaN.LIZ(mainSAFFragment2, false, mainSAFFragment2.LLJJI, new C1563870qnZ(this, mainSAFFragment2, mainSAFFragment2, abstractC738140SxQLJ, tabAbilityAssemLIZLLL, bundle), 1);
        }
        if (((Boolean) C1EDN.LIZIZ.getValue()).booleanValue()) {
            C104100aN.LIZ().LJJIJL(new ARunnableS124S0100000_24(this, 55));
        }
        C0X35.LJIIJJI("main_act_assemble_invoke", false);
        C08TN.LIZ().LJ("main_act_assemble_loaded", false);
        C0X35.LIZ("main_act_assemble_loaded", false);
        List<InterfaceC1593530rZP> listLIZ = C1583610rJP.LIZ(this);
        if (listLIZ != null) {
            Iterator<InterfaceC1593530rZP> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onAssemLoaded();
            }
        }
        C0X35.LJIIJJI("main_act_assemble_loaded", false);
        C08TN.LIZ().LJI("main_act_assemble_loaded");
        C0X35.LJIIJJI("main_act_assemble_duration", false);
        C08TN.LIZ().LJI("main_act_create_assem");
        C0X35.LIZ("cold_boot_main_create_after_apply_assem_to_feed_request_preload", false);
        C08TN.LIZ().LJ("main_act_create_part1", false);
        C1492110ovp.LIZJ("StoryClearOpt", new AObjectS398S0100000_24(this, 0), new AObjectS398S0100000_24(this, 1), ((Boolean) C2188271Akb.LIZIZ.getValue()).booleanValue());
        C1618230sDF.LIZIZ.LIZ.getClass();
        this.adHomePageDataVM = C1074300e3w.LIZ(this);
        this.mDataCenter = DataCenter.vQ2(ViewModelProviders.of(this), this);
        tryCheckSplashAdsAdvance();
        C0X35.LJIIJJI("cold_boot_main_create_after_apply_assem_to_feed_request_preload", false);
        C0X35.LIZ("cold_boot_main_create_feed_request_preload_duration", false);
        if (!SplashSettingServiceImpl.LIZJ().LIZIZ() && !C1514430pVp.LIZLLL().booleanValue()) {
            if (((Boolean) C1EDN.LJFF.getValue()).booleanValue()) {
                ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJL(new ARunnableS124S0100000_24(this, 54));
            } else {
                C1601420rm8.LIZLLL(getIntent());
            }
        }
        C0X35.LJIIJJI("cold_boot_main_create_feed_request_preload_duration", false);
        C0X35.LIZ("cold_boot_main_create_feed_request_end_to_super", false);
        C1150504el.LIZ().LIZLLL("feed_lego_add_to_request", false);
        C1150504el.LIZ().LJI("main_act_user_guide_to_immersive_config", false);
        C1150504el.LIZ().LIZLLL("main_act_immersive_config", false);
        activityConfiguration(new AObjectS123S0000000_24(1));
        if (bundle != null) {
            i = R.style.xm;
        } else {
            i = R.style.xr;
        }
        setTheme(i);
        C08TN.LIZ().LJI("main_act_create_part1");
        C0X35.LJIIJJI("cold_boot_main_create_feed_request_end_to_super", false);
        C0X35.LJIIJJI("main_act_begin_to_super", true);
        C0X35.LIZ("main_act_super_duration", true);
        C0X35.LIZJ("cold_boot_main_create_duration", "main_create_super_to_end");
        List<InterfaceC1593530rZP> listLIZ2 = C1583610rJP.LIZ(this);
        if (listLIZ2 != null) {
            Iterator<InterfaceC1593530rZP> it3 = listLIZ2.iterator();
            while (it3.hasNext()) {
                it3.next().onBeforeCreate();
            }
        }
        C1606580ruS.LIZ(this, "beforeSuperOnCreate end");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        String stringExtra;
        HomePageViewPagerAbility homePageViewPagerAbilityMS;
        MainRootFragment mainRootFragmentMrfOrCrash = mrfOrCrash("onActivityReenter");
        if (mainRootFragmentMrfOrCrash != null) {
            C0VPL.LIZ(i, mainRootFragmentMrfOrCrash.LLJILLL);
            if (-1 == i && intent != null) {
                try {
                    stringExtra = intent.getStringExtra("feed_share_element_aid");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (mainRootFragmentMrfOrCrash.uS().BQ2() instanceof C0SSZ) {
                    ((C0SSZ) mainRootFragmentMrfOrCrash.uS().BQ2()).LLIZ(stringExtra);
                } else if ((mainRootFragmentMrfOrCrash.uS().BQ2() instanceof MainFragment) && (homePageViewPagerAbilityMS = mainRootFragmentMrfOrCrash.mS()) != null && stringExtra != null) {
                    homePageViewPagerAbilityMS.As(stringExtra);
                }
            }
        }
        super.onActivityReenter(i, intent);
    }
}
