package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class CommerceSmartUIModelV2 extends CommerceSmartUIModel {

    @C09CT("features")
    public InputFeaturesConfig features;

    @C09CT("real")
    public OnePlaytimePredictRealConfig realConfig;

    @C09CT("track")
    public OneSmartDataTrackConfig track;

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
