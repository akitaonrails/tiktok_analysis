package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_enable_video_mock_push_stream")
public final class LiveAnchorEnableVideoMockPushStream {
    public static final LiveAnchorEnableVideoMockPushStream INSTANCE = new LiveAnchorEnableVideoMockPushStream();
    public static final boolean DEFAULT = false;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_anchor_enable_video_mock_push_stream", DEFAULT);

    public final boolean getValue() {
        return value;
    }

    public static final void setValue(boolean z) {
        value = z;
    }
}
