package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_mock_video_path")
public final class LiveAnchorVideoMockPath {
    public static final LiveAnchorVideoMockPath INSTANCE = new LiveAnchorVideoMockPath();
    public static final String DEFAULT = "";
    public static String path = SettingsManager.INSTANCE.getStringValue("live_anchor_mock_video_path", DEFAULT);

    public final String getValue() {
        return path;
    }

    public static final void setValue(String str) {
        path = str;
    }
}
