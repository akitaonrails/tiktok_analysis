package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_audio_engine_option")
public final class TTLHAudioEngineOption {
    public static final int DEFAULT = 0;
    public static final TTLHAudioEngineOption INSTANCE = new TTLHAudioEngineOption();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_audio_engine_option", DEFAULT);
    }
}
