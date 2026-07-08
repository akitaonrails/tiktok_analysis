package com.ss.bytertc.engine.video;

import com.ss.bytertc.engine.type.VideoStrategyParams;

/* JADX INFO: loaded from: classes21.dex */
public interface IVideoStrategyRunner {
    boolean isActive();

    void setResultListener(IVideoStrategyResultListener iVideoStrategyResultListener);

    void updateFeatures(VideoStrategyParams videoStrategyParams);
}
