package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_ai_commentary_voice_visualisation")
public final class LiveMatchAICommentaryVoiceVisualisationSettings {
    public static final LiveMatchAICommentaryVoiceVisualisationSettings INSTANCE = new LiveMatchAICommentaryVoiceVisualisationSettings();
    public static final LiveMatchAICommentaryVoiceVisualisationConfig DEFAULT = new LiveMatchAICommentaryVoiceVisualisationConfig(1.0f, 1.2f, 450, 450, 750, 500);

    private final LiveMatchAICommentaryVoiceVisualisationConfig getConfig() {
        return (LiveMatchAICommentaryVoiceVisualisationConfig) SettingsManager.INSTANCE.getValueSafely("live_ai_commentary_voice_visualisation", DEFAULT);
    }

    public final float getBigScale() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.bigScale;
    }

    public final int getEntranceHoldAtBigDelayMs() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.entranceHoldAtBigDelayMs;
    }

    public final int getEntranceScaleDownDurationMs() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.entranceScaleDownDurationMs;
    }

    public final int getEntranceScaleUpDurationMs() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.entranceScaleUpDurationMs;
    }

    public final int getScaleAnimDurationMs() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.scaleAnimDurationMs;
    }

    public final float getSmallScale() {
        LiveMatchAICommentaryVoiceVisualisationConfig config = getConfig();
        if (config == null) {
            config = DEFAULT;
        }
        return config.smallScale;
    }
}
