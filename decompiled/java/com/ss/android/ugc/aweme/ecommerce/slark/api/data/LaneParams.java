package com.ss.android.ugc.aweme.ecommerce.slark.api.data;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class LaneParams extends HashMap<String, Object> implements Serializable {
    public final HashMap<String, Object> notCheckParams = new HashMap<>();

    public final Map<String, Object> preview() {
        HashMap map = new HashMap(this.notCheckParams);
        map.putAll(this);
        return map;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final JSONObject toJSONObject() {
        if (isEmpty()) {
            return null;
        }
        return new JSONObject(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public final Map<String, Object> getNotCheckParams() {
        return this.notCheckParams;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final LaneParams merge(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        put(next, jSONObject.get(next).toString());
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public final void withNotCheckParams(Map<String, ? extends Object> map) {
        this.notCheckParams.putAll(map);
    }

    public final void withParamsGroup(Map<String, ? extends Object> map) {
        withNotCheckParams(map);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    public final int compareTo(LaneParams laneParams, Map<String, ? extends Object> map) {
        laneParams.putAll(map);
        return 0;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, obj2);
    }

    public final void minus(String str, Object obj) {
        if (obj != null) {
            put(str, obj);
        }
    }

    public final void plusAssign(String str, Object obj) {
        put(str, obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public final void withNotCheckParam(String str, Object obj) {
        this.notCheckParams.put(str, obj);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
