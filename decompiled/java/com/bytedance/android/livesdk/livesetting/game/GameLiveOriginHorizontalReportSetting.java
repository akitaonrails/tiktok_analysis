package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("game_live_origin_horizontal_report")
public final class GameLiveOriginHorizontalReportSetting {
    public static final boolean DEFAULT = true;
    public static final GameLiveOriginHorizontalReportSetting INSTANCE = new GameLiveOriginHorizontalReportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_origin_horizontal_report", DEFAULT);
    }
}
