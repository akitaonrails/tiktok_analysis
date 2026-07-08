package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_delay_iap_sdk_init")
public final class LiveDelayIAPSDKInitSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDelayIAPSDKInitSetting INSTANCE = new LiveDelayIAPSDKInitSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_delay_iap_sdk_init", DEFAULT);
    }
}
