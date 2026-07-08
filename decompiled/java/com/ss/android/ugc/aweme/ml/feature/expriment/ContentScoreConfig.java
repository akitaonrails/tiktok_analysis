package com.ss.android.ugc.aweme.ml.feature.expriment;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.TTMFeatureConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class ContentScoreConfig {

    @C09CT("cache_days")
    public final int cacheDays;

    @C09CT("cache_upper_limit")
    public final int cacheUpperLimit;

    @C09CT("content_score_input_features")
    public final TTMFeatureConfig featureInput;

    @C09CT("content_score_past_features")
    public final TTMFeatureConfig featurePast;

    @C09CT("trigger_event")
    public final String triggerEvent;

    @C09CT("update_scores_interval")
    public final int updateScoresInterval;

    @C09CT("update_weights_interval")
    public final int updateWeightsInterval;

    @C09CT("upload_data_sampling")
    public final float uploadDataSampling;

    public ContentScoreConfig() {
        this("", 0, 0, 0.0f, 500, 14, null, null);
    }

    public ContentScoreConfig(String str, int i, int i2, float f, int i3, int i4, TTMFeatureConfig tTMFeatureConfig, TTMFeatureConfig tTMFeatureConfig2) {
        this.triggerEvent = str;
        this.updateWeightsInterval = i;
        this.updateScoresInterval = i2;
        this.uploadDataSampling = f;
        this.cacheUpperLimit = i3;
        this.cacheDays = i4;
        this.featureInput = tTMFeatureConfig;
        this.featurePast = tTMFeatureConfig2;
    }
}
