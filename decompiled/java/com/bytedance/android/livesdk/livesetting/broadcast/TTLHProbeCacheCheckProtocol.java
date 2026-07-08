package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_cache_check_protocol")
public final class TTLHProbeCacheCheckProtocol {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheCheckProtocol INSTANCE = new TTLHProbeCacheCheckProtocol();

    public final boolean enableProbeCacheCheckProtocol() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_check_protocol", DEFAULT) == 1;
    }
}
