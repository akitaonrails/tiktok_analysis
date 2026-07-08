package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_trymode_pause_opt")
public final class LiveHostTrymodePauseOpt {
    public static final boolean DEFAULT = false;
    public static final LiveHostTrymodePauseOpt INSTANCE = new LiveHostTrymodePauseOpt();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_trymode_pause_opt", DEFAULT);
    }
}
