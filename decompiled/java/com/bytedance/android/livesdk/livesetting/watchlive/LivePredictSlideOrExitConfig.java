package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
public final class LivePredictSlideOrExitConfig {
    public static final TypeAdapter ADAPTER = new LivePredictSlideOrExitConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_pre_io_scene_gate")
    public boolean enablePreIoSceneGate;

    @C09CT("enable_predict_slide")
    public boolean enablePredictSlide;

    @C09CT("exit_prob_threshold")
    public float exitProbThreshold;

    @C09CT("keep_time_high_ms")
    public long keepTimeHighMs;

    @C09CT("keep_time_mid_ms")
    public long keepTimeMidMs;

    @C09CT("keep_time_ms")
    public long keepTimeMs;

    @C09CT("scroll_prob_threshold")
    public float scrollProbThreshold;

    @C09CT("scroll_prob_threshold_high")
    public float scrollProbThresholdHigh;

    public LivePredictSlideOrExitConfig() {
        this(false, false, Mp4ScreenVideoLoadTimeout.CONTROL, 0.5f, 0.7f, Mp4ScreenVideoLoadTimeout.CONTROL, 3000L, 0.5f);
    }

    public LivePredictSlideOrExitConfig(boolean z, boolean z2, long j, float f, float f2, long j2, long j3, float f3) {
        this.enablePredictSlide = z;
        this.enablePreIoSceneGate = z2;
        this.keepTimeMs = j;
        this.scrollProbThreshold = f;
        this.scrollProbThresholdHigh = f2;
        this.keepTimeHighMs = j2;
        this.keepTimeMidMs = j3;
        this.exitProbThreshold = f3;
    }
}
