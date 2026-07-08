package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_new_video_buffer_pool")
public final class TTLHEnableNewVideoBufferPoolSettings {
    public static final boolean DEFAULT = false;
    public static final TTLHEnableNewVideoBufferPoolSettings INSTANCE = new TTLHEnableNewVideoBufferPoolSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_new_video_buffer_pool", DEFAULT);
    }
}
