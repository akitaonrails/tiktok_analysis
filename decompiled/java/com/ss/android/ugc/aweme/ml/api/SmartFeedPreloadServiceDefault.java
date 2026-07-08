package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedPreloadServiceDefault extends SmartFeedPreloadService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final float getPredictProbabilityResult() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getSmartPreloadStrategyV2ExperimentJsonString() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final PreloadStrategyV2Config getSmartPreloadStrategyV2ExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final int obtainAiFastSlowPredict() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void removeResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
    }
}
