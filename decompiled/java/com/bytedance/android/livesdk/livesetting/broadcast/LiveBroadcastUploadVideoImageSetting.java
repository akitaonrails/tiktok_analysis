package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_upload_video_image")
public final class LiveBroadcastUploadVideoImageSetting {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastUploadVideoImageSetting INSTANCE = new LiveBroadcastUploadVideoImageSetting();

    public final boolean isDisable() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_upload_video_image", DEFAULT) == 0;
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_upload_video_image", DEFAULT) == 1;
    }
}
