package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("webcast_live_sdk_auto_remove_video_frame_listener")
public final class LiveVideoFrameListenerSettings {
    public static final boolean DEFAULT = false;
    public static final LiveVideoFrameListenerSettings INSTANCE = new LiveVideoFrameListenerSettings();

    public final boolean autoRemoveFrameListener() {
        return SettingsManager.INSTANCE.getBooleanValue("webcast_live_sdk_auto_remove_video_frame_listener", DEFAULT);
    }
}
