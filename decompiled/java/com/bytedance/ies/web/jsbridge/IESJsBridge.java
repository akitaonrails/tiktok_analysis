package com.bytedance.ies.web.jsbridge;

import X.C1058910df7;
import X.C1059410dfv;
import X.C14BD;
import X.C14W7;
import X.C1543940qHQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1051760dTa;
import X.InterfaceC1058960dfC;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class IESJsBridge {
    public WebView LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public boolean LJ;
    public InterfaceC1058960dfC LJFF;
    public C1059410dfv LJI;
    public Map<String, InterfaceC1051760dTa> LIZLLL = new HashMap();
    public final Handler LJII = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.ies.web.jsbridge.IESJsBridge.1
        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r10) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge.IESJsBridge.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    public IESJsBridge(WebView webView) {
        this.LIZ = webView;
        if (webView != null) {
            if ((webView instanceof C14BD) && !((C14BD) webView).LL) {
                webView.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.LIZ.getSettings().setJavaScriptEnabled(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final boolean LIZJ(String str) {
        String host;
        List<String> list;
        int iIndexOf;
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27 || (iIndexOf = str.indexOf(92)) == -1) {
                host = UriProtector.parse(str).getHost();
            } else {
                host = UriProtector.parse(str.substring(0, iIndexOf)).getHost();
            }
            if (host == null || (list = this.LIZIZ) == null || list.isEmpty()) {
                return false;
            }
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                String str2 = this.LIZIZ.get(i);
                if (!host.equals(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('.');
                    sbLIZ.append(str2);
                    if (!host.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                    }
                }
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public final void LJFF(JSONObject jSONObject) {
        WebView webView = this.LIZ;
        if (webView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("javascript:ToutiaoJSBridge");
            sbLIZ.append(e3.d);
            sbLIZ.append("_handleMessageFromToutiao");
            sbLIZ.append(e3.h);
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            sbLIZ.append(")");
            C14W7.LIZ(webView, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        C1059410dfv c1059410dfv = this.LJI;
        if (c1059410dfv != null && c1059410dfv.LIZ(1, str, jSONObject) != null) {
            return;
        }
        InterfaceC1058960dfC interfaceC1058960dfC = this.LJFF;
        if (interfaceC1058960dfC != null && interfaceC1058960dfC.LIZ(1, str, jSONObject) != null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            LJFF(jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(C1058910df7 c1058910df7, JSONObject jSONObject) {
        C1543940qHQ c1543940qHQ = new C1543940qHQ("bridge", "call", c1058910df7.LIZJ, 1, "IESJSBridge");
        String str = c1058910df7.LIZIZ;
        if (str != null && str.contains("SANDBOX_PREFIX")) {
            c1543940qHQ.LJJI = 1;
        }
        try {
            c1543940qHQ.LJJ = Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "code"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c1543940qHQ.LIZIZ();
    }

    public final void LJ(String str, JSONObject jSONObject) {
        C1059410dfv c1059410dfv = this.LJI;
        if (c1059410dfv != null && c1059410dfv.LIZ(2, str, jSONObject) != null) {
            return;
        }
        InterfaceC1058960dfC interfaceC1058960dfC = this.LJFF;
        if (interfaceC1058960dfC != null && interfaceC1058960dfC.LIZ(2, str, jSONObject) != null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            LJFF(jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJI(String str, JSONObject jSONObject) {
        WebView webView = this.LIZ;
        if (webView != null) {
            C14W7.LIZ(webView, C786410Ut5.j4("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(C786410Ut5.j4("iframe[src=\"%s\"", new Object[]{str}).getBytes(), 2), C786410Ut5.J3(jSONObject), Base64.encodeToString(str.getBytes(), 2)}));
        }
    }

    public final void LIZIZ(String str, String str2, JSONObject jSONObject) {
        C1059410dfv c1059410dfv = this.LJI;
        if (c1059410dfv != null && c1059410dfv.LIZ(1, str2, jSONObject) != null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str2);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            LJI(str, jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
