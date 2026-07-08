package com.bytedance.lynx.hybrid.ttp;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lynx.hybrid.ttp.WIReport;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class WIReport {
    public final WebView LIZ;

    public WIReport(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void postMessage(final String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/lynx/hybrid/ttp/WIReport", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNkU6neiKxVXU4Ij9c=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        HandlerHook.viewPost(this.LIZ, new Runnable() { // from class: X.0WeB
            public final void LIZ() {
                String str2 = str;
                WIReport wIReport = this;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String strOptString = jSONObject.optString("eventName");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metrics");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("category");
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
                    InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                    WebView webView = wIReport.LIZ;
                    C1520360pfO c1520360pfO = new C1520360pfO(strOptString);
                    c1520360pfO.LIZ = string;
                    c1520360pfO.LIZLLL = jSONObjectOptJSONObject2;
                    c1520360pfO.LJ = jSONObjectOptJSONObject;
                    c1520360pfO.LIZIZ = (String) C843290X6h.LJIIIIZZ.getValue();
                    c1520360pfO.LIZIZ(0);
                    webViewMonitorHelper.customReport(webView, c1520360pfO.LIZ());
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("WIReport@3c94.postMessage$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("WIReport@3c94.postMessage$1");
            }
        });
    }
}
