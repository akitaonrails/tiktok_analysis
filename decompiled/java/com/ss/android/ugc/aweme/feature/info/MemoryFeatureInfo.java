package com.ss.android.ugc.aweme.feature.info;

import X.C087U;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class MemoryFeatureInfo implements C087U {
    public final ConcurrentHashMap<String, Object> featureMap = new ConcurrentHashMap<>(16);

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.featureMap.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Object> entry : this.featureMap.entrySet()) {
                    if ((entry.getValue() instanceof Number) || (entry.getValue() instanceof String) || (entry.getValue() instanceof Boolean) || (entry.getValue() instanceof JSONArray) || (entry.getValue() instanceof JSONObject)) {
                        jSONObject2.putOpt(entry.getKey(), entry.getValue());
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("toJSON not support ");
                        sbLIZ.append(entry.getKey());
                        sbLIZ.append(':');
                        sbLIZ.append(entry.getValue());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                jSONObject.put("map", jSONObject2);
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureInfo(featureMap=");
        sbLIZ.append(this.featureMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ConcurrentHashMap<String, Object> getFeatureMap() {
        return this.featureMap;
    }

    public void fromJSON(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("map");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectOptJSONObject.opt(next);
                if (objOpt != null) {
                    this.featureMap.put(next, objOpt);
                }
            }
        }
    }

    public Object getFeature(String str) {
        return this.featureMap.get(str);
    }

    public boolean hasFeature(String str) {
        return this.featureMap.containsKey(str);
    }

    public void setFeature(String str, Object obj) {
        if (obj != null) {
            this.featureMap.put(str, obj);
        } else {
            this.featureMap.remove(str);
        }
    }

    @Override // X.C087U
    public Number addFeature(String str, Number number, boolean z) {
        Number number2;
        if (number != null) {
            float fFloatValue = number.floatValue();
            if (z && fFloatValue <= 0.0f) {
                Object obj = this.featureMap.get(str);
                if (!(obj instanceof Number)) {
                    return null;
                }
                return (Number) obj;
            }
            Object obj2 = this.featureMap.get(str);
            if ((obj2 instanceof Number) && (number2 = (Number) obj2) != null) {
                fFloatValue += number2.floatValue();
            }
            this.featureMap.put(str, Float.valueOf(fFloatValue));
            return Float.valueOf(fFloatValue);
        }
        Object obj3 = this.featureMap.get(str);
        if (!(obj3 instanceof Number)) {
            return null;
        }
        return (Number) obj3;
    }

    @Override // X.C087U
    public void setFeature(String str, Number number, boolean z) {
        if (number != null) {
            float fFloatValue = number.floatValue();
            if (z && fFloatValue < 0.0f) {
                return;
            }
            this.featureMap.put(str, Float.valueOf(fFloatValue));
            return;
        }
        this.featureMap.remove(str);
    }
}
