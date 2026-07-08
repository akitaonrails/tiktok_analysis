package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_set_surface_time")
public final class LiveSetSurfaceTimeSetting {
    public static final int DEFAULT = 1;
    public static final LiveSetSurfaceTimeSetting INSTANCE = new LiveSetSurfaceTimeSetting();

    public static final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_set_surface_time", DEFAULT);
    }
}
