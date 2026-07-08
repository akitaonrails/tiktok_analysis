package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_try_mode_video_mode_switch")
public final class LivePreviewTryModeVideoModeSwitchSetting {
    public static final boolean DEFAULT = true;
    public static final LivePreviewTryModeVideoModeSwitchSetting INSTANCE = new LivePreviewTryModeVideoModeSwitchSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_try_mode_video_mode_switch", DEFAULT);
    }
}
