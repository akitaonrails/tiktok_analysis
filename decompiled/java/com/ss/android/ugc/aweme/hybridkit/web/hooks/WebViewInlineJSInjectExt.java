package com.ss.android.ugc.aweme.hybridkit.web.hooks;

import X.C01GW;
import X.C1520360pfO;
import X.C2188811AlT;
import X.C2202461BHw;
import X.C452501pT;
import X.C588010N4l;
import X.C828100We8;
import X.EnumC587990N4j;
import X.InterfaceC1041930dDj;
import X.InterfaceC588000N4k;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewInlineJSInjectExt extends C2202461BHw {
    public static final C01GW<Boolean> LLJ = C452501pT.LIZIZ(new C828100We8());
    public static final ConcurrentHashMap<C588010N4l, InterfaceC588000N4k> LLJI = new ConcurrentHashMap<>();

    public WebViewInlineJSInjectExt() {
        super(6);
    }

    @Override // X.C2202461BHw, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "WebViewInlineJSInjectExt";
    }

    public static String LIZLLL(Uri uri) {
        String host;
        String path;
        if (uri == null || (host = uri.getHost()) == null || (path = uri.getPath()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(host);
        sbLIZ.append(path);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:22:0x0053 BREAK  A[LOOP:0: B:17:0x0040->B:127:?]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r23, android.webkit.WebResourceRequest r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.web.hooks.WebViewInlineJSInjectExt.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    public static void LJFF(WebView webView, Uri uri, EnumC587990N4j enumC587990N4j) {
        Iterator<Map.Entry<C588010N4l, InterfaceC588000N4k>> it2 = LLJI.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ();
        }
    }

    public static void LJ(WebView webView, WebResourceRequest webResourceRequest, JSONObject jSONObject, JSONObject jSONObject2) {
        InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_web_inline_js_inject_ext");
        c1520360pfO.LIZIZ = "web_inline_js_ext";
        c1520360pfO.LIZIZ(2);
        c1520360pfO.LIZ = webResourceRequest.getUrl().toString();
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = jSONObject2;
        webViewMonitorHelper.customReport(webView, c1520360pfO.LIZ());
    }
}
