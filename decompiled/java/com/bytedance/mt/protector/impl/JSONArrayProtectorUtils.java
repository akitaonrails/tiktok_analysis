package com.bytedance.mt.protector.impl;

import X.C08FG;
import X.C08FV;
import X.C09EU;
import X.C2337809Ea;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public class JSONArrayProtectorUtils {
    public static JSONArray createJSONArray(JSONTokener jSONTokener) {
        String string;
        if (C09EU.LIZIZ()) {
            try {
                return new JSONArray(jSONTokener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ == null) {
                    if (jSONTokener != null) {
                        string = jSONTokener.toString();
                    } else {
                        string = "null JSONTokener";
                    }
                    addSelfData("createJSONArray", th, string);
                    throw th;
                }
                Object obj = c08fvLIZ.LIZ;
                if (obj instanceof k) {
                    return new JSONArray(obj.toString());
                }
                return null;
            }
        }
        return new JSONArray(jSONTokener);
    }

    public static JSONArray createJSONArray(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return new JSONArray(obj.toString());
                    }
                    return null;
                }
                addSelfData("createJSONArray", th, str);
                throw th;
            }
        }
        return new JSONArray(str);
    }

    public static boolean getBoolean(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getBoolean(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Boolean) c08fvLIZ.LIZ).booleanValue();
                }
                throw th;
            }
        }
        return jSONArray.getBoolean(i);
    }

    public static double getDouble(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getDouble(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Double) c08fvLIZ.LIZ).doubleValue();
                }
                throw th;
            }
        }
        return jSONArray.getDouble(i);
    }

    public static int getInt(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getInt(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Integer) c08fvLIZ.LIZ).intValue();
                }
                throw th;
            }
        }
        return jSONArray.getInt(i);
    }

    public static JSONArray getJSONArray(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getJSONArray(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return new JSONArray(obj.toString());
                    }
                    return null;
                }
                throw th;
            }
        }
        return jSONArray.getJSONArray(i);
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getJSONObject(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return new JSONObject(obj.toString());
                    }
                    return null;
                }
                throw th;
            }
        }
        return jSONArray.getJSONObject(i);
    }

    public static long getLong(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getLong(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Long) c08fvLIZ.LIZ).longValue();
                }
                throw th;
            }
        }
        return jSONArray.getLong(i);
    }

    public static String getString(JSONArray jSONArray, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONArray.getString(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return (String) c08fvLIZ.LIZ;
                }
                throw th;
            }
        }
        return jSONArray.getString(i);
    }

    public static void addSelfData(String str, Throwable th, String str2) {
        try {
            String strLIZ = C2337809Ea.LIZ(th);
            n nVar = new n();
            nVar.LJJIIJ("stackTrace", strLIZ);
            nVar.LJJIIJ("inputData", str2);
            SelfDataManager.LJ.LIZ(str, th, nVar);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C09EU.LIZJ.LIZ();
        }
    }

    public static void addSelfData(String str, Throwable th, k kVar) {
        String string;
        if (kVar != null) {
            string = kVar.toString();
        } else {
            string = "null-param";
        }
        addSelfData(str, th, string);
    }
}
