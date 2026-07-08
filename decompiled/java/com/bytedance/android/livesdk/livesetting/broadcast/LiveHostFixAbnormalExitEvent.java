package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_fix_abnormal_exit_event")
public final class LiveHostFixAbnormalExitEvent {
    public static final LiveHostFixAbnormalExitEvent INSTANCE = new LiveHostFixAbnormalExitEvent();
    public static final boolean DEFAULT = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_fix_abnormal_exit_event", DEFAULT);
    }
}
