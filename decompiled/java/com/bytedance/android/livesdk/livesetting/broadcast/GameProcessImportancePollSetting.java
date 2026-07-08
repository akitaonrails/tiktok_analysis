package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("livesdk_game_process_importance_poll_enable_settings")
public final class GameProcessImportancePollSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_EXPERIMENT = true;
    public static final GameProcessImportancePollSetting INSTANCE = new GameProcessImportancePollSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_game_process_importance_poll_enable_settings", DEFAULT);
    }
}
