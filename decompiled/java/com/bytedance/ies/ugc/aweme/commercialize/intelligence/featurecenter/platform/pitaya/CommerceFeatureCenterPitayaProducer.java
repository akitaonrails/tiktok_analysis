package com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.platform.pitaya;

import X.C07Y1;
import X.C1868307Tl;
import X.C1905307dD;
import X.C1905607dG;
import X.C1909707dv;
import X.InterfaceC1905407dE;
import X.InterfaceC1905507dF;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.CommerceFeatureCenter;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CommerceFeatureCenterPitayaProducer extends PTYFeatureProducer {
    public final CommerceFeatureCenter featureCenter;

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getGroupName() {
        return "tt_commerce";
    }

    public final CommerceFeatureCenter getFeatureCenter() {
        return this.featureCenter;
    }

    public CommerceFeatureCenterPitayaProducer(CommerceFeatureCenter commerceFeatureCenter) {
        this.featureCenter = commerceFeatureCenter;
    }

    private final InterfaceC1905407dE fetchFeatureInternal(String str, JSONObject jSONObject) {
        for (InterfaceC1905507dF interfaceC1905507dF : this.featureCenter.LIZIZ) {
            if (interfaceC1905507dF.LIZ(str)) {
                return interfaceC1905507dF.LIZIZ(str, jSONObject);
            }
        }
        return C1905607dG.LIZ;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONObject getDictFeature(String str, JSONObject jSONObject) {
        InterfaceC1905407dE interfaceC1905407dEFetchFeatureInternal = fetchFeatureInternal(str, jSONObject);
        if (interfaceC1905407dEFetchFeatureInternal instanceof C1868307Tl) {
            return ((C1868307Tl) interfaceC1905407dEFetchFeatureInternal).LIZ;
        }
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public double getDoubleFeature(String str, JSONObject jSONObject) {
        InterfaceC1905407dE interfaceC1905407dEFetchFeatureInternal = fetchFeatureInternal(str, jSONObject);
        if (interfaceC1905407dEFetchFeatureInternal instanceof C1909707dv) {
            return ((C1909707dv) interfaceC1905407dEFetchFeatureInternal).LIZ;
        }
        return 0.0d;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public float getNumericFeature(String str, JSONObject jSONObject) {
        InterfaceC1905407dE interfaceC1905407dEFetchFeatureInternal = fetchFeatureInternal(str, jSONObject);
        if (interfaceC1905407dEFetchFeatureInternal instanceof C1909707dv) {
            return (float) ((C1909707dv) interfaceC1905407dEFetchFeatureInternal).LIZ;
        }
        return 0.0f;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONArray getSeqFeature(String str, JSONObject jSONObject) {
        InterfaceC1905407dE interfaceC1905407dEFetchFeatureInternal = fetchFeatureInternal(str, jSONObject);
        if (interfaceC1905407dEFetchFeatureInternal instanceof C1905307dD) {
            return ((C1905307dD) interfaceC1905407dEFetchFeatureInternal).LIZ;
        }
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getStringFeature(String str, JSONObject jSONObject) {
        InterfaceC1905407dE interfaceC1905407dEFetchFeatureInternal = fetchFeatureInternal(str, jSONObject);
        if (interfaceC1905407dEFetchFeatureInternal instanceof C07Y1) {
            return ((C07Y1) interfaceC1905407dEFetchFeatureInternal).LIZ;
        }
        return "";
    }
}
