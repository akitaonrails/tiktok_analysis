package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_record_watch_task_progress_enable")
public final class LiveRecordWatchTaskProgressSettings {
    public static final LiveRecordWatchTaskProgressSettings INSTANCE = new LiveRecordWatchTaskProgressSettings();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_record_watch_task_progress_enable", DEFAULT);
    }
}
