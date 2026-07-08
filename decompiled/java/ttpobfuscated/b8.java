package ttpobfuscated;

import X.C098200Yq;
import X.C09R4;
import X.C13LZ;
import X.C15438062q;
import X.C189200o6;
import X.C531650Kt9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 {
    public static final List<Object> a(JSONArray jSONArray) {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(c(jSONArray.get(it2.nextInt())));
        }
        return arrayList;
    }

    public static final List<String> b(JSONArray jSONArray) {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(b(jSONArray.get(it2.nextInt())));
        }
        return arrayList;
    }

    public static final Map<String, String> c(JSONObject jSONObject) {
        Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceLIZIZ) {
            linkedHashMap.put(obj, b(jSONObject.get((String) obj)));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, List<String>> b(JSONObject jSONObject) {
        Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceLIZIZ) {
            linkedHashMap.put(obj, a(jSONObject.get((String) obj)));
        }
        return linkedHashMap;
    }

    public static final Object c(Object obj) {
        if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        return a((JSONArray) obj);
    }

    public static final Map<String, Object> a(JSONObject jSONObject) {
        Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceLIZIZ) {
            linkedHashMap.put(obj, c(jSONObject.get((String) obj)));
        }
        return linkedHashMap;
    }

    public static final String b(Object obj) throws JSONException {
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new JSONException("JSON document doesn't match the data expected by the caller");
    }

    public static final JSONObject a(String str) {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final List<String> a(Object obj) throws JSONException {
        if (obj instanceof JSONArray) {
            return b((JSONArray) obj);
        }
        if (obj instanceof String) {
            return Collections.singletonList(obj);
        }
        throw new JSONException("JSON document doesn't match the data expected by the caller");
    }
}
