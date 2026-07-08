package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_ai_broadcast_mock_fusion_id")
public final class GameAiBroadcastMockFusionIdSetting {
    public static final String DEFAULT = "";
    public static final GameAiBroadcastMockFusionIdSetting INSTANCE = new GameAiBroadcastMockFusionIdSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("game_ai_broadcast_mock_fusion_id", DEFAULT);
    }
}
