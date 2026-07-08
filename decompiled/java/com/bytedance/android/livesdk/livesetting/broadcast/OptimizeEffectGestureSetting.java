package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_effect_gesture")
public final class OptimizeEffectGestureSetting {
    public static final boolean DEFAULT = false;
    public static final OptimizeEffectGestureSetting INSTANCE = new OptimizeEffectGestureSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("optimize_effect_gesture", DEFAULT);
    }
}
