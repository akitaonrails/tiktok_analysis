package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_reverse_no_new_effect")
public final class LiveEffectNewEffectReverseSetting {
    public static final int DEFAULT = 0;
    public static final LiveEffectNewEffectReverseSetting INSTANCE = new LiveEffectNewEffectReverseSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_reverse_no_new_effect", DEFAULT) == 1;
    }
}
