package com.bytedance.android.monitorV2.webview;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1520230pfB;
import X.C1520380pfQ;
import X.C1520640pfq;
import X.C1520960pgM;
import X.C1520970pgN;
import X.C1521180pgi;
import X.C1521200pgk;
import X.C1521590phN;
import X.C1521730phb;
import X.C2187451AjH;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C824310WVh;
import X.EnumC1520990pgP;
import Y.ARunnableS11S2100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS6S2200000_23;
import android.app.Application;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class WebViewMonitorJsBridge {
    public final C1521200pgk webViewViewSession;

    @JavascriptInterface
    public String getVersion() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getVersion", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        return c0wsuLIZIZ.LIZ ? (String) c0wsuLIZIZ.LIZIZ : "1.0-tiktok-monorepo";
    }

    @JavascriptInterface
    public void traceMark(String str) throws Throwable {
        Object[] objArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "traceMark", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ || (objArr = c0wsuLIZIZ.LIZJ) == null) {
            return;
        }
        Object obj = objArr[0];
    }

    @JavascriptInterface
    public String getInfo() throws Throwable {
        SharedPreferences sharedPreferencesLIZJ;
        boolean z = false;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getInfo", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "getInfo");
        JSONObject jSONObject = new JSONObject();
        C1520380pfQ.LIZ.getClass();
        Application application = C1520380pfQ.LJIIJ;
        if (application != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 4, "bd_hybrid_monitor_global_shared_preference")) != null) {
            z = sharedPreferencesLIZJ.getBoolean("monitor_validation_switch", false);
        }
        C1520640pfq.LJIILJJIL(jSONObject, "need_report", Boolean.valueOf(z));
        C1520640pfq.LJIILIIL("sdk_version", "1.0-tiktok-monorepo", jSONObject);
        return C786410Ut5.J3(jSONObject);
    }

    public C1521180pgi getNavigationManager() {
        return (C1521180pgi) this.webViewViewSession.LLJIJIL;
    }

    @JavascriptInterface
    public void injectJS() {
        if (new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "injectJS", this, new Object[0], "void", new C0WZW(false, "()V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null))).LIZ) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "inject js");
        C824310WVh.LIZLLL(new ARunnableS123S0100000_23(this, 9));
    }

    public WebViewMonitorJsBridge(C1521200pgk c1521200pgk) {
        this.webViewViewSession = c1521200pgk;
        C1521590phN.LIZ(c1521200pgk);
    }

    @JavascriptInterface
    public void batch(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "batch", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "batch: " + str);
        C824310WVh.LIZLLL(new ARunnableS28S1100000_23(this, str, 2));
    }

    @JavascriptInterface
    public void config(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "config", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "config: " + str);
        JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(str);
        String strLJIIJ = C1520640pfq.LJIIJ("bid", jSONObjectLJIILL);
        String strLJIIJ2 = C1520640pfq.LJIIJ("pid", jSONObjectLJIILL);
        C824310WVh.LIZLLL(new ARunnableS6S2200000_23(getNavigationManager(), strLJIIJ, jSONObjectLJIILL, strLJIIJ2, 0));
        if (!strLJIIJ.isEmpty()) {
            C1520970pgN c1520970pgN = C1520970pgN.LIZ;
            String strLJIIJJI = this.webViewViewSession.LJIIJJI();
            c1520970pgN.getClass();
            C1520970pgN.LIZ(null, strLJIIJJI, strLJIIJ, strLJIIJ2);
        }
    }

    @JavascriptInterface
    public void reportPageLatestData(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPageLatestData", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "report latest page data");
        C824310WVh.LIZ(new ARunnableS28S1100000_23(this, str, 4));
    }

    @JavascriptInterface
    public void reportPiaInfo(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPiaInfo", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        C824310WVh.LIZLLL(new ARunnableS28S1100000_23(this, str, 1));
    }

    @JavascriptInterface
    public void reportVerifiedData(String str) throws Throwable {
        SharedPreferences sharedPreferencesLIZJ;
        Object obj;
        String str2 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportVerifiedData", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "reportVerifiedData" + str);
        C1520380pfQ.LIZ.getClass();
        Application application = C1520380pfQ.LJIIJ;
        if (application != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 4, "bd_hybrid_monitor_global_shared_preference")) != null && sharedPreferencesLIZJ.getBoolean("monitor_validation_switch", false)) {
            JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(str);
            HybridSettingInitConfig hybridSettingInitConfig = C1520230pfB.LIZ;
            if (hybridSettingInitConfig != null) {
                str2 = hybridSettingInitConfig.LJ;
            }
            C1520640pfq.LJIILIIL("device_id", str2, jSONObjectLJIILL);
            C1520640pfq.LJIIL("timestamp", System.currentTimeMillis(), jSONObjectLJIILL);
            C1520230pfB.LIZ(C786410Ut5.J3(jSONObjectLJIILL));
        }
    }

    @JavascriptInterface
    public void request(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "request", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        try {
            if (!EnumC1520990pgP.SparkTracing.isEnabled()) {
                return;
            }
            C1521590phN.LIZIZ(this.webViewViewSession, new JSONObject(str), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @JavascriptInterface
    public void sendInitTimeInfo(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "sendInitTimeInfo: " + str);
        C824310WVh.LIZLLL(new ARunnableS28S1100000_23(this, str, 3));
    }

    @JavascriptInterface
    public void terminatedPreCollect(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "terminatedPreCollect", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "terminatedPreCollect: " + str);
        C824310WVh.LIZLLL(new ARunnableS123S0100000_23(this, 12));
    }

    @JavascriptInterface
    public void cover(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "cover", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "cover: eventType: " + str2);
        C824310WVh.LIZLLL(new ARunnableS11S2100000_23(this, str, str2, 1));
    }

    @JavascriptInterface
    public void reportDirectly(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportDirectly", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K480evCE4lduWSNLlxUI4nuYIX+en0K6CWwBxHjvoNHjHeFo3sL3m4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("WebViewMonitorJsBridge", "reportDirectly: eventType: " + str2);
        C824310WVh.LIZLLL(new ARunnableS11S2100000_23(this, str2, str, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void customReport(java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.customReport(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
