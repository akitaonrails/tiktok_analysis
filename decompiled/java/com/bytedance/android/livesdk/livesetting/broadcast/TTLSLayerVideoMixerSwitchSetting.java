package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_layer_video_mixer_switch")
public final class TTLSLayerVideoMixerSwitchSetting {
    public static final TTLSLayerVideoMixerSwitchSetting INSTANCE = new TTLSLayerVideoMixerSwitchSetting();
    public static final int DEFAULT = 1;

    public final boolean enableLayerVideoMixerSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttls_layer_video_mixer_switch", DEFAULT) == 1;
    }
}
