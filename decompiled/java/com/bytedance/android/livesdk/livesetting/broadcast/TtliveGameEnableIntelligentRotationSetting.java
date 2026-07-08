package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_enable_intelligent_rotation")
public final class TtliveGameEnableIntelligentRotationSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGameEnableIntelligentRotationSetting INSTANCE = new TtliveGameEnableIntelligentRotationSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_enable_intelligent_rotation", DEFAULT) == 1;
    }
}
