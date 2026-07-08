package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_hybrid_bridge_registry_fallback")
public final class LiveHybridBridgeRegistryFallbackSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridBridgeRegistryFallbackSetting INSTANCE = new LiveHybridBridgeRegistryFallbackSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_bridge_registry_fallback", DEFAULT);
    }
}
