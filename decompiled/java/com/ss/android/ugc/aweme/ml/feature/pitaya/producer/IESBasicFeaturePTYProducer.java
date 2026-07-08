package com.ss.android.ugc.aweme.ml.feature.pitaya.producer;

import X.C1510050pOl;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class IESBasicFeaturePTYProducer extends PTYFeatureProducer {
    public static final IESBasicFeaturePTYProducer INSTANCE = new IESBasicFeaturePTYProducer();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getGroupName() {
        return "ies_basic";
    }

    private final String getProducerName(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject != null && (strOptString = jSONObject.optString("group")) != null && strOptString.length() != 0) {
            return strOptString;
        }
        return "ies_basic";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONObject getDictFeature(String str, JSONObject jSONObject) {
        Object feature$default;
        JSONObject jSONObjectOptJSONObject;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), getProducerName(jSONObject), 0, 2, null);
        if (producer$default != null) {
            if (jSONObject != null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
                Object objOpt = jSONObject.opt("pty_biz_name");
                if (objOpt == null || (string = objOpt.toString()) == null) {
                }
                feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
            } else {
                jSONObjectOptJSONObject = null;
            }
            String string = "pitaya_ies_basic";
            feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
        } else {
            feature$default = null;
        }
        if (feature$default instanceof Map) {
            return new JSONObject((Map) feature$default);
        }
        if (!(feature$default instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) feature$default;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public float getNumericFeature(String str, JSONObject jSONObject) {
        String string;
        Object objOpt;
        FeatureServiceManager.Companion.getClass();
        JSONObject jSONObjectOptJSONObject = null;
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), getProducerName(jSONObject), 0, 2, null);
        if (producer$default != null) {
            if (jSONObject != null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
            }
            if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
                string = "pitaya_ies_basic";
            }
            Number numericFeature$default = FeatureProducer.getNumericFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
            if (numericFeature$default != null) {
                return numericFeature$default.floatValue();
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONArray getSeqFeature(String str, JSONObject jSONObject) {
        Object feature$default;
        JSONObject jSONObjectOptJSONObject;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), getProducerName(jSONObject), 0, 2, null);
        if (producer$default != null) {
            if (jSONObject != null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
                Object objOpt = jSONObject.opt("pty_biz_name");
                if (objOpt == null || (string = objOpt.toString()) == null) {
                }
                feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
            } else {
                jSONObjectOptJSONObject = null;
            }
            String string = "pitaya_ies_basic";
            feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
        } else {
            feature$default = null;
        }
        if (feature$default instanceof List) {
            return new JSONArray((Collection) feature$default);
        }
        if (!(feature$default instanceof JSONArray)) {
            return null;
        }
        return (JSONArray) feature$default;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getStringFeature(String str, JSONObject jSONObject) {
        String string;
        Object objOpt;
        FeatureServiceManager.Companion.getClass();
        JSONObject jSONObjectOptJSONObject = null;
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), getProducerName(jSONObject), 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        if (jSONObject != null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
        }
        if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
            string = "pitaya_ies_basic";
        }
        return FeatureProducer.getStringFeature$default(producer$default, str, jSONObjectOptJSONObject, string, (ReturnCode) null, 8, (Object) null);
    }
}
