package com.bytedance.pitaya.api.feature.store;

import X.C786410Ut5;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class PTYModelInstance implements ReflectionCall {
    public JSONObject features;
    public final String instanceID;
    public final Map<String, Float> labels = new LinkedHashMap();
    public final Map<String, Float> predicts = new LinkedHashMap();

    private final String getFeatureStr() {
        return C786410Ut5.J3(this.features);
    }

    private final String getLabelsStr() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Float> entry : this.labels.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return C786410Ut5.J3(jSONObject);
    }

    private final String getPredictsStr() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Float> entry : this.predicts.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final JSONObject getFeatures() {
        return this.features;
    }

    public final String getInstanceID() {
        return this.instanceID;
    }

    public final Object getFeature(String str) {
        return this.features.opt(str);
    }

    public final void updateFeatures$pitayacore_release(JSONObject jSONObject) {
        this.features = jSONObject;
    }

    public PTYModelInstance(String str, String str2) {
        this.instanceID = str;
        this.features = new JSONObject(str2);
    }

    public final void addLabel(String str, float f) {
        this.labels.put(str, Float.valueOf(f));
    }

    public final void addPredict(String str, float f) {
        this.predicts.put(str, Float.valueOf(f));
    }

    public final void upload(float f, String str, int i, String str2) {
        IFeatureStore featureStore = PTYFeatureStoreInstance.INSTANCE.getFeatureStore();
        if (featureStore != null) {
            featureStore.upload(this, f, str, i, str2);
        }
    }
}
