package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_force_upload_video_image")
public final class LiveBroadcastForceUploadVideoImageSetting {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastForceUploadVideoImageSetting INSTANCE = new LiveBroadcastForceUploadVideoImageSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_force_upload_video_image", DEFAULT) == 1;
    }
}
