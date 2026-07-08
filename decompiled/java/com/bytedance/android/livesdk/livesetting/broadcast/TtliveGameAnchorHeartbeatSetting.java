package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_anchor_heartbeat")
public final class TtliveGameAnchorHeartbeatSetting {
    public static final int DEFAULT = 1;
    public static final TtliveGameAnchorHeartbeatSetting INSTANCE = new TtliveGameAnchorHeartbeatSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_anchor_heartbeat", DEFAULT);
    }

    public final boolean useOpt() {
        return getValue() == 1;
    }
}
