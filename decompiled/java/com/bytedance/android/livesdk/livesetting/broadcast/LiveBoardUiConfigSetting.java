package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_board_ui_config")
public final class LiveBoardUiConfigSetting {
    public static final float DEFAULT = 32.0f;
    public static final LiveBoardUiConfigSetting INSTANCE = new LiveBoardUiConfigSetting();

    public final float getBottomBallHeight() {
        return SettingsManager.INSTANCE.getFloatValue("live_board_ui_config", DEFAULT);
    }
}
