package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_abnormal_exit_pid_guard")
public final class LiveHostAbnormalExitPidGuardOpt {
    public static final int DEFAULT = 0;
    public static final LiveHostAbnormalExitPidGuardOpt INSTANCE = new LiveHostAbnormalExitPidGuardOpt();

    public static final boolean enable() {
        return INSTANCE.getSettingValue() > 0;
    }

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_host_abnormal_exit_pid_guard", DEFAULT);
    }
}
