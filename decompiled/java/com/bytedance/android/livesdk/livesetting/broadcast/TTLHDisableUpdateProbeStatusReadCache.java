package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_disable_update_probe_status_read_cache")
public final class TTLHDisableUpdateProbeStatusReadCache {
    public static final int DEFAULT = 0;
    public static final TTLHDisableUpdateProbeStatusReadCache INSTANCE = new TTLHDisableUpdateProbeStatusReadCache();

    public final boolean disable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_disable_update_probe_status_read_cache", DEFAULT) == 1;
    }
}
