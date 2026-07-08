package com.bytedance.sdk.xbridge.protocol.impl.web;

import X.AbstractC1543840qHG;
import X.AbstractC1544900qIy;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X7R;
import X.C0X8V;
import X.C0X8W;
import X.C1543190qGD;
import X.C1543410qGZ;
import X.C1543440qGc;
import X.C1543910qHN;
import X.C1544000qHW;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC1543740qH6;
import X.InterfaceC1297560js2;
import X.InterfaceC1544190qHp;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sdk.xbridge.protocol.impl.web.JSB2Impl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class JSB2Impl extends AbstractC1543840qHG {
    public final C1543190qGD LIZLLL;

    @Override // X.AbstractC1543840qHG
    public final String LJIILJJIL() {
        return "ToutiaoJSBridge";
    }

    public JSB2Impl(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZLLL = c1543190qGD;
    }

    @Override // X.AbstractC1543840qHG
    public final C1543910qHN LJIIL(String str) {
        String url;
        C1543910qHN c1543910qHN = new C1543910qHN(this.LIZLLL);
        try {
            JSONObject jSONObject = new JSONObject(str);
            c1543910qHN.LJ = jSONObject.optString("__callback_id");
            c1543910qHN.LJFF = jSONObject.optString("func");
            c1543910qHN.LJIILJJIL = jSONObject.optString("token");
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp == null || (url = interfaceC1544190qHp.getUrl()) == null) {
                url = "";
            }
            c1543910qHN.LJI = url;
            c1543910qHN.LJII = jSONObject.optString("__msg_type");
            c1543910qHN.LJIIIIZZ = jSONObject.opt("params");
            c1543910qHN.LJIIIZ = jSONObject.optString("JSSDK");
            c1543910qHN.LJIIJ = jSONObject.optString("namespace");
            c1543910qHN.LJIIJJI = jSONObject.optString("__iframe_url");
            c1543910qHN.LJIIL = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            c1543910qHN.LJIJ = EnumC1543740qH6.Web;
            c1543910qHN.LJIILIIL = str;
            String strOptString = jSONObject.optString("secure_token");
            if (strOptString != null && strOptString.length() != 0) {
                c1543910qHN.LIZIZ = jSONObject.optString("secure_token");
            } else {
                Object obj = c1543910qHN.LJIIIIZZ;
                if (obj instanceof JSONObject) {
                    c1543910qHN.LIZIZ = ((JSONObject) obj).optString("_jsb_secure_token");
                }
            }
            c1543910qHN.LJJIJLIJ = jSONObject;
            return c1543910qHN;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1543910qHN.LJJIJIL = false;
            return c1543910qHN;
        }
    }

    @JavascriptInterface
    public final void invokeMethod(String str) throws Throwable {
        Object obj;
        boolean zLJI = MethodIDManager.LJI(196725);
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB2Impl", "invokeMethod", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1iJMqiY8pf79s2gY0g==", null)));
        if (c0wsuLIZIZ.LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        LJIILL(str, 2, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, org.json.JSONObject] */
    @Override // X.AbstractC1543840qHG
    public final Pair<String, AbstractC1544900qIy> LJIILIIL(final C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) throws JSONException {
        final C259800zU c259800zU = new C259800zU();
        ?? jSONObject = new JSONObject();
        c259800zU.element = jSONObject;
        jSONObject.put("__callback_id", c1543910qHN.LJ);
        ((JSONObject) c259800zU.element).put("__params", c1543440qGc.LIZJ(c1543910qHN));
        ((JSONObject) c259800zU.element).put("__msg_type", "callback");
        Object obj = null;
        if (!TextUtils.isEmpty(c1543910qHN.LJIIJJI)) {
            String str = c1543910qHN.LJIIJJI;
            Charset charset = Charsets.UTF_8;
            final String strEncodeToString = Base64.encodeToString(str.getBytes(charset), 2);
            final String strEncodeToString2 = Base64.encodeToString(C786410Ut5.j4("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1)).getBytes(charset), 2);
            String strJ4 = C786410Ut5.j4("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{strEncodeToString2, c259800zU.element, strEncodeToString}, 3));
            if (C1544000qHW.LJI) {
                obj = new C0X8W() { // from class: X.0X8Y
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView) throws JSONException {
                        JSONObject jSONObject2 = new JSONObject();
                        String str2 = strEncodeToString2;
                        C259800zU<JSONObject> c259800zU2 = c259800zU;
                        String str3 = strEncodeToString;
                        jSONObject2.put("query", str2);
                        jSONObject2.put("data", c259800zU2.element);
                        jSONObject2.put("encodeIFrameUrl", str3);
                        return C786410Ut5.J3(jSONObject2);
                    }
                };
            }
            return new Pair<>(strJ4, obj);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:window.");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append(" && ");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append("._handleMessageFromToutiao && ");
        sbLIZ.append("ToutiaoJSBridge");
        sbLIZ.append("._handleMessageFromToutiao(");
        sbLIZ.append(c259800zU.element);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C1544000qHW.LJII) {
            obj = new C0X8V() { // from class: X.0qHV
                @Override // X.AbstractC1544900qIy
                public final void LJIIJJI(Object obj2) {
                    c1543910qHN.LJJIJ = String.valueOf(obj2);
                    C1543190qGD c1543190qGD = this.LIZ.LIZ;
                    c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
                }

                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView) throws JSONException {
                    JSONObject jSONObject2 = new JSONObject();
                    JSB2Impl jSB2Impl = this.LIZ;
                    C259800zU<JSONObject> c259800zU2 = c259800zU;
                    jSB2Impl.getClass();
                    jSONObject2.put("objName", "ToutiaoJSBridge");
                    jSONObject2.put("objFunc", "_handleMessageFromToutiao");
                    jSONObject2.put("params", c259800zU2.element);
                    return C786410Ut5.J3(jSONObject2);
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJ(int i, Object obj2, String str2) {
                    c1543910qHN.LJJIJ = String.valueOf(obj2);
                    C1543190qGD c1543190qGD = this.LIZ.LIZ;
                    c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
                }
            };
        }
        return new Pair<>(strLIZIZ, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, org.json.JSONObject] */
    @Override // X.AbstractC1543840qHG
    public final void LJIILLIIL(String str, JSONObject jSONObject) {
        C0X7R c0x7r;
        final C259800zU c259800zU = new C259800zU();
        ?? jSONObject2 = new JSONObject();
        c259800zU.element = jSONObject2;
        try {
            jSONObject2.put("__msg_type", "event");
            ((JSONObject) c259800zU.element).put("__event_id", str);
            ((JSONObject) c259800zU.element).put("__params", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("javascript:window.");
            sbLIZ.append("ToutiaoJSBridge");
            sbLIZ.append(" && ");
            sbLIZ.append("ToutiaoJSBridge");
            sbLIZ.append("._handleMessageFromToutiao && ");
            sbLIZ.append("ToutiaoJSBridge");
            sbLIZ.append("._handleMessageFromToutiao(");
            sbLIZ.append(c259800zU.element);
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (C1544000qHW.LJFF) {
                c0x7r = new C0X7R() { // from class: X.0X8Z
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView) throws JSONException {
                        JSONObject jSONObject3 = new JSONObject();
                        JSB2Impl jSB2Impl = this.LIZ;
                        C259800zU<JSONObject> c259800zU2 = c259800zU;
                        jSB2Impl.getClass();
                        jSONObject3.put("objName", "ToutiaoJSBridge");
                        jSONObject3.put("obj", c259800zU2.element);
                        return C786410Ut5.J3(jSONObject3);
                    }
                };
            } else {
                c0x7r = null;
            }
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp != null) {
                interfaceC1544190qHp.LJII(strLIZIZ, null, c0x7r);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("parse event failed,reason=");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            }
        }
    }
}
