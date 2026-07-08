package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_auto_post_living_buffer_duration_threshold")
public final class LiveAutoPostLivingBufferDurationThreshold {
    public static final long DEFAULT = 1000;
    public static final LiveAutoPostLivingBufferDurationThreshold INSTANCE = new LiveAutoPostLivingBufferDurationThreshold();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_auto_post_living_buffer_duration_threshold", DEFAULT);
    }
}
