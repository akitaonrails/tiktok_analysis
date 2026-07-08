package com.ss.android.ugc.aweme.hybridkit.web.ttp;

import X.C098200Yq;
import X.C0X5X;
import X.C0X68;
import X.C0X69;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2202461BHw;
import X.C786410Ut5;
import X.C843000X5e;
import X.C843010X5f;
import X.C843060X5k;
import X.C843070X5l;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ttp.TTHYBRIDXHR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPWebViewClientExt extends C2202461BHw {
    public final C843000X5e LLJ;

    @Override // X.C2202461BHw, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "TTPWebViewClientExt";
    }

    public TTPWebViewClientExt(C843000X5e c843000X5e) {
        super(7);
        this.LLJ = c843000X5e;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C843000X5e c843000X5e = this.LLJ;
        c843000X5e.LIZ.getClass();
        c843000X5e.LIZIZ.getClass();
        c843000X5e.LIZJ.getClass();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0166  */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(final android.webkit.WebView r17, final android.webkit.WebResourceRequest r18) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.web.ttp.TTPWebViewClientExt.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Object c098200Yq;
        if (Build.VERSION.SDK_INT >= 24) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
            if (webView == null) {
                return zShouldOverrideUrlLoading;
            }
            C843000X5e c843000X5e = this.LLJ;
            if (webResourceRequest != null) {
                c843000X5e.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUrlRedirect: ");
                sbLIZ.append(webResourceRequest.getUrl());
                C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                String strValueOf = String.valueOf(webResourceRequest.getUrl());
                if (C843060X5k.LIZIZ(strValueOf)) {
                    C843010X5f.LJI(webView, strValueOf, C0X5X.SCENE_OVER_LOAD);
                    if (C843010X5f.LJFF(webView) && !zShouldOverrideUrlLoading) {
                        C786410Ut5.ue(webView, strValueOf);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onUrlRedirect delegate load: ");
                        sbLIZ2.append(strValueOf);
                        C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                        if (requestHeaders != null && (str = requestHeaders.get("X-TTWEB-CONTROL-REQUEST-INFO")) != null) {
                            try {
                                c098200Yq = new JSONObject(str);
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
                            if (jSONObject != null && jSONObject.optBoolean("from_ttnet_native")) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
                                if (requestHeaders2 == null) {
                                    requestHeaders2 = C2097608Jq.LJ();
                                }
                                linkedHashMap.putAll(requestHeaders2);
                                linkedHashMap.put("web_redirect_proxy", "TTNet");
                                C786410Ut5.ve(webView, strValueOf, linkedHashMap);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onUrlRedirect delegate load2: ");
                                sbLIZ3.append(strValueOf);
                                C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    }
                    zShouldOverrideUrlLoading = true;
                }
                c843000X5e.LIZIZ.getClass();
                c843000X5e.LIZJ.getClass();
                return zShouldOverrideUrlLoading;
            }
            c843000X5e.getClass();
            return zShouldOverrideUrlLoading;
        }
        return false;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, str);
        C843000X5e c843000X5e = this.LLJ;
        if (str != null) {
            c843000X5e.LIZ.getClass();
            c843000X5e.LIZJ.getClass();
            if (webResourceResponseShouldInterceptRequest == null && webView != null) {
                try {
                    if (C843010X5f.LJFF(webView) && C843060X5k.LIZIZ(str)) {
                        C0X68 c0x68LIZIZ = C0X69.LIZIZ(webView, str);
                        if (c0x68LIZIZ != null) {
                            webResourceResponseShouldInterceptRequest = C0X68.LIZ(c0x68LIZIZ, C843010X5f.LIZLLL(webView));
                        } else {
                            webResourceResponseShouldInterceptRequest = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("shouldInterceptRequest1, url:");
                        sbLIZ.append(str);
                        C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c843000X5e.LIZIZ.getClass();
            return webResourceResponseShouldInterceptRequest;
        }
        c843000X5e.getClass();
        return webResourceResponseShouldInterceptRequest;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        if (webView == null) {
            return zShouldOverrideUrlLoading;
        }
        C843000X5e c843000X5e = this.LLJ;
        if (str != null) {
            c843000X5e.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUrlRedirect: ");
            sbLIZ.append(str);
            C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (C843060X5k.LIZIZ(str)) {
                C843010X5f.LJI(webView, str, C0X5X.SCENE_OVER_LOAD);
                if (C843010X5f.LJFF(webView) && !zShouldOverrideUrlLoading) {
                    C786410Ut5.ue(webView, str);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUrlRedirect delegate load: ");
                    sbLIZ2.append(str);
                    C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    zShouldOverrideUrlLoading = true;
                }
            }
            c843000X5e.LIZIZ.getClass();
            c843000X5e.LIZJ.getClass();
            return zShouldOverrideUrlLoading;
        }
        c843000X5e.getClass();
        return zShouldOverrideUrlLoading;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        TTHYBRIDXHR tthybridxhrLJ;
        super.onPageStarted(webView, str, bitmap);
        C843000X5e c843000X5e = this.LLJ;
        c843000X5e.LIZ.getClass();
        if (webView != null && str != null) {
            C843010X5f.LJI(webView, str, C0X5X.SCENE_PAGE_START);
        }
        c843000X5e.LIZIZ.getClass();
        if (webView != null && str != null && C843010X5f.LJFF(webView) && ((tthybridxhrLJ = C843010X5f.LJ(webView)) == null || !tthybridxhrLJ.LIZLLL)) {
            webView.evaluateJavascript("window.__tiktokwebview_ops_hook_inject_method__=1", new ValueCallback() { // from class: X.0X5a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("__tiktokwebview_ops_hook_inject_method__1: ");
                    sbLIZ.append((String) obj);
                    C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            webView.evaluateJavascript(C843010X5f.LIZIZ(), new ValueCallback() { // from class: X.0X5b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("web_hook_js_ajax: ");
                    sbLIZ.append((String) obj);
                    C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            webView.evaluateJavascript(C843010X5f.LIZJ(), new ValueCallback() { // from class: X.0X5c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("hook white list: ");
                    sbLIZ.append((String) obj);
                    C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            webView.evaluateJavascript(C843010X5f.LIZIZ, new ValueCallback() { // from class: X.0X5d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("web_hook_ajax: ");
                    sbLIZ.append((String) obj);
                    C843070X5l.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
        c843000X5e.LIZJ.getClass();
    }
}
