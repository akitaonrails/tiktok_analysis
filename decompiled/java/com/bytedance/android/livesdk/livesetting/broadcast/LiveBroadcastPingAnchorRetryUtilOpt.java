package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_ping_anchor_retry_util_opt")
public final class LiveBroadcastPingAnchorRetryUtilOpt {
    public static final LiveBroadcastPingAnchorRetryUtilOpt INSTANCE = new LiveBroadcastPingAnchorRetryUtilOpt();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_background_ping_anchor_retry_util_opt", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
