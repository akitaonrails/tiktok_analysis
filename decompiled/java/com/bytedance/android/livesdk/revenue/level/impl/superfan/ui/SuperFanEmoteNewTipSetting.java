package com.bytedance.android.livesdk.revenue.level.impl.superfan.ui;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fan_emote_new_tip")
public final class SuperFanEmoteNewTipSetting {
    public static final boolean DEFAULT = false;
    public static final SuperFanEmoteNewTipSetting INSTANCE = new SuperFanEmoteNewTipSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_super_fan_emote_new_tip", DEFAULT);
    }
}
