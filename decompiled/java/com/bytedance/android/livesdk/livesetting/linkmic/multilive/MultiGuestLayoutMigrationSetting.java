package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_setting_migration")
public final class MultiGuestLayoutMigrationSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestLayoutMigrationSetting INSTANCE = new MultiGuestLayoutMigrationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_layout_setting_migration", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
