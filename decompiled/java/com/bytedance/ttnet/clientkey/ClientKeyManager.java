package com.bytedance.ttnet.clientkey;

import X.C080U;
import X.C1490270osr;
import X.C1490280oss;
import X.C1490380ot2;
import X.C2175508fh;
import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ClientKeyManager {
    public static volatile ClientKeyManager LJII = null;
    public static Keva LJIIIIZZ = null;
    public static volatile boolean LJIIIZ = false;
    public static boolean LJIIJ = true;
    public static Map<String, String> LJIIJJI;
    public final List<String> LIZ = new CopyOnWriteArrayList();
    public final List<String> LIZIZ = new CopyOnWriteArrayList();
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public boolean LJI = true;

    public static ClientKeyManager LJI() {
        if (LJII == null) {
            synchronized (ClientKeyManager.class) {
                try {
                    if (LJII == null) {
                        LJII = new ClientKeyManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (LJIIIIZZ == null || !LJIIIZ) {
            return null;
        }
        return LJIIJ ? LJIIJJI : LJFF(LJIIIIZZ.getString("client_key", ""), LJIIIIZZ.getString("kms_version", ""));
    }

    public final void LIZ(Object obj) {
        JSONObject jSONObjectOptJSONObject;
        if (LJIIIIZZ != null && C1490280oss.LIZ(obj)) {
            try {
                JSONObject jSONObjectLIZ = null;
                if (obj instanceof String) {
                    jSONObjectLIZ = new JSONObject((String) obj);
                } else if (obj instanceof JSONObject) {
                    jSONObjectLIZ = (JSONObject) obj;
                } else if (obj instanceof C1490270osr) {
                    jSONObjectLIZ = ((C1490270osr) obj).LIZ();
                }
                if (jSONObjectLIZ != null && (jSONObjectOptJSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObjectLIZ, "data").optJSONObject("client_key_config")) != null) {
                    String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                    Logger.debug();
                    LJIIIIZZ.storeString("client_key_config", strJ3);
                    LIZIZ(jSONObjectOptJSONObject);
                    return;
                }
                Logger.debug();
                LJIIIZ = false;
                LJIIIIZZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        boolean z;
        boolean z2 = true;
        if (jSONObject.optInt("client_key_sign_enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        LJIIIZ = z;
        if (!LJIIIZ) {
            Logger.debug();
            LJIIIIZZ.clear();
            return;
        }
        if (jSONObject.optInt("rewrite_session_enabled", 1) <= 0) {
            z2 = false;
        }
        this.LJI = z2;
        ((CopyOnWriteArrayList) this.LIZ).clear();
        String strOptString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(strOptString)) {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    ((CopyOnWriteArrayList) this.LIZ).add(string);
                }
            }
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        String strOptString2 = jSONObject.optString("update_path_list", null);
        if (!TextUtils.isEmpty(strOptString2)) {
            JSONArray jSONArray2 = new JSONArray(strOptString2);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string2 = JSONArrayProtectorUtils.getString(jSONArray2, i2);
                if (!TextUtils.isEmpty(string2)) {
                    ((CopyOnWriteArrayList) this.LIZIZ).add(string2);
                }
            }
        }
    }

    public static String LJ(C2175508fh c2175508fh, String str) {
        C080U c080uLIZ = c2175508fh.LIZ(str);
        if (c080uLIZ == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(c080uLIZ.toString());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("; ");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static Map<String, String> LJFF(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap map = new HashMap();
            map.put("x-bd-client-key", str);
            map.put("x-bd-kmsv", str2);
            return map;
        }
        return null;
    }

    public final void LIZJ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append("");
            jSONObject.put("report_time", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", str2);
            jSONObject.put("url", this.LJ);
            C1490380ot2.LIZ("cookie_mismatch", jSONObject, null, Integer.MAX_VALUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:37|(2:47|(5:49|60|52|45|46)(1:50))(2:40|(3:44|45|46))|51|60|52|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.retrofit2.client.Request r16, X.C2175508fh r17) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.clientkey.ClientKeyManager.LIZLLL(com.bytedance.retrofit2.client.Request, X.08fh):void");
    }

    public final void LJII(String str, CookieHandler cookieHandler, URI uri) throws IOException {
        if (!this.LJI) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        linkedHashMap.put("Set-Cookie", arrayList);
        cookieHandler.put(uri, linkedHashMap);
        Logger.debug();
    }

    public static void LJIIIIZZ(int i, String str, String str2, String str3, String str4, String str5, String str6, C2175508fh c2175508fh, String str7) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("origin_sid", str);
        jSONObject.put("sid", str2);
        jSONObject.put("origin_key", str3);
        jSONObject.put("key", str4);
        jSONObject.put("origin_kms", str5);
        jSONObject.put("kms", str6);
        if (c2175508fh != null) {
            String strLJ = LJ(c2175508fh, "x-tt-token");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJ);
            sbLIZ.append(LJ(c2175508fh, "x-tt-logid"));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(LJ(c2175508fh, "x-bd-lanusk"));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(LJ(c2175508fh, "x-bd-lanusv"));
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            if (!TextUtils.isEmpty(strLIZIZ3)) {
                jSONObject.put("headers", strLIZIZ3);
            }
        }
        C1490380ot2.LIZ("client_key", jSONObject, str7, i);
    }
}
