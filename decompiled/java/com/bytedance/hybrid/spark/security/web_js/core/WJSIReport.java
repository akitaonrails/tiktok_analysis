package com.bytedance.hybrid.spark.security.web_js.core;

import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1544840qIs;
import X.C189200o6;
import X.C828160WeE;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class WJSIReport {
    public final WebView LIZ;

    public WJSIReport(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void postMessage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/hybrid/spark/security/web_js/core/WJSIReport", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNUGgDECH/R8hbW96ZskTpqZe+l/dtF61La9V6AddcA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("eventName");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metrics");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("category");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            C828160WeE.LIZIZ(this.LIZ, strOptString, JSONObjectProtectorUtils.getString(jSONObject, "url"), jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            C1544840qIs.LIZJ("fe report. eventName: ".concat(strOptString));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
