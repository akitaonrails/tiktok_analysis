package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ClientAiBatchFeatureConfig {

    @C09CT("data_track_config")
    public final OneSmartDataTrackConfig dataTrackConfig;

    @C09CT("feature_config")
    public final String featureConfigJsonStr;

    public ClientAiBatchFeatureConfig() {
        this("", null);
    }

    public ClientAiBatchFeatureConfig(String str, OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.featureConfigJsonStr = str;
        this.dataTrackConfig = oneSmartDataTrackConfig;
    }
}
