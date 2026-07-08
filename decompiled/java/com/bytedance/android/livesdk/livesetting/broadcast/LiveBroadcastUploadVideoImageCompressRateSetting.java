package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image_compress_rate")
public final class LiveBroadcastUploadVideoImageCompressRateSetting {
    public static final float DEFAULT = 0.4f;
    public static final LiveBroadcastUploadVideoImageCompressRateSetting INSTANCE = new LiveBroadcastUploadVideoImageCompressRateSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_broadcast_upload_video_image_compress_rate", DEFAULT);
    }
}
