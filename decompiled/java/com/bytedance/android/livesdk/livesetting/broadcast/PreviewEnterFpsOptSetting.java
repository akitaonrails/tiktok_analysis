package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "preview_enter_fps_opt")
public final class PreviewEnterFpsOptSetting {
    public static final boolean DEFAULT = false;
    public static final PreviewEnterFpsOptSetting INSTANCE = new PreviewEnterFpsOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("preview_enter_fps_opt", DEFAULT);
    }
}
