package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C01GW;
import X.C089E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X5B;
import X.C0X6K;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS46S0300000_13;
import Y.ARunnableS7S2100000_13;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTHYBRIDXHR {
    public static final C01GW<Boolean> LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(108));
    public static final Map<Integer, String> LJI = new LinkedHashMap();
    public static final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final WebView LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C0X5B LJ;

    public TTHYBRIDXHR(WebView webView) {
        this.LIZ = webView;
        this.LIZIZ = webView.getSettings().getUserAgentString();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    @JavascriptInterface
    public final String postMessage(String str) throws Throwable {
        Object obj;
        String str2 = str;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", this, new Object[]{str2}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8jM9SinkIRAgKPTWKvQlClVHRLC43ZwEWSZp", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str2 = (String) obj;
        }
        if (!this.LIZJ) {
            return "disabled";
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        try {
            JSONObject jSONObject = new JSONObject(str2);
            final String strOptString = jSONObject.optString("method");
            final String strOptString2 = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID);
            final C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = jSONObject.optString("url");
            final String strOptString3 = jSONObject.optString("data");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            final boolean zOptBoolean = jSONObject.optBoolean("isBinary", false);
            final boolean zOptBoolean2 = jSONObject.optBoolean("isResponseBinary", false);
            c259800zU.element = c259800zU2.element;
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObjectOptJSONObject.optString(next));
            }
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0X5R
                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() throws Throwable {
                    String string;
                    Object c098200Yq;
                    String str3 = "";
                    try {
                        if (linkedHashMap.get("User-Agent") == null && linkedHashMap.get("user-agent") == null) {
                            linkedHashMap.put("User-Agent", this.LIZIZ);
                        }
                        C0X6I c0x6i = C0X6I.LIZ;
                        String str4 = c259800zU2.element;
                        c0x6i.getClass();
                        if (C0X6I.LIZLLL(str4)) {
                            C259800zU c259800zU3 = new C259800zU();
                            c259800zU3.element = "";
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            TTHYBRIDXHR tthybridxhr = this;
                            HandlerHook.viewPost(tthybridxhr.LIZ, new ARunnableS46S0300000_13(c259800zU3, tthybridxhr, countDownLatch, 8));
                            countDownLatch.await();
                            C259800zU<String> c259800zU4 = c259800zU2;
                            try {
                                c098200Yq = new URI(C0X6I.LIZIZ(UriProtector.parse((String) c259800zU3.element))).resolve(c259800zU4.element).toString();
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            T t = str3;
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                t = c098200Yq;
                            }
                            c259800zU4.element = t;
                        }
                        C0X6I c0x6i2 = C0X6I.LIZ;
                        WebView webView = this.LIZ;
                        String upperCase = strOptString.toUpperCase(Locale.ROOT);
                        Uri uri = UriProtector.parse(c259800zU2.element);
                        Map<String, String> map = linkedHashMap;
                        String str5 = strOptString3;
                        boolean z = zOptBoolean;
                        C0X5T c0x5t = C0X5T.AJAX_HOOK;
                        c0x6i2.getClass();
                        C0X6K c0x6kLJ = C0X6I.LJ(webView, false, upperCase, uri, map, str5, z, c0x5t);
                        InputStream inputStream = c0x6kLJ.LJFF;
                        if (inputStream == null) {
                            return;
                        }
                        if (zOptBoolean2) {
                            string = Base64.encodeToString(C2106208My.LIZIZ(inputStream), 0);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            Throwable th2 = null;
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
                                        th2 = th3;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    C2107108Nh.LIZ(bufferedReader, th2);
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
                        this.LIZ(strOptString2, c259800zU2.element, c0x6kLJ, string, zOptBoolean2);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.LJJZZIII(TTHYBRIDXHR.LJII, new ARunnableS46S0300000_13(this, c259800zU, e, 9));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTHYBRIDXHR@9107.postMessage$1$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTHYBRIDXHR@9107.postMessage$1$2");
                }
            });
            return "success";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.LJJZZIII(LJII, new ARunnableS46S0300000_13(this, c259800zU, e, 10));
            StringBuilder sb = new StringBuilder();
            C089E c089e = new C089E(e.getStackTrace());
            while (c089e.hasNext()) {
                Object next2 = c089e.next();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next2);
                sb2.append('\n');
                sb.append(sb2.toString());
            }
            return sb.toString();
        }
    }

    public final void LIZ(String str, String str2, C0X6K c0x6k, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = c0x6k.LJ;
        if (map != null) {
            jSONObject = new JSONObject(map);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0x6k.LIZJ);
        jSONObject2.put("statusText", c0x6k.LIZLLL);
        jSONObject2.put("responseURL", str2);
        jSONObject2.put("data", str3);
        jSONObject2.put("headers", jSONObject);
        jSONObject2.put("isResponseBinary", z);
        C786410Ut5.LJJZZIII(LJII, new ARunnableS7S2100000_13(this, str, Uri.encode(C786410Ut5.J3(jSONObject2)), 2));
    }
}
