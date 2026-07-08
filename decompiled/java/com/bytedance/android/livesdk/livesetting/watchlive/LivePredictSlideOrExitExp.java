package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_predict_slide_or_exit")
public final class LivePredictSlideOrExitExp {
    public static final LivePredictSlideOrExitConfig DEFAULT;
    public static final LivePredictSlideOrExitExp INSTANCE = new LivePredictSlideOrExitExp();
    public static final LivePredictSlideOrExitConfig config;

    static {
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig = new LivePredictSlideOrExitConfig(false, false, Mp4ScreenVideoLoadTimeout.CONTROL, 0.5f, 0.7f, Mp4ScreenVideoLoadTimeout.CONTROL, 3000L, 0.5f);
        DEFAULT = livePredictSlideOrExitConfig;
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig2 = (LivePredictSlideOrExitConfig) SettingsManager.INSTANCE.getValueSafely("live_predict_slide_or_exit", livePredictSlideOrExitConfig);
        if (livePredictSlideOrExitConfig2 != null) {
            livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
        }
        config = livePredictSlideOrExitConfig;
    }

    public static final boolean isEnablePreIoSceneGate() {
        return config.enablePreIoSceneGate;
    }

    public static final boolean isEnablePredictSlide() {
        return config.enablePredictSlide;
    }

    public static final long keepTimeMs() {
        return config.keepTimeMs;
    }

    public final LivePredictSlideOrExitConfig getConfig() {
        return config;
    }

    public final LivePredictSlideOrExitConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isOpenpreIO(float f) {
        if (f > config.scrollProbThreshold) {
            return true;
        }
        return false;
    }

    public static final long keepTimeMsFor(float f) {
        if (!isEnablePreIoSceneGate()) {
            return config.keepTimeMs;
        }
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig = config;
        if (f > livePredictSlideOrExitConfig.scrollProbThresholdHigh) {
            return livePredictSlideOrExitConfig.keepTimeHighMs;
        }
        if (f > livePredictSlideOrExitConfig.scrollProbThreshold) {
            return livePredictSlideOrExitConfig.keepTimeMidMs;
        }
        return 0L;
    }

    public static final boolean isOpenPreIoByPredict(float f, float f2) {
        if (isEnablePreIoSceneGate()) {
            LivePredictSlideOrExitConfig livePredictSlideOrExitConfig = config;
            if (f > livePredictSlideOrExitConfig.scrollProbThreshold && f2 < livePredictSlideOrExitConfig.exitProbThreshold) {
                return true;
            }
            return false;
        }
        return isOpenpreIO(f);
    }
}
