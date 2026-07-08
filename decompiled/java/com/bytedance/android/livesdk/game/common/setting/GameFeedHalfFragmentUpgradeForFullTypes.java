package com.bytedance.android.livesdk.game.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "game_feed_half_fragment_upgrade_for_full_types")
public final class GameFeedHalfFragmentUpgradeForFullTypes {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final GameFeedHalfFragmentUpgradeForFullTypes INSTANCE = new GameFeedHalfFragmentUpgradeForFullTypes();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("game_feed_half_fragment_upgrade_for_full_types", DEFAULT);
    }
}
