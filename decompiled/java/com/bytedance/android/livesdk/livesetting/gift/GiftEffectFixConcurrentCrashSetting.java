package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_effect_fix_concurrent_crash_setting")
public final class GiftEffectFixConcurrentCrashSetting {
    public static final boolean ENABLED = false;
    public static final GiftEffectFixConcurrentCrashSetting INSTANCE = new GiftEffectFixConcurrentCrashSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_effect_fix_concurrent_crash_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getENABLED() {
        return ENABLED;
    }
}
