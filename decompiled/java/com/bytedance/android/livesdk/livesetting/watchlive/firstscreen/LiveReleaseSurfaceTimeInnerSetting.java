package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_release_surface_time_inner")
public final class LiveReleaseSurfaceTimeInnerSetting {
    public static final int DEFAULT = 80;
    public static final LiveReleaseSurfaceTimeInnerSetting INSTANCE = new LiveReleaseSurfaceTimeInnerSetting();

    public static final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_release_surface_time_inner", DEFAULT);
    }
}
