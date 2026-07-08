package ttpobfuscated;

import X.C139O;
import X.C13LE;
import X.C13LP;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 {
    public static final a b = new a();
    public static final String c = "$";
    public static final String d = ".";
    public static final String e = "[";
    public static final String f = "]";
    public static final String g = "@";
    public static final String h = "(";
    public static final String i = "convertBooleanToInt";
    public Map<String, Boolean> a;

    public static final class a {
    }

    public final int a(boolean z) {
        return z ? 1 : 0;
    }

    public final Map<String, Boolean> a() {
        return this.a;
    }

    public final void a(Map<String, Boolean> map) {
        this.a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Map<String, ? extends Object> map, String str) {
        boolean z;
        if (kotlin.text.u.LJJIIJZLJL(str, c, false)) {
            this.a = new LinkedHashMap();
            for (String str2 : kotlin.text.a0.LJJLIIIJILLIZJL(str, new String[]{d}, 0, 6)) {
                if (!Intrinsics.LJFF(str2, c)) {
                    map = a(str2, map);
                    Map<String, Boolean> map2 = this.a;
                    if (map2 != null) {
                        if (map != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        map2.put(str2, Boolean.valueOf(z));
                    }
                }
            }
            return map;
        }
        return null;
    }

    public final Object b(String str, Object obj) {
        Boolean bool;
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return b(str, b8.a((JSONObject) obj));
        }
        if (obj instanceof JSONArray) {
            return b(str, b8.a((JSONArray) obj));
        }
        if (obj == null) {
            return null;
        }
        if (kotlin.text.a0.LJJIIZI(str, g, false)) {
            if (!Intrinsics.LJFF(ze.b(str, g, h), i) || !(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return null;
            }
            return Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        C13LE.LIZ(obj.getClass());
        throw new C139O();
    }

    public final Object a(String str, Object obj) {
        Integer numA;
        if (kotlin.text.a0.LJJIIZI(str, e, false)) {
            Object objB = b(kotlin.text.a0.LJJZ(str, e, str), obj);
            if (objB instanceof List) {
                Integer numA2 = ze.a(str, e, f);
                if (numA2 != null) {
                    return C13LP.LJJJLZIJ(numA2.intValue(), (List) objB);
                }
                return null;
            }
            if ((objB instanceof JSONArray) && (numA = ze.a(str, e, f)) != null) {
                return ((JSONArray) objB).opt(numA.intValue());
            }
            return null;
        }
        return b(str, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Map<String, ? extends Object> map, List<String> list) {
        boolean z;
        if (Intrinsics.LJFF(C13LP.LJJJLZIJ(0, list), c)) {
            this.a = new LinkedHashMap();
            for (String str : list) {
                if (!Intrinsics.LJFF(str, c)) {
                    map = a(str, map);
                    Map<String, Boolean> map2 = this.a;
                    if (map2 != null) {
                        if (map != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        map2.put(str, Boolean.valueOf(z));
                    }
                }
            }
            return map;
        }
        return null;
    }
}
