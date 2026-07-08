package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_overall_score_level")
public final class BroadcastOverallScoreLevelSetting {
    public static final BroadcastOverallScoreLevelSetting INSTANCE = new BroadcastOverallScoreLevelSetting();
    public static final BroadcastOverallScoreLevelMapping DEFAULT = new BroadcastOverallScoreLevelMapping(6.5f, 8.0f);

    public final BroadcastOverallScoreLevelMapping getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping = DEFAULT;
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping2 = (BroadcastOverallScoreLevelMapping) settingsManager.getValueSafely("broadcast_overall_score_level", broadcastOverallScoreLevelMapping);
        return broadcastOverallScoreLevelMapping2 != null ? broadcastOverallScoreLevelMapping2 : broadcastOverallScoreLevelMapping;
    }
}
