package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_dynamic_adaptive_forbid_apply_when_level_change")
public final class LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting {
    public static final LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting INSTANCE = new LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_dynamic_adaptive_forbid_apply_when_level_change", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }

    public final boolean disable() {
        return !enable();
    }
}
