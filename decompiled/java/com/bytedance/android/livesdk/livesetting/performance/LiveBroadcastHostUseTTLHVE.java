package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_host_use_ttlh_ve")
public final class LiveBroadcastHostUseTTLHVE {
    public static final LiveBroadcastHostUseTTLHVE INSTANCE = new LiveBroadcastHostUseTTLHVE();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_host_use_ttlh_ve", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
