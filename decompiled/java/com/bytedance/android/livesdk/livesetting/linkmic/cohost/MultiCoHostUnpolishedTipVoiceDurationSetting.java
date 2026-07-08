package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_unpolished_tip_voice_duration")
public final class MultiCoHostUnpolishedTipVoiceDurationSetting {
    public static final MultiCoHostUnpolishedTipVoiceDurationSetting INSTANCE = new MultiCoHostUnpolishedTipVoiceDurationSetting();
    public static final int DEFAULT = 45;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_unpolished_tip_voice_duration", DEFAULT);
    }
}
