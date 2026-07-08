package com.ss.android.ugc.aweme.hybridkit.web.hooks;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1520360pfO;
import X.C189200o6;
import X.C2487409ou;
import X.C294901Ch;
import X.C295001Ci;
import X.C452501pT;
import X.C822610WOt;
import X.C824330WVj;
import X.InterfaceC1041930dDj;
import Y.ARunnableS82S0200000_13;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class RestrictiveRuleReporter {
    public final WebView LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(139));

    public RestrictiveRuleReporter(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void reportRestrictiveRule(String str) throws Throwable {
        Object c098200Yq;
        String str2;
        ISparkHostApi iSparkHostApi;
        Object obj;
        String str3 = str;
        String str4 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/hybridkit/web/hooks/RestrictiveRuleReporter", "reportRestrictiveRule", this, new Object[]{str3}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKxYY3H2Dn0OlcBfSaEaI/jbrOer4g8GrHGFA9/iP4Tm7EWVKl6logwbBw=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str3 = (String) obj;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            int iOptInt = jSONObject.optInt("ruleId");
            String strOptString = jSONObject.optString("url");
            C295001Ci c295001CiLIZIZ = C294901Ch.LIZIZ(strOptString);
            if (c295001CiLIZIZ != null) {
                str4 = c295001CiLIZIZ.LIZ;
            }
            C822610WOt.LIZ(new C824330WVj(iOptInt, strOptString));
            if (((Boolean) this.LIZIZ.getValue()).booleanValue() && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && iSparkHostApi.LJLLLL()) {
                C2487409ou.LIZJ(new ARunnableS82S0200000_13(this, iSparkHostApi, 29));
            }
            InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
            WebView webView = this.LIZ;
            C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_restrictive_rule");
            c1520360pfO.LIZIZ = "restrictive_rule";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ruleId", iOptInt);
            if (str4 == null) {
                str2 = "";
            } else {
                str2 = str4;
            }
            jSONObject2.put("url", str2);
            c1520360pfO.LIZLLL = jSONObject2;
            if (str4 == null) {
                str4 = "";
            }
            c1520360pfO.LIZ = str4;
            c1520360pfO.LIZIZ(0);
            webViewMonitorHelper.customReport(webView, c1520360pfO.LIZ());
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
