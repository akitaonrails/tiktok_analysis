package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("wise_gift_client_insert_strategy_config")
public final class LiveGiftClientForceInsertMigrateSettings {
    public static final LiveGiftClientForceInsertMigrateSettings INSTANCE = new LiveGiftClientForceInsertMigrateSettings();
    public static final LiveGiftClientForceInsertParams DEFAULT = new LiveGiftClientForceInsertParams(false, false, false, false, false);

    private final LiveGiftClientForceInsertParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftClientForceInsertParams liveGiftClientForceInsertParams = DEFAULT;
        LiveGiftClientForceInsertParams liveGiftClientForceInsertParams2 = (LiveGiftClientForceInsertParams) settingsManager.getValueSafely("wise_gift_client_insert_strategy_config", liveGiftClientForceInsertParams);
        return liveGiftClientForceInsertParams2 != null ? liveGiftClientForceInsertParams2 : liveGiftClientForceInsertParams;
    }

    public final boolean enablePreRequestFromLiveGoal() {
        return getValue().enablePreRequestFromLiveGoal;
    }

    public final boolean enablePreRequestFromMatchGiftOnly() {
        return getValue().enablePreRequestFromMatchGiftOnly;
    }

    public final boolean enableStrategyForceInsertLevelUpGame() {
        return getValue().enableStrategyForceInsertLevelUpGame;
    }

    public final boolean enableStrategyForceInsertLiveGoal() {
        return getValue().enableStrategyForceInsertLiveGoal;
    }

    public final boolean enableStrategyForceInsertMatchGiftOnly() {
        return getValue().enableStrategyForceInsertMatchGiftOnly;
    }

    public final LiveGiftClientForceInsertParams getDEFAULT() {
        return DEFAULT;
    }
}
