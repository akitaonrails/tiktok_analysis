package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image_interval")
public final class LiveBroadcastUploadVideoImageIntervalSetting {
    public static final long DEFAULT = 2;
    public static final LiveBroadcastUploadVideoImageIntervalSetting INSTANCE = new LiveBroadcastUploadVideoImageIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_broadcast_upload_video_image_interval", DEFAULT);
    }
}
