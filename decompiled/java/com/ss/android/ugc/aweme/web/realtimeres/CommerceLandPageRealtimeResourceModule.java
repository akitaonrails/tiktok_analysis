package com.ss.android.ugc.aweme.web.realtimeres;

import X.C04TD;
import X.C080U;
import X.C0PEM;
import X.C0SCL;
import X.C1001690cAp;
import X.C1002090cBT;
import X.C1016840cZG;
import X.C1035880d3y;
import X.C1037010d5n;
import X.C1040640dBe;
import X.C1043040dFW;
import X.C1043460dGC;
import X.C13LP;
import X.C1489105sH;
import X.C1490740otc;
import X.C1533940q1I;
import X.C1552050qUV;
import X.C1AF0;
import X.C2188811AlT;
import X.C2206681BYc;
import X.C2281108wj;
import X.C2296808zG;
import X.C23250099c;
import X.C293790BfN;
import X.C7740030o;
import X.C786410Ut5;
import X.C844470XAv;
import X.C989070bqT;
import X.EnumC1490770otf;
import X.EnumC2281308wl;
import X.InterfaceC1040510dBR;
import X.InterfaceC1041500dD2;
import X.InterfaceC1541990qEH;
import X.InterfaceC1910030znt;
import Y.ARunnableS49S0300000_16;
import android.content.Context;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.network.SingletonWebView;
import com.ss.android.ugc.aweme.ad.settings.IABPrefetchHTMLSettings;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.PreWarmAdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import com.ss.android.ugc.aweme.web.realtimeres.model.AdLandPagePreconnectModel;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLandPageRealtimeResourceModule implements ICommerceLandPageRealtimeResourceModule {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ou(SparkContext sparkContext, Context context) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Yi0(int i, List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void hv(SparkContext sparkContext, int i, String str) {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1037760d70
    public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void r3(Aweme aweme) {
    }

    @Override // X.InterfaceC1037760d70
    public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC1037760d70
    public final void wK1(SparkContext sparkContext, String str) {
    }

    @Override // X.InterfaceC1037760d70
    public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
    }

    public static ICommerceLandPageRealtimeResourceModule LIZ() {
        Object objLIZ = C04TD.LIZ(ICommerceLandPageRealtimeResourceModule.class, false);
        if (objLIZ != null) {
            return (ICommerceLandPageRealtimeResourceModule) objLIZ;
        }
        if (C04TD.g6 == null) {
            synchronized (ICommerceLandPageRealtimeResourceModule.class) {
                if (C04TD.g6 == null) {
                    C04TD.g6 = new CommerceLandPageRealtimeResourceModule();
                }
            }
        }
        return C04TD.g6;
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final void Sz1(AwemeRawAd awemeRawAd) {
        String channelName;
        String webUrl;
        List<String> list;
        if (awemeRawAd == null) {
            return;
        }
        LandingPageNetworkOptimization landingPageNetworkOptimization = awemeRawAd.getLandingPageNetworkOptimization();
        Integer numValueOf = null;
        if ((landingPageNetworkOptimization == null || (numValueOf = Integer.valueOf(landingPageNetworkOptimization.getNetworkOptimization())) == null || numValueOf.intValue() != 0) && (channelName = awemeRawAd.getChannelName()) != null && !a0.LJJJIL(channelName) && (webUrl = awemeRawAd.getWebUrl()) != null && !a0.LJJJIL(webUrl)) {
            C1040640dBe c1040640dBeY0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).y0(p0("feed", channelName));
            if (c1040640dBeY0 != null && (list = c1040640dBeY0.LJI) != null && numValueOf != null) {
                int i = 2;
                if (numValueOf.intValue() == 2) {
                    if (awemeRawAd.getPreloadH5Type() == 2) {
                        i = 10;
                    }
                    C1043460dGC c1043460dGC = C1043460dGC.LIZ;
                    List listLL = C13LP.LL(list, i);
                    c1043460dGC.getClass();
                    String strLJ = C1043460dGC.LJ(listLL);
                    if (strLJ != null) {
                        LIZIZ(awemeRawAd, strLJ, "prewarm_webview");
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void TQ1(Aweme aweme) {
        String webUrl;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (webUrl = awemeRawAd.getWebUrl()) == null || a0.LJJJIL(webUrl) || !(true ^ C989070bqT.LIZ.isEmpty())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(webUrl);
        sbLIZ.append("-false-false");
        try {
            C1533940q1I.LIZLLL().LIZ.remove(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "remove html failed");
        }
    }

    public final List<String> LIZJ(AwemeRawAd awemeRawAd, InterfaceC1040510dBR interfaceC1040510dBR) {
        Boolean boolValueOf;
        LinkedHashMap linkedHashMap;
        Collection collectionValues;
        String strJ3;
        Object objFromJson;
        ArrayList arrayList = new ArrayList();
        String webUrl = awemeRawAd.getWebUrl();
        if (webUrl == null) {
            webUrl = "";
        }
        String strP0 = p0("feed", awemeRawAd.getChannelName());
        List<SSPResponse.PreConnect> listH21 = null;
        if (AdLandPageResourceOptimizeExperiment.LIZ().enableGeckoPreconnect) {
            if (interfaceC1040510dBR != null) {
                boolValueOf = Boolean.valueOf(interfaceC1040510dBR.Lr0(webUrl));
            } else {
                boolValueOf = null;
            }
            if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                JSONObject jSONObjectZ0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).z0(strP0);
                if (jSONObjectZ0 != null && jSONObjectZ0.length() != 0) {
                    linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObjectZ0.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject = jSONObjectZ0.optJSONObject(next);
                        if (jSONObjectOptJSONObject != null) {
                            strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                        } else {
                            strJ3 = null;
                        }
                        if (next != null && strJ3 != null) {
                            try {
                                objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strJ3, (Class<Object>) AdLandPagePreconnectModel.PreconnectModel.class);
                            } catch (s e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                                objFromJson = null;
                            }
                            if (objFromJson != null) {
                                linkedHashMap.put(next, objFromJson);
                            }
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                ArrayList arrayList2 = new ArrayList();
                if (linkedHashMap != null && (collectionValues = linkedHashMap.values()) != null) {
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AdLandPagePreconnectModel.PreconnectModel) it2.next()).url);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (C293790BfN.LIZ()) {
            if (interfaceC1040510dBR != null) {
                listH21 = interfaceC1040510dBR.H21(webUrl, webUrl);
            }
            if (listH21 != null) {
                Iterator<SSPResponse.PreConnect> it3 = listH21.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().domain);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final void LL1(AwemeRawAd awemeRawAd, String str) {
        IAdWebUtils iAdWebUtils;
        if (awemeRawAd == null) {
            return;
        }
        if (!awemeRawAd.isOpenSystemBrowser() || ((iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) != null && iAdWebUtils.Wu(awemeRawAd))) {
            if (!C293790BfN.LIZ() && !AdLandPageResourceOptimizeExperiment.LIZ().enableGeckoPreconnect) {
                return;
            }
            InterfaceC1040510dBR interfaceC1040510dBR = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
            if (interfaceC1040510dBR != null && !interfaceC1040510dBR.eP0(awemeRawAd, awemeRawAd.getWebUrl())) {
                C1490740otc.LIZ.LIZ("disable ssp first-loop preconnect.", EnumC1490770otf.W, "CommerceLandPageSSPContext_");
            } else {
                if (C2206681BYc.LIZ()) {
                    if (!C2206681BYc.LIZIZ()) {
                        return;
                    }
                    C1043040dFW.LIZ(new ARunnableS49S0300000_16(this, awemeRawAd, interfaceC1040510dBR, 6));
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1016840cZG(this, awemeRawAd, interfaceC1040510dBR, str, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final void Zt0(AwemeRawAd awemeRawAd, String str) {
        boolean z;
        ISettingService iSettingService;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1002090cBT(str, awemeRawAd, null), 3);
        Map<String, String> mapLIZ = WebAdUserAgentServiceImpl.LIZIZ().LIZ(null, str, awemeRawAd.isEnableWebGoogleLogin());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        System.currentTimeMillis();
        if (((IABPrefetchHTMLSettings.IABPrefetchHTMLSettingsModel) IABPrefetchHTMLSettings.LIZIZ.getValue()).enableLanguageHeader && (iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class)) != null) {
            C844470XAv.LIZ.getClass();
            InterfaceC1910030znt currentI18nItem = iSettingService.getCurrentI18nItem(C844470XAv.LIZ());
            if (currentI18nItem != null) {
                currentI18nItem.getLanguage();
            }
        }
        Long adId = awemeRawAd.getAdId();
        LandingPageConfig landingPageConfig = awemeRawAd.getLandingPageConfig();
        if (landingPageConfig != null) {
            z = landingPageConfig.strictUsePureLink;
        } else {
            z = false;
        }
        bU1(adId, str, linkedHashMap, mapLIZ, true, z, null, awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final String p0(String str, String str2) {
        return C1552050qUV.LJ(((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0(str), str2);
    }

    public static void LIZIZ(AwemeRawAd awemeRawAd, String str, String str2) {
        View viewE1;
        boolean z;
        String url;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        boolean z2 = true;
        if (Intrinsics.LJFF(str2, "prewarm_webview")) {
            AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel resourceOptimizeModelLIZ = AdLandPageResourceOptimizeExperiment.LIZ();
            if (!resourceOptimizeModelLIZ.enableNewWebviewOnLaunch && !resourceOptimizeModelLIZ.usePrewarmSingletonWebView) {
                PreWarmAdSparkHybridContext preWarmAdSparkHybridContextLIZLLL = C1037010d5n.LIZ.LIZLLL(awemeRawAd, awemeRawAd.getWebUrl());
                WebView webView = null;
                if (preWarmAdSparkHybridContextLIZLLL != null && (interfaceC1541990qEHLJIJJ = preWarmAdSparkHybridContextLIZLLL.LJIJJ()) != null) {
                    viewE1 = interfaceC1541990qEHLJIJJ.e1();
                } else {
                    viewE1 = null;
                }
                if (viewE1 instanceof WebView) {
                    webView = (WebView) viewE1;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prewarm webview is null ");
                if (webView == null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                if (webView == null) {
                    return;
                }
                C1043460dGC.LIZ.getClass();
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                for (int size = webBackForwardListCopyBackForwardList.getSize() - 1; -1 < size; size--) {
                    WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(size);
                    if (itemAtIndex != null && (url = itemAtIndex.getUrl()) != null && !u.LJJIIJZLJL(url, "data:text/html", false)) {
                        return;
                    }
                }
                preWarmAdSparkHybridContextLIZLLL.lastPreconnectWebUrl = awemeRawAd.getWebUrl();
                webView.loadData(str, "text/html", "utf-8");
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str2, "singleton_webview")) {
            AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel resourceOptimizeModelLIZ2 = AdLandPageResourceOptimizeExperiment.LIZ();
            if (!resourceOptimizeModelLIZ2.enableNewWebviewOnLaunch && !resourceOptimizeModelLIZ2.usePrewarmSingletonWebView) {
                return;
            }
            WebView webview = SingletonWebView.INSTANCE.getWebview();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("singleton webview is null ");
            if (webview != null) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (webview != null) {
                webview.loadData(str, "text/html", "utf-8");
            }
        }
    }

    public static void LJ(String str, String str2, Map map) {
        map.get(str);
        map.put(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final void MR0(String str, String str2, String str3, AwemeRawAd awemeRawAd) {
        Boolean boolValueOf;
        Long l;
        if (str == null) {
            return;
        }
        InterfaceC1040510dBR interfaceC1040510dBR = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
        if (interfaceC1040510dBR != null) {
            boolValueOf = Boolean.valueOf(interfaceC1040510dBR.Lr0(str));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1043460dGC c1043460dGC = C1043460dGC.LIZ;
            FeatureCenterModel feature = awemeRawAd.getFeature();
            if (feature != null) {
                l = feature.pricingType;
            } else {
                l = null;
            }
            c1043460dGC.getClass();
            if (l != null) {
                if (l.longValue() == 9 || l.longValue() == 7) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1489105sH(str2, this, "feed", str3, str, awemeRawAd, null), 3);
                }
            }
        }
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, boolean z) {
        if (Intrinsics.LJFF(str, "SettingsClose")) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1001690cAp(str, str4, str2, str3, z, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final Map sa1(String str, Map map, Map map2, boolean z, boolean z2) {
        map.put("Referer", str);
        map.putAll(map2);
        map.put("X-moz", "prefetch");
        map.put("x-tt-dataflow-id", "671089411");
        if (z) {
            C1043460dGC.LIZ.getClass();
            List listLJIIIZ = C1043460dGC.LJIIIZ(z2);
            if (listLJIIIZ != null) {
                for (C080U c080u : (ArrayList) listLJIIIZ) {
                    map.put(c080u.LIZ, c080u.LIZIZ);
                }
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule
    public final void bU1(final Long l, final String str, final Map map, final Map map2, final boolean z, final boolean z2, C1035880d3y c1035880d3y, final AwemeRawAd awemeRawAd) {
        final C1035880d3y c1035880d3y2 = c1035880d3y;
        if (str != null && !a0.LJJJIL(str)) {
            final Forest forest = AdWebViewInterceptorService.LIZIZ().LIZ().LIZ;
            if (!(c1035880d3y2 instanceof C1035880d3y)) {
                c1035880d3y2 = null;
            }
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Blocked, true, new Runnable() { // from class: X.0dBV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchAsync$1");
                }

                /* JADX WARN: Code restructure failed: missing block: B:155:0x032e, code lost:
                
                    if (r12 == null) goto L158;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:156:0x0330, code lost:
                
                    r2 = r12.getCreativeIdStr();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:157:0x0334, code lost:
                
                    com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule.LIZLLL("invalid", r11, r2, r10, false);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:158:0x033a, code lost:
                
                    r2 = null;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x033f  */
                /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 934
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1040550dBV.LIZ():void");
                }
            });
        }
    }
}
