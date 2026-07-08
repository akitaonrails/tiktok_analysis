package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_tips_migrate_strategy_framework")
public final class LiveTipsMigrateStrategyFrameworkSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTipsMigrateStrategyFrameworkSetting INSTANCE = new LiveTipsMigrateStrategyFrameworkSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tips_migrate_strategy_framework", DEFAULT);
    }
}
