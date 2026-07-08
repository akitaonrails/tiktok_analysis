package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_audio_scene_switch")
public final class KaraokeAudioSceneSwitchSetting {
    public static final int DEFAULT = 1;
    public static final KaraokeAudioSceneSwitchSetting INSTANCE = new KaraokeAudioSceneSwitchSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_audio_scene_switch", DEFAULT) == 1;
    }
}
