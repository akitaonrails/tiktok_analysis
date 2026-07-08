package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("roma_schema_group_gamepad")
public final class GameLivePartnershipLynxSchemaSetting {
    public static final GameLivePartnershipLynxSchemaSetting INSTANCE = new GameLivePartnershipLynxSchemaSetting();
    public static final PartnershipSchemaConfig DEFAULT = new PartnershipSchemaConfig("", "", "", "", "", "", "", "", "", "", "");

    public final PartnershipSchemaConfig getSchemaConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PartnershipSchemaConfig partnershipSchemaConfig = DEFAULT;
        PartnershipSchemaConfig partnershipSchemaConfig2 = (PartnershipSchemaConfig) settingsManager.getValueSafely("roma_schema_group_gamepad", partnershipSchemaConfig);
        return partnershipSchemaConfig2 != null ? partnershipSchemaConfig2 : partnershipSchemaConfig;
    }
}
