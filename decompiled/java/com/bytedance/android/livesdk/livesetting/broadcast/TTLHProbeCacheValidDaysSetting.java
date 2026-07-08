package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_cache_valid_days")
public final class TTLHProbeCacheValidDaysSetting {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheValidDaysSetting INSTANCE = new TTLHProbeCacheValidDaysSetting();

    public final int probeCacheValidDays() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_valid_days", DEFAULT);
    }
}
