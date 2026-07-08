package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_probe_cache_on_running_probe")
public final class TTLHProbeCacheOnRunningProbeSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHProbeCacheOnRunningProbeSwitch INSTANCE = new TTLHProbeCacheOnRunningProbeSwitch();

    public final boolean enableTTLHProbeCacheOnRunningProbeSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_cache_on_running_probe", DEFAULT) == 1;
    }
}
