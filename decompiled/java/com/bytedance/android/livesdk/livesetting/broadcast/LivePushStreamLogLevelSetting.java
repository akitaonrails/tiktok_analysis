package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_push_stream_log_level")
public final class LivePushStreamLogLevelSetting {
    public static final int DEFAULT = 5;
    public static final LivePushStreamLogLevelSetting INSTANCE = new LivePushStreamLogLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_push_stream_log_level", DEFAULT);
    }
}
