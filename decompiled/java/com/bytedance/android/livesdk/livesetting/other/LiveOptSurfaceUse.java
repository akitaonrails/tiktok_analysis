package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_surface_use")
public final class LiveOptSurfaceUse {
    public static final boolean DEFAULT = false;
    public static final LiveOptSurfaceUse INSTANCE = new LiveOptSurfaceUse();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_surface_use", DEFAULT);
    }
}
