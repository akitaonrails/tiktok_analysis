package com.ss.android.ugc.aweme.hybridkit.web.hooks;

import X.C1491570oux;
import X.C1530570pvr;
import X.C1537480q70;
import X.C1544810qIp;
import X.C1955407lI;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2202461BHw;
import X.EnumC1537220q6a;
import X.InterfaceC1491630ov3;
import X.InterfaceC1541990qEH;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebMonitorExt;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class WebMonitorExt extends C2202461BHw {
    public static final AtomicBoolean LLJ = new AtomicBoolean(false);

    public WebMonitorExt() {
        super(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(WebView webView, WebResourceRequest webResourceRequest) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && (webView instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) webView) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
            C1530570pvr.LIZJ(hybridContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_END}, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(final WebView webView, final WebResourceRequest webResourceRequest) {
        boolean z;
        final String strLIZLLL;
        boolean z2;
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        Uri url = null;
        if (z && (webView instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) webView) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
            C1530570pvr.LIZJ(hybridContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_START}, Long.valueOf(System.currentTimeMillis()));
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        JSInjectConfig jSInjectConfig = C1544810qIp.LIZ;
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        }
        if (C1544810qIp.LIZIZ.get(String.valueOf(url)) != null) {
            return webResourceResponseShouldInterceptRequest;
        }
        if (webView == 0 || (strLIZLLL = C1955407lI.LIZLLL(webView)) == null) {
            strLIZLLL = "";
        }
        if (!a0.LJJJIL(strLIZLLL)) {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            C1491570oux.LJI(c1491570oux, strLIZLLL, new InterfaceC1491630ov3() { // from class: X.0piq
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj) {
                    if (obj == null) {
                        C1491570oux c1491570oux2 = C1491570oux.LIZ;
                        String str = strLIZLLL;
                        c1491570oux2.getClass();
                        C1491570oux.LIZ(600000L, str, false, false);
                    }
                }
            });
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("spark_web_intercept");
                sbLIZ.append("_main_doc_start");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("spark_web_intercept");
                sbLIZ2.append("_main_doc_end");
                C1491570oux.LJIILLIIL(c1491570oux, strLIZLLL, C2097608Jq.LJIIIIZZ(new Pair(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jCurrentTimeMillis)), new Pair(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(System.currentTimeMillis()))));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("spark_web_intercept");
            sbLIZ3.append("_first_res_start");
            C1491570oux.LJIIJ(strLIZLLL, C2188811AlT.LIZIZ(sbLIZ3), true, new InterfaceC1491630ov3() { // from class: X.0pip
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj) {
                    if (obj == null) {
                        C1491570oux c1491570oux2 = C1491570oux.LIZ;
                        String str = strLIZLLL;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("spark_web_intercept");
                        sbLIZ4.append("_first_res_start");
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("spark_web_intercept");
                        sbLIZ5.append("_first_res_end");
                        C1491570oux.LJIILLIIL(c1491570oux2, str, C2097608Jq.LJIIIIZZ(new Pair(C2188811AlT.LIZIZ(sbLIZ4), Long.valueOf(jCurrentTimeMillis)), new Pair(C2188811AlT.LIZIZ(sbLIZ5), Long.valueOf(System.currentTimeMillis()))));
                    }
                }
            });
        }
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if (webResourceResponseShouldInterceptRequest != null) {
                if (webResourceResponseShouldInterceptRequest.getStatusCode() == 0) {
                    LIZLLL(webView, webResourceRequest);
                    return new WebResourceResponse(webResourceResponseShouldInterceptRequest.getMimeType(), webResourceResponseShouldInterceptRequest.getEncoding(), webResourceResponseShouldInterceptRequest.getData());
                }
                final InputStream data = webResourceResponseShouldInterceptRequest.getData();
                if (data != null) {
                    return new WebResourceResponse(webResourceResponseShouldInterceptRequest.getMimeType(), webResourceResponseShouldInterceptRequest.getEncoding(), webResourceResponseShouldInterceptRequest.getStatusCode(), webResourceResponseShouldInterceptRequest.getReasonPhrase(), webResourceResponseShouldInterceptRequest.getResponseHeaders(), new FilterInputStream(data) { // from class: X.0pjH
                        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            try {
                                super.close();
                                WebMonitorExt webMonitorExt = this;
                                WebView webView2 = webView;
                                WebResourceRequest webResourceRequest2 = webResourceRequest;
                                webMonitorExt.getClass();
                                WebMonitorExt.LIZLLL(webView2, webResourceRequest2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                WebMonitorExt webMonitorExt2 = this;
                                WebView webView3 = webView;
                                WebResourceRequest webResourceRequest3 = webResourceRequest;
                                webMonitorExt2.getClass();
                                WebMonitorExt.LIZLLL(webView3, webResourceRequest3);
                                throw th;
                            }
                        }
                    });
                }
                LIZLLL(webView, webResourceRequest);
                return webResourceResponseShouldInterceptRequest;
            }
            LIZLLL(webView, webResourceRequest);
        }
        return webResourceResponseShouldInterceptRequest;
    }
}
