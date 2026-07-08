package com.ss.android.common.lib;

import X.C0V19;
import X.C19919012we;
import X.C2093608Ic;
import X.C2184701Aeq;
import X.C2210271Bez;
import X.C830270Whd;
import X.EnumC21646419na;
import X.EnumC2176421AFs;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AppLogNewUtils {
    public static volatile boolean LIZ = true;
    public static final Looper LIZIZ = Looper.getMainLooper();
    public static volatile boolean LIZJ = false;

    public static boolean LJII() {
        return LIZJ && AppLog.getSwitchToBdtracker() && Looper.myLooper() != LIZIZ;
    }

    public static JSONObject LIZ(JSONObject jSONObject) {
        if (AppLog.isEventMapEnabled()) {
            C19919012we.LIZ.LIZ(jSONObject);
        }
        return jSONObject;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            linkedList.add(itKeys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static boolean LIZJ(String str) {
        if (AppLog.getSwitchToBdtracker()) {
            C2184701Aeq c2184701Aeq = ((C2210271Bez) com.bytedance.applog.AppLog.getBatchReportSettings()).LJIIIZ;
            if (c2184701Aeq.LIZ && c2184701Aeq.LIZIZ.contains(str)) {
                com.bytedance.applog.AppLog.getInstance().LJJJJZ().LJIIL(EnumC21646419na.PRE_EVENT_BLOCKED, str, String.valueOf(C830270Whd.LIZ.incrementAndGet()), System.currentTimeMillis(), EnumC2176421AFs.V3_EVENT);
                return true;
            }
        }
        return false;
    }

    public static void LJ(final String str, final Bundle bundle) {
        Object obj;
        if (C2093608Ic.LJ(str) || LIZJ(str)) {
            return;
        }
        if (LJII()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        try {
                            obj = bundle.get(str2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj = null;
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        }
                        jSONObject.put(str2, obj);
                    }
                }
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LIZ(jSONObject);
            AppLog.onEvent(null, "event_v3", str, null, 0L, 0L, jSONObject);
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0V19.LIZJ().LIZIZ(new Runnable() { // from class: X.0Vm7
            public final void LIZ() {
                Object obj2;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("_event_v3", 1);
                    jSONObject2.put("event_v3_reserved_field_time_stamp", jCurrentTimeMillis);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        for (String str3 : bundle2.keySet()) {
                            try {
                                obj2 = bundle.get(str3);
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                obj2 = null;
                            } catch (OutOfMemoryError e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                obj2 = null;
                            }
                            jSONObject2.put(str3, obj2);
                        }
                    }
                    String abSDKVersion = AppLog.getAbSDKVersion();
                    if (!TextUtils.isEmpty(abSDKVersion)) {
                        jSONObject2.put("ab_sdk_version", abSDKVersion);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                AppLogNewUtils.LIZ(jSONObject2);
                AppLog.onEvent(null, "event_v3", str, null, 0L, 0L, jSONObject2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppLogNewUtils@e200.onEventV3Bundle$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppLogNewUtils@e200.onEventV3Bundle$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(final java.lang.String r22, final org.json.JSONObject r23) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.lib.AppLogNewUtils.LJFF(java.lang.String, org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(final java.lang.String r20, final java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.lib.AppLogNewUtils.LJI(java.lang.String, java.util.Map):void");
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        if (LIZJ(str)) {
            return;
        }
        JSONObject jSONObjectLIZIZ = LIZIZ(jSONObject);
        LIZ(jSONObjectLIZIZ);
        LJFF(str, jSONObjectLIZIZ);
    }

    public static void LIZLLL(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        if (C2093608Ic.LJ(str) || LIZJ(str)) {
            return;
        }
        LIZ(jSONObject2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("_event_v3", 1);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            try {
                jSONObject2.put("__applog_need_avoid", 1);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            AppLog.onEvent(null, "event_v3", str, null, 0L, 0L, jSONObject2);
            return;
        }
        AppLog.onEventInternal(null, "event_v3", str, null, 0L, 0L, false, jSONObject2);
    }
}
