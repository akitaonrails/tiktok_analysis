package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("ttlive_game_mix_framework_config")
public final class GameLivePartnershipMixFrameworkConfig {
    public static final GameLivePartnershipMixFrameworkConfig INSTANCE = new GameLivePartnershipMixFrameworkConfig();
    public static final MixFrameworkConfig DEFAULT = new MixFrameworkConfig();

    public final MixFrameworkConfig getConfig() {
        MixFrameworkConfig mixFrameworkConfig = (MixFrameworkConfig) SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipMixFrameworkConfig.class);
        return mixFrameworkConfig == null ? DEFAULT : mixFrameworkConfig;
    }
}
