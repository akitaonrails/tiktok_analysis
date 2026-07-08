package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_dynamic_adaptive_setting")
public final class LiveEffectDynamicAdaptiveSetting {
    public static final LiveEffectDynamicAdaptiveSetting INSTANCE = new LiveEffectDynamicAdaptiveSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_dynamic_adaptive_setting", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }

    public final boolean disable() {
        return !enable();
    }
}
