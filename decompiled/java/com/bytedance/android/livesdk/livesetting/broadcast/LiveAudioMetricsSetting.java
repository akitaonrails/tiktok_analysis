package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_audio_metrics_url")
public final class LiveAudioMetricsSetting {
    public static final LiveAudioMetricsSetting INSTANCE = new LiveAudioMetricsSetting();
    public static final String DEFAULT = "";

    public final String getAudioUrl() {
        return SettingsManager.INSTANCE.getStringValue("live_audio_metrics_url", DEFAULT);
    }
}
