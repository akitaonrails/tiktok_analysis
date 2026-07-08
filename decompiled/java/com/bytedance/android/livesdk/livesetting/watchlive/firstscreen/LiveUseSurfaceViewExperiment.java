package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import android.os.Build;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_use_surface_view")
public final class LiveUseSurfaceViewExperiment {
    public static final boolean DEFAULT = false;
    public static final LiveUseSurfaceViewExperiment INSTANCE = new LiveUseSurfaceViewExperiment();
    public static final boolean enableValue = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_use_surface_view", DEFAULT) && Build.VERSION.SDK_INT >= 24;
    }
}
