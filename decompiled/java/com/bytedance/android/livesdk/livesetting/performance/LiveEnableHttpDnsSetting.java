package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_http_dns")
public final class LiveEnableHttpDnsSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEnableHttpDnsSetting INSTANCE = new LiveEnableHttpDnsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_http_dns", DEFAULT);
    }
}
