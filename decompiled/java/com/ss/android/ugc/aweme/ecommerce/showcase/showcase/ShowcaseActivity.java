package com.ss.android.ugc.aweme.ecommerce.showcase.showcase;

import X.AbstractActivityC1743740vTg;
import X.AbstractC1539010q9T;
import X.AnonymousClass0317;
import X.C034S;
import X.C0C64;
import X.C0X0Q;
import X.C1120604Zw;
import X.C1202220hOG;
import X.C1308910kAL;
import X.C1541950qED;
import X.C1547280qMo;
import X.C1697810uHb;
import X.C1738960vLy;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C1942007j8;
import X.C1AQS;
import X.C2010707uD;
import X.C2010907uF;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC1059280dfi;
import X.InterfaceC1541990qEH;
import X.InterfaceC1740760vOs;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.n;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.showcase.ab.EcomShopAndShowcaseHostWhiteListModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class ShowcaseActivity extends AbstractActivityC1743740vTg implements InterfaceC1059280dfi, InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgICo7Ki4gLWs/ISAkKyQ/LGEAICo7Ki4gLQQvPSYlITE1";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZIL;

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        InterfaceC1541990qEH kitView;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onResume", true);
        super.onResume();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.onShow();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.SHOWCASE_PAGE.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        InterfaceC1541990qEH kitView;
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.onHide();
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        finish();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        int i;
        String string;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", true);
        super.onCreate(bundle);
        activityConfiguration(AFwS268S0000000_26.get$arr$(299));
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(true);
        tuxImmersionBar.LIZLLL();
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
            return;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            EcomShopAndShowcaseHostWhiteListModel ecomShopAndShowcaseHostWhiteListModel = C0X0Q.LIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomShopAndShowcaseHostWhiteListModel ecomShopAndShowcaseHostWhiteListModel2 = C0X0Q.LIZ;
            EcomShopAndShowcaseHostWhiteListModel ecomShopAndShowcaseHostWhiteListModel3 = (EcomShopAndShowcaseHostWhiteListModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_shop_and_showcase_host_white_list", EcomShopAndShowcaseHostWhiteListModel.class, ecomShopAndShowcaseHostWhiteListModel2);
            if (ecomShopAndShowcaseHostWhiteListModel3 != null) {
                ecomShopAndShowcaseHostWhiteListModel2 = ecomShopAndShowcaseHostWhiteListModel3;
            }
            String str = "";
            if (ecomShopAndShowcaseHostWhiteListModel2.getVerifyHost()) {
                if (!C1942007j8.LIZJ(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), ecomShopAndShowcaseHostWhiteListModel2.getWhiteHostList())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strLIZ = C1942007j8.LIZ(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                    if (strLIZ != null) {
                        str = strLIZ;
                    }
                    linkedHashMap.put("host", str);
                    linkedHashMap.put("url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    C2010707uD.LIZLLL("tiktokec_rd_open_showcase_page_reject", linkedHashMap);
                    finish();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
                    return;
                }
            }
            String stringExtra = null;
            Uri uriBuild = data.buildUpon().scheme("sslocal").authority("lynxview").path(null).build();
            C2010907uF c2010907uF = new C2010907uF(uriBuild, uriBuild.toString());
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "showcase_lynx_prefetch", true, false)) {
                c2010907uF.LIZJ("enable_prefetch", "1");
            }
            c2010907uF.LIZJ("original_schema", "aweme");
            c2010907uF.LIZIZ(Long.valueOf(System.currentTimeMillis()));
            c2010907uF.LIZJ("__live_platform__", "webcast");
            HashMap<String, Object> mapLIZIZ = C1741890vQh.LIZIZ(getIntent(), "trackParams");
            if (mapLIZIZ == null) {
                mapLIZIZ = new HashMap<>();
            }
            mapLIZIZ.put("traffic_source_list", C1742080vR0.LIZLLL(3, mapLIZIZ));
            c2010907uF.LIZJ("trackParams", C1741890vQh.LJIIIIZZ(mapLIZIZ));
            final String strLIZ2 = c2010907uF.LIZ("session_id");
            if (strLIZ2 == null) {
                strLIZ2 = "";
            }
            String strLIZ3 = c2010907uF.LIZ("showcase_native_prefetch");
            if (strLIZ3 != null) {
                i = CastIntegerProtector.parseInt(strLIZ3);
            } else {
                i = 0;
            }
            String strLIZ4 = c2010907uF.LIZ("author_id");
            if (strLIZ4 != null) {
                str = strLIZ4;
            }
            C1202220hOG c1202220hOG = C1202220hOG.LIZ;
            Object obj = mapLIZIZ.get("list_source_content_id");
            c1202220hOG.getClass();
            n nVarLIZIZ = C1202220hOG.LIZIZ(obj, str);
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(String.valueOf(c2010907uF));
            sparkContext.LJJJZ("sec_link_scene", "deeplink");
            sparkContext.LJJ(InterfaceC1059280dfi.class, this);
            sparkContext.LJJ(AbstractC1539010q9T.class, new C1738960vLy(true));
            Pair[] pairArr = new Pair[1];
            if (nVarLIZIZ != null) {
                string = nVarLIZIZ.toString();
            } else {
                string = null;
            }
            pairArr[0] = new Pair("recommend_context", string);
            C1547280qMo.LJFF(sparkContext, pairArr);
            if (i >= 1 && strLIZ2.length() > 0) {
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0vLv
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        C1537910q7h c1537910q7h;
                        final String str2 = strLIZ2;
                        final ShowcaseActivity showcaseActivity = this;
                        LynxViewClient lynxViewClient = new LynxViewClient() { // from class: X.0vLu
                            @Override // com.lynx.tasm.LynxViewClient
                            public final void LJIILJJIL() {
                                C597870Ncf c597870Ncf;
                                C1738980vM0 c1738980vM0 = C1738980vM0.LIZ;
                                String str3 = str2;
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = showcaseActivity.LLILZIL;
                                InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() : null;
                                c1738980vM0.getClass();
                                if (kitView != null && (c597870Ncf = (C597870Ncf) ((LinkedHashMap) C1738980vM0.LIZIZ).get(str3)) != null) {
                                    c597870Ncf.LIZJ = new WeakReference<>(kitView);
                                }
                                C597870Ncf c597870NcfRemove = C1738980vM0.LIZIZ.remove(str2);
                                if (c597870NcfRemove != null) {
                                    c597870NcfRemove.LIZIZ();
                                }
                            }
                        };
                        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                            c1537910q7h.LJIIIIZZ(lynxViewClient);
                        }
                    }
                });
            }
            C1541950qED.LIZJ.getClass();
            this.LLILZIL = new C1541950qED(this, sparkContext).LIZ(false);
            ((ViewGroup) findViewById(R.id.content)).addView(this.LLILZIL);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            boolean zLJFF = Intrinsics.LJFF(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), str);
            IEcommerceStoreTechLogService iEcommerceStoreTechLogService = (IEcommerceStoreTechLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreTechLogService.class, false, false, false, 14, null);
            if (iEcommerceStoreTechLogService != null) {
                iEcommerceStoreTechLogService.LIZ(str, c2010907uF.LIZ("enter_from"), "showcase", mapLIZIZ, zLJFF);
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String str2 = "a2270." + getBtmPageCode();
            try {
                stringExtra = getIntent().getStringExtra("source_btm_token");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            btmSDK.registerBtmPageOnCreate(this, str2, stringExtra);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(com.zhiliaoapp.musically.R.style.a9t), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9u), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9v), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9u, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9v, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9y, true);
        }
    }
}
