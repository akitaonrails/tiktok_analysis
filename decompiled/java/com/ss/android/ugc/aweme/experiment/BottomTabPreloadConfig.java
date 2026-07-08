package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class BottomTabPreloadConfig {

    @C09CT("touch_delay_config")
    public final BottomTabTouchDelayConfig touchDelayConfig;

    @C09CT("touch_prediction_config")
    public final BottomTabTouchPredictionConfig touchPredictionConfig;

    @C09CT("touch_strategy")
    public final int touchStrategy;

    public BottomTabPreloadConfig() {
        this(0, null, null);
    }

    public BottomTabPreloadConfig(int i, BottomTabTouchDelayConfig bottomTabTouchDelayConfig, BottomTabTouchPredictionConfig bottomTabTouchPredictionConfig) {
        this.touchStrategy = i;
        this.touchDelayConfig = bottomTabTouchDelayConfig;
        this.touchPredictionConfig = bottomTabTouchPredictionConfig;
    }
}
