package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableSingleEffectInstanceSettings;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gift_effect_single_instance_enable")
public final class LiveGiftEffectSingleInstanceSetting {
    public static final LiveGiftEffectSingleInstanceSetting INSTANCE = new LiveGiftEffectSingleInstanceSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_effect_single_instance_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() && LiveEnableSingleEffectInstanceSettings.INSTANCE.enabled();
    }
}
