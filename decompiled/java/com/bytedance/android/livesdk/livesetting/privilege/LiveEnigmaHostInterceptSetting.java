package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enigma_host_intercept")
public final class LiveEnigmaHostInterceptSetting {
    public static final LiveEnigmaHostInterceptSetting INSTANCE = new LiveEnigmaHostInterceptSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enigma_host_intercept", DEFAULT);
    }
}
