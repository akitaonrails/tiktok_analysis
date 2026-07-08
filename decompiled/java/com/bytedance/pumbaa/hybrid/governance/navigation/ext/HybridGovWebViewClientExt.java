package com.bytedance.pumbaa.hybrid.governance.navigation.ext;

import X.C2202461BHw;
import X.C244800x4;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovWebViewClientExt extends C2202461BHw {
    public HybridGovWebViewClientExt() {
        super(4);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        C244800x4 c244800x4 = C244800x4.LIZ;
        Uri url2 = null;
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        } else {
            url = null;
        }
        c244800x4.getClass();
        if (url != null && C244800x4.LIZIZ.containsKey(url.getHost())) {
            if (webResourceRequest != null) {
                url2 = webResourceRequest.getUrl();
            }
            Pair pairLIZ = C244800x4.LIZ(String.valueOf(url2));
            CharSequence charSequence = (CharSequence) pairLIZ.getSecond();
            if (charSequence != null && charSequence.length() != 0) {
                if (webView != null) {
                    C786410Ut5.ue(webView, (String) pairLIZ.getSecond());
                }
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    @InterfaceC1294060jmO
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        CharSequence charSequence;
        C244800x4.LIZ.getClass();
        Pair pairLIZ = C244800x4.LIZ(str);
        if (((Boolean) pairLIZ.getFirst()).booleanValue() && (charSequence = (CharSequence) pairLIZ.getSecond()) != null && charSequence.length() != 0) {
            if (webView != null) {
                C786410Ut5.ue(webView, (String) pairLIZ.getSecond());
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
