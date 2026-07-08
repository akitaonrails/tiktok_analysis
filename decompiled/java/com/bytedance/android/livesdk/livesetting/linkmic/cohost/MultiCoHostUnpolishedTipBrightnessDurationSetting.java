package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_unpolished_tip_brightness_duration")
public final class MultiCoHostUnpolishedTipBrightnessDurationSetting {
    public static final MultiCoHostUnpolishedTipBrightnessDurationSetting INSTANCE = new MultiCoHostUnpolishedTipBrightnessDurationSetting();
    public static final int DEFAULT = 45;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_unpolished_tip_brightness_duration", DEFAULT);
    }
}
