package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_unpolished_tip_brightness_enable")
public final class MultiCoHostUnpolishedTipBrightnessEnableSetting {
    public static final MultiCoHostUnpolishedTipBrightnessEnableSetting INSTANCE = new MultiCoHostUnpolishedTipBrightnessEnableSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_unpolished_tip_brightness_enable", DEFAULT);
    }
}
