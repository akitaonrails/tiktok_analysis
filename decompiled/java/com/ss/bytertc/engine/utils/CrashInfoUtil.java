package com.ss.bytertc.engine.utils;

import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CrashInfoUtil {
    public static volatile Method getAddTagsStaticMethod;
    public static AtomicInteger isApplogOrBDTracker = new AtomicInteger(0);
    public static volatile Method onEventV3StaticMethod;

    public static void getEventMethod() {
        if (onEventV3StaticMethod == null) {
            getMethodFromAppLog();
        }
        if (onEventV3StaticMethod == null) {
            getMethodFromBDTracker();
        }
    }

    public static void getMethodFromAppLog() {
        try {
            Class.forName("com.ss.android.common.applog.AppLog");
            onEventV3StaticMethod = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
            isApplogOrBDTracker.set(1);
            LogUtil.d("CrashInfoUtil", "upload AppLog Success!");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload error (AppLog)");
            sbLIZ.append(e);
            LogUtil.e("CrashInfoUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void getMethodFromBDTracker() {
        try {
            onEventV3StaticMethod = Class.forName("com.bytedance.applog.AppLog").getMethod("onEventV3", String.class, JSONObject.class);
            isApplogOrBDTracker.set(2);
            LogUtil.d("CrashInfoUtil", "upload BDTracker Success!");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload error (bdtracker)");
            sbLIZ.append(e);
            LogUtil.e("CrashInfoUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void getMethodFromNpth() {
        try {
            getAddTagsStaticMethod = Class.forName("com.bytedance.crash.Npth").getMethod("addTags", Map.class);
            LogUtil.d("CrashInfoUtil", "upload Npth Success!");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload error (Npth)");
            sbLIZ.append(e);
            LogUtil.e("CrashInfoUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) throws Throwable {
        LogUtil.i("CrashInfoUtil", "addTags");
        getMethodFromNpth();
        if (getAddTagsStaticMethod != null) {
            try {
                C2204961BRm.a0(getAddTagsStaticMethod, null, new Object[]{map}, new C0WZX("dzBzEhEpEcjFQVIzURHKY0i/duFJK+IWVf8rKO4krKdaBvDPaeeZ6ts=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LogUtil.e("CrashInfoUtil", "upload error " + e);
            }
        }
    }

    public static void addTagsReport(String str) throws Throwable {
        LogUtil.d("CrashInfoUtil", "addTagsReport...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            addTags(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addTagsReport catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("CrashInfoUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void onEventV3Report(String str) throws Throwable {
        LogUtil.d("CrashInfoUtil", "onEventV3Report...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strJ3 = C786410Ut5.J3(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("custom", strJ3);
            jSONObject2.put("sdk_version", "1.3.0");
            if (jSONObject.optString("rtc_room_id", "").isEmpty()) {
                jSONObject2.put("sdk_aid", 2255);
            } else {
                jSONObject2.put("sdk_aid", 1304);
            }
            onEventV3("sdk_session_launch", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEventV3Report catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("CrashInfoUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void onEventV3(String str, JSONObject jSONObject) throws Throwable {
        LogUtil.d("CrashInfoUtil", "onEventV2 monitorName " + str);
        getEventMethod();
        if (onEventV3StaticMethod != null) {
            try {
                C2204961BRm.a0(onEventV3StaticMethod, null, new Object[]{str, jSONObject}, new C0WZX("dzBzEhEpEcjFQVIzURHKY0i/duFJK+IWVf8rKO4krKdaBvDPaeeZ6ts=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LogUtil.e("CrashInfoUtil", "upload error " + e);
            }
        }
    }
}
