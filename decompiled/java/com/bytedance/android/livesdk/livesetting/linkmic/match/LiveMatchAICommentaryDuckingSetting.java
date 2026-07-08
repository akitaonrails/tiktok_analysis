package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_ai_commentary_ducking_settings")
public final class LiveMatchAICommentaryDuckingSetting {
    public static final LiveMatchAICommentaryDuckingSetting INSTANCE = new LiveMatchAICommentaryDuckingSetting();
    public static final LiveMatchAICommentaryDuckingConfig DEFAULT = new LiveMatchAICommentaryDuckingConfig(-25.0f, -10.0f, 0.01f, 1.0f, 0.001f, 1.5f, 10000.0f, 0.2f, 200.0f);

    public final LiveMatchAICommentaryDuckingConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchAICommentaryDuckingConfig liveMatchAICommentaryDuckingConfig = DEFAULT;
        LiveMatchAICommentaryDuckingConfig liveMatchAICommentaryDuckingConfig2 = (LiveMatchAICommentaryDuckingConfig) settingsManager.getValueSafely("live_match_ai_commentary_ducking_settings", liveMatchAICommentaryDuckingConfig);
        return liveMatchAICommentaryDuckingConfig2 != null ? liveMatchAICommentaryDuckingConfig2 : liveMatchAICommentaryDuckingConfig;
    }
}
