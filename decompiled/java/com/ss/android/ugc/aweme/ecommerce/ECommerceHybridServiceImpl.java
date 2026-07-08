package com.ss.android.ugc.aweme.ecommerce;

import X.AbstractC1538690q8x;
import X.AbstractC1547260qMm;
import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1311670kEn;
import X.C1339200kxC;
import X.C13LP;
import X.C1523320pkA;
import X.C1523400pkI;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547050qMR;
import X.C1547240qMk;
import X.C1697810uHb;
import X.C1739190vML;
import X.C19719612Di;
import X.C1AQS;
import X.C2124108Tv;
import X.C797990VSb;
import X.InterfaceC1542720qFS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ecc.EccDslManagerConfigModel;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.ECLynxVideoUI;
import com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService;
import com.ss.android.ugc.aweme.ecommerce.router.EcomHybridInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.EcomSaaSGeckoRegister;
import com.ss.android.ugc.aweme.ecommerce.saas.EcomSaaSInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import j27.IDaS54S0000000_20;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ECommerceHybridServiceImpl implements IECommerceHybridService {
    public final List<ISparkRouterInterceptor> LIZ = C1697810uHb.LJIIJJI(new EcomSaaSInterceptor(), new AbstractC1547260qMm() { // from class: X.0vAR
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String url;
            if (routeIntent != null && (url = routeIntent.getUrl()) != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(url), "lru_cache_init") != null) {
                return true;
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            if (str != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "lru_cache_init") != null) {
                return true;
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final void handleSparkContext(SparkContext sparkContext, String str) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            Type type;
            super.handleSparkContext(sparkContext, str);
            if (a0.LJJIIZI(str, "ECSparkPreload", false)) {
                return;
            }
            if (str != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "lru_cache_init");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(String.class))))));
                } else {
                    type = new TypeToken<List<? extends Map<String, ? extends String>>>() { // from class: X.0ecS
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, type);
                if (!(objFromJson instanceof List)) {
                    objFromJson = null;
                }
                List<Map> list = (List) objFromJson;
                if (list != null) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map map : list) {
                        String str2 = (String) map.get(Scene.SCENE_SERVICE);
                        if (str2 != null) {
                            String str3 = (String) map.get("key");
                            C212391189t.LIZ.getClass();
                            String strLIZ = C212391189t.LIZ(str2, str3);
                            if (strLIZ != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("lru_");
                                sbLIZ.append(str2);
                                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), strLIZ);
                            }
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        sparkContext.LJJJJZ(new C1151910g57(linkedHashMap, 0));
                        if (!a0.LJJIIZI(str, "ECSparkPreload", false)) {
                            C1523770pkt.LIZ.getClass();
                            CopyOnWriteArraySet<String> copyOnWriteArraySet = C1523770pkt.LIZJ;
                            if ((!copyOnWriteArraySet.isEmpty()) && !copyOnWriteArraySet.isEmpty()) {
                                Iterator<String> it2 = copyOnWriteArraySet.iterator();
                                while (it2.hasNext()) {
                                    if (a0.LJJIIZI(str, it2.next(), false)) {
                                        sparkContext.LJJ(AbstractC1537120q6Q.class, new AbstractC1537120q6Q() { // from class: X.0esw
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // X.AbstractC1537120q6Q
                                            public final void LIZ(C1051630dTN c1051630dTN, InterfaceC1540940qCa interfaceC1540940qCa) {
                                                InterfaceC1105930esx interfaceC1105930esx;
                                                C1537910q7h c1537910q7h;
                                                LynxView lynxView;
                                                InterfaceC1531560pxS interfaceC1531560pxS = null;
                                                if ((interfaceC1540940qCa instanceof InterfaceC1105930esx) && (interfaceC1105930esx = (InterfaceC1105930esx) interfaceC1540940qCa) != null) {
                                                    if (interfaceC1105930esx.LIZIZ()) {
                                                        if (interfaceC1540940qCa instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                                                            Object kitView = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCa).getKitView();
                                                            if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                                                                lynxView.updateData(TemplateData.LJII(C2097608Jq.LJIIZILJ(linkedHashMap)));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (!(interfaceC1540940qCa instanceof C1537720q7O)) {
                                                            return;
                                                        }
                                                        ((LynxView) interfaceC1540940qCa).updateData(TemplateData.LJII(C2097608Jq.LJIIZILJ(linkedHashMap)));
                                                        return;
                                                    }
                                                    C1537480q70 performanceViewHybridContext = interfaceC1540940qCa.getPerformanceViewHybridContext();
                                                    if (performanceViewHybridContext != null) {
                                                        interfaceC1531560pxS = performanceViewHybridContext.hybridParams;
                                                    }
                                                    if (!(interfaceC1531560pxS instanceof C1537910q7h) || (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) == null) {
                                                        return;
                                                    }
                                                    c1537910q7h.LJIJJ = TemplateData.LJII(C2097608Jq.LJIIZILJ(linkedHashMap));
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }, C1739190vML.LL, new AbstractC1547260qMm() { // from class: X.08fO
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EccDslManagerConfigModel eccDslManagerConfigModel = C2173708fP.LIZ;
            EccDslManagerConfigModel eccDslManagerConfigModel2 = (EccDslManagerConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecc_dsl_manager_config", EccDslManagerConfigModel.class, eccDslManagerConfigModel);
            if (eccDslManagerConfigModel2 != null) {
                eccDslManagerConfigModel = eccDslManagerConfigModel2;
            }
            return eccDslManagerConfigModel.dslManageEnable;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EccDslManagerConfigModel eccDslManagerConfigModel = C2173708fP.LIZ;
            EccDslManagerConfigModel eccDslManagerConfigModel2 = (EccDslManagerConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecc_dsl_manager_config", EccDslManagerConfigModel.class, eccDslManagerConfigModel);
            if (eccDslManagerConfigModel2 != null) {
                eccDslManagerConfigModel = eccDslManagerConfigModel2;
            }
            return eccDslManagerConfigModel.dslManageEnable;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final void handleSparkContext(final SparkContext sparkContext, final String str) {
            super.handleSparkContext(sparkContext, str);
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.08fN
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String strLIZJ = C1947207jy.LIZJ(str);
                    Map mapLIZ = C2173908fR.LIZ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((ConcurrentHashMap) mapLIZ).entrySet()) {
                        C07WE c07we = new C07WE((String) entry.getKey());
                        if (c07we.LIZ && a0.LJJIIZI(strLIZJ, c07we.LIZJ, false)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("ecc_dsl_list", linkedHashMap));
                        sparkContext.LJJLIIIJ(C13LP.LLIIII(linkedHashMap.keySet()), "ecc_dsl_id_list");
                        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX || interfaceC1531560pxS.getType() == EnumC1067640dtC.WEB) {
                            sparkContext.LJJLIIIJILLIZJL(mapLIZJ);
                        }
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ecc dsl inject took ");
                        sbLIZ.append(jElapsedRealtime2);
                        sbLIZ.append(" ms");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            });
        }
    }, new AbstractC1547260qMm() { // from class: X.0qMP
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            return true;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            return true;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final void handleSparkContext(SparkContext sparkContext, String str) {
            super.handleSparkContext(sparkContext, str);
            C848510XQj.LIZ.getClass();
            C848510XQj.LIZ(str);
        }
    }, new AbstractC1547260qMm() { // from class: X.0pkH
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
            if (iEcRaxService != null) {
                iEcRaxService.isOpen();
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
            if (iEcRaxService != null) {
                iEcRaxService.isOpen();
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final void handleSparkContext(SparkContext sparkContext, String str) {
            super.handleSparkContext(sparkContext, str);
            IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
            if (iEcRaxService != null) {
                iEcRaxService.isOpen();
            }
        }
    });
    public final List<ISparkRouterInterceptor> LIZIZ = C1697810uHb.LJIIJJI(C1523320pkA.LL, C2124108Tv.LL, new AbstractC1547260qMm() { // from class: X.0pkh
        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(String str) {
            Uri uriLIZJ;
            if (str != null && (uriLIZJ = C1943307jL.LIZJ(str)) != null) {
                C1523590pkb.LIZ.getClass();
                return C1523590pkb.LIZJ(uriLIZJ);
            }
            return false;
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String url;
            if (routeIntent != null) {
                url = routeIntent.getUrl();
            } else {
                url = null;
            }
            return matchInterceptRules(url);
        }

        @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
        public final void handleSparkContext(SparkContext sparkContext, String str) {
            super.handleSparkContext(sparkContext, str);
            try {
                if (sparkContext.usePreload) {
                    sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0pke
                        public Uri LLILLJJLI;

                        @Override // X.AbstractC1537870q7d
                        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                            this.LLILLJJLI = UriProtector.parse(str2);
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLJJL(String str2, byte[] bArr) {
                            String strLIZIZ;
                            Uri uri = this.LLILLJJLI;
                            if (uri == null || (strLIZIZ = C1942307jB.LIZIZ(uri, "ec_lynx_open_id")) == null) {
                                strLIZIZ = "";
                            }
                            C1523590pkb c1523590pkb = C1523590pkb.LIZ;
                            Uri uri2 = this.LLILLJJLI;
                            c1523590pkb.getClass();
                            C1523590pkb.LIZLLL(uri2, strLIZIZ, "load_template_start", false, null, false);
                        }
                    });
                }
                Uri uri = UriProtector.parse(str);
                String strLIZIZ = C1942307jB.LIZIZ(uri, "ec_lynx_open_id");
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    C1529920puo c1529920puo = new C1529920puo(uri, strLIZIZ);
                    sparkContext.LJJLIIIJJI(c1529920puo);
                    if (!C2190461Ao8.LIZIZ()) {
                        sparkContext.LJJLIIIJL(c1529920puo);
                    }
                    C1523630pkf c1523630pkf = new C1523630pkf(uri, strLIZIZ, sparkContext);
                    c1523630pkf.LLILZ.LJJJJZI(c1523630pkf.LLILZLL);
                    if (!((Boolean) C2190461Ao8.LIZLLL.getValue()).booleanValue()) {
                        c1523630pkf.LLILZ.LJJ(AbstractC1537120q6Q.class, (C1523640pkg) c1523630pkf.LLIZ.getValue());
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }, C1523400pkI.LL);
    public final List<IDaS54S0000000_20> LIZJ = Collections.singletonList(new C1339200kxC(67));

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final void LIZ() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C1547050qMR.LIZIZ) {
            return;
        }
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        c1120604Zw.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJI) {
            C797990VSb.LIZ.LJIIJJI(new EcomSaaSGeckoRegister());
        }
        C1547240qMk c1547240qMk = new C1547240qMk();
        C1541950qED.LIZJ.getClass();
        C1541950qED.LJ.add(c1547240qMk);
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).registerSubSparkPlugin(c1547240qMk);
        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJFF) {
            C1537900q7g.LJIIIIZZ(new AbstractC1538690q8x() { // from class: X.0qMT
                public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(194));

                @Override // X.AbstractC1538690q8x
                public final String LJI() {
                    return "webcast_legacy";
                }

                @Override // X.AbstractC1538690q8x
                public final void LJ(SparkContext sparkContext, String str) {
                    IECommerceHostService iECommerceHostService;
                    Uri uri;
                    AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
                    IECommerceHostService iECommerceHostService2;
                    AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                    AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2;
                    AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
                    Object c098200Yq;
                    AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3;
                    boolean z;
                    boolean z2;
                    String name;
                    boolean z3;
                    String name2;
                    boolean z4;
                    String name3;
                    boolean z5;
                    String name4;
                    boolean z6;
                    String name5;
                    Resources resources;
                    Configuration configuration;
                    boolean z7;
                    String name6;
                    super.LJ(sparkContext, str);
                    IECSDKMonitorService iECSDKMonitorService = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
                    String str2 = "";
                    if (iECSDKMonitorService != null) {
                        String strLJIJI = sparkContext.LJIJI();
                        String strLIZIZ = C1547280qMo.LIZIZ(sparkContext);
                        if (strLIZIZ == null) {
                            strLIZIZ = "";
                        }
                        iECSDKMonitorService.LIZLLL(strLJIJI, "webcast_legacy", strLIZIZ);
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    sparkContext.bid = "live";
                    sparkContext.vaid = "99999";
                    String name7 = null;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        String name8 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name6 = iECommerceHostService.getClass().getName();
                        } else {
                            name6 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name8, name6, z7);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    Activity currentActivity = ((IApplicationDependencyService) iECommerceHostService).getCurrentActivity();
                    if (currentActivity != null && (resources = currentActivity.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                        sparkContext.LJJJLZIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C958103op.LIZJ()))), "landscape_width");
                        sparkContext.LJJJZ("landscape_gravity", "end");
                        sparkContext.LJJJZ("landscape_transition_animation", "end");
                    }
                    try {
                        uri = UriProtector.parse(sparkContext.LJIJI());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        uri = null;
                    }
                    new Object() { // from class: X.0qMW
                    }.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        String name9 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name5 = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name5 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime4, 1, name9, name5, z6);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    linkedHashMap.putAll(((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getNetworkCommonParams());
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                        iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService2 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        String name10 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService2 != null) {
                            name4 = iECommerceHostService2.getClass().getName();
                        } else {
                            name4 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime5, 1, name10, name4, z5);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) iECommerceHostService2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime6 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String name11 = IAccountDependencyService.class.getName();
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                            name3 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime6, 1, name11, name3, z4);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    String deviceId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getDeviceId();
                    if (deviceId == null) {
                        deviceId = "";
                    }
                    linkedHashMap.put("deviceId", deviceId);
                    linkedHashMap.put("appVersion", iApplicationDependencyService.getVersionInfo().LIZ);
                    linkedHashMap.put("appId", Integer.valueOf(iApplicationDependencyService.getAppId()));
                    linkedHashMap.put("lynx_version", LynxEnv.inst().getLynxVersion());
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime7 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String name12 = IAccountDependencyService.class.getName();
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                            name2 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2.getClass().getName();
                        } else {
                            name2 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime7, 1, name12, name2, z3);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    linkedHashMap.put("user_id", ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2).getUserId());
                    linkedHashMap.put("initTimestamp", String.valueOf(System.currentTimeMillis()));
                    linkedHashMap.put("webcast_sdk_version", "1234");
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime8 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String name13 = IAppSettingDependencyService.class.getName();
                        if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime8, 1, name13, name, z2);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
                    }
                    linkedHashMap.put("webcast_language", C2273321DyU.LIZ(((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getCountryLocale()));
                    sparkContext.LJJLIIIJILLIZJL(linkedHashMap);
                    try {
                        c098200Yq = UriProtector.parse(sparkContext.LJIJI());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Uri uri2 = (Uri) c098200Yq;
                    if (uri2 == null) {
                        uri2 = Uri.EMPTY;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime9 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name14 = IAccountDependencyService.class.getName();
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 != null) {
                            name7 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime9, 1, name14, name7, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("user_id", iAccountDependencyService.getUserId());
                    String secUid = iAccountDependencyService.getSecUid();
                    if (secUid == null) {
                        secUid = "";
                    }
                    linkedHashMap2.put("sec_user_id", secUid);
                    linkedHashMap2.put("webcast_sdk_version", "1234");
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, (String) entry.getKey()) == null && !sparkContext.LJJJ().containsKey(entry.getKey())) {
                            sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    sparkContext.jsbOptimize = true;
                    sparkContext.jsbOptimizeV2 = true;
                    sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0qMU
                        @Override // X.C1543000qFu
                        public final C1058990dfF LIZLLL() {
                            return null;
                        }

                        @Override // X.C1543000qFu
                        public final C1543030qFx LJ() {
                            return new C1543030qFx() { // from class: X.0qMV
                                @Override // X.C1543030qFx
                                public final String LIZIZ() {
                                    return "webcast";
                                }

                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                @Override // X.C1543030qFx
                                public final Class<? extends InterfaceC1063710dmr> LIZ(String str3) {
                                    switch (str3.hashCode()) {
                                        case -1296660405:
                                            if (!str3.equals("openRegionListPage")) {
                                                return null;
                                            }
                                            return C1AQL.class;
                                        case -504883626:
                                            if (!str3.equals("openLive")) {
                                                return null;
                                            }
                                            return C1060270dhJ.class;
                                        case 97322682:
                                            if (!str3.equals("fetch")) {
                                                return null;
                                            }
                                            return C520470Kb7.class;
                                        case 110532135:
                                            if (!str3.equals("toast")) {
                                                return null;
                                            }
                                            return C1801440wyk.class;
                                        default:
                                            return null;
                                    }
                                }
                            };
                        }
                    });
                    sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0qMb
                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            C1537910q7h c1537910q7h;
                            Uri uriLIZ;
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            if (interfaceC1531560pxS instanceof C1541480qDS) {
                                ((C1541480qDS) interfaceC1531560pxS).LJ = new InterfaceC1541760qDu() { // from class: X.0qMX
                                    @Override // X.InterfaceC1541760qDu
                                    public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
                                        IECommerceHostService iECommerceHostService3;
                                        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2;
                                        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3;
                                        boolean z8;
                                        boolean z9;
                                        String name15;
                                        boolean z10;
                                        String name16;
                                        String userAgentString = webKitView.getSettings().getUserAgentString();
                                        if (a0.LJJIIZI(userAgentString, "trill_", false) && a0.LJJIIZI(userAgentString, "musical_ly", false)) {
                                            C786410Ut5.se(webKitView.getSettings(), u.LJJIFFI(userAgentString, "trill_", "musical_ly_", false));
                                        }
                                        getClass();
                                        String userAgentString2 = webKitView.getSettings().getUserAgentString();
                                        if (userAgentString2 == null) {
                                            userAgentString2 = "";
                                        }
                                        String name17 = null;
                                        if (C034S.LIZ()) {
                                            C1120604Zw.LIZ.LIZ();
                                            long jElapsedRealtime10 = SystemClock.elapsedRealtime();
                                            iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                                            if (iECommerceHostService3 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            String name18 = IApplicationDependencyService.class.getName();
                                            if (iECommerceHostService3 != null) {
                                                name16 = iECommerceHostService3.getClass().getName();
                                            } else {
                                                name16 = null;
                                            }
                                            C1AQS.LIZJ(jElapsedRealtime10, 1, name18, name16, z10);
                                        } else {
                                            C1120604Zw.LIZ.LIZ();
                                            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                                        }
                                        IApplicationDependencyService iApplicationDependencyService2 = (IApplicationDependencyService) iECommerceHostService3;
                                        if (C034S.LIZ()) {
                                            C1120604Zw.LIZ.LIZ();
                                            long jElapsedRealtime11 = SystemClock.elapsedRealtime();
                                            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2 = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                                            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2 != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            String name19 = IAppSettingDependencyService.class.getName();
                                            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2 != null) {
                                                name15 = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2.getClass().getName();
                                            } else {
                                                name15 = null;
                                            }
                                            C1AQS.LIZJ(jElapsedRealtime11, 1, name19, name15, z9);
                                        } else {
                                            C1120604Zw.LIZ.LIZ();
                                            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
                                        }
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(iApplicationDependencyService2.getAppName());
                                        sbLIZ.append('_');
                                        sbLIZ.append(iApplicationDependencyService2.getVersionInfo().LIZIZ);
                                        sbLIZ.append(" AppVersion/");
                                        sbLIZ.append(iApplicationDependencyService2.getVersionInfo().LIZIZ);
                                        sbLIZ.append(" JsSdk/2.0 Channel/");
                                        sbLIZ.append(iApplicationDependencyService2.getChannel());
                                        sbLIZ.append(" ByteLocale/");
                                        sbLIZ.append(((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin2).getCurrentLocaleStr(webKitView.getContext()));
                                        sbLIZ.append(" Webcast_ByteLocale/");
                                        if (C034S.LIZ()) {
                                            C1120604Zw.LIZ.LIZ();
                                            long jElapsedRealtime12 = SystemClock.elapsedRealtime();
                                            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3 = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                                            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3 != null) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            String name20 = IAppSettingDependencyService.class.getName();
                                            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3 != null) {
                                                name17 = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3.getClass().getName();
                                            }
                                            C1AQS.LIZJ(jElapsedRealtime12, 1, name20, name17, z8);
                                        } else {
                                            C1120604Zw.LIZ.LIZ();
                                            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
                                        }
                                        sbLIZ.append(C2273321DyU.LIZ(((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin3).getCountryLocale()));
                                        sbLIZ.append(" App/");
                                        sbLIZ.append(iApplicationDependencyService2.getAppName());
                                        sbLIZ.append(" WebcastSDK/1234");
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                        String strLIZ = C188200nw.LIZ();
                                        WebSettings settings = webKitView.getSettings();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(userAgentString2);
                                        sbLIZ2.append(' ');
                                        sbLIZ2.append(strLIZIZ2);
                                        sbLIZ2.append(' ');
                                        sbLIZ2.append(strLIZ);
                                        C786410Ut5.se(settings, C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                };
                            }
                            if ((interfaceC1531560pxS instanceof C1537910q7h) && (uriLIZ = (c1537910q7h = (C1537910q7h) interfaceC1531560pxS).LIZ()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZ, "initial_data")) != null) {
                                C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                c1067460dsuLIZIZ.LIZ("initial_data", new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                                c1537910q7h.LJIJJLI(c1067460dsuLIZIZ);
                            }
                        }
                    });
                    if (((AbstractC1538680q8w) this.LIZIZ.getValue()).LIZJ(uri)) {
                        ((AbstractC1538680q8w) this.LIZIZ.getValue()).LIZ(sparkContext);
                    }
                    IECSDKMonitorService iECSDKMonitorService2 = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
                    if (iECSDKMonitorService2 != null) {
                        String strLJIJI2 = sparkContext.LJIJI();
                        String strLIZIZ2 = C1547280qMo.LIZIZ(sparkContext);
                        if (strLIZIZ2 != null) {
                            str2 = strLIZIZ2;
                        }
                        iECSDKMonitorService2.LIZJ(strLJIJI2, "webcast_legacy", str2, SystemClock.elapsedRealtime() - jElapsedRealtime2, 0);
                    }
                }
            });
        }
        C1537900q7g.LJIIIIZZ(new AbstractC1538690q8x() { // from class: X.0qR1
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "ecom";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext, String str) {
                Object obj;
                long jCurrentTimeMillis;
                AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
                Object obj2;
                AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
                boolean zLJIIZILJ;
                String authority;
                boolean z;
                boolean z2;
                String name;
                Long l;
                super.LJ(sparkContext, str);
                C1547250qMl.LIZ.getClass();
                C1547250qMl.LIZ(sparkContext);
                C1549940qR6.LIZ.getClass();
                C1549940qR6.LIZIZ = EnumC1549900qR2.LOAD_INIT;
                C1537510q73 c1537510q73 = sparkContext.extraRuntimeInfo;
                String name2 = null;
                if (c1537510q73 != null) {
                    obj = c1537510q73.get((Object) "initTimestamp");
                } else {
                    obj = null;
                }
                if ((obj instanceof Long) && (l = (Long) obj) != null) {
                    jCurrentTimeMillis = l.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                C1549940qR6.LIZJ = jCurrentTimeMillis;
                String strLIZ = AnonymousClass0188.LIZ(sparkContext.LJIJI());
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name3 = IHybridDependencyService.class.getName();
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                }
                boolean zIsGeckoBundleExists = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).isGeckoBundleExists(strLIZ);
                String str2 = "1";
                if (zIsGeckoBundleExists) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name4 = IECommerceMallDependencyService.class.getName();
                    if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        name2 = anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name2, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                }
                if (!Intrinsics.LJFF(((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin).shouldShowMall2TabOrTopTab(), Boolean.TRUE)) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                sparkContext.LJJLIIIJ(obj2, "offline");
                sparkContext.LJJLIIIJ(str2, "ec_mall_has_shop_tab");
                sparkContext.LJJJJZI(new C623120OcI(new AwS567S0100000_23(sparkContext, 176), new AwS602S0100000_23(sparkContext, 69), null, new AwS637S0100000_23(sparkContext, 12), new AwS672S0100000_23(sparkContext, 4)));
                try {
                    authority = UriProtector.parse(sparkContext.LJIJI()).getAuthority();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (authority != null) {
                    zLJIIZILJ = u.LJIIZILJ(authority, "_popup", false);
                } else {
                    zLJIIZILJ = false;
                }
                final AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(sparkContext, 177);
                if (zLJIIZILJ) {
                    sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0(awS567S0100000_23) { // from class: X.0qR4
                        public final Function0<Unit> LIZ;

                        @Override // X.InterfaceC1554220qY0
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJII() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIIZ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIJ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIILJJIL(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIILL(SparkPopup sparkPopup, int i) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIILLIIL() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIIZILJ(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIJ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final boolean LJIJI(SparkPopup sparkPopup) {
                            return false;
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJIL(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJI(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJIFFI(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJII() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                            return false;
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJIIJ(SparkPopup sparkPopup) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z3) {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJIIZ() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void LJJIIZI() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void onViewAttachedToWindow() {
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final void onViewDetachedFromWindow() {
                        }

                        {
                            this.LIZ = awS567S0100000_23;
                        }

                        @Override // X.InterfaceC1554220qY0
                        public final boolean LJIJJ(SparkPopup sparkPopup) {
                            this.LIZ.invoke();
                            return false;
                        }
                    });
                } else {
                    sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy(awS567S0100000_23) { // from class: X.0qR3
                        public final Function0<Unit> LL;

                        @Override // X.InterfaceC2217701Bqy
                        public final Context LIZJ(Context context) {
                            return context;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIILLIIL(boolean z3) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIL(Activity activity, Context context) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIII(SparkActivity sparkActivity, boolean z3) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIJIIJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJZI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLJLI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void finish() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onActivityResult(int i, int i2, Intent intent) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onRestoreInstanceState(Bundle bundle) {
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        {
                            this.LL = awS567S0100000_23;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                            this.LL.invoke();
                            return false;
                        }
                    });
                    if (!C2190461Ao8.LIZIZ()) {
                        sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz(awS567S0100000_23) { // from class: X.0qR5
                            public final Function0<Unit> LL;

                            @Override // X.InterfaceC2217711Bqz
                            public final Context LIZJ(Context context) {
                                return context;
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LIZLLL() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJII() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIIIZZ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIIZ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIJJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIL() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIILLIIL(boolean z3) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIIZILJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIJI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJIJJLI() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJLIIIIJ() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJLIIIJLJLI(InterfaceC1546650qLn interfaceC1546650qLn) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void finish() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void onActivityResult(int i, int i2, Intent intent) {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void onRestoreInstanceState(Bundle bundle) {
                            }

                            @Override // X.InterfaceC1163130gND
                            public final void release() {
                            }

                            @Override // X.InterfaceC2217711Bqz
                            public final void LJJIJIL() {
                                this.LL.invoke();
                            }

                            {
                                this.LL = awS567S0100000_23;
                            }
                        });
                    }
                }
                String strLJIJI = sparkContext.LJIJI();
                if (strLJIJI != null && a0.LJJIIZI(strLJIJI, "use_default_failed_view=1", true)) {
                    sparkContext.LJJLIIIJLJLI(new InterfaceC1163110gNB() { // from class: X.0zMh
                        public C1749280vcc LL;

                        @Override // X.InterfaceC1163110gNB
                        public final void LJJJJIZL(float f) {
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final View LJJLIL(Integer num, String str3, String str4) {
                            return null;
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final View LJJL() {
                            C1749280vcc c1749280vcc = this.LL;
                            if (c1749280vcc == null) {
                                c1749280vcc = null;
                            }
                            c1749280vcc.LJ();
                            C1749280vcc c1749280vcc2 = this.LL;
                            if (c1749280vcc2 == null) {
                                c1749280vcc2 = null;
                            }
                            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                            C1749280vcc c1749280vcc3 = this.LL;
                            if (c1749280vcc3 != null) {
                                return c1749280vcc3;
                            }
                            return null;
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final void LJIIJ(Context context) {
                            C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
                            c1749280vcc.setLayoutVariant(0);
                            this.LL = c1749280vcc;
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
                            C1749280vcc c1749280vcc = this.LL;
                            if (c1749280vcc == null) {
                                c1749280vcc = null;
                            }
                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                            C1893080zMY.LJFF(c1722300uv6, new AwS572S0100000_28(interfaceC1051240dSk, 894));
                            c1749280vcc.setStatus(c1722300uv6);
                            C1749280vcc c1749280vcc2 = this.LL;
                            if (c1749280vcc2 == null) {
                                c1749280vcc2 = null;
                            }
                            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                            C1749280vcc c1749280vcc3 = this.LL;
                            if (c1749280vcc3 == null) {
                                return null;
                            }
                            return c1749280vcc3;
                        }
                    });
                }
            }

            @Override // X.AbstractC1538690q8x
            public final void LJFF(SparkContext sparkContext, String str) {
                super.LJFF(sparkContext, str);
                C1549830qQv.LIZ.getClass();
                C1549830qQv.LIZ(sparkContext);
            }
        });
        Iterator it2 = ServiceManager.get().getServices(InterfaceC1542720qFS.class).iterator();
        while (it2.hasNext()) {
            for (AbstractC1538690q8x abstractC1538690q8x : ((InterfaceC1542720qFS) it2.next()).LIZ()) {
                C1541950qED.LIZJ.getClass();
                C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
            }
        }
        C1547050qMR.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<C1311670kEn> LIZIZ() {
        List<IDaS54S0000000_20> list = this.LIZJ;
        Set services = ServiceManager.get().getServices(IEComHybridLynxBehaviorService.class);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = services.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((IEComHybridLynxBehaviorService) it2.next()).LIZIZ(), arrayList);
        }
        return C13LP.LJLILLLLZI(new C1311670kEn() { // from class: X.0qMO
            @Override // X.C1311670kEn
            public final LynxUI<?> LJFF(j27.s sVar) {
                return new ECLynxVideoUI(sVar);
            }
        }, C13LP.LJLIL(arrayList, list));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<IInterceptor> LJ() {
        return Collections.singletonList(new EcomHybridInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<ISparkRouterInterceptor> LIZLLL() {
        Set services = ServiceManager.get().getServices(IEcomHybridSparkMatchService.class);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = services.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((IEcomHybridSparkMatchService) it2.next()).LIZ(), arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<ISparkRouterInterceptor> LIZJ(String str) {
        Set services = ServiceManager.get().getServices(IEComHybridSparkInterceptorService.class);
        List<ISparkRouterInterceptor> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = services.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((IEComHybridSparkInterceptorService) it2.next()).LIZIZ(), arrayList);
        }
        List listLJLIL = C13LP.LJLIL(this.LIZIZ, C13LP.LJLIL(arrayList, list));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = services.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((IEComHybridSparkInterceptorService) it3.next()).LIZ(), arrayList2);
        }
        return C13LP.LJLIL(arrayList2, listLJLIL);
    }
}
