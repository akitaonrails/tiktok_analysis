package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_sdk_test_enable")
public final class TTLHSdkTestEnableSetting {
    public static final boolean DEFAULT = false;
    public static final TTLHSdkTestEnableSetting INSTANCE = new TTLHSdkTestEnableSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_sdk_test_enable", DEFAULT);
    }
}
