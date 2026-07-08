package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_enable_category_gears")
public final class TtliveGameEnableCategoryGearsSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final TtliveGameEnableCategoryGearsSetting INSTANCE = new TtliveGameEnableCategoryGearsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_enable_category_gears", DEFAULT) == 1;
    }
}
