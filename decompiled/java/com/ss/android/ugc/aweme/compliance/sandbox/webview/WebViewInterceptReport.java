package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import Y.ARunnableS18S1100000_13;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewInterceptReport {
    public final WebView LIZ;

    public WebViewInterceptReport(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void postMessage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/WebViewInterceptReport", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8jM9SinkIRAgKPTWKvQlClZ2br+T6qIJbxpeTSU70h8c5rE2Nlg=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        HandlerHook.viewPost(this.LIZ, new ARunnableS18S1100000_13(this, str, 2));
    }
}
