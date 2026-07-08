package com.ss.android.ugc.aweme.discover.ui;

import X.C01CD;
import X.C12863051p;
import X.C1520360pfO;
import X.InterfaceC1041760dDS;
import X.InterfaceC1041930dDj;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetABTest extends BaseCommonJavaMethod {
    public final WeakReference<WebView> LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetABTest() {
    }

    public GetABTest(WebView webView, IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = new WeakReference<>(webView);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        WeakReference<WebView> weakReference;
        WebView webView;
        if ((jSONObject == null || jSONObject.optJSONArray("ab_test_names") == null) && (weakReference = this.LLILLL) != null && (webView = weakReference.get()) != null) {
            InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
            C1520360pfO c1520360pfO = new C1520360pfO("getABTestParams");
            c1520360pfO.LIZIZ = "getABTestParams";
            c1520360pfO.LIZLLL = new JSONObject().put("from", "crossPlatform").put("url", webView.getUrl()).put("business", C01CD.LIZLLL(webView.getUrl())).put("container", "web");
            c1520360pfO.LIZ = webView.getUrl();
            c1520360pfO.LIZIZ(0);
            webViewMonitorHelper.customReport(webView, c1520360pfO.LIZ());
        }
        C12863051p.LIZIZ.LIZ(jSONObject, new AwS595S0100000_16(interfaceC1041760dDS, 89), new AwS382S0200000_16(jSONObject, interfaceC1041760dDS, 23));
    }
}
