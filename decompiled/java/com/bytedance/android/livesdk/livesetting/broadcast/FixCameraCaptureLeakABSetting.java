package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "fix_camera_capture_leak_ab_setting")
public final class FixCameraCaptureLeakABSetting {
    public static final int DEFAULT = 1;
    public static final FixCameraCaptureLeakABSetting INSTANCE = new FixCameraCaptureLeakABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("fix_camera_capture_leak_ab_setting", DEFAULT) == 1;
    }
}
