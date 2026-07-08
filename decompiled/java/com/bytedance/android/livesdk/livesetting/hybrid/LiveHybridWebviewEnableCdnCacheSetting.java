package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_webview_enable_cdn_cache")
public final class LiveHybridWebviewEnableCdnCacheSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridWebviewEnableCdnCacheSetting INSTANCE = new LiveHybridWebviewEnableCdnCacheSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_webview_enable_cdn_cache", DEFAULT);
    }
}
