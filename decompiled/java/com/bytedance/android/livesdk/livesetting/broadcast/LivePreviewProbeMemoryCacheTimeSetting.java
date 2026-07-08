package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_memory_cache_valid_time")
public final class LivePreviewProbeMemoryCacheTimeSetting {
    public static final int DEFAULT = 0;
    public static final LivePreviewProbeMemoryCacheTimeSetting INSTANCE = new LivePreviewProbeMemoryCacheTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_memory_cache_valid_time", DEFAULT);
    }
}
