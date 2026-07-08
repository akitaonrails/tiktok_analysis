package im3;

import X.AnonymousClass0825;
import X.C0VJO;
import X.C2188811AlT;
import X.C802770VeN;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import dl3.h;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class o {
    public static String LIZJ(String str, Map map) {
        if (!TextUtils.isDigitsOnly(str)) {
            HashMap map2 = (HashMap) map;
            if (!map2.isEmpty()) {
                StringBuilder sb = new StringBuilder(str);
                if (!str.contains("?")) {
                    sb.append("?");
                }
                try {
                    for (Map.Entry entry : map2.entrySet()) {
                        if (entry.getValue() != null) {
                            if (!sb.toString().endsWith("?")) {
                                sb.append("&");
                            }
                            sb.append(URLEncoder.encode(entry.getKey().toString(), "UTF-8"));
                            sb.append("=");
                            sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                        }
                    }
                    return sb.toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return str;
    }

    public static String LIZLLL(String str, JSONObject jSONObject) {
        String string;
        String strValueOf;
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.opt(next));
            }
        }
        String[] strArr = new String[14];
        strArr[0] = "aid";
        strArr[1] = "4444";
        strArr[2] = "os";
        strArr[3] = "Android";
        strArr[4] = "update_version_code";
        strArr[5] = "000000";
        strArr[6] = "channel";
        strArr[7] = "unknown";
        strArr[8] = "app_version";
        strArr[9] = "0.0.0";
        strArr[10] = "sdk_version";
        strArr[11] = AnonymousClass0825.LIZ;
        strArr[12] = "device_id";
        C802770VeN c802770VeNLIZ = C802770VeN.LIZ();
        if (c802770VeNLIZ != null) {
            string = c802770VeNLIZ.LJFF().getRandomDeviceId();
        } else {
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (TextUtils.isEmpty(string)) {
                string = "0000-1111-2222-3333-4444";
            }
        }
        strArr[13] = string;
        HashMap map2 = new HashMap();
        for (int i = 0; i < 14; i += 2) {
            String str2 = strArr[i];
            Object obj = map.get(str2);
            if (obj != null) {
                strValueOf = String.valueOf(obj);
            } else {
                strValueOf = strArr[i + 1];
            }
            map2.put(str2, strValueOf);
        }
        return LIZJ(str, map2);
    }

    public static String LJ(String str, f fVar) {
        HashMap map = new HashMap();
        map.put("aid", fVar.LIZ());
        map.put("version_code", String.valueOf(fVar.LJIIIIZZ()));
        map.put("update_version_code", String.valueOf(fVar.LJFF()));
        map.put("app_version", String.valueOf(fVar.LJIIIZ()));
        if (!TextUtils.isEmpty(fVar.LIZIZ())) {
            map.put("channel", fVar.LIZIZ());
        }
        map.put("device_id", fVar.LIZLLL(CardStruct.IStatusCode.DEFAULT));
        return LIZLLL(str, new JSONObject(map));
    }

    public static String LJFF(CrashType crashType, JSONObject jSONObject) {
        String str;
        if (crashType == CrashType.NATIVE) {
            str = h.LJIIJJI.LJII;
        } else if (crashType != CrashType.ANR && crashType != CrashType.JAVA && crashType != CrashType.DART) {
            if (crashType == CrashType.LAUNCH) {
                str = h.LJIIJJI.LIZJ;
            } else if (crashType == CrashType.ASAN) {
                str = h.LJIIJJI.LJII;
            } else if (crashType == CrashType.COREDUMP) {
                str = h.LJIIJJI.LIZ;
            } else if (crashType == CrashType.NATIVE_CUSTOMIZE) {
                str = h.LJIIJJI.LJFF;
            } else {
                str = h.LJIIJJI.LIZIZ;
            }
        } else {
            str = h.LJIIJJI.LIZIZ;
        }
        if (!C0VJO.LJI(jSONObject)) {
            return LIZLLL(str, jSONObject);
        }
        return str;
    }

    public static String LJI(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("?");
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else if (!str.endsWith("&")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("&");
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public static String LIZIZ(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str3 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            }
            try {
                if (!sb.toString().endsWith("?")) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "UTF-8"));
                return sb.toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public static String LIZ(int i, String str, String str2, long j, String str3) {
        return LIZIZ(LIZIZ(LIZIZ(LIZIZ(LIZIZ(LIZIZ(LIZIZ(str, "aid", String.valueOf(i)), "device_id", str2), "os", "Android"), "update_version_code", String.valueOf(j)), "channel", "unknown"), "app_version", str3), "sdk_version", AnonymousClass0825.LIZ);
    }
}
