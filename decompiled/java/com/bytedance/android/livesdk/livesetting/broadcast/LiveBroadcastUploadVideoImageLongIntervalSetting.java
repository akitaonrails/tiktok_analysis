package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image_interval_long")
public final class LiveBroadcastUploadVideoImageLongIntervalSetting {
    public static final long DEFAULT = 10;
    public static final LiveBroadcastUploadVideoImageLongIntervalSetting INSTANCE = new LiveBroadcastUploadVideoImageLongIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_broadcast_upload_video_image_interval_long", DEFAULT);
    }
}
