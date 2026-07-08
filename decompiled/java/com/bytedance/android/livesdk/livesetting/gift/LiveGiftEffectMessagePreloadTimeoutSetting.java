package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_prefetch_timeout")
public final class LiveGiftEffectMessagePreloadTimeoutSetting {
    public static final int DEFAULT = 60;
    public static final LiveGiftEffectMessagePreloadTimeoutSetting INSTANCE = new LiveGiftEffectMessagePreloadTimeoutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_prefetch_timeout", DEFAULT);
    }
}
