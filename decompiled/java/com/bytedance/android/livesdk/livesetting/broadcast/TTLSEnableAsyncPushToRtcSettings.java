package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_enable_async_push_to_rtc")
public final class TTLSEnableAsyncPushToRtcSettings {
    public static final boolean DEFAULT = false;
    public static final TTLSEnableAsyncPushToRtcSettings INSTANCE = new TTLSEnableAsyncPushToRtcSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_enable_async_push_to_rtc", DEFAULT);
    }
}
