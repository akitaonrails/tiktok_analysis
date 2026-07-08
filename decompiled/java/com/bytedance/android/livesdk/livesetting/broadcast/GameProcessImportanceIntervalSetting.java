package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("livesdk_game_process_importance_poll_interval_settings")
public final class GameProcessImportanceIntervalSetting {
    public static final long DEFAULT = 10;
    public static final GameProcessImportanceIntervalSetting INSTANCE = new GameProcessImportanceIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("livesdk_game_process_importance_poll_interval_settings", DEFAULT);
    }
}
