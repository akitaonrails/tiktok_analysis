package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_smooth_exit_not_capture_exp")
public final class LiveSmoothExitNotCaptureExp {
    public static final boolean DEFAULT = false;
    public static final LiveSmoothExitNotCaptureExp INSTANCE = new LiveSmoothExitNotCaptureExp();

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_smooth_exit_not_capture_exp", DEFAULT);
    }

    public static final boolean disable() {
        return !getEnable();
    }
}
