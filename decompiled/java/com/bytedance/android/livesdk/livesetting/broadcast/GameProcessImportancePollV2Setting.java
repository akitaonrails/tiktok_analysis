package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("livesdk_game_process_importance_poll_enable_v2_settings")
public final class GameProcessImportancePollV2Setting {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final GameProcessImportancePollV2Setting INSTANCE = new GameProcessImportancePollV2Setting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_game_process_importance_poll_enable_v2_settings", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
