package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public class FeatureNegFeedBackConfig extends FeatureTypeConfig {

    @C09CT("feature_name")
    public String featureName;

    @C09CT("positive_label")
    public String positiveLabel;

    @C09CT("positive_threshold")
    public float positiveThreshold = 200.0f;

    @C09CT("producer")
    public String producer;

    @Override // com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NegFeedbackType{super=");
        sbLIZ.append(super.toString());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final String getPositiveLabel() {
        return this.positiveLabel;
    }

    public final float getPositiveThreshold() {
        return this.positiveThreshold;
    }

    public final String getProducer() {
        return this.producer;
    }

    public final void setFeatureName(String str) {
        this.featureName = str;
    }

    public final void setPositiveLabel(String str) {
        this.positiveLabel = str;
    }

    public final void setPositiveThreshold(float f) {
        this.positiveThreshold = f;
    }

    public final void setProducer(String str) {
        this.producer = str;
    }
}
