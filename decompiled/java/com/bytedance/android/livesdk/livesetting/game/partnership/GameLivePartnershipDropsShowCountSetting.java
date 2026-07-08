package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_game_partnership_drops_count")
public final class GameLivePartnershipDropsShowCountSetting {
    public static final GameLivePartnershipDropsShowCountSetting INSTANCE = new GameLivePartnershipDropsShowCountSetting();
    public static final int DEFAULT = 3;

    public final int getCount() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return Math.max(settingsManager.getIntValue("ttlive_game_partnership_drops_count", i), i);
    }
}
