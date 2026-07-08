package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_stream_linkmic_video_e2e_frame_interval")
public final class BroadcastVideoE2EDelaySampleSetting {
    public static final int DEFAULT = 50;
    public static final BroadcastVideoE2EDelaySampleSetting INSTANCE = new BroadcastVideoE2EDelaySampleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_stream_linkmic_video_e2e_frame_interval", DEFAULT);
    }
}
