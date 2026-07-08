package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_c2pa_check_resume_live_delay_task")
public final class LiveHostC2PACheckResumeLiveDelayTask {
    public static final LiveHostC2PACheckResumeLiveDelayTask INSTANCE = new LiveHostC2PACheckResumeLiveDelayTask();
    public static final long DEFAULT = 30000;

    public static final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_host_c2pa_check_resume_live_delay_task", DEFAULT);
    }
}
