package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_push_stream_interval")
public final class LivePushStreamIntervalSetting {
    public static final long DEFAULT = 3000;
    public static final LivePushStreamIntervalSetting INSTANCE = new LivePushStreamIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_push_stream_interval", DEFAULT);
    }
}
