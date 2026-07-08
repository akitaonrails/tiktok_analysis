package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_unpolished_tip_voice_threshold")
public final class MultiCoHostUnpolishedTipVoiceThresholdSetting {
    public static final MultiCoHostUnpolishedTipVoiceThresholdSetting INSTANCE = new MultiCoHostUnpolishedTipVoiceThresholdSetting();
    public static final double DEFAULT = 0.1d;

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_cohost_unpolished_tip_voice_threshold", DEFAULT);
    }
}
