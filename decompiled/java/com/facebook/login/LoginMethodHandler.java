package com.facebook.login;

import X.C0W7Q;
import X.C0WV6;
import X.C0WVE;
import X.C0WVK;
import X.C1BJA;
import X.C1BJO;
import X.C2188811AlT;
import X.C2202561BIg;
import X.C786410Ut5;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public static final C2202561BIg Companion = new C2202561BIg();
    public LoginClient loginClient;
    public Map<String, String> methodLoggingExtras;

    public void LIZIZ() {
    }

    public abstract String LIZLLL();

    public boolean LJI(int i, int i2, Intent intent) {
        return false;
    }

    public void LJIIIIZZ(JSONObject jSONObject) {
    }

    public abstract int LJIIIZ(LoginClient.Request request);

    public String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fb");
        sbLIZ.append(FacebookSdk.LIZLLL());
        sbLIZ.append("://authorize/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LoginMethodHandler(Parcel parcel) {
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = null;
        if (i >= 0) {
            HashMap map = new HashMap();
            if (i > 0) {
                int i2 = 0;
                do {
                    i2++;
                    map.put(parcel.readString(), parcel.readString());
                } while (i2 < i);
            }
            linkedHashMap = new LinkedHashMap(map);
        }
        this.methodLoggingExtras = linkedHashMap;
    }

    public final String LIZJ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", LIZLLL());
            LJIIIIZZ(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final void LJFF(String str) {
        String strLIZLLL;
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        LoginClient.Request request = loginClient.pendingRequest;
        if (request == null || (strLIZLLL = request.applicationId) == null) {
            strLIZLLL = FacebookSdk.LIZLLL();
        }
        LoginClient loginClient2 = this.loginClient;
        loginClient2.getClass();
        loginClient2.LJFF();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fb_web_login_e2e", str, bundle);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        C786410Ut5.LJJJI("app_id", strLIZLLL, bundle);
    }

    public LoginMethodHandler(LoginClient loginClient) {
        this.loginClient = loginClient;
    }

    public final void LIZ(Object obj, String str) {
        String string;
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map != null) {
            if (obj == null) {
                string = null;
            } else {
                string = obj.toString();
            }
            map.put(str, string);
        }
    }

    public final void LJII(Bundle bundle, LoginClient.Request request) {
        String string = bundle.getString("code");
        if (!C0W7Q.LJIILL(string)) {
            if (string == null) {
                throw new C1BJO("Failed to create code exchange request");
            }
            String strLJ = LJ();
            String str = request.codeVerifier;
            if (str == null) {
                str = "";
            }
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("code", string, bundle2);
            C786410Ut5.LJJJI("client_id", FacebookSdk.LIZLLL(), bundle2);
            C786410Ut5.LJJJI("redirect_uri", strLJ, bundle2);
            C786410Ut5.LJJJI("code_verifier", str, bundle2);
            String str2 = GraphRequest.LJIIIIZZ;
            GraphRequest graphRequestLJFF = C1BJA.LJFF(null, "oauth/access_token", null);
            graphRequestLJFF.LJIIIZ(C0WV6.GET);
            graphRequestLJFF.LIZLLL = bundle2;
            C0WVK c0wvkLIZJ = graphRequestLJFF.LIZJ();
            FacebookRequestError facebookRequestError = c0wvkLIZJ.LIZJ;
            if (facebookRequestError == null) {
                try {
                    JSONObject jSONObject = c0wvkLIZJ.LIZIZ;
                    if (jSONObject != null) {
                        String string2 = jSONObject.getString("access_token");
                        if (!C0W7Q.LJIILL(string2)) {
                            C786410Ut5.LJJJI("access_token", string2, bundle);
                            if (jSONObject.has("id_token")) {
                                C786410Ut5.LJJJI("id_token", jSONObject.getString("id_token"), bundle);
                                return;
                            }
                            return;
                        }
                    }
                    throw new C1BJO("No access token found from result");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C1BJO(Intrinsics.LJIIJJI(e.getMessage(), "Fail to process code exchange response: "));
                }
            }
            throw new C0WVE(facebookRequestError, facebookRequestError.LIZ());
        }
        throw new C1BJO("No code param found from the request");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }
}
