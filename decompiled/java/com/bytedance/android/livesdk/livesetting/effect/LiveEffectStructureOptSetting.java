package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_structure_opt")
public final class LiveEffectStructureOptSetting {
    public static final LiveEffectStructureOptSetting INSTANCE = new LiveEffectStructureOptSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_structure_opt", DEFAULT);

    public final boolean enable() {
        return setting > 0;
    }

    public final boolean shouldClearCache() {
        return setting == 2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
