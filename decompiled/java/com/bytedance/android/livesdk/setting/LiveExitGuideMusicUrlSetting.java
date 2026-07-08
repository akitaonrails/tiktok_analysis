package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_exit_guide_music_url")
public final class LiveExitGuideMusicUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveExitGuideMusicUrlSetting INSTANCE = new LiveExitGuideMusicUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_exit_guide_music_url", DEFAULT);
    }
}
