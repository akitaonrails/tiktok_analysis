package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_set_surface_time_inner")
public final class LiveSetSurfaceTimeInnerSetting {
    public static final int DEFAULT = 80;
    public static final LiveSetSurfaceTimeInnerSetting INSTANCE = new LiveSetSurfaceTimeInnerSetting();

    public static final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_set_surface_time_inner", DEFAULT);
    }
}
