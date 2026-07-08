package com.bytedance.pitaya.cep_engine.inner;

import X.C0T56;
import X.C0VCC;
import X.C1305150k4H;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class PlatformAdapter implements CepKeeper {
    public static final PlatformAdapter INSTANCE = new PlatformAdapter();

    public static final JSONObject createDict() {
        return new JSONObject();
    }

    public static final JSONArray createList() {
        return new JSONArray();
    }

    public static final Object createNull() {
        return JSONObject.NULL;
    }

    public static final void cancelTimer(long j) {
        TimerV2.INSTANCE.cancelTimer(j);
    }

    public static final Object copyObject(long j) throws JSONException {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (JSONArray) objLIZIZ;
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                jSONArray.put(jSONArray2.get(i));
            }
            return jSONArray;
        }
        if (objLIZIZ instanceof JSONObject) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = (JSONObject) objLIZIZ;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
            return jSONObject;
        }
        return null;
    }

    public static final Object createBool(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Object createDouble(double d) {
        return Double.valueOf(d);
    }

    public static final Object createInt64(long j) {
        return Long.valueOf(j);
    }

    public static final Object dictGetKeys(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONObject) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> itKeys = ((JSONObject) objLIZIZ).keys();
            while (itKeys.hasNext()) {
                jSONArray.put(itKeys.next());
            }
            return jSONArray;
        }
        return null;
    }

    public static final void dispatchGlobal(long j) {
        Dispatcher.INSTANCE.dispatchGlobalV2(j);
    }

    public static final Object getOriginObject(long j) {
        return C0T56.LIZIZ(j);
    }

    public static final int getType(Object obj) {
        if (!(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return 2;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                return 1;
            }
            if (obj instanceof String) {
                return 3;
            }
            if (obj instanceof JSONObject) {
                return 5;
            }
            if (obj instanceof JSONArray) {
                return 4;
            }
            return 6;
        }
        return 0;
    }

    public static final int listGetSize(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONArray) {
            return ((JSONArray) objLIZIZ).length();
        }
        return 0;
    }

    public static final Object parseJson(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = null;
        }
        if (jSONObject == null) {
            try {
                return new JSONArray(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return null;
            }
        }
        return jSONObject;
    }

    public static final void releaseObject(long j) {
        C0T56.LIZ.remove(Long.valueOf(j));
    }

    public static final double toDouble(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof Number) {
            return ((Number) objLIZIZ).doubleValue();
        }
        if ((objLIZIZ instanceof Boolean) && ((Boolean) objLIZIZ).booleanValue()) {
            return 1.0d;
        }
        return 0.0d;
    }

    public static final long toInt64(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof Number) {
            return ((Number) objLIZIZ).longValue();
        }
        if ((objLIZIZ instanceof Boolean) && ((Boolean) objLIZIZ).booleanValue()) {
            return 1L;
        }
        return 0L;
    }

    public static final String toJson(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (!(objLIZIZ instanceof JSONArray) && !(objLIZIZ instanceof JSONObject)) {
            return "";
        }
        return objLIZIZ.toString();
    }

    public static final String toString(long j) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof String) {
            return (String) objLIZIZ;
        }
        return "";
    }

    public static final int getType(long j) {
        return getType(C0T56.LIZIZ(j));
    }

    public static final int dictGetFieldType(long j, String str) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONObject) {
            return getType(((JSONObject) objLIZIZ).opt(str));
        }
        return 6;
    }

    public static final Object dictGetValue(long j, String str) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONObject) {
            return ((JSONObject) objLIZIZ).opt(str);
        }
        return null;
    }

    public static final void dispatchAsync(long j, long j2) {
        Dispatcher.INSTANCE.dispatchAsyncV2(j, j2);
    }

    public static final void dispatchSync(long j, long j2) throws InterruptedException {
        Dispatcher.INSTANCE.dispatchSyncV2(j, j2);
    }

    public static final void listAppendValue(long j, long j2) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        Object objLIZIZ2 = C0T56.LIZIZ(j2);
        if (objLIZIZ instanceof JSONArray) {
            if ((objLIZIZ2 instanceof JSONArray) || (objLIZIZ2 instanceof JSONObject) || (objLIZIZ2 instanceof Number) || (objLIZIZ2 instanceof Boolean) || (objLIZIZ2 instanceof String) || Intrinsics.LJFF(objLIZIZ2, JSONObject.NULL)) {
                ((JSONArray) objLIZIZ).put(objLIZIZ2);
            }
        }
    }

    public static final int listGetFieldType(long j, int i) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONArray) {
            return getType(((JSONArray) objLIZIZ).opt(i));
        }
        return 6;
    }

    public static final Object listGetValue(long j, int i) {
        Object objLIZIZ = C0T56.LIZIZ(j);
        if (objLIZIZ instanceof JSONArray) {
            return ((JSONArray) objLIZIZ).opt(i);
        }
        return null;
    }

    public static final void retainObject(long j, Object obj) {
        C0T56.LIZ.put(Long.valueOf(j), obj);
    }

    public static final void dictSetValue(long j, Object obj, long j2) throws JSONException {
        Object objLIZIZ = C0T56.LIZIZ(j);
        Object objLIZIZ2 = C0T56.LIZIZ(j2);
        if ((objLIZIZ instanceof JSONObject) && (obj instanceof String)) {
            if ((objLIZIZ2 instanceof JSONArray) || (objLIZIZ2 instanceof JSONObject) || (objLIZIZ2 instanceof Number) || (objLIZIZ2 instanceof Boolean) || (objLIZIZ2 instanceof String) || Intrinsics.LJFF(objLIZIZ2, JSONObject.NULL)) {
                ((JSONObject) objLIZIZ).put((String) obj, objLIZIZ2);
            }
        }
    }

    public static final void startTimer(long j, long j2, long j3) {
        TimerV2.INSTANCE.timer(j, j2, j3);
    }

    public static final void monitorSync(String str, long j, long j2, long j3) throws JSONException {
        JSONObject jSONObjectLIZ = C0T56.LIZ(j);
        JSONObject jSONObjectLIZ2 = C0T56.LIZ(j2);
        JSONObject jSONObjectLIZ3 = C0T56.LIZ(j3);
        C1305150k4H.LIZ.getClass();
        JSONObject jSONObjectPut = new JSONObject().put("sdk_build_ver", "1.7.28.cn-je-r21e");
        C1305150k4H.LIZ(jSONObjectPut, jSONObjectLIZ);
        JSONObject jSONObject = new JSONObject();
        C1305150k4H.LIZ(jSONObject, jSONObjectLIZ2);
        if (!jSONObject.has("cnt")) {
            jSONObject.put("cnt", 1);
        }
        JSONObject jSONObjectPut2 = new JSONObject().put("extra", jSONObjectLIZ3);
        JSONObject jSONObject2 = new JSONObject();
        C1305150k4H.LIZ(jSONObject2, jSONObjectPut);
        C1305150k4H.LIZ(jSONObject2, jSONObject);
        C1305150k4H.LIZ(jSONObject2, jSONObjectPut2);
        C0VCC c0vcc = C1305150k4H.LIZIZ;
        if (c0vcc != null) {
            c0vcc.LJIIJ(str, jSONObjectPut, jSONObject, jSONObjectPut2);
        }
        AppLogNewUtils.onEventV3(str, jSONObject2);
    }
}
