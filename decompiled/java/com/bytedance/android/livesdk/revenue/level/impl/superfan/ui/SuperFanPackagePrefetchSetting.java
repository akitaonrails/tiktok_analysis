package com.bytedance.android.livesdk.revenue.level.impl.superfan.ui;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fan_package_prefetch_setting")
public final class SuperFanPackagePrefetchSetting {
    public static final boolean DEFAULT = true;
    public static final SuperFanPackagePrefetchSetting INSTANCE = new SuperFanPackagePrefetchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_super_fan_package_prefetch_setting", DEFAULT);
    }
}
