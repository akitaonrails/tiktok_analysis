package com.bytedance.android.livesdk.livesetting.performance;

import X.C497280Jeo;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_smooth_activity_arch_opt")
public final class LiveSmoothActivityArchOpt {
    public static final boolean DEFAULT = true;
    public static final LiveSmoothActivityArchOpt INSTANCE = new LiveSmoothActivityArchOpt();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_smooth_activity_arch_opt", DEFAULT) && C497280Jeo.LIZ;
    }
}
