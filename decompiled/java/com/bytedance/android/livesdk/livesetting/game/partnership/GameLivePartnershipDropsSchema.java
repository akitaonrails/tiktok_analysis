package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_drops_schema")
public final class GameLivePartnershipDropsSchema {
    public static final GameLivePartnershipDropsSchema INSTANCE = new GameLivePartnershipDropsSchema();
    public static final DropsPageSchemaData DEFAULT = new DropsPageSchemaData("", "", "", "", "", "");

    public final DropsPageSchemaData getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DropsPageSchemaData dropsPageSchemaData = DEFAULT;
        DropsPageSchemaData dropsPageSchemaData2 = (DropsPageSchemaData) settingsManager.getValueSafely("live_drops_schema", dropsPageSchemaData);
        return dropsPageSchemaData2 != null ? dropsPageSchemaData2 : dropsPageSchemaData;
    }
}
