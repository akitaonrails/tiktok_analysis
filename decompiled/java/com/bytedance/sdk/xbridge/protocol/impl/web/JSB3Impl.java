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
import X.C1543550qGn;
import X.C1543910qHN;
import X.C1544070qHd;
import X.C1544720qIg;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1543740qH6;
import X.EnumC1544090qHf;
import X.InterfaceC1297560js2;
import X.InterfaceC1544190qHp;
import android.webkit.JavascriptInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class JSB3Impl extends AbstractC1543840qHG {
    public final C1543190qGD LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    @Override // X.AbstractC1543840qHG
    public final String LJIILJJIL() {
        return this.LJI;
    }

    public JSB3Impl(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZLLL = c1543190qGD;
        this.LJ = "JSBridge";
        this.LJFF = "Native2JSBridge";
        this.LJI = "JS2NativeBridge";
    }

    @Override // X.AbstractC1543840qHG
    public final C1543910qHN LJIIL(String str) {
        String url;
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1543910qHN c1543910qHN = new C1543910qHN(this.LIZLLL);
            c1543910qHN.LJ = jSONObject.optString("__callback_id");
            c1543910qHN.LJFF = jSONObject.optString("func");
            c1543910qHN.LJIILJJIL = jSONObject.optString("token");
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp == null || (url = interfaceC1544190qHp.getUrl()) == null) {
                url = "";
            }
            c1543910qHN.LJI = url;
            c1543910qHN.LJII = jSONObject.optString("__msg_type");
            c1543910qHN.LJIIL = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            c1543910qHN.LJIIIIZZ = jSONObject.opt("params");
            c1543910qHN.LJIIIZ = jSONObject.optString("JSSDK");
            c1543910qHN.LJIIJ = jSONObject.optString("namespace");
            c1543910qHN.LJIIJJI = jSONObject.optString("__iframe_url");
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
            C1543910qHN c1543910qHN2 = new C1543910qHN(this.LIZLLL);
            c1543910qHN2.LJJIJIL = false;
            return c1543910qHN2;
        }
    }

    public final String LJIJI(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:if(window.");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" && window.");
        sbLIZ.append(this.LJ);
        sbLIZ.append("._handleMessageFromApp){ window.");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" && window.");
        sbLIZ.append(this.LJ);
        sbLIZ.append("._handleMessageFromApp(");
        sbLIZ.append(jSONObject);
        sbLIZ.append(")} else if(window.");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" && window.");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("._handleMessageFromApp){ window.");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" && window.");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("._handleMessageFromApp(");
        sbLIZ.append(jSONObject);
        sbLIZ.append(")}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @JavascriptInterface
    public final String _invokeMethod(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "_invokeMethod", this, new Object[]{str}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1iJMqiY8pf78NqAatg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        LJIJJ(null, str);
        return null;
    }

    public static JSONObject LJIJ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.opt("func") == null) {
            if (jSONObject.optString("namespace", "").length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(jSONObject.optString("namespace", ""));
                sbLIZ.append('.');
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            jSONObject.put("func", str);
        }
        return jSONObject;
    }

    @Override // X.AbstractC1543840qHG
    public final Pair<String, AbstractC1544900qIy> LJIILIIL(C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__callback_id", c1543910qHN.LJ);
            jSONObject.put("__params", c1543440qGc.LIZJ(c1543910qHN));
            jSONObject.put("__msg_type", "callback");
            return new Pair<>(LJIJI(jSONObject), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return new Pair<>("", null);
        }
    }

    @Override // X.AbstractC1543840qHG
    public final void LJIILLIIL(String str, JSONObject jSONObject) {
        Object c098200Yq;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__msg_type", "event");
            jSONObject3.put("__event_id", str);
            jSONObject3.put("__callback_id", str);
            jSONObject3.put("__params", jSONObject2);
            String strLJIJI = LJIJI(jSONObject3);
            InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
            if (interfaceC1544190qHp != null) {
                interfaceC1544190qHp.LJII(strLJIJI, null, null);
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse event failed,reason=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
    }

    public final void LJIJJ(String str, String str2) {
        try {
            LJIILL(C786410Ut5.J3(LJIJ(str, str2)), 3, new C1544070qHd());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1544070qHd c1544070qHd = new C1544070qHd();
            c1544070qHd.LJ = EnumC1544090qHf.H5.getType();
            c1544070qHd.LIZLLL = C1544720qIg.LIZJ;
            c1544070qHd.LIZIZ = 0;
            C1544720qIg c1544720qIg = C1543550qGn.LIZJ;
            if (c1544720qIg != null) {
                c1544720qIg.LIZ(c1544070qHd.LIZ());
            }
        }
    }

    @JavascriptInterface
    public final String call(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/sdk/xbridge/protocol/impl/web/JSB3Impl", "call", this, new Object[]{str, str2}, "java.lang.String", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1iJMqiY8pf78NqAatg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
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
        LJIJJ(str, str2);
        return null;
    }
}
