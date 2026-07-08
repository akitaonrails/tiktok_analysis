package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_audio_ab_params")
public final class LiveAudioAbParamsSetting {
    public static final String DEFAULT = "";
    public static final LiveAudioAbParamsSetting INSTANCE = new LiveAudioAbParamsSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_audio_ab_params", DEFAULT);
    }
}
