package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("livesdk_game_process_importance_poll_init_delay_settings")
public final class GameProcessImportanceInitIntervalSetting {
    public static final long DEFAULT = 0;
    public static final GameProcessImportanceInitIntervalSetting INSTANCE = new GameProcessImportanceInitIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("livesdk_game_process_importance_poll_init_delay_settings", DEFAULT);
    }
}
