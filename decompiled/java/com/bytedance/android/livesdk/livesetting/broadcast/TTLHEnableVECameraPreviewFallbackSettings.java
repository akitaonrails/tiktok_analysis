package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_ve_camera_preview_fallback")
public final class TTLHEnableVECameraPreviewFallbackSettings {
    public static final int DEFAULT = 0;
    public static final TTLHEnableVECameraPreviewFallbackSettings INSTANCE = new TTLHEnableVECameraPreviewFallbackSettings();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_ve_camera_preview_fallback", DEFAULT) == 1;
    }
}
