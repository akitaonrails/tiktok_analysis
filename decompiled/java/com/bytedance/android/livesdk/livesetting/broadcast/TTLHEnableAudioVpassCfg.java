package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_audio_vpass_cfg")
public final class TTLHEnableAudioVpassCfg {
    public static final boolean DEFAULT = false;
    public static final TTLHEnableAudioVpassCfg INSTANCE = new TTLHEnableAudioVpassCfg();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_audio_vpass_cfg", DEFAULT);
    }
}
