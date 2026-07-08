package com.bytedance.android.livesdk.pip;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = true, value = "live_pip_use_surfaceview")
public final class LivePipUseSurfaceViewSetting {
    public static final boolean DEFAULT = false;
    public static final LivePipUseSurfaceViewSetting INSTANCE = new LivePipUseSurfaceViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pip_use_surfaceview", DEFAULT);
    }
}
