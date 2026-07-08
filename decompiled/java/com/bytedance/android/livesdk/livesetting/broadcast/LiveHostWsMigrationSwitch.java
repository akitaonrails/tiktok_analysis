package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_ws_migration")
public final class LiveHostWsMigrationSwitch {
    public static final LiveHostWsMigrationSwitch INSTANCE = new LiveHostWsMigrationSwitch();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_host_ws_migration", DEFAULT);

    public final boolean allCombined() {
        return value == 3;
    }

    public final boolean enableColdBoot() {
        return value == 4;
    }

    public final boolean enableRiskMigration() {
        return value == 2 || allCombined();
    }

    public final boolean isEnable() {
        return value == 1 || allCombined();
    }
}
