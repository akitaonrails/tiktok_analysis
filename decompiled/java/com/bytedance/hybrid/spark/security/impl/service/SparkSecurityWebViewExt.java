package com.bytedance.hybrid.spark.security.impl.service;

import X.C2188811AlT;
import X.C2202461BHw;
import X.C821780WLo;
import X.C821850WLv;
import X.C828250WeN;
import X.EnumC821770WLn;
import X.InterfaceC821860WLw;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityWebViewExt extends C2202461BHw {
    public final HashMap<Integer, WebResourceResponse> LLJ;
    public final int LLJI;

    public SparkSecurityWebViewExt() {
        super(3);
        this.LLJ = new HashMap<>();
        this.LLJI = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, android.webkit.WebResourceRequest r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.security.impl.service.SparkSecurityWebViewExt.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String name;
        Uri url;
        Uri url2;
        int iHashCode;
        Uri url3;
        boolean z;
        if (this.LLJ.size() >= this.LLJI) {
            this.LLJ.clear();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldOverrideUrlLoading:");
        InterfaceC821860WLw interfaceC821860WLw = null;
        if (webView != null) {
            name = webView.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(", ");
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        } else {
            url = null;
        }
        sbLIZ.append(url);
        C2188811AlT.LIZIZ(sbLIZ);
        if (webResourceRequest != null) {
            url2 = webResourceRequest.getUrl();
        } else {
            url2 = null;
        }
        if (url2 != null) {
            iHashCode = url2.hashCode();
        } else {
            iHashCode = 0;
        }
        int iIdentityHashCode = iHashCode & System.identityHashCode(webView);
        this.LLJ.put(Integer.valueOf(iIdentityHashCode), null);
        if (webResourceRequest != null) {
            url3 = webResourceRequest.getUrl();
        } else {
            url3 = null;
        }
        String strValueOf = String.valueOf(url3);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        Pair pairLIZJ = C828250WeN.LIZJ(webView, strValueOf, z, false, null);
        if (pairLIZJ != null) {
            this.LLJ.put(Integer.valueOf(iIdentityHashCode), (WebResourceResponse) pairLIZJ.getFirst());
            if (!((C821850WLv) pairLIZJ.getSecond()).LIZ) {
                return false;
            }
            C821780WLo c821780WLo = ((C821850WLv) pairLIZJ.getSecond()).LJ;
            if (c821780WLo != null) {
                interfaceC821860WLw = c821780WLo.LIZ;
            }
            if (interfaceC821860WLw != EnumC821770WLn.WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED) {
                return false;
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int iHashCode;
        if (this.LLJ.size() >= this.LLJI) {
            this.LLJ.clear();
        }
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int iIdentityHashCode = iHashCode & System.identityHashCode(webView);
        InterfaceC821860WLw interfaceC821860WLw = null;
        this.LLJ.put(Integer.valueOf(iIdentityHashCode), null);
        Pair pairLIZJ = C828250WeN.LIZJ(webView, str, true, false, null);
        if (pairLIZJ != null) {
            this.LLJ.put(Integer.valueOf(iIdentityHashCode), (WebResourceResponse) pairLIZJ.getFirst());
            if (!((C821850WLv) pairLIZJ.getSecond()).LIZ) {
                return false;
            }
            C821780WLo c821780WLo = ((C821850WLv) pairLIZJ.getSecond()).LJ;
            if (c821780WLo != null) {
                interfaceC821860WLw = c821780WLo.LIZ;
            }
            if (interfaceC821860WLw != EnumC821770WLn.WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED) {
                return false;
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
