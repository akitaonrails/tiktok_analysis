package com.ss.android.ugc.aweme.ml.feature.pitaya.producer;

import X.C1510050pOl;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PortraitFeaturePTYProducer extends PTYFeatureProducer {
    public static final PortraitFeaturePTYProducer INSTANCE = new PortraitFeaturePTYProducer();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getGroupName() {
        return "portrait";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONObject getDictFeature(String str, JSONObject jSONObject) {
        String string;
        Object objOpt;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_solaria_portrait", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
            string = "pitaya_ies_basic";
        }
        return FeatureProducer.getDictFeature$default(producer$default, str, jSONObject, string, null, 8, null);
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public float getNumericFeature(String str, JSONObject jSONObject) {
        String string;
        Object objOpt;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_solaria_portrait", 0, 2, null);
        if (producer$default != null) {
            if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
                string = "pitaya_ies_basic";
            }
            Number numericFeature$default = FeatureProducer.getNumericFeature$default(producer$default, str, jSONObject, string, (ReturnCode) null, 8, (Object) null);
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
        String string;
        Object objOpt;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_solaria_portrait", 0, 2, null);
        if (producer$default != null) {
            if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
                string = "pitaya_ies_basic";
            }
            feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObject, string, (ReturnCode) null, 8, (Object) null);
        } else {
            feature$default = null;
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
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_solaria_portrait", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        if (jSONObject == null || (objOpt = jSONObject.opt("pty_biz_name")) == null || (string = objOpt.toString()) == null) {
            string = "pitaya_ies_basic";
        }
        return FeatureProducer.getStringFeature$default(producer$default, str, jSONObject, string, (ReturnCode) null, 8, (Object) null);
    }
}
