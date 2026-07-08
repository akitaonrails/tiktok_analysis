package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_device_performance_score_setting")
public final class GiftDevicePerformanceScoreSettings {
    public static final ScoreParams DEFAULT;
    public static final GiftDevicePerformanceScoreSettings INSTANCE = new GiftDevicePerformanceScoreSettings();
    public static final ScoreParams value;

    public static final class ScoreParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("high_end_lowest_score")
        public float highEndLowestScore;

        @C09CT("low_end_highest_score")
        public float lowEndHighestScore;

        static {
            NormalGson.singleton();
            ADAPTER = new GiftDevicePerformanceScoreSettings_ScoreParams_OptTypeAdapter();
        }

        public ScoreParams() {
            this(8.0f, 5.5f);
        }

        public ScoreParams(float f, float f2) {
            this.highEndLowestScore = f;
            this.lowEndHighestScore = f2;
        }
    }

    static {
        ScoreParams scoreParams = new ScoreParams(8.0f, 5.5f);
        DEFAULT = scoreParams;
        ScoreParams scoreParams2 = (ScoreParams) SettingsManager.INSTANCE.getValueSafely("live_gift_device_performance_score_setting", scoreParams);
        if (scoreParams2 != null) {
            scoreParams = scoreParams2;
        }
        value = scoreParams;
    }

    public final ScoreParams getValue() {
        return value;
    }
}
