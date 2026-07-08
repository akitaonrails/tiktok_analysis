package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_anchor_intelligent_rotation_time")
public final class TtliveGameAnchorIntelligentRotationTimeSetting {
    public static final int DEFAULT = -1;
    public static final TtliveGameAnchorIntelligentRotationTimeSetting INSTANCE = new TtliveGameAnchorIntelligentRotationTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_anchor_intelligent_rotation_time", DEFAULT);
    }
}
