package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image_width")
public final class LiveBroadcastUploadVideoImageWidthSetting {
    public static final int DEFAULT = 360;
    public static final LiveBroadcastUploadVideoImageWidthSetting INSTANCE = new LiveBroadcastUploadVideoImageWidthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_upload_video_image_width", DEFAULT);
    }
}
