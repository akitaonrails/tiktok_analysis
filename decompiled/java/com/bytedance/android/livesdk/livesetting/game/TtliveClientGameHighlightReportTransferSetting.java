package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_client_game_highlight_report_transfer")
public final class TtliveClientGameHighlightReportTransferSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveClientGameHighlightReportTransferSetting INSTANCE = new TtliveClientGameHighlightReportTransferSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_client_game_highlight_report_transfer", DEFAULT);
    }
}
