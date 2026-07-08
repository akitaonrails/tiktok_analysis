package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_use_camera_capture_pts_in_rtc")
public final class TTLSUseCameraCaptureVideoPtsInRtc {
    public static final boolean DEFAULT = false;
    public static final TTLSUseCameraCaptureVideoPtsInRtc INSTANCE = new TTLSUseCameraCaptureVideoPtsInRtc();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_use_camera_capture_pts_in_rtc", DEFAULT);
    }
}
