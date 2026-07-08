package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_location_anr_opt")
public final class LivePreviewLocationAnrOptSetting {
    public static final LivePreviewLocationAnrOptSetting INSTANCE = new LivePreviewLocationAnrOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_preview_location_anr_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
