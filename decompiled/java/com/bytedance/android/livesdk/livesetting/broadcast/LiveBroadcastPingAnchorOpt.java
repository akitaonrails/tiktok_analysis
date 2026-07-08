package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_ping_anchor_opt")
public final class LiveBroadcastPingAnchorOpt {
    public static final LiveBroadcastPingAnchorOpt INSTANCE = new LiveBroadcastPingAnchorOpt();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_background_ping_anchor_opt", DEFAULT);

    public static final boolean inExperiment() {
        int i = value;
        return i == 1 || i == 2 || i == 3;
    }

    public static final boolean inExperimentV1() {
        return value == 1;
    }

    public static final boolean inExperimentV2() {
        return value == 2;
    }

    public static final boolean inExperimentV3() {
        return value == 3;
    }
}
