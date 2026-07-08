package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ai_summary_board_usage_setting")
public final class LiveAISummaryBoardSetting {
    public static final LiveAISummaryBoardUsageConfig DEFAULT;
    public static final LiveAISummaryBoardSetting INSTANCE = new LiveAISummaryBoardSetting();
    public static final LiveAISummaryBoardUsageConfig config;

    static {
        LiveAISummaryBoardUsageConfig liveAISummaryBoardUsageConfig = new LiveAISummaryBoardUsageConfig(false, 0, true);
        DEFAULT = liveAISummaryBoardUsageConfig;
        config = (LiveAISummaryBoardUsageConfig) SettingsManager.INSTANCE.getValueSafely("live_ai_summary_board_usage_setting", liveAISummaryBoardUsageConfig);
    }

    public final boolean aiSummaryUsageOpt() {
        return config.getAiSummaryUsageOpt();
    }

    public final int broadcastDialogStyle() {
        return config.getBroadcastDialogStyle();
    }

    public final boolean previewKeepOldStyle() {
        return config.getPreviewKeepOldStyle();
    }
}
