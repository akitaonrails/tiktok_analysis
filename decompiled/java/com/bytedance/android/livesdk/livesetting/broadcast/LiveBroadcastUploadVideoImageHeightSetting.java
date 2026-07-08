package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image_height")
public final class LiveBroadcastUploadVideoImageHeightSetting {
    public static final int DEFAULT = 640;
    public static final LiveBroadcastUploadVideoImageHeightSetting INSTANCE = new LiveBroadcastUploadVideoImageHeightSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_upload_video_image_height", DEFAULT);
    }
}
