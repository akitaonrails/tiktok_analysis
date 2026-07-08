package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_main_video_mixer_switch")
public final class TTLSMainVideoMixerSwitchSetting {
    public static final TTLSMainVideoMixerSwitchSetting INSTANCE = new TTLSMainVideoMixerSwitchSetting();
    public static final int DEFAULT = 1;

    public final boolean enableMainVideoMixerSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttls_main_video_mixer_switch", DEFAULT) == 1;
    }
}
