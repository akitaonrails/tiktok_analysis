package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_dizziness_effect_enable")
public final class LiveMatchDizzinessEffectEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchDizzinessEffectEnableSetting INSTANCE = new LiveMatchDizzinessEffectEnableSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_dizziness_effect_enable", DEFAULT);
    }
}
