package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartFeedPreloadService {
    void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener);

    void checkAndInit();

    boolean enable();

    PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig();

    String getPredictLabelResult();

    List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue();

    String getSmartPreloadStrategyV2ExperimentJsonString();

    int obtainAiFastSlowPredict();

    void startSmartPreloadV2Judge(Aweme aweme);
}
