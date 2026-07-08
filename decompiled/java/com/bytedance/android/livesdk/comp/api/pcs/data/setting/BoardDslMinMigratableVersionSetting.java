package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("board_dsl_min_migratable_version")
public final class BoardDslMinMigratableVersionSetting {
    public static final BoardDslMinMigratableVersionSetting INSTANCE = new BoardDslMinMigratableVersionSetting();
    public static final int DEFAULT = 20000;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("board_dsl_min_migratable_version", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
