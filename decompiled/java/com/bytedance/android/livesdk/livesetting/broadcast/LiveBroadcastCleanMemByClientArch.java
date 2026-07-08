package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_clean_mem_by_clientarch_time")
public final class LiveBroadcastCleanMemByClientArch {
    public static final long DEFAULT = 0;
    public static final LiveBroadcastCleanMemByClientArch INSTANCE = new LiveBroadcastCleanMemByClientArch();

    public static final long time() {
        return SettingsManager.INSTANCE.getLongValue("live_broadcast_clean_mem_by_clientarch_time", DEFAULT);
    }
}
