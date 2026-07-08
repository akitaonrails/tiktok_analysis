package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_recordings_settings_enable")
public final class LiveRecordingsSettingsEnableSetting {
    public static final LiveRecordingsSettingsEnableSetting INSTANCE = new LiveRecordingsSettingsEnableSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_recordings_settings_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
