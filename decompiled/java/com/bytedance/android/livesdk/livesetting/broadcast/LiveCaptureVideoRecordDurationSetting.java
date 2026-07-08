package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_capture_video_record_duration")
public final class LiveCaptureVideoRecordDurationSetting {
    public static final float DEFAULT = 0.0f;
    public static final LiveCaptureVideoRecordDurationSetting INSTANCE = new LiveCaptureVideoRecordDurationSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_capture_video_record_duration", DEFAULT);
    }
}
