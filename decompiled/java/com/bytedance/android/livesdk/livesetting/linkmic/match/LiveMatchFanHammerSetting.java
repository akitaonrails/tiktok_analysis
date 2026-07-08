package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gbl_match_hammer_card_fans_config")
public final class LiveMatchFanHammerSetting {
    public static final LiveMatchFanHammerSetting INSTANCE = new LiveMatchFanHammerSetting();
    public static final LiveMatchFanHammerConfig DEFAULT = new LiveMatchFanHammerConfig(false, "aweme://roma_redirect/?spark_page=live_match_fans_hammer_effect", "aweme://roma_redirect/?spark_page=live_match_items_upgrade", 3);

    private final LiveMatchFanHammerConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchFanHammerConfig liveMatchFanHammerConfig = DEFAULT;
        LiveMatchFanHammerConfig liveMatchFanHammerConfig2 = (LiveMatchFanHammerConfig) settingsManager.getValueSafely("gbl_match_hammer_card_fans_config", liveMatchFanHammerConfig);
        return liveMatchFanHammerConfig2 != null ? liveMatchFanHammerConfig2 : liveMatchFanHammerConfig;
    }

    public final long containerReadyTimeoutInSecond() {
        return getConfig().containerReadyTimeoutInSecond;
    }

    public final String getLynxSchema() {
        return getConfig().lynxSchema;
    }

    public final String getUpgradeGuideSchema() {
        return getConfig().upgradeGuideSchema;
    }

    public final boolean isEnabled() {
        return getConfig().enable;
    }
}
