package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_broadcast_fusion_id_fixed_time")
public final class GameBroadcastFusionIdFixedTimeSetting {
    public static final long DEFAULT = 60000;
    public static final GameBroadcastFusionIdFixedTimeSetting INSTANCE = new GameBroadcastFusionIdFixedTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_broadcast_fusion_id_fixed_time", DEFAULT);
    }
}
