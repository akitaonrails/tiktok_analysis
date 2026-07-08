package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_single_effect_instance")
public final class LiveEnableSingleEffectInstanceSettings {
    public static final boolean DEFAULT = false;
    public static final LiveEnableSingleEffectInstanceSettings INSTANCE = new LiveEnableSingleEffectInstanceSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_single_effect_instance", DEFAULT);
    }
}
