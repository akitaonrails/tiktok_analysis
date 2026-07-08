package com.ss.android.ugc.aweme.hybridkit.web.inject;

import X.C01GW;
import X.C1543890qHL;
import X.C1544550qIP;
import X.C1544770qIl;
import X.C1544850qIt;
import X.C2202461BHw;
import X.C452501pT;
import X.C828150WeD;
import X.InterfaceC1544310qI1;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class WebViewJSInjectExtImpl extends C2202461BHw {
    public final InterfaceC1544310qI1 LLJ;
    public final C01GW LLJI;

    public WebViewJSInjectExtImpl(C1544850qIt c1544850qIt) {
        super(5);
        this.LLJ = c1544850qIt;
        this.LLJI = C452501pT.LIZIZ(new C828150WeD());
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (((Boolean) this.LLJI.getValue()).booleanValue() && webView != null) {
            C1543890qHL c1543890qHL = C1543890qHL.LIZ;
            if (((Boolean) C1543890qHL.LIZJ.getValue()).booleanValue()) {
                C1544770qIl.LIZ(webView, new C1544550qIP());
            }
        }
        super.onPageFinished(webView, str);
        this.LLJ.onPageFinished(webView, str);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int statusCode;
        if (webResourceRequest != null) {
            webResourceRequest.isForMainFrame();
        }
        WebResourceResponse webResourceResponseLIZIZ = this.LLJ.LIZIZ(webView, webResourceRequest);
        if (webResourceRequest != null) {
            webResourceRequest.isForMainFrame();
        }
        if (webResourceResponseLIZIZ != null) {
            return webResourceResponseLIZIZ;
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        if (webResourceRequest != null) {
            webResourceRequest.isForMainFrame();
        }
        if (webResourceResponseShouldInterceptRequest != null && (!Intrinsics.LJFF(webResourceResponseShouldInterceptRequest.getMimeType(), "text/html") || ((300 <= (statusCode = webResourceResponseShouldInterceptRequest.getStatusCode()) && statusCode < 400) || Intrinsics.LJFF(webResourceResponseShouldInterceptRequest.getReasonPhrase(), "redirect")))) {
            return webResourceResponseShouldInterceptRequest;
        }
        WebResourceResponse webResourceResponseLIZLLL = this.LLJ.LIZLLL(webView, webResourceRequest, webResourceResponseShouldInterceptRequest);
        if (webResourceRequest != null) {
            webResourceRequest.isForMainFrame();
        }
        return webResourceResponseLIZLLL;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webView != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.LLJ.LJII(webView, webResourceRequest.getUrl().toString());
        }
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
        if (webView != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.LLJ.LJI(webView, webResourceRequest.getUrl().toString(), zShouldOverrideUrlLoading);
        }
        return zShouldOverrideUrlLoading;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            this.LLJ.LJII(webView, str);
        }
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        if (webView != null && str != null) {
            this.LLJ.LJI(webView, str, zShouldOverrideUrlLoading);
        }
        return zShouldOverrideUrlLoading;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.LLJ.LIZ(webView, str);
    }
}
