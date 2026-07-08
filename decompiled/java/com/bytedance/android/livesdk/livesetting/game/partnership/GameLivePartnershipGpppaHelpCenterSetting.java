package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("game_partnership_gpppa_help_center")
public final class GameLivePartnershipGpppaHelpCenterSetting {
    public static final GameLivePartnershipGpppaHelpCenterSetting INSTANCE = new GameLivePartnershipGpppaHelpCenterSetting();
    public static final String DEFAULT = "";

    public final String getHelpCenterUrl() {
        return SettingsManager.INSTANCE.getStringValue("game_partnership_gpppa_help_center", DEFAULT);
    }
}
