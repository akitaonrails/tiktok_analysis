package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_cache_check_interval")
public final class TTLHProbeCacheCheckIntervalSetting {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheCheckIntervalSetting INSTANCE = new TTLHProbeCacheCheckIntervalSetting();

    public final int probeCacheCheckInterval() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_check_interval", DEFAULT);
    }
}
