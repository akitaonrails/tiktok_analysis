package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_effect_sdk_version_setting")
public final class LiveEnableEffectSdkVersionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectSdkVersionSetting INSTANCE = new LiveEnableEffectSdkVersionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_effect_sdk_version_setting", DEFAULT);
    }
}
