package com.bytedance.vmsdk.monitor;

import X.C0TKA;
import X.C0VCC;
import X.C0VCZ;
import X.C1299270jun;
import X.C1305220k4O;
import X.C1305230k4P;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.log.VLog;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class VmSdkMonitor {
    public static volatile C0VCC LIZ;
    public static Context LIZIZ;
    public static C1305230k4P LIZJ;
    public static boolean LIZLLL;

    public static synchronized void LIZ() {
        if (LIZ != null) {
            return;
        }
        VLog.init();
        SDKMonitorUtils.setConfigUrl("8398", C1305220k4O.LIZ);
        SDKMonitorUtils.setDefaultReportUrl("8398", C1305220k4O.LIZIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", LIZJ.LIZ);
            jSONObject.put("channel", LIZJ.LIZIZ);
            jSONObject.put("host_aid", LIZJ.LIZJ);
            jSONObject.put("app_version", LIZJ.LIZLLL);
            jSONObject.put("update_version_code", LIZJ.LJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
        SDKMonitorUtils.initMonitor(LIZIZ, "8398", jSONObject, new C0VCZ() { // from class: X.0k4N
            @Override // X.C0VCZ
            public final String getSessionId() {
                return null;
            }

            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                if (!VmSdkMonitor.LIZLLL) {
                    return null;
                }
                HashMap map = new HashMap();
                map.put("oversea", "1");
                return map;
            }
        });
        LIZ = SDKMonitorUtils.getInstance("8398");
    }

    public static int getSettingsFlag() {
        int iIntValue;
        Object obj;
        C1299270jun c1299270junLIZIZ = C1299270jun.LIZIZ();
        Context context = LIZIZ;
        synchronized (c1299270junLIZIZ) {
            if (context != null) {
                try {
                    c1299270junLIZIZ.LJ = context;
                    SharedPreferences sharedPreferencesLIZJ = c1299270junLIZIZ.LIZ;
                    if (sharedPreferencesLIZJ == null) {
                        sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "vmsdk_settings_manager_sp");
                    }
                    c1299270junLIZIZ.LIZ = sharedPreferencesLIZJ;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c1299270junLIZIZ.LIZJ = c1299270junLIZIZ.LIZLLL();
        }
        C1299270jun c1299270junLIZIZ2 = C1299270jun.LIZIZ();
        c1299270junLIZIZ2.getClass();
        Integer num = 0;
        try {
            Object objLIZJ = C0TKA.LIZJ("VMSDK", num.getClass(), num, false, true, null);
            if (objLIZJ == null) {
                Intrinsics.LJIIL();
            }
            iIntValue = ((Integer) objLIZJ).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            HashMap<String, Object> map = c1299270junLIZIZ2.LIZJ;
            if (map == null) {
                return 0;
            }
            try {
                Map map2 = (Map) map.get("vmsdk_common");
                if (map2 != null && (obj = map2.get("VMSDK")) != null) {
                    return ((Integer) obj).intValue();
                }
            } catch (Throwable th2) {
            }
        }
        return iIntValue;
    }

    public static boolean getSettings(String str) {
        C1299270jun c1299270junLIZIZ = C1299270jun.LIZIZ();
        Context context = LIZIZ;
        synchronized (c1299270junLIZIZ) {
            if (context != null) {
                try {
                    c1299270junLIZIZ.LJ = context;
                    SharedPreferences sharedPreferencesLIZJ = c1299270junLIZIZ.LIZ;
                    if (sharedPreferencesLIZJ == null) {
                        sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "vmsdk_settings_manager_sp");
                    }
                    c1299270junLIZIZ.LIZ = sharedPreferencesLIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1299270junLIZIZ.LIZJ = c1299270junLIZIZ.LIZLLL();
        }
        return C1299270jun.LIZIZ().LIZ(str);
    }

    public static synchronized void LIZIZ(Context context, C1305230k4P c1305230k4P) {
        LIZIZ = context;
        LIZJ = c1305230k4P;
        LIZLLL = false;
    }

    public static synchronized void LIZJ(Context context, C1305230k4P c1305230k4P) {
        LIZIZ(context, c1305230k4P);
        LIZ();
    }

    public static synchronized void LIZLLL(Context context, C1305230k4P c1305230k4P) {
        LIZJ(context, c1305230k4P);
    }

    public static void LJ(String str, JSONObject jSONObject) {
        if (LIZ == null) {
            LIZ();
        }
        if (LIZ != null) {
            LIZ.LJIIJ(str, jSONObject, null, null);
        }
    }

    public static void monitorEvent(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_name", str2);
            jSONObject.put(str3, str4);
            LJ(str, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
