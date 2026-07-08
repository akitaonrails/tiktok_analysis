package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_ping_anchor_opt")
public final class TtliveGamePingAnchorOptSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGamePingAnchorOptSetting INSTANCE = new TtliveGamePingAnchorOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_ping_anchor_opt", DEFAULT);
    }
}
