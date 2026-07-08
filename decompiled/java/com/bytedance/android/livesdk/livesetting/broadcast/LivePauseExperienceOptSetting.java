package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pause_experience_opt")
public final class LivePauseExperienceOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePauseExperienceOptSetting INSTANCE = new LivePauseExperienceOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pause_experience_opt", DEFAULT);
    }
}
