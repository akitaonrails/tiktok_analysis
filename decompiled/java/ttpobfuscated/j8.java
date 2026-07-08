package ttpobfuscated;

import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.m8;

/* JADX INFO: loaded from: classes24.dex */
public final class j8 {
    public static final k8 a(String str) {
        return new k8(new m8.d(str));
    }

    public static final boolean a(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof Boolean) {
                return ((Boolean) objOpt).booleanValue();
            }
            throw a(str, objOpt, n8.BooleanType);
        }
        throw new k8(new m8.d(str));
    }

    public static final double b(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof Float) {
                return ((Number) objOpt).floatValue();
            }
            if (objOpt instanceof Integer) {
                return ((Number) objOpt).intValue();
            }
            if (objOpt instanceof Long) {
                return ((Number) objOpt).longValue();
            }
            if (objOpt instanceof Double) {
                return ((Number) objOpt).doubleValue();
            }
            throw a(str, objOpt, n8.DoubleType);
        }
        throw new k8(new m8.d(str));
    }

    public static final int c(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (!(objOpt instanceof Float)) {
                if (!(objOpt instanceof Double)) {
                    if (objOpt instanceof Integer) {
                        return ((Number) objOpt).intValue();
                    }
                    throw a(str, objOpt, n8.IntType);
                }
                throw a(str, objOpt, n8.IntType);
            }
            throw a(str, objOpt, n8.IntType);
        }
        throw new k8(new m8.d(str));
    }

    public static final JSONArray d(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof JSONArray) {
                return (JSONArray) objOpt;
            }
            throw a(str, objOpt, n8.ArrayType);
        }
        throw new k8(new m8.d(str));
    }

    public static final JSONObject e(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof JSONObject) {
                return (JSONObject) objOpt;
            }
            throw a(str, objOpt, n8.ObjectType);
        }
        throw new k8(new m8.d(str));
    }

    public static final long f(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof Long) {
                return ((Number) objOpt).longValue();
            }
            if (objOpt instanceof Integer) {
                return ((Number) objOpt).intValue();
            }
            throw a(str, objOpt, n8.LongType);
        }
        throw new k8(new m8.d(str));
    }

    public static final String g(JSONObject jSONObject, String str) throws k8 {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof String) {
                return (String) objOpt;
            }
            throw a(str, objOpt, n8.StringType);
        }
        throw new k8(new m8.d(str));
    }

    public static final k8 a(String str, String str2) {
        return new k8(new m8.a(str, str2));
    }

    public static final k8 a(String str, Object obj, n8 n8Var) {
        n8 n8Var2;
        n8 n8Var3;
        n8 n8Var4;
        n8 n8Var5;
        n8 n8Var6;
        n8 n8Var7;
        n8 n8Var8;
        n8 n8Var9;
        if ((obj instanceof String) && n8Var != (n8Var9 = n8.StringType)) {
            return new k8(new m8.c(str, n8Var9, n8Var));
        }
        if ((obj instanceof Integer) && n8Var != (n8Var8 = n8.IntType)) {
            return new k8(new m8.c(str, n8Var8, n8Var));
        }
        if ((obj instanceof Long) && n8Var != (n8Var7 = n8.LongType)) {
            return new k8(new m8.c(str, n8Var7, n8Var));
        }
        if ((obj instanceof Boolean) && n8Var != (n8Var6 = n8.BooleanType)) {
            return new k8(new m8.c(str, n8Var6, n8Var));
        }
        if ((obj instanceof Float) && n8Var != (n8Var5 = n8.FloatType)) {
            return new k8(new m8.c(str, n8Var5, n8Var));
        }
        if ((obj instanceof Double) && n8Var != (n8Var4 = n8.DoubleType)) {
            return new k8(new m8.c(str, n8Var4, n8Var));
        }
        if ((obj instanceof JSONObject) && n8Var != (n8Var3 = n8.ObjectType)) {
            return new k8(new m8.c(str, n8Var3, n8Var));
        }
        if ((obj instanceof JSONArray) && n8Var != (n8Var2 = n8.ArrayType)) {
            return new k8(new m8.c(str, n8Var2, n8Var));
        }
        return new k8(m8.b.b);
    }

    public static final k8 a(String str, n8 n8Var, n8 n8Var2) {
        return new k8(new m8.c(str, n8Var, n8Var2));
    }
}
