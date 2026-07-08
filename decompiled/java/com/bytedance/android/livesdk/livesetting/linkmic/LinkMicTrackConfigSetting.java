package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_local_tracker_config")
public final class LinkMicTrackConfigSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicTrackConfigSetting INSTANCE = new LinkMicTrackConfigSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_local_tracker_config", DEFAULT);
    }
}
