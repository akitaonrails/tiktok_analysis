package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_heart_me_task_sleep_fans_enable")
public final class LiveHeartMeTaskSleepFansEnable {
    public static final boolean DEFAULT = false;
    public static final LiveHeartMeTaskSleepFansEnable INSTANCE = new LiveHeartMeTaskSleepFansEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_heart_me_task_sleep_fans_enable", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
