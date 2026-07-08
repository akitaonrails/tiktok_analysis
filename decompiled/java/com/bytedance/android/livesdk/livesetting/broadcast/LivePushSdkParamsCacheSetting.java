package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_push_sdk_params_cache_enable")
public final class LivePushSdkParamsCacheSetting {
    public static final boolean DEFAULT = false;
    public static final LivePushSdkParamsCacheSetting INSTANCE = new LivePushSdkParamsCacheSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_push_sdk_params_cache_enable", DEFAULT);
    }
}
