package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_drops_red_dot_update")
public final class TtliveGameDropsRedDotUpdateSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGameDropsRedDotUpdateSetting INSTANCE = new TtliveGameDropsRedDotUpdateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_drops_red_dot_update", DEFAULT);
    }
}
