package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "live_level_up_effect_type")
public final class LiveLevelRenderEffectABControlSetting {
    public static final int DEFAULT = 0;
    public static final LiveLevelRenderEffectABControlSetting INSTANCE = new LiveLevelRenderEffectABControlSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_level_up_effect_type", DEFAULT);
    }
}
