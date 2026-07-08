package com.ss.android.ugc.profile.business.profile.prediction.exp;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class FYP2ProfilePredictConfig extends SmartSceneConfig {

    @C09CT("delay_time")
    public final int delayTime;

    @C09CT("is_predict_profile")
    public final boolean isPredictProfile;

    @C09CT("positive_threshold")
    public final float positiveThreshold;

    @C09CT("target_key")
    public final String targetKey;

    public FYP2ProfilePredictConfig() {
        setScene("fyp_profile_predict");
        this.targetKey = "";
    }
}
