package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_use_new_audio_codec")
public final class LiveUseNewAudioCodecSetting {
    public static final int DEFAULT = 0;
    public static final LiveUseNewAudioCodecSetting INSTANCE = new LiveUseNewAudioCodecSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_use_new_audio_codec", DEFAULT) == 1;
    }
}
