package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_broadcast_inflate_opt")
public final class LiveCohostBroadcastInflateOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostBroadcastInflateOptSetting INSTANCE = new LiveCohostBroadcastInflateOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_broadcast_inflate_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
