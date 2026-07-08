package com.bytedance.lynx.hybrid.ttp;

import X.C089E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X28;
import X.C0X65;
import X.C0X68;
import X.C259800zU;
import X.C786410Ut5;
import X.C843010X5f;
import X.C843090X5n;
import X.C843290X6h;
import android.net.Uri;
import android.os.Handler;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lynx.hybrid.ttp.TTHYBRIDXHR;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTHYBRIDXHR {
    public final WebView LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C0X65 LJ = C0X65.TTNet_Android;
    public boolean LJFF;

    public TTHYBRIDXHR(WebView webView) {
        this.LIZ = webView;
        this.LIZIZ = webView.getSettings().getUserAgentString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    @JavascriptInterface
    public final String postMessage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/lynx/hybrid/ttp/TTHYBRIDXHR", "postMessage", this, new Object[]{str}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNkU6nei7EyO8VAfkfTyLY=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        if (!this.LIZJ) {
            return "disabled";
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        try {
            final C843090X5n c843090X5nLIZ = C0X28.LIZ(str, this.LIZIZ);
            c259800zU.element = c843090X5nLIZ.LIZJ;
            final C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = c843090X5nLIZ.LIZJ;
            C843290X6h.LIZJ().LIZJ().execute(new Runnable() { // from class: X.0X5g
                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() throws Throwable {
                    String string;
                    Object c098200Yq;
                    String str2 = "";
                    try {
                        C843060X5k c843060X5k = C843060X5k.LIZ;
                        Throwable th = null;
                        if (C843060X5k.LIZJ(c259800zU2.element)) {
                            final C259800zU c259800zU3 = new C259800zU();
                            c259800zU3.element = "";
                            final CountDownLatch countDownLatch = new CountDownLatch(1);
                            final TTHYBRIDXHR tthybridxhr = this;
                            HandlerHook.viewPost(tthybridxhr.LIZ, new Runnable() { // from class: X.0X5i
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("TTHYBRIDXHR@d0bc.postMessage$1$1");
                                    try {
                                        C259800zU<String> c259800zU4 = c259800zU3;
                                        String url = tthybridxhr.LIZ.getUrl();
                                        T t = url;
                                        if (url == null) {
                                            t = "";
                                        }
                                        c259800zU4.element = t;
                                        countDownLatch.countDown();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("TTHYBRIDXHR@d0bc.postMessage$1$1");
                                }
                            });
                            countDownLatch.await();
                            C259800zU<String> c259800zU4 = c259800zU2;
                            try {
                                c098200Yq = new URI(c843060X5k.LIZ(UriProtector.parse((String) c259800zU3.element))).resolve(c259800zU4.element).toString();
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            T t = str2;
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                t = c098200Yq;
                            }
                            c259800zU4.element = t;
                            C843090X5n c843090X5n = c843090X5nLIZ;
                            String str3 = c259800zU2.element;
                            c843090X5n.LIZJ = str3;
                            c843090X5n.LIZLLL = UriProtector.parse(str3);
                            C843070X5l.LIZJ(6, "tthybrid handle relative url, " + c259800zU.element + ", " + c259800zU2.element, null, null);
                        }
                        C0X68 c0x68LIZJ = C0X69.LIZJ(this.LIZ, c843090X5nLIZ);
                        InputStream inputStream = c0x68LIZJ.LJFF;
                        if (inputStream == null) {
                            return;
                        }
                        if (c843090X5nLIZ.LJII) {
                            string = Base64.encodeToString(C2106208My.LIZIZ(inputStream), 0);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            try {
                                Iterator<String> it2 = C08KC.LIZIZ(bufferedReader).iterator();
                                while (it2.hasNext()) {
                                    sb.append(it2.next());
                                }
                                string = sb.toString();
                                C2107108Nh.LIZ(bufferedReader, null);
                            } catch (Throwable th3) {
                                try {
                                    TryCatchGuardChecker.doCheck(th3);
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th3;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    C2107108Nh.LIZ(bufferedReader, th);
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        }
                        inputStream.close();
                        TTHYBRIDXHR tthybridxhr2 = this;
                        C843090X5n c843090X5n2 = c843090X5nLIZ;
                        tthybridxhr2.LIZIZ(c843090X5n2.LIZIZ, c259800zU2.element, c0x68LIZJ, string, c843090X5n2.LJII);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ("jsb_request", c259800zU.element, e);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTHYBRIDXHR@d0bc.postMessage$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTHYBRIDXHR@d0bc.postMessage$1");
                }
            });
            return "success";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ("parse_jsb", (String) c259800zU.element, e);
            StringBuilder sb = new StringBuilder();
            C089E c089e = new C089E(e.getStackTrace());
            while (c089e.hasNext()) {
                Object next = c089e.next();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next);
                sb2.append('\n');
                sb.append(sb2.toString());
            }
            return sb.toString();
        }
    }

    public final void LIZ(String str, String str2, Exception exc) throws JSONException {
        final WebView webView = this.LIZ;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("phase", str);
        jSONObject.put("request_url", str2);
        jSONObject.put("main_frame_url", C843010X5f.LIZLLL(this.LIZ));
        jSONObject.put("errorCode", -1);
        jSONObject.put("errorDesc", exc.getMessage());
        C786410Ut5.LJJZZIII((Handler) C843290X6h.LIZ.getValue(), new Runnable() { // from class: X.0WeC
            public final /* synthetic */ String LLILLJJLI = "ajax_hook_failed";
            public final /* synthetic */ JSONObject LLILZ = null;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Monitor@49ae.customReport$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Monitor@49ae.customReport$1");
            }

            public final void LIZ() {
                InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                WebView webView2 = webView;
                C1520360pfO c1520360pfO = new C1520360pfO(this.LLILLJJLI);
                c1520360pfO.LIZIZ = (String) C843290X6h.LJIIIIZZ.getValue();
                c1520360pfO.LIZIZ(0);
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LJ = this.LLILZ;
                webViewMonitorHelper.customReport(webView2, c1520360pfO.LIZ());
            }
        });
    }

    public final void LIZIZ(final String str, String str2, C0X68 c0x68, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = c0x68.LJ;
        if (map != null) {
            jSONObject = new JSONObject(map);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0x68.LIZJ);
        jSONObject2.put("statusText", c0x68.LIZLLL);
        jSONObject2.put("responseURL", str2);
        jSONObject2.put("data", str3);
        jSONObject2.put("headers", jSONObject);
        jSONObject2.put("isResponseBinary", z);
        final String strEncode = Uri.encode(C786410Ut5.J3(jSONObject2));
        C786410Ut5.LJJZZIII((Handler) C843290X6h.LIZ.getValue(), new Runnable() { // from class: X.0X5j
            public final void LIZ() {
                WebView webView = this.LL.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("!function(){window.imy_realxhr_callback(\"");
                sbLIZ.append(str);
                sbLIZ.append("\", JSON.parse(decodeURIComponent(\"");
                sbLIZ.append(strEncode);
                sbLIZ.append("\")))}()");
                webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0X5o
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTHYBRIDXHR@d0bc.xhrCallback$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTHYBRIDXHR@d0bc.xhrCallback$2");
            }
        });
    }
}
