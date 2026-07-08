package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_moy_reward_effect")
public final class LiveMoyEffectRedDotSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMoyEffectRedDotSetting INSTANCE = new LiveMoyEffectRedDotSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_moy_reward_effect", DEFAULT);
    }
}
