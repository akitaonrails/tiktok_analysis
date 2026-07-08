package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_crop_surface_exp")
public final class LiveEnableCropSurfaceExp {
    public static final boolean DEFAULT = false;
    public static final LiveEnableCropSurfaceExp INSTANCE = new LiveEnableCropSurfaceExp();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_crop_surface_exp", DEFAULT);
    }
}
