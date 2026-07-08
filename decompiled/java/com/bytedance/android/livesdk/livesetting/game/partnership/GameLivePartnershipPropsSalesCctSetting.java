package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("ttlive_partnership_props_sales_cct")
public final class GameLivePartnershipPropsSalesCctSetting {
    public static final GameLivePartnershipPropsSalesCctSetting INSTANCE = new GameLivePartnershipPropsSalesCctSetting();
    public static final GamePartnershipPropsSalesCctConfig DEFAULT = new GamePartnershipPropsSalesCctConfig(false);

    public final GamePartnershipPropsSalesCctConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GamePartnershipPropsSalesCctConfig gamePartnershipPropsSalesCctConfig = DEFAULT;
        GamePartnershipPropsSalesCctConfig gamePartnershipPropsSalesCctConfig2 = (GamePartnershipPropsSalesCctConfig) settingsManager.getValueSafely("ttlive_partnership_props_sales_cct", gamePartnershipPropsSalesCctConfig);
        return gamePartnershipPropsSalesCctConfig2 != null ? gamePartnershipPropsSalesCctConfig2 : gamePartnershipPropsSalesCctConfig;
    }
}
