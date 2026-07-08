package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_cache_write_status")
public final class TTLHProbeCacheWriteStatus {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheWriteStatus INSTANCE = new TTLHProbeCacheWriteStatus();

    public final int probeCacheWriteStatus() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_write_status", DEFAULT);
    }
}
