package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_move_banner_init_data_event_to_runtime_ready")
public final class LiveMoveBannerInitDataEventToRuntimeReadySetting {
    public static final boolean DEFAULT = false;
    public static final LiveMoveBannerInitDataEventToRuntimeReadySetting INSTANCE = new LiveMoveBannerInitDataEventToRuntimeReadySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_move_banner_init_data_event_to_runtime_ready", DEFAULT);
    }
}
