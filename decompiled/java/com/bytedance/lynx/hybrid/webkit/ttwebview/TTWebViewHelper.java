package com.bytedance.lynx.hybrid.webkit.ttwebview;

import X.AbstractC1532350pyj;
import X.AbstractC19994813Le;
import X.C01GW;
import X.C086F;
import X.C08AB;
import X.C098200Yq;
import X.C0X79;
import X.C13LP;
import X.C1529350ptt;
import X.C1529710puT;
import X.C1529990puv;
import X.C1530570pvr;
import X.C1532310pyf;
import X.C1533790q13;
import X.C1533900q1E;
import X.C1533920q1G;
import X.C1535630q41;
import X.C1537480q70;
import X.C1541080qCo;
import X.C1541400qDK;
import X.C1541430qDN;
import X.C1541450qDP;
import X.C15438062q;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C443120HZe;
import X.C452501pT;
import X.C786410Ut5;
import X.C828440Weg;
import X.C830720WiM;
import X.EnumC1533980q1M;
import X.EnumC1541410qDL;
import X.InterfaceC1541390qDJ;
import X.InterfaceC1541440qDO;
import X.InterfaceC1544780qIm;
import X.RunnableC830750WiP;
import X.RunnableC830760WiQ;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public final class TTWebViewHelper extends C1541400qDK {
    public static Long appStartTime;
    public static Long applicationAttachDuration;
    public static Long applicationCreateDuration;
    public static n bidConfig;
    public static Long coldBootEndTime;
    public static Long feedUIDuration;
    public static Long firstFeedEndTime;
    public static Long initTime;
    public static boolean isTTWebViewInitialized;
    public static boolean isTTWebViewRemoved;
    public static volatile boolean isTTWebViewTriedInitialized;
    public static boolean isTTWebViewTriedPreInitBrowser;
    public static boolean isTTWebViewTriedPreRender;
    public static String loadResult;
    public static Long mainActivityCreateDuration;
    public static Long mainActivityFocusDuration;
    public static Long mainActivityResumeDuration;
    public static h overallConfig;
    public static Long splitCompatInstallExecuteTime;
    public static Long splitCompatInstallTimeCost;
    public static Long ttKernelVersion;
    public static Long ttWebInitCost;
    public static String ttWebInitMsg;
    public static Long ttWebPreCheckCost;
    public static Integer ttWebTriggerPoint;
    public static List<String> ttWebViewBidAllowList;
    public static List<String> ttWebViewBidBlockList;
    public static InterfaceC1541390qDJ ttWebViewRuntimeService;
    public static List<String> ttWebViewUrlAllowList;
    public static List<String> ttWebViewUrlBlockList;
    public static n urlConfig;
    public static String versionCode;
    public static final TTWebViewHelper INSTANCE = new TTWebViewHelper();
    public static final C01GW keva$delegate = C452501pT.LIZIZ(new C1541450qDP());
    public static final ByteArrayInputStream EMPTY_INPUT_STREAM = new ByteArrayInputStream(new byte[0]);
    public static TTWebViewStatusModel statusModel = new TTWebViewStatusModel();

    @Override // X.C1541400qDK
    public void onWebViewLoadUrl(WebKitView webKitView, String str) {
    }

    @Override // X.AbstractC1530000puw
    public boolean preloadOnlineResourceToEngine(C1533900q1E c1533900q1E, C1533790q13 c1533790q13, Long l) {
        return false;
    }

    @Override // X.C1541400qDK
    public boolean enableAddDocumentJS() {
        TTWebViewStatusModel tTWebViewStatusModel = statusModel;
        return tTWebViewStatusModel.isTTWebViewEnabled && tTWebViewStatusModel.enableAddDocumentJS;
    }

    @Override // X.C1541400qDK
    public boolean enableOptimizeIframeJSInjection() {
        TTWebViewStatusModel tTWebViewStatusModel = statusModel;
        return tTWebViewStatusModel.isTTWebViewEnabled && tTWebViewStatusModel.enableOptimizeIframeJSInjection;
    }

    @Override // X.C1541400qDK
    public boolean enablePreloadJSInjection() {
        TTWebViewStatusModel tTWebViewStatusModel = statusModel;
        return tTWebViewStatusModel.isTTWebViewEnabled && tTWebViewStatusModel.enablePreloadJSInjection;
    }

    @Override // X.C1541400qDK
    public String getDefaultUserAgent() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        String defaultUserAgent;
        return (!isTTWebViewInitialized || (interfaceC1541390qDJ = ttWebViewRuntimeService) == null || (defaultUserAgent = interfaceC1541390qDJ.getDefaultUserAgent()) == null) ? "" : defaultUserAgent;
    }

    public final Keva getKeva() {
        return (Keva) keva$delegate.getValue();
    }

    public final long getPreInitDuration() {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ != null) {
            return interfaceC1541390qDJ.getPreInitDuration();
        }
        return -1L;
    }

    public final int getPreInitStatus() {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ != null) {
            return interfaceC1541390qDJ.getPreInitStatus();
        }
        return 0;
    }

    @Override // X.C1541400qDK
    public boolean isRenderAlive() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        return isTTWebViewInitialized && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null && interfaceC1541390qDJ.isRenderAlive();
    }

    @Override // X.C1541400qDK
    public boolean isTTWebViewLoaded() {
        Object c098200Yq;
        if (!isTTWebViewInitialized) {
            return false;
        }
        try {
            InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
            c098200Yq = Boolean.valueOf(interfaceC1541390qDJ != null && interfaceC1541390qDJ.isTTWebViewLoaded());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C1541400qDK
    public boolean isTTWebViewTTNetResLoadEnable() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        Boolean boolValueOf;
        if (isTTWebViewInitialized && statusModel.enableTTNetLoad && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null && (boolValueOf = Boolean.valueOf(interfaceC1541390qDJ.isTTNetNativeEnable())) != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean isTTWebViewTriedInitialized() {
        return isTTWebViewTriedInitialized && ttWebInitCost != null;
    }

    @Override // X.C1541400qDK
    public void onBootFinish() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (isTTWebViewTriedInitialized && statusModel.isTTWebViewEnabled && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null) {
            interfaceC1541390qDJ.onBootFinish();
        }
    }

    @Override // X.C1541400qDK
    public void onColdStartFinish() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (isTTWebViewTriedInitialized && statusModel.isTTWebViewEnabled && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null) {
            interfaceC1541390qDJ.onColdStartFinish();
        }
    }

    @Override // X.C1541400qDK
    public void onFirstFrameFinish() {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (isTTWebViewTriedInitialized && statusModel.isTTWebViewEnabled && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null) {
            interfaceC1541390qDJ.onFirstFrameFinish();
        }
    }

    public final void preRender() {
        if (!isTTWebViewInitialized || isTTWebViewTriedPreRender) {
            return;
        }
        isTTWebViewTriedPreRender = true;
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ != null) {
            interfaceC1541390qDJ.preRender();
        }
    }

    public final boolean tryPreInitBrowserAsync() {
        boolean zPreInitBrowser = false;
        if (!isTTWebViewTriedPreInitBrowser && isTTWebViewInitialized) {
            isTTWebViewTriedPreInitBrowser = true;
            try {
                InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
                if (interfaceC1541390qDJ == null) {
                    return false;
                }
                zPreInitBrowser = interfaceC1541390qDJ.preInitBrowser();
                return zPreInitBrowser;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return zPreInitBrowser;
    }

    private final boolean checkVersion() {
        List listLJJLIIIJILLIZJL;
        String str;
        Integer numLJIIJJI;
        int iIntValue;
        String sysWebViewVersion = getSysWebViewVersion();
        if (sysWebViewVersion != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(sysWebViewVersion, new String[]{e3.d}, 0, 6)) != null && (str = (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            Long l = ttKernelVersion;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue >= 100) {
                    Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(String.valueOf(jLongValue).substring(0, 3));
                    if (numLJIIJJI2 == null) {
                        return true;
                    }
                    iIntValue = numLJIIJJI2.intValue();
                } else {
                    iIntValue = (int) jLongValue;
                }
                n nVar = statusModel.versionConfig;
                if (nVar.LJJIJIIJIL("ABSOLUTE_CHECK")) {
                    try {
                        if (CastLongProtector.parseLong(nVar.LJJIIZ("ABSOLUTE_CHECK").LJIL()) > iIntValue) {
                            return false;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (nVar.LJJIJIIJIL("RELATIVE_CHECK")) {
                    try {
                        if (((long) iIntValue) + CastLongProtector.parseLong(nVar.LJJIIZ("RELATIVE_CHECK").LJIL()) < iIntValue2) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (nVar.LJJIJIIJIL("RANGE_CHECK")) {
                    try {
                        h hVarLJIIL = nVar.LJJIIZ("RANGE_CHECK").LJIIL();
                        long j = CastLongProtector.parseLong(hVarLJIIL.LJJIIJZLJL(0).LJIL());
                        long j2 = CastLongProtector.parseLong(hVarLJIIL.LJJIIJZLJL(1).LJIL());
                        long j3 = CastLongProtector.parseLong(hVarLJIIL.LJJIIJZLJL(2).LJIL());
                        long j4 = iIntValue;
                        if (j <= j4 && j4 <= j2) {
                            if (iIntValue2 >= j3) {
                                return false;
                            }
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
            }
        }
        return true;
    }

    private final int getFlag() {
        return getKeva().getInt("flag", 0);
    }

    public final String getSysWebViewVersion() {
        return getKeva().getString("system_webview_version", null);
    }

    @Override // X.AbstractC1530000puw
    public boolean isEngineSupportKeepCacheForTime() {
        return isRenderAlive();
    }

    public final Long getAppStartTime() {
        return appStartTime;
    }

    public final Long getColdBootEndTime() {
        return coldBootEndTime;
    }

    public final Long getFirstFeedEndTime() {
        return firstFeedEndTime;
    }

    public final Long getInitTime() {
        return initTime;
    }

    public final String getLoadResult() {
        return loadResult;
    }

    public final Long getTTWebViewVersion() {
        return ttKernelVersion;
    }

    public final Long getTtKernelVersion() {
        return ttKernelVersion;
    }

    public final Long getTtWebInitCost() {
        return ttWebInitCost;
    }

    public final String getTtWebInitMsg() {
        return ttWebInitMsg;
    }

    public final Long getTtWebPreCheckCost() {
        return ttWebPreCheckCost;
    }

    public final Integer getTtWebTriggerPoint() {
        return ttWebTriggerPoint;
    }

    public final InterfaceC1541390qDJ getTtWebViewRuntimeService() {
        return ttWebViewRuntimeService;
    }

    public final boolean hasTriedPreInitBrowser() {
        return isTTWebViewTriedPreInitBrowser;
    }

    @Override // X.C1541400qDK
    public boolean isTTWebViewInitialized() {
        return isTTWebViewInitialized;
    }

    private final List<String> getMetricsKeys(C1537480q70 c1537480q70) {
        Unit unit;
        Set<Map.Entry<String, k>> setEntrySet;
        Unit unit2;
        h hVarLJJIIZI;
        ArrayList arrayList = new ArrayList();
        Unit unit3 = null;
        try {
            n nVar = bidConfig;
            if (nVar != null && (hVarLJJIIZI = nVar.LJJIIZI(c1537480q70.bid)) != null) {
                Iterator<k> it2 = hVarLJJIIZI.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LJIL());
                }
                unit2 = Unit.LIZ;
            } else {
                unit2 = null;
            }
            C189200o6.m2constructorimpl(unit2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            n nVar2 = urlConfig;
            if (nVar2 != null && (setEntrySet = nVar2.entrySet()) != null) {
                Iterator<T> it3 = setEntrySet.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    String str = (String) entry.getKey();
                    String strLJII = c1537480q70.LJII();
                    boolean z = false;
                    if (strLJII != null && a0.LJJIIZI(strLJII, str, true)) {
                        z = true;
                    }
                    if (z) {
                        Iterator<k> it4 = ((k) entry.getValue()).LJIIL().iterator();
                        while (it4.hasNext()) {
                            arrayList.add(it4.next().LJIL());
                        }
                    }
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            h hVar = overallConfig;
            if (hVar != null) {
                Iterator<k> it5 = hVar.iterator();
                while (it5.hasNext()) {
                    arrayList.add(it5.next().LJIL());
                }
                unit3 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit3);
            return arrayList;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
            return arrayList;
        }
    }

    public static final JSONObject getWebViewLoadingTelemetryMetrics(WebView webView) {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (!INSTANCE.isTTWebView(webView) || (interfaceC1541390qDJ = ttWebViewRuntimeService) == null) {
            return null;
        }
        return interfaceC1541390qDJ.getWebViewLoadingTelemetryMetrics(webView);
    }

    private final JSONObject getWebViewPerformanceMetrics(WebKitView webKitView) {
        Object c098200Yq;
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        Object obj = null;
        if (ttWebViewRuntimeService == null || !isTTWebView(webKitView)) {
            return null;
        }
        try {
            List<String> metricsKeys = INSTANCE.getMetricsKeys(webKitView.getHybridContext());
            if (!(!metricsKeys.isEmpty())) {
                metricsKeys = null;
            }
            if (metricsKeys == null || (interfaceC1541390qDJ = ttWebViewRuntimeService) == null) {
                c098200Yq = null;
            } else {
                c098200Yq = interfaceC1541390qDJ.getWebViewPerformanceMetrics(webKitView, metricsKeys);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (JSONObject) obj;
    }

    public static final void onPageFinished$collectKernelData(WebKitView webKitView) {
        try {
            C1530570pvr.LIZIZ(webKitView.getHybridContext(), "ttweb_collection_start");
            JSONObject webViewPerformanceMetrics = INSTANCE.getWebViewPerformanceMetrics(webKitView);
            if (webViewPerformanceMetrics != null) {
                Iterator<String> itKeys = webViewPerformanceMetrics.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = webViewPerformanceMetrics.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ttweb_");
                        sbLIZ.append(next);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            try {
                                C1537480q70 hybridContext = webKitView.getHybridContext();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append('_');
                                sbLIZ2.append(next2);
                                C1530570pvr.LJ(hybridContext, C2188811AlT.LIZIZ(sbLIZ2), jSONObjectOptJSONObject.opt(next2));
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                }
            }
            C1530570pvr.LIZIZ(webKitView.getHybridContext(), "ttweb_collection_end");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    private final void setFlag(int i) {
        getKeva().storeInt("flag", i);
    }

    public static final void setTTWebViewEnabled(boolean z) {
        if (z) {
            INSTANCE.setFlag(0);
        } else {
            INSTANCE.setFlag(2);
        }
    }

    @Override // X.C1541400qDK
    public boolean enableOptimizeOfflineResource(WebView webView) {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (!isTTWebView(webView) || !statusModel.optimizeOfflineResponse || (interfaceC1541390qDJ = ttWebViewRuntimeService) == null || !interfaceC1541390qDJ.isOfflineNativeInterceptorSupport()) {
            return false;
        }
        return true;
    }

    @Override // X.C1541400qDK
    public boolean isTTWebView(WebView webView) {
        Object c098200Yq;
        boolean z;
        if (!isTTWebViewInitialized) {
            return false;
        }
        try {
            InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
            if (interfaceC1541390qDJ != null && interfaceC1541390qDJ.isTTWebView(webView)) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.C1541400qDK
    public void onDestroy(WebKitView webKitView) {
        Unit unit;
        String webViewError;
        if (isTTWebView(webKitView) && AbstractC19994813Le.Default.nextFloat() < statusModel.webViewErrorReportRate) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
                if (interfaceC1541390qDJ != null && (webViewError = interfaceC1541390qDJ.getWebViewError(webKitView)) != null) {
                    doCommonReport$default(INSTANCE, "webview_error_trace", true, jCurrentTimeMillis, webViewError, null, false, null, 64, null);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // X.C1541400qDK
    public void onPageFinished(WebKitView webKitView) {
        if (isTTWebViewInitialized && isTTWebView(webKitView)) {
            if (statusModel.shouldCollectKernelInfoInMainThread) {
                onPageFinished$collectKernelData(webKitView);
                return;
            }
            WeakReference weakReference = new WeakReference(webKitView);
            C086F c086f = C086F.LIZ;
            C1541430qDN c1541430qDN = new C1541430qDN(weakReference);
            c086f.getClass();
            C086F.LJI(c1541430qDN);
        }
    }

    @Override // X.C1541400qDK
    public void onWebViewCreated(WebKitView webKitView) {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        C1537480q70 hybridContext = webKitView.getHybridContext();
        C1530570pvr.LIZIZ(hybridContext, "ttweb_postcheck_start");
        if (isTTWebView(webKitView)) {
            webKitView.U0(C2097908Jt.LIZJ(new Pair("web_kernel_type", "TTWebView")));
            WebViewMonitorHelper.getInstance().addContext(webKitView, "web_kernel_type", "TTWebView");
            hybridContext.LJIIIZ().LIZJ("ttweb_web_kernel_type", "TTWebView");
            if (statusModel.enableResourceEventReport && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null) {
                interfaceC1541390qDJ.addResourceEventListener(webKitView, new C0X79(webKitView));
            }
        } else {
            webKitView.U0(C2097908Jt.LIZJ(new Pair("web_kernel_type", "SysTTWebView")));
            WebViewMonitorHelper.getInstance().addContext(webKitView, "web_kernel_type", "SysTTWebView");
            hybridContext.LJIIIZ().LIZJ("ttweb_web_kernel_type", "SysTTWebView");
        }
        C1530570pvr.LIZIZ(hybridContext, "ttweb_postcheck_end");
    }

    public final void presetTTWebViewService(TTWebViewStatusModel tTWebViewStatusModel) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (tTWebViewStatusModel != null) {
            statusModel = tTWebViewStatusModel;
            Object obj5 = null;
            try {
                h hVar = tTWebViewStatusModel.blockUrlList;
                if (hVar.size() != 0) {
                    arrayList4 = new ArrayList(C15438062q.LJIJJ(hVar, 10));
                    Iterator<k> it2 = hVar.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(it2.next().LJIL());
                    }
                } else {
                    arrayList4 = null;
                }
                C189200o6.m2constructorimpl(arrayList4);
                obj = arrayList4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq4 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq4);
                obj = c098200Yq4;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj6 = obj;
            if (zM7isFailureimpl) {
                obj6 = null;
            }
            ttWebViewUrlBlockList = (List) obj6;
            try {
                h hVar2 = tTWebViewStatusModel.allowUrlList;
                if (hVar2.size() != 0) {
                    arrayList3 = new ArrayList(C15438062q.LJIJJ(hVar2, 10));
                    Iterator<k> it3 = hVar2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(it3.next().LJIL());
                    }
                } else {
                    arrayList3 = null;
                }
                C189200o6.m2constructorimpl(arrayList3);
                obj2 = arrayList3;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq5 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq5);
                obj2 = c098200Yq5;
            }
            boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(obj2);
            Object obj7 = obj2;
            if (zM7isFailureimpl2) {
                obj7 = null;
            }
            ttWebViewUrlAllowList = (List) obj7;
            try {
                h hVar3 = tTWebViewStatusModel.blockBidList;
                if (hVar3.size() != 0) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(hVar3, 10));
                    Iterator<k> it4 = hVar3.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(it4.next().LJIL());
                    }
                } else {
                    arrayList2 = null;
                }
                C189200o6.m2constructorimpl(arrayList2);
                obj3 = arrayList2;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C098200Yq c098200Yq6 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq6);
                obj3 = c098200Yq6;
            }
            boolean zM7isFailureimpl3 = C189200o6.m7isFailureimpl(obj3);
            Object obj8 = obj3;
            if (zM7isFailureimpl3) {
                obj8 = null;
            }
            ttWebViewBidBlockList = (List) obj8;
            try {
                h hVar4 = tTWebViewStatusModel.allowBidList;
                if (hVar4.size() != 0) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(hVar4, 10));
                    Iterator<k> it5 = hVar4.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(it5.next().LJIL());
                    }
                } else {
                    arrayList = null;
                }
                C189200o6.m2constructorimpl(arrayList);
                obj4 = arrayList;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C098200Yq c098200Yq7 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq7);
                obj4 = c098200Yq7;
            }
            boolean zM7isFailureimpl4 = C189200o6.m7isFailureimpl(obj4);
            Object obj9 = obj4;
            if (zM7isFailureimpl4) {
                obj9 = null;
            }
            ttWebViewBidAllowList = (List) obj9;
            try {
                c098200Yq = tTWebViewStatusModel.metricsConfig.LJJIJ("url_config");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            urlConfig = (n) c098200Yq;
            try {
                c098200Yq2 = tTWebViewStatusModel.metricsConfig.LJJIJ("bid_config");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                c098200Yq2 = new C098200Yq(th6);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            bidConfig = (n) c098200Yq2;
            try {
                c098200Yq3 = tTWebViewStatusModel.metricsConfig.LJJIIZI("overall_config");
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                c098200Yq3 = new C098200Yq(th7);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                obj5 = c098200Yq3;
            }
            overallConfig = (h) obj5;
        }
        C1541400qDK.onTTWebViewServiceRegister(this);
    }

    @Override // X.AbstractC1530000puw
    public void release(C1533900q1E c1533900q1E) {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ != null) {
            interfaceC1541390qDJ.release(c1533900q1E.LIZIZ);
        }
    }

    public final void setTtWebPreCheckCost(Long l) {
        ttWebPreCheckCost = l;
    }

    public final void setTtWebTriggerPoint(Integer num) {
        ttWebTriggerPoint = num;
    }

    @Override // X.C1541400qDK
    public boolean tryPreConnect(String str) {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ != null) {
            return interfaceC1541390qDJ.preConnect(str);
        }
        return false;
    }

    private final void addExtraForestInformation(C1532310pyf c1532310pyf, JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        C08AB c08ab;
        ArrayList<C443120HZe<String, Long, Integer>> arrayList;
        Object objLJJJLL;
        jSONObject.put("res_from", c1532310pyf.LJIIJJI);
        jSONObject.put("res_version", c1532310pyf.LJIIIZ());
        C1529350ptt c1529350ptt = c1532310pyf.LIZ.LJJIIJ;
        String str3 = null;
        if (c1529350ptt != null) {
            str = c1529350ptt.LIZ;
        } else {
            str = null;
        }
        jSONObject.put("gecko_access_key", str);
        C1529350ptt c1529350ptt2 = c1532310pyf.LIZ.LJJIIJ;
        if (c1529350ptt2 != null) {
            str2 = c1529350ptt2.LIZIZ;
        } else {
            str2 = null;
        }
        jSONObject.put("gecko_channel", str2);
        C1529350ptt c1529350ptt3 = c1532310pyf.LIZ.LJJIIJ;
        if (c1529350ptt3 != null) {
            str3 = c1529350ptt3.LIZJ;
        }
        jSONObject.put("gecko_bundle", str3);
        C1541080qCo<C1532310pyf> c1541080qCo = c1532310pyf.LIZ.LJJIIZI;
        if (c1541080qCo != null && (c08ab = c1541080qCo.LJIIL) != null && (arrayList = c08ab.LIZJ) != null && (objLJJJLL = C13LP.LJJJLL(arrayList)) != null) {
            jSONObject.put("client_start_timing", objLJJJLL);
        }
    }

    @Override // X.C1541400qDK
    public void addResourceEventListener(WebView webView, Function1<? super String, Unit> function1) {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        WebKitView webKitView;
        if (!statusModel.enableResourceEventReport || !isTTWebView(webView)) {
            return;
        }
        if ((!(webView instanceof WebKitView) || (webKitView = (WebKitView) webView) == null || !webKitView.LIZJ(webView)) && (interfaceC1541390qDJ = ttWebViewRuntimeService) != null) {
            interfaceC1541390qDJ.addResourceEventListener(webView, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x00b3, B:28:0x00b9, B:29:0x00bd), top: B:55:0x00b3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x00b3, B:28:0x00b9, B:29:0x00bd), top: B:55:0x00b3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void checkStatus(X.InterfaceC1541440qDO r22, final boolean r23) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper.checkStatus(X.0qDO, boolean):void");
    }

    public final Pair<InterfaceC1541390qDJ, Throwable> getTTWebViewRuntimeServiceAndError(Context context, String str) {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        Throwable th = null;
        if (interfaceC1541390qDJ != null) {
            return new Pair<>(interfaceC1541390qDJ, null);
        }
        synchronized (this) {
            try {
                InterfaceC1541390qDJ interfaceC1541390qDJ2 = ttWebViewRuntimeService;
                if (interfaceC1541390qDJ2 != null) {
                    return new Pair<>(interfaceC1541390qDJ2, null);
                }
                try {
                    InterfaceC1541390qDJ interfaceC1541390qDJ3 = (InterfaceC1541390qDJ) Class.forName(str).newInstance();
                    ttWebViewRuntimeService = interfaceC1541390qDJ3;
                    interfaceC1541390qDJ3.preInitTTWebView(context);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                }
                return new Pair<>(ttWebViewRuntimeService, th);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    @Override // X.C1541400qDK
    public WebResourceResponse handleForestResponse(WebView webView, C1533790q13 c1533790q13) throws JSONException {
        File fileLJIIJ;
        String string;
        if (enableOptimizeOfflineResource(webView) && c1533790q13.LIZIZ && (fileLJIIJ = C1533790q13.LJIIJ(c1533790q13)) != null && fileLJIIJ.isFile()) {
            C1529710puT c1529710puT = C1529710puT.LIZ;
            String strLIZIZ = c1533790q13.LIZIZ();
            String str = c1533790q13.LJJIIZI;
            ByteArrayInputStream byteArrayInputStream = EMPTY_INPUT_STREAM;
            String str2 = c1533790q13.LIZ.LJJJJIZL;
            Map<String, String> map = c1533790q13.LJIILLIIL;
            c1529710puT.getClass();
            WebResourceResponse webResourceResponseLIZLLL = C1529710puT.LIZLLL(strLIZIZ, str, byteArrayInputStream, str2, map);
            if (webResourceResponseLIZLLL != null) {
                webResourceResponseLIZLLL.getResponseHeaders().put("X-TTWEB-CONTROL-LOADER-TYPE", "FILE");
                Map<String, String> responseHeaders = webResourceResponseLIZLLL.getResponseHeaders();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("abs_file_path", fileLJIIJ.getAbsolutePath());
                responseHeaders.put("X-TTWEB-CONTROL-OFFLINE-PARAMS", C786410Ut5.J3(jSONObject));
                Long lValueOf = Long.valueOf(c1533790q13.LJIIIZ);
                if ((lValueOf.longValue() > 0 || (lValueOf = c1533790q13.LJIILIIL) != null) && (string = lValueOf.toString()) != null) {
                    webResourceResponseLIZLLL.getResponseHeaders().put("x-ttwebview-response-update-time", string);
                }
                webResourceResponseLIZLLL.setData(null);
                Map<String, String> responseHeaders2 = webResourceResponseLIZLLL.getResponseHeaders();
                JSONObject jSONObject2 = new JSONObject();
                C1533920q1G.LIZ(c1533790q13, jSONObject2);
                responseHeaders2.put("X-TTWEB-CONTROL-EXTRA", C786410Ut5.J3(jSONObject2));
                return webResourceResponseLIZLLL;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1541400qDK
    public WebResourceResponse handleForestXResponse(WebView webView, C1532310pyf c1532310pyf) throws JSONException {
        AbstractC1532350pyj abstractC1532350pyjLJIIIIZZ;
        File file;
        if (enableOptimizeOfflineResource(webView) && c1532310pyf.isSuccess() && (abstractC1532350pyjLJIIIIZZ = c1532310pyf.LJIIIIZZ(File.class)) != null && (file = (File) abstractC1532350pyjLJIIIIZZ.LIZ) != null) {
            C1529710puT c1529710puT = C1529710puT.LIZ;
            String strLJ = c1532310pyf.LJ();
            String strLIZLLL = c1532310pyf.LIZLLL();
            ByteArrayInputStream byteArrayInputStream = EMPTY_INPUT_STREAM;
            String str = c1532310pyf.LIZ.LJJIII.LIZ;
            Map<String, String> mapLJI = c1532310pyf.LJI();
            c1529710puT.getClass();
            WebResourceResponse webResourceResponseLIZLLL = C1529710puT.LIZLLL(strLJ, strLIZLLL, byteArrayInputStream, str, mapLJI);
            if (webResourceResponseLIZLLL != null) {
                webResourceResponseLIZLLL.getResponseHeaders().put("X-TTWEB-CONTROL-LOADER-TYPE", "FILE");
                Map<String, String> responseHeaders = webResourceResponseLIZLLL.getResponseHeaders();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("abs_file_path", file.getAbsolutePath());
                responseHeaders.put("X-TTWEB-CONTROL-OFFLINE-PARAMS", C786410Ut5.J3(jSONObject));
                Long lLJIIIZ = c1532310pyf.LJIIIZ();
                if (lLJIIIZ != null) {
                    webResourceResponseLIZLLL.getResponseHeaders().put("x-ttwebview-response-update-time", String.valueOf(lLJIIIZ.longValue()));
                }
                webResourceResponseLIZLLL.setData(null);
                Map<String, String> responseHeaders2 = webResourceResponseLIZLLL.getResponseHeaders();
                JSONObject jSONObject2 = new JSONObject();
                INSTANCE.addExtraForestInformation(c1532310pyf, jSONObject2);
                responseHeaders2.put("X-TTWEB-CONTROL-EXTRA", C786410Ut5.J3(jSONObject2));
                return webResourceResponseLIZLLL;
            }
        }
        return null;
    }

    public final void updateCookieDBVersion(Context context, String str) throws JSONException {
        StringBuilder sb;
        int cookieDBVersion;
        Object c098200Yq;
        int i = statusModel.cookieDirDepth;
        JSONObject loadTimingInfo = null;
        if (AbstractC19994813Le.Default.nextFloat() < statusModel.cookieDirTraceRate) {
            sb = new StringBuilder();
        } else {
            sb = null;
        }
        InterfaceC1541390qDJ first = getTTWebViewRuntimeServiceAndError(context, str).getFirst();
        if (first != null) {
            cookieDBVersion = first.getCookieDBVersion(context, i, sb);
        } else {
            cookieDBVersion = -1;
        }
        getKeva().storeInt("cookie_db_version", cookieDBVersion);
        if (isTTWebViewTriedInitialized) {
            try {
                InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
                if (interfaceC1541390qDJ != null) {
                    c098200Yq = interfaceC1541390qDJ.getLoadInfo();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("multiCore", 0);
            jSONObject.put("triggerPoint", ttWebTriggerPoint);
            jSONObject.put("cookieMsg", String.valueOf(sb));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, isTTWebViewInitialized);
            String str2 = ttWebInitMsg;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("message", str2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cost", ttWebInitCost);
            jSONObject3.put("host_pre_check_cost", ttWebPreCheckCost);
            InterfaceC1541390qDJ interfaceC1541390qDJ2 = ttWebViewRuntimeService;
            if (interfaceC1541390qDJ2 != null) {
                loadTimingInfo = interfaceC1541390qDJ2.getLoadTimingInfo();
            }
            jSONObject3.put("detail_timing", loadTimingInfo);
            doCommonReport("ttwebview_init_event", jSONObject2, jSONObject3, jSONObject);
        }
    }

    public final void tryInitRenderProcess(Context context, String str, InterfaceC1541440qDO interfaceC1541440qDO) {
        boolean z;
        interfaceC1541440qDO.LIZJ(context);
        InterfaceC1541390qDJ first = getTTWebViewRuntimeServiceAndError(context, str).getFirst();
        if (first == null) {
            return;
        }
        try {
            first.initTTWebViewRenderProcess(context);
            th = null;
            z = true;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            z = false;
        }
        isTTWebViewInitialized = z;
        Objects.toString(th);
        if (isTTWebViewInitialized) {
            C1541400qDK.onTTWebViewServiceRegister(this);
        }
    }

    @Override // X.C1541400qDK
    public InterfaceC1544780qIm addDocumentStartJavaScript(WebView webView, String str, Set<String> set, EnumC1541410qDL enumC1541410qDL) {
        InterfaceC1541390qDJ interfaceC1541390qDJ;
        if (!isTTWebViewInitialized || (interfaceC1541390qDJ = ttWebViewRuntimeService) == null) {
            return null;
        }
        return interfaceC1541390qDJ.addDocumentStartJavaScript(webView, str, set, enumC1541410qDL.getScope());
    }

    public final void doCommonReport(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C086F c086f = C086F.LIZ;
        C828440Weg c828440Weg = new C828440Weg(str, jSONObject3, jSONObject, jSONObject2);
        c086f.getClass();
        C086F.LJI(c828440Weg);
    }

    private final JSONObject generateExtraJSONObject(EnumC1533980q1M enumC1533980q1M, Map<String, ? extends Object> map, JSONObject jSONObject, Long l, Long l2) throws JSONException {
        boolean z;
        long jLongValue;
        boolean zBooleanValue;
        Boolean bool;
        JSONObject jSONObject2 = new JSONObject();
        if (enumC1533980q1M != EnumC1533980q1M.WEB_MAIN_DOCUMENT && enumC1533980q1M != EnumC1533980q1M.LYNX_TEMPLATE) {
            z = false;
        } else {
            z = true;
        }
        jSONObject2.put("isMainResource", z);
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = C1535630q41.LJIIL;
        }
        jSONObject2.put("stayTimeMs", jLongValue);
        Object obj = null;
        if (map != null) {
            obj = map.get("keepAlive");
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        jSONObject2.put("keepAlive", zBooleanValue);
        jSONObject2.put("responseTime", l);
        jSONObject2.put("forceConsumeCodecache", false);
        jSONObject2.put("biz_info", jSONObject);
        return jSONObject2;
    }

    private final boolean isTTWebViewBundleInstalled(Context context, String str, InterfaceC1541440qDO interfaceC1541440qDO, String str2, boolean z) {
        if (Intrinsics.LJFF(getKeva().getString("install_version", null), str2)) {
            return true;
        }
        if ((!z || getTTWebViewRuntimeServiceAndError(context, str).getFirst() == null) && !interfaceC1541440qDO.LIZLLL()) {
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1530000puw
    public boolean preloadLocalFileToEngine(String str, String str2, JSONObject jSONObject, String str3, Long l) {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ == null || !interfaceC1541390qDJ.preloadFile(str, C2097908Jt.LIZJ(new Pair(str2, str3)), jSONObject, null)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void doCommonReport$default(TTWebViewHelper tTWebViewHelper, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        if ((i & 4) != 0) {
            jSONObject2 = new JSONObject();
        }
        tTWebViewHelper.doCommonReport(str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void doCommonReport(String str, boolean z, long j, String str2, JSONObject jSONObject, boolean z2, JSONObject jSONObject2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C086F c086f = C086F.LIZ;
        C830720WiM c830720WiM = new C830720WiM(jSONObject2, str2, z, z2, jSONObject, jElapsedRealtime, j, str);
        c086f.getClass();
        C086F.LJI(c830720WiM);
    }

    public final synchronized boolean initTTWebView(Context context, String str, InterfaceC1541440qDO interfaceC1541440qDO, TTWebViewStatusModel tTWebViewStatusModel, String str2, long j, boolean z, int i) {
        Object c098200Yq;
        String message;
        Object c098200Yq2;
        if (isTTWebViewTriedInitialized) {
            return false;
        }
        statusModel = tTWebViewStatusModel;
        if (!tTWebViewStatusModel.isTTWebViewEnabled) {
            return false;
        }
        appStartTime = Long.valueOf(j);
        isTTWebViewTriedInitialized = true;
        ttWebTriggerPoint = Integer.valueOf(i);
        versionCode = str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int flag = getFlag();
        if (flag != 0) {
            ttWebInitCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag is ");
            sbLIZ.append(flag);
            ttWebInitMsg = C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        int i2 = getKeva().getInt("cookie_db_version", -1);
        if (i2 <= 0) {
            ttWebInitCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cookie version not support ");
            sbLIZ2.append(i2);
            ttWebInitMsg = C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
        Integer numValueOf = Integer.valueOf(statusModel.minSupportedCookieDBVersion);
        if (numValueOf.intValue() > 0) {
            String message2 = null;
            if (1 != 0) {
                int iIntValue = numValueOf.intValue();
                Integer numValueOf2 = Integer.valueOf(statusModel.maxSupportedCookieDBVersion);
                if (numValueOf2.intValue() <= 0) {
                    return false;
                }
                int iIntValue2 = numValueOf2.intValue();
                if (i2 >= iIntValue && i2 <= iIntValue2) {
                    boolean zIsTTWebViewBundleInstalled = isTTWebViewBundleInstalled(context, str, interfaceC1541440qDO, str2, z);
                    Pair<InterfaceC1541390qDJ, Throwable> tTWebViewRuntimeServiceAndError = getTTWebViewRuntimeServiceAndError(context, str);
                    InterfaceC1541390qDJ first = tTWebViewRuntimeServiceAndError.getFirst();
                    if (first == null) {
                        ttWebInitCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("runtimeService error ");
                        Throwable second = tTWebViewRuntimeServiceAndError.getSecond();
                        if (second != null) {
                            message2 = second.getMessage();
                        }
                        sbLIZ3.append(message2);
                        ttWebInitMsg = C2188811AlT.LIZIZ(sbLIZ3);
                        return false;
                    }
                    if (!zIsTTWebViewBundleInstalled) {
                        try {
                            INSTANCE.getKeva().storeString("install_version", str2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                    }
                    try {
                        c098200Yq2 = new JSONObject(statusModel.ttwebConfig.toString());
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    JSONObject jSONObject = (JSONObject) c098200Yq2;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    ttWebPreCheckCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                    c098200Yq = Boolean.valueOf(first.initTTWebView(context, jSONObject));
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl == null) {
                        thM5exceptionOrNullimpl = null;
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
                    if (zBooleanValue) {
                        isTTWebViewInitialized = true;
                        C1529990puv.LIZ = INSTANCE;
                        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
                        if (interfaceC1541390qDJ != null) {
                            interfaceC1541390qDJ.registerDataReportListener();
                        }
                        Long l = statusModel.browserPreInitDelayTime;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            C086F c086f = C086F.LIZ;
                            RunnableC830750WiP runnableC830750WiP = new Runnable() { // from class: X.0WiP
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("TTWebViewHelper@e93e.initTTWebView$1$1");
                                    try {
                                        TTWebViewHelper.INSTANCE.tryPreInitBrowserAsync();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("TTWebViewHelper@e93e.initTTWebView$1$1");
                                }
                            };
                            c086f.getClass();
                            C086F.LIZJ(jLongValue, runnableC830750WiP);
                        }
                        Long l2 = statusModel.prerenderDelayTime;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            C086F c086f2 = C086F.LIZ;
                            RunnableC830760WiQ runnableC830760WiQ = new Runnable() { // from class: X.0WiQ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("TTWebViewHelper@e93e.initTTWebView$2$1");
                                    try {
                                        TTWebViewHelper.INSTANCE.preRender();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("TTWebViewHelper@e93e.initTTWebView$2$1");
                                }
                            };
                            c086f2.getClass();
                            C086F.LIZJ(jLongValue2, runnableC830760WiQ);
                        }
                    }
                    ttWebInitCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("status:");
                    sbLIZ4.append(zBooleanValue);
                    sbLIZ4.append(", error:");
                    if (thM5exceptionOrNullimpl == null) {
                        message = null;
                    } else {
                        message = thM5exceptionOrNullimpl.getMessage();
                    }
                    sbLIZ4.append(message);
                    ttWebInitMsg = C2188811AlT.LIZIZ(sbLIZ4);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("finish Init TTWebView in ");
                    sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ5.append(" ms, success=");
                    sbLIZ5.append(isTTWebViewInitialized);
                    sbLIZ5.append(", error:");
                    if (thM5exceptionOrNullimpl != null) {
                        message2 = thM5exceptionOrNullimpl.getMessage();
                    }
                    sbLIZ5.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    return isTTWebViewInitialized;
                }
                ttWebInitCost = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("cookie version error ");
                sbLIZ6.append(i2);
                ttWebInitMsg = C2188811AlT.LIZIZ(sbLIZ6);
                return false;
            }
        }
        return false;
    }

    @Override // X.AbstractC1530000puw
    public boolean preloadBytesToEngine(String str, String str2, EnumC1533980q1M enumC1533980q1M, Map<String, ? extends Object> map, JSONObject jSONObject, Long l, byte[] bArr, Long l2) {
        InterfaceC1541390qDJ interfaceC1541390qDJ = ttWebViewRuntimeService;
        if (interfaceC1541390qDJ == null || !interfaceC1541390qDJ.preloadBytes(str, str2, bArr, generateExtraJSONObject(enumC1533980q1M, map, jSONObject, l, l2), null)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void doCommonReport$default(TTWebViewHelper tTWebViewHelper, String str, boolean z, long j, String str2, JSONObject jSONObject, boolean z2, JSONObject jSONObject2, int i, Object obj) {
        if ((i & 64) != 0) {
            jSONObject2 = null;
        }
        tTWebViewHelper.doCommonReport(str, z, j, str2, jSONObject, z2, jSONObject2);
    }
}
