package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fan_pro_disable_setting")
public final class SuperFanProDisableSetting {
    public static final boolean DEFAULT = true;
    public static final SuperFanProDisableSetting INSTANCE = new SuperFanProDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_super_fan_pro_disable_setting", DEFAULT);
    }
}
