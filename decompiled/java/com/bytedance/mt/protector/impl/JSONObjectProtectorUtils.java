package com.bytedance.mt.protector.impl;

import X.C08FG;
import X.C08FV;
import X.C09EU;
import X.C2337809Ea;
import X.C2337909Eb;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public class JSONObjectProtectorUtils {
    public static JSONObject createJSONObject(JSONTokener jSONTokener) {
        String string;
        if (C09EU.LIZIZ()) {
            try {
                return new JSONObject(jSONTokener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ == null) {
                    if (jSONTokener != null) {
                        string = jSONTokener.toString();
                    } else {
                        string = "null JSONTokener";
                    }
                    addSelfData("createJSONObject", th, string);
                    throw th;
                }
                Object obj = c08fvLIZ.LIZ;
                if (obj instanceof k) {
                    return new JSONObject(obj.toString());
                }
                return null;
            }
        }
        return new JSONObject(jSONTokener);
    }

    public static JSONObject createJSONObject(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return new JSONObject(str);
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
                addSelfData("createJSONObject", th, str);
                throw th;
            }
        }
        return new JSONObject(str);
    }

    public static JSONObject INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getJSONObject(JSONObject jSONObject, String str) throws JSONException {
        if (C2337909Eb.LIZ) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
            throw C2337909Eb.LIZIZ;
        }
        return jSONObject.getJSONObject(str);
    }

    public static String INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getString(JSONObject jSONObject, String str) throws JSONException {
        if (C2337909Eb.LIZ) {
            String strOptString = jSONObject.optString(str, "_-=|_");
            if (strOptString != "_-=|_") {
                return strOptString;
            }
            throw C2337909Eb.LIZJ;
        }
        return jSONObject.getString(str);
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONObject.getBoolean(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Boolean) c08fvLIZ.LIZ).booleanValue();
                }
                throw th;
            }
        }
        return jSONObject.getBoolean(str);
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONObject.getDouble(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Double) c08fvLIZ.LIZ).doubleValue();
                }
                throw th;
            }
        }
        return jSONObject.getDouble(str);
    }

    public static int getInt(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONObject.getInt(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Integer) c08fvLIZ.LIZ).intValue();
                }
                throw th;
            }
        }
        return jSONObject.getInt(str);
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONObject.getJSONArray(str);
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
        return jSONObject.getJSONArray(str);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getJSONObject(jSONObject, str);
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
        return INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getJSONObject(jSONObject, str);
    }

    public static long getLong(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return jSONObject.getLong(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return ((Long) c08fvLIZ.LIZ).longValue();
                }
                throw th;
            }
        }
        return jSONObject.getLong(str);
    }

    public static String getString(JSONObject jSONObject, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getString(jSONObject, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return (String) c08fvLIZ.LIZ;
                }
                throw th;
            }
        }
        return INVOKEVIRTUAL_com_bytedance_mt_protector_impl_JSONObjectProtectorUtils_com_ss_android_ugc_aweme_lancet_JSONObjectLancet_getString(jSONObject, str);
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
