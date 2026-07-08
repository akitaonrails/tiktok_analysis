package com.ss.android.ugc.aweme.hybridkit.forest;

import X.AbstractC1528710psr;
import X.C098200Yq;
import X.C0WTI;
import X.C0X0P;
import X.C1490740otc;
import X.C1529870puj;
import X.C1530310pvR;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533950q1J;
import X.C189200o6;
import X.C19719512Dh;
import X.C2188811AlT;
import X.EnumC1490770otf;
import X.InterfaceC1541990qEH;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SSPFetcher extends ResourceFetcher {
    public static final C0WTI Companion = new C0WTI();

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
    }

    public SSPFetcher(Forest forest) {
        super(forest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        WebResourceRequest webResourceRequest;
        String str;
        WebKitView webKitView;
        C1530310pvR c1530310pvRLJLLL;
        Map<String, String> responseHeaders;
        Map<String, String> responseHeaders2;
        String str2;
        Object c098200Yq;
        if (!c1533490q0Z.LIZ()) {
            return;
        }
        Object obj = c1533490q0Z.LJJJJI;
        final WebResourceResponse webResourceResponse = null;
        if ((obj instanceof WebResourceRequest) && (webResourceRequest = (WebResourceRequest) obj) != null) {
            Object obj2 = c1533490q0Z.LJFF.get("rl_container_uuid");
            if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                C1529870puj.LIZ.getClass();
                InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
                if ((interfaceC1541990qEHLJFF instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEHLJFF) != null) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("spark_ssp_business_fetch_filter", false)) {
                        Companion.getClass();
                        if (C0WTI.LIZ(webResourceRequest, webKitView)) {
                            C1490740otc c1490740otc = C1490740otc.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("skip ssp_fetcher by business filter, url: ");
                            sbLIZ.append(c1533490q0Z.LJJJJIZL);
                            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "SspLifeCycle_");
                            return;
                        }
                    }
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders.get("Sec-Fetch-Site") == null) {
                        requestHeaders.put("Sec-Fetch-Site", "none");
                    }
                    Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
                    if (requestHeaders2.get("Sec-Fetch-Mode") == null) {
                        requestHeaders2.put("Sec-Fetch-Mode", "navigate");
                    }
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null && (c1530310pvRLJLLL = iSparkHostApi.LJLLL(webKitView, webResourceRequest.isForMainFrame(), webResourceRequest.getMethod(), webResourceRequest.getUrl(), webResourceRequest.getRequestHeaders())) != null) {
                        Integer num = c1530310pvRLJLLL.LIZIZ;
                        if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                            webResourceResponse = c1530310pvRLJLLL.LIZ;
                        } else {
                            int i = c1530310pvRLJLLL.LIZJ;
                            if (300 > i || i >= 500) {
                                WebResourceResponse webResourceResponse2 = c1530310pvRLJLLL.LIZ;
                                if (webResourceResponse2 != null && (((responseHeaders = webResourceResponse2.getResponseHeaders()) != null && (str2 = responseHeaders.get("Content-Type")) != null) || ((responseHeaders2 = webResourceResponse2.getResponseHeaders()) != null && (str2 = responseHeaders2.get("content-type")) != null))) {
                                    try {
                                        c098200Yq = C0X0P.LIZJ(str2);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                        c098200Yq = null;
                                    }
                                    C0X0P c0x0p = (C0X0P) c098200Yq;
                                    if (c0x0p != null && C1533950q1J.LJ(webResourceResponse2.getMimeType())) {
                                        if (Intrinsics.LJFF(c0x0p.LIZIZ + '/' + c0x0p.LIZJ, webResourceResponse2.getMimeType())) {
                                            Map<String, String> responseHeaders3 = webResourceResponse2.getResponseHeaders();
                                            if (!C19719512Dh.LJII(responseHeaders3) || responseHeaders3 == null) {
                                                Map<String, String> responseHeaders4 = webResourceResponse2.getResponseHeaders();
                                                if (responseHeaders4 != null) {
                                                    responseHeaders3 = new LinkedHashMap<>(responseHeaders4);
                                                    responseHeaders3.remove("Content-Type");
                                                    responseHeaders3.remove("content-type");
                                                    webResourceResponse2.setResponseHeaders(responseHeaders3);
                                                }
                                            } else {
                                                responseHeaders3.remove("Content-Type");
                                                responseHeaders3.remove("content-type");
                                                webResourceResponse2.setResponseHeaders(responseHeaders3);
                                            }
                                        }
                                    }
                                }
                                webResourceResponse = webResourceResponse2;
                            }
                        }
                        c1533790q13.LJI = false;
                        if (webResourceResponse != null) {
                            c1533790q13.LIZIZ = true;
                            c1533790q13.LJ = "ssp_fetcher";
                            c1533790q13.LJIILLIIL = webResourceResponse.getResponseHeaders();
                            c1533790q13.LJJIIZI = webResourceResponse.getEncoding();
                            c1533790q13.LJJI = webResourceResponse.getMimeType();
                            c1533790q13.LJIILJJIL(new AbstractC1528710psr() { // from class: X.0pvQ
                                public volatile boolean LL;

                                @Override // X.AbstractC1533800q14
                                public final boolean LJI() {
                                    return !this.LL;
                                }

                                @Override // X.AbstractC1533800q14
                                public final InputStream LJIILLIIL() {
                                    if (this.LL) {
                                        return null;
                                    }
                                    this.LL = true;
                                    return webResourceResponse.getData();
                                }
                            });
                            C1490740otc.LIZ.LIZ("success fetch by ssp_fetcher, url: " + c1533490q0Z.LJJJJIZL, EnumC1490770otf.I, "SspLifeCycle_");
                        }
                    }
                }
            }
        }
    }
}
