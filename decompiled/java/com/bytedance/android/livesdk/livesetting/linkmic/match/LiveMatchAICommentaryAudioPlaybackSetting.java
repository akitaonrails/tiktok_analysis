package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_match_ai_commentary_audio_playback_config")
public final class LiveMatchAICommentaryAudioPlaybackSetting {
    public static final LiveMatchAICommentaryAudioPlaybackSetting INSTANCE = new LiveMatchAICommentaryAudioPlaybackSetting();
    public static final LiveMatchAICommentaryAudioPlaybackConfig DEFAULT = new LiveMatchAICommentaryAudioPlaybackConfig(true, 3000.0f);

    public final LiveMatchAICommentaryAudioPlaybackConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchAICommentaryAudioPlaybackConfig liveMatchAICommentaryAudioPlaybackConfig = DEFAULT;
        LiveMatchAICommentaryAudioPlaybackConfig liveMatchAICommentaryAudioPlaybackConfig2 = (LiveMatchAICommentaryAudioPlaybackConfig) settingsManager.getValueSafely("live_match_ai_commentary_audio_playback_config", liveMatchAICommentaryAudioPlaybackConfig);
        return liveMatchAICommentaryAudioPlaybackConfig2 != null ? liveMatchAICommentaryAudioPlaybackConfig2 : liveMatchAICommentaryAudioPlaybackConfig;
    }

    public final float getPlayTimeoutExtraTimeMs() {
        return getConfig().play_timeout_extra_time_ms;
    }

    public final boolean isPlayTimeoutEnable() {
        return getConfig().play_timeout_enable;
    }
}
