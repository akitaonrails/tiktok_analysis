package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_interactive_effect_enable")
public final class LiveInteractionEffectEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveInteractionEffectEnableSetting INSTANCE = new LiveInteractionEffectEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_interactive_effect_enable", DEFAULT);
    }

    public final boolean inExperiment() {
        return getValue() > 0;
    }
}
