package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_audio_chat_watermark_resolution")
public final class LinkmicAudioChatWatermarkResolutionSetting {
    public static final LinkmicAudioChatWatermarkResolutionSetting INSTANCE = new LinkmicAudioChatWatermarkResolutionSetting();
    public static final AudioChatWatermarkResolution DEFAULT = new AudioChatWatermarkResolution(240, 240);

    public final AudioChatWatermarkResolution getValue() {
        AudioChatWatermarkResolution audioChatWatermarkResolution = (AudioChatWatermarkResolution) SettingsManager.INSTANCE.getValueSafely(LinkmicAudioChatWatermarkResolutionSetting.class);
        return audioChatWatermarkResolution == null ? DEFAULT : audioChatWatermarkResolution;
    }
}
