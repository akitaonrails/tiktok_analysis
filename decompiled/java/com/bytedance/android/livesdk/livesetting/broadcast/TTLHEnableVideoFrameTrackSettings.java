package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_video_frame_track")
public final class TTLHEnableVideoFrameTrackSettings {
    public static final TTLHEnableVideoFrameTrackSettings INSTANCE = new TTLHEnableVideoFrameTrackSettings();
    public static final int DEFAULT = 1;

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_video_frame_track", DEFAULT) == 1;
    }
}
