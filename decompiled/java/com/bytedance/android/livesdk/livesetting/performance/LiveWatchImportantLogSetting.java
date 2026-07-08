package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_watch_important_log")
public final class LiveWatchImportantLogSetting {
    public static final LiveWatchImportantLogSetting INSTANCE = new LiveWatchImportantLogSetting();
    public static final String[] DEFAULT = {"livesdk_live_duration", "livesdk_live_show", "livesdk_rec_live_play", "livesdk_live_window_duration_v2", "livesdk_watch_onemin", "livesdk_live_play", "livesdk_live_draw", "livesdk_exit_survey", "livesdk_watch_thirtysec", "livesdk_watch_tensec", "livesdk_live_draw"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_watch_important_log", DEFAULT);
    }
}
