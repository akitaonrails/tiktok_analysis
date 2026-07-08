package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_mic_volume_config")
public final class LiveMicVoiceSetting {
    public static final LiveMicVoiceSetting INSTANCE = new LiveMicVoiceSetting();
    public static final SpeakingVoiceConfig DEFAULT = new SpeakingVoiceConfig(120, 180);

    public final int[] getVolumeLevel() {
        int[] iArr = {0, 20, getValue().getLow(), getValue().getHigh()};
        Arrays.sort(iArr);
        return iArr;
    }

    public final SpeakingVoiceConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SpeakingVoiceConfig speakingVoiceConfig = DEFAULT;
        SpeakingVoiceConfig speakingVoiceConfig2 = (SpeakingVoiceConfig) settingsManager.getValueSafely("live_mic_volume_config", speakingVoiceConfig);
        return speakingVoiceConfig2 != null ? speakingVoiceConfig2 : speakingVoiceConfig;
    }
}
