package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_use_effect_algorithm_ab")
public final class LiveUseEffectAlgorithmAbSetting {
    public static final int DEFAULT = 0;
    public static final LiveUseEffectAlgorithmAbSetting INSTANCE = new LiveUseEffectAlgorithmAbSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_use_effect_algorithm_ab", DEFAULT) == 1;
    }
}
