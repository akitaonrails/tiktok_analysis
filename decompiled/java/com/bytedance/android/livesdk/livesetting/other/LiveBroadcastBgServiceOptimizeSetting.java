package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_bg_service_camera_opt")
public final class LiveBroadcastBgServiceOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastBgServiceOptimizeSetting INSTANCE = new LiveBroadcastBgServiceOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_bg_service_camera_opt", DEFAULT);
    }
}
