package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_hybrid_container_bind_lifecycle")
public final class LiveHybridContainerBindLifecycleOwnerSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridContainerBindLifecycleOwnerSetting INSTANCE = new LiveHybridContainerBindLifecycleOwnerSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_container_bind_lifecycle", DEFAULT);
    }
}
