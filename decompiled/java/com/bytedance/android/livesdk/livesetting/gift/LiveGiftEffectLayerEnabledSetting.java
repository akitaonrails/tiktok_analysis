package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("is_effect_layer_enabled")
public final class LiveGiftEffectLayerEnabledSetting {
    public static final LiveGiftEffectLayerEnabledSetting INSTANCE = new LiveGiftEffectLayerEnabledSetting();
    public static final boolean DEFAULT = false;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("is_effect_layer_enabled", DEFAULT);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
