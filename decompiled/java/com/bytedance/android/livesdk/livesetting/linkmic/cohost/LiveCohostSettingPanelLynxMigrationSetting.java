package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_setting_panel_lynx_migration")
public final class LiveCohostSettingPanelLynxMigrationSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostSettingPanelLynxMigrationSetting INSTANCE = new LiveCohostSettingPanelLynxMigrationSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_setting_panel_lynx_migration", DEFAULT);
    }
}
