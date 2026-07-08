package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sdk_enable_tfo_preconnect")
public final class LiveSdkEnableTfoPreconnectSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkEnableTfoPreconnectSetting INSTANCE = new LiveSdkEnableTfoPreconnectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_enable_tfo_preconnect", DEFAULT);
    }
}
