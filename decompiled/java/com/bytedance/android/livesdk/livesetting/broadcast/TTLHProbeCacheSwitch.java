package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_probe_cache_switch")
public final class TTLHProbeCacheSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheSwitch INSTANCE = new TTLHProbeCacheSwitch();

    public final boolean enableTTLHProbeCacheSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_switch", DEFAULT) == 1;
    }
}
