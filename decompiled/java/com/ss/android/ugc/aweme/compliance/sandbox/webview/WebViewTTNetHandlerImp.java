package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C0X5T;
import X.C0X6I;
import X.C0X6K;
import android.net.Uri;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewTTNetHandlerImp implements IWebViewTTNetHandler {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler
    public final C0X6K LIZ(WebView webView, boolean z, String str, Uri uri, Map<String, String> map, C0X5T c0x5t) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case -531492226:
                if (!upperCase.equals("OPTIONS")) {
                    return null;
                }
                break;
            case 70454:
                if (!upperCase.equals("GET")) {
                    return null;
                }
                break;
            case 2213344:
                if (!upperCase.equals("HEAD")) {
                    return null;
                }
                break;
            case 2012838315:
                if (!upperCase.equals("DELETE")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        C0X6I.LIZ.getClass();
        return C0X6I.LJ(webView, z, str, uri, map, null, false, c0x5t);
    }
}
