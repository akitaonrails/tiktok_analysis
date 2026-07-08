package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_release_surface_time")
public final class LiveReleaseSurfaceTimeSetting {
    public static final int DEFAULT = 500;
    public static final LiveReleaseSurfaceTimeSetting INSTANCE = new LiveReleaseSurfaceTimeSetting();

    public static final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_release_surface_time", DEFAULT);
    }
}
