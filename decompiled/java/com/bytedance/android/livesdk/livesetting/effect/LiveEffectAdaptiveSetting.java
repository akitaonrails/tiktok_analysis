package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_effect_adaptive_enable")
public final class LiveEffectAdaptiveSetting {
    public static final LiveEffectAdaptiveSetting INSTANCE = new LiveEffectAdaptiveSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_adaptive_enable", DEFAULT);

    public final boolean enable() {
        return setting > 0;
    }
}
