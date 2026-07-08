package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C01CD;
import X.C1051660dTQ;
import X.C12863051p;
import X.C1520360pfO;
import X.InterfaceC1019840ce6;
import X.InterfaceC1041930dDj;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetAbTestMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public GetAbTestMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getABTestParams";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (jSONObject.optJSONArray("ab_test_names") == null) {
            KeyEvent.Callback callback = (View) this.contextProviderFactory.LIZIZ(View.class);
            if (callback == null && (callback = (WebView) this.contextProviderFactory.LIZIZ(WebView.class)) == null) {
                callback = (View) this.contextProviderFactory.LIZIZ(LynxView.class);
            }
            if (callback instanceof LynxView) {
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                LynxView lynxView = (LynxView) callback;
                C1520360pfO c1520360pfO = new C1520360pfO(getName());
                c1520360pfO.LIZIZ = getName();
                c1520360pfO.LIZ = lynxView.getTemplateUrl();
                c1520360pfO.LIZLLL = new JSONObject().put("from", "bullet").put("url", lynxView.getTemplateUrl()).put("business", C01CD.LIZLLL(lynxView.getTemplateUrl())).put("container", "lynx");
                c1520360pfO.LIZIZ(0);
                lynxViewMonitor.reportCustom(lynxView, c1520360pfO.LIZ());
            } else if (callback instanceof WebView) {
                InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                WebView webView = (WebView) callback;
                C1520360pfO c1520360pfO2 = new C1520360pfO(getName());
                c1520360pfO2.LIZIZ = getName();
                c1520360pfO2.LIZ = webView.getUrl();
                c1520360pfO2.LIZLLL = new JSONObject().put("from", "bullet").put("url", webView.getUrl()).put("business", C01CD.LIZLLL(webView.getUrl())).put("container", "web");
                c1520360pfO2.LIZIZ(0);
                webViewMonitorHelper.customReport(webView, c1520360pfO2.LIZ());
            }
        }
        C12863051p.LIZIZ.LIZ(jSONObject, new AwS595S0100000_16(interfaceC1019840ce6, 64), new AwS382S0200000_16(jSONObject, interfaceC1019840ce6, 13));
    }
}
