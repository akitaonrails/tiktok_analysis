package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gift_effect_pad")
public final class LiveGiftEffectPadSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveGiftEffectPadSetting INSTANCE = new LiveGiftEffectPadSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_effect_pad", DEFAULT);
    }
}
