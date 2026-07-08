package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_clear_expire_days")
public final class LiveBroadcastResourcesExpiredDays {
    public static final LiveBroadcastResourcesExpiredDays INSTANCE = new LiveBroadcastResourcesExpiredDays();
    public static final int DEFAULT = 30;
    public static int expiredDays = SettingsManager.INSTANCE.getIntValue("live_host_clear_expire_days", 30);

    public static /* synthetic */ void getExpiredDays$annotations() {
    }

    public static final long value() {
        return ((long) expiredDays) * 86400000;
    }

    public static final void setExpiredDays(int i) {
        expiredDays = i;
    }
}
