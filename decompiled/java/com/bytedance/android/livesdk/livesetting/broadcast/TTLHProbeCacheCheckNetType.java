package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_cache_check_net_type")
public final class TTLHProbeCacheCheckNetType {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheCheckNetType INSTANCE = new TTLHProbeCacheCheckNetType();

    public final boolean enableProbeCacheCheckNetType() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_check_net_type", DEFAULT) == 1;
    }
}
