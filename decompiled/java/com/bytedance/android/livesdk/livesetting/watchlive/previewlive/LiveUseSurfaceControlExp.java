package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_use_surface_control_exp")
public final class LiveUseSurfaceControlExp {
    public static final boolean DEFAULT = false;
    public static final LiveUseSurfaceControlExp INSTANCE = new LiveUseSurfaceControlExp();

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_use_surface_control_exp", DEFAULT);
    }
}
