package com.bytedance.android.livesdk.broadcast.video;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "fix_task_init_by_start_push")
public final class FixTaskInitByStartPushSetting {
    public static final FixTaskInitByStartPushSetting INSTANCE = new FixTaskInitByStartPushSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("fix_task_init_by_start_push", DEFAULT);

    public final boolean disable() {
        return !enable();
    }

    public final boolean enable() {
        return value;
    }
}
