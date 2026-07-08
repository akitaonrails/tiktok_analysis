package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_pcs_pin_card_migration_improvement")
public final class LivePcsPinCardMigrationImprovementSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsPinCardMigrationImprovementSetting INSTANCE = new LivePcsPinCardMigrationImprovementSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_pcs_pin_card_migration_improvement", DEFAULT);
    }
}
