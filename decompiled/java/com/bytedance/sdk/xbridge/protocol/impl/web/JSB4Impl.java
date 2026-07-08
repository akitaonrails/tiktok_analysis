package com.bytedance.sdk.xbridge.protocol.impl.web;

import X.AbstractC1543840qHG;
import X.AbstractC1544900qIy;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1543190qGD;
import X.C1543410qGZ;
import X.C1543440qGc;
import X.C1543910qHN;
import X.C1544070qHd;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1543740qH6;
import X.InterfaceC1297560js2;
import X.InterfaceC1544190qHp;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class JSB4Impl extends AbstractC1543840qHG {
    public final C1543190qGD LIZLLL;

    @Override // X.AbstractC1543840qHG
    public final String LJIILJJIL() {
        return "BDXBridge";
    }

    public JSB4Impl(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZLLL = c1543190qGD;
    }

    @Override // X.AbstractC1543840qHG
    public final C1543910qHN LJIIL(String str) {
        String url;
        C1543910qHN c1543910qHN = new C1543910qHN(this.LIZLLL);
        try {
            JSONObject jSONObject = new JSONObject(str);
            c1543910qHN.LJFF = jSONObject.optString("func");
            c1543910qHN.LJIIIIZZ = jSONObject.opt("params");
            c1543910qHN.LJIIIZ = jSONObject.optString("JSSDK");
            c1543910qHN.LJIIL = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            c1543910qHN.LJII = jSONObject.optString("__msg_type");
            c1543910qHN.LJIIJJI = jSONObject.optString("__iframe_url");
            c1543910qHN.LJ = jSONObject.optString("__callback_id");
            c1543910qHN.LJIILJJIL = jSONObject.optString("token");
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp == null || (url = interfaceC1544190qHp.getUrl()) == null) {
                url = "";
            }
            c1543910qHN.LJI = url;
            c1543910qHN.LJIIJ = jSONObject.optString("namespace");
            c1543910qHN.LJIILIIL = str;
            c1543910qHN.LJIJ = EnumC1543740qH6.Web;
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
    public final void _invokeMethod(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB4Impl", "_invokeMethod", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1iJMqiY8pf774M7Tqg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        LJIILL(str, 4, new C1544070qHd());
    }

    @Override // X.AbstractC1543840qHG
    public final Pair<String, AbstractC1544900qIy> LJIILIIL(C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__msg_type", "callback");
        jSONObject.put("__callback_id", c1543910qHN.LJ);
        jSONObject.put("__params", c1543440qGc.LIZJ(c1543910qHN));
        jSONObject.put("__timestamp", System.currentTimeMillis());
        jSONObject.put("__sdk_version", "4.0");
        if (!TextUtils.isEmpty(c1543910qHN.LJIIJJI)) {
            String str = c1543910qHN.LJIIJJI;
            Charset charset = Charsets.UTF_8;
            return new Pair<>(C786410Ut5.j4("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{Base64.encodeToString(C786410Ut5.j4("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1)).getBytes(charset), 2), jSONObject, Base64.encodeToString(str.getBytes(charset), 2)}, 3)), null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:window.");
        sbLIZ.append("BDXBridge");
        sbLIZ.append(" && ");
        sbLIZ.append("BDXBridge");
        sbLIZ.append("._handleMessageFromApp && ");
        sbLIZ.append("BDXBridge");
        sbLIZ.append("._handleMessageFromApp(");
        sbLIZ.append(jSONObject);
        sbLIZ.append(')');
        return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.AbstractC1543840qHG
    public final void LJIILLIIL(String str, JSONObject jSONObject) {
        Object c098200Yq;
        JSONObject jSONObjectPut;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (jSONObject != null) {
                jSONObjectPut = new JSONObject(C786410Ut5.J3(jSONObject));
                if (!jSONObjectPut.has("code")) {
                    jSONObjectPut.put("code", 1);
                }
            } else {
                jSONObjectPut = new JSONObject().put("code", 1);
            }
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            jSONObject2.put("__params", jSONObjectPut);
            jSONObject2.put("__timestamp", System.currentTimeMillis());
            jSONObject2.put("__sdk_version", "4.0");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("javascript:window.");
            sbLIZ.append("BDXBridge");
            sbLIZ.append(" && ");
            sbLIZ.append("BDXBridge");
            sbLIZ.append("._handleMessageFromApp && ");
            sbLIZ.append("BDXBridge");
            sbLIZ.append("._handleMessageFromApp(");
            sbLIZ.append(jSONObject2);
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp != null) {
                interfaceC1544190qHp.LJII(strLIZIZ, null, null);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
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
