package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_recordings_page_redesign")
public final class LiveRecordingPageRedesignSetting {
    public static final LiveRecordingPageRedesignSetting INSTANCE = new LiveRecordingPageRedesignSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_recordings_page_redesign", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
