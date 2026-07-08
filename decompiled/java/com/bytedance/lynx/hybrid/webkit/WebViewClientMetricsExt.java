package com.bytedance.lynx.hybrid.webkit;

import X.C0X70;
import X.C0X74;
import X.C2202461BHw;
import X.C786410Ut5;
import X.C843450X6x;
import X.C843460X6y;
import X.C843470X6z;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class WebViewClientMetricsExt extends C2202461BHw {
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Map<String, String> responseHeaders;
        String str;
        C0X70 c0x70;
        Map<String, Object> map;
        C843450X6x c843450X6x = C843460X6y.LIZIZ;
        c843450X6x.set(new C0X70());
        String string = webResourceRequest.getUrl().toString();
        if (C843460X6y.LIZ && (c0x70 = c843450X6x.get()) != null && (map = c0x70.LIZIZ) != null) {
            map.put("res_src", string);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C843470X6z.LIZ(Long.valueOf(jCurrentTimeMillis), "res_intercept_start");
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C843470X6z.LIZ(Long.valueOf(jCurrentTimeMillis2), "res_intercept_finish");
        if (webResourceResponseShouldInterceptRequest != null) {
            InputStream data = webResourceResponseShouldInterceptRequest.getData();
            if (data != null) {
                webResourceResponseShouldInterceptRequest.setData(new C0X74(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), c843450X6x.get(), data));
            }
            if (webResourceResponseShouldInterceptRequest.getResponseHeaders() != null && webResourceResponseShouldInterceptRequest.getResponseHeaders().containsKey("X-TTWEB-CONTROL-EXTRA") && (str = (responseHeaders = webResourceResponseShouldInterceptRequest.getResponseHeaders()).get("X-TTWEB-CONTROL-EXTRA")) != null && !str.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("res_intercept_start", jCurrentTimeMillis);
                    jSONObject.put("res_intercept_finish", jCurrentTimeMillis2);
                    responseHeaders.put("X-TTWEB-CONTROL-EXTRA", C786410Ut5.J3(jSONObject));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C843460X6y.LIZIZ.remove();
        return webResourceResponseShouldInterceptRequest;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream data;
        C0X70 c0x70;
        Map<String, Object> map;
        C843450X6x c843450X6x = C843460X6y.LIZIZ;
        c843450X6x.set(new C0X70());
        if (C843460X6y.LIZ && (c0x70 = c843450X6x.get()) != null && (map = c0x70.LIZIZ) != null) {
            map.put("res_src", str);
        }
        C843470X6z.LIZ(Long.valueOf(System.currentTimeMillis()), "res_intercept_start");
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, str);
        C843470X6z.LIZ(Long.valueOf(System.currentTimeMillis()), "res_intercept_finish");
        if (webResourceResponseShouldInterceptRequest != null && (data = webResourceResponseShouldInterceptRequest.getData()) != null) {
            webResourceResponseShouldInterceptRequest.setData(new C0X74(webView, str, false, c843450X6x.get(), data));
        }
        c843450X6x.remove();
        return webResourceResponseShouldInterceptRequest;
    }
}
