package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "guide_host_open_gps")
public final class GuideHostOpenGpsSetting {
    public static final boolean DEFAULT = true;
    public static final GuideHostOpenGpsSetting INSTANCE = new GuideHostOpenGpsSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("guide_host_open_gps", DEFAULT);
    }
}
