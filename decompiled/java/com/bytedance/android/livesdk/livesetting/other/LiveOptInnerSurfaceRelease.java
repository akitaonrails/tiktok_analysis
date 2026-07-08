package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_opt_inner_surface_release")
public final class LiveOptInnerSurfaceRelease {
    public static final boolean DEFAULT = false;
    public static final LiveOptInnerSurfaceRelease INSTANCE = new LiveOptInnerSurfaceRelease();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_inner_surface_release", DEFAULT);
    }
}
