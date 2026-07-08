package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_boost_watch_task_schedule")
public final class LiveBoostWatchTaskSchedule {
    public static final boolean DEFAULT = false;
    public static final LiveBoostWatchTaskSchedule INSTANCE = new LiveBoostWatchTaskSchedule();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_boost_watch_task_schedule", DEFAULT);
    }
}
