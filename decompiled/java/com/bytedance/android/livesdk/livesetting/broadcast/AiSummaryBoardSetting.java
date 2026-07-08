package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ai_summary_board_setting")
public final class AiSummaryBoardSetting {
    public static final AiSummaryBoardSetting INSTANCE = new AiSummaryBoardSetting();
    public static final int DEFAULT = 1;

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("ai_summary_board_setting", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue() == 1;
    }
}
