package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_tracker")
public final class LinkMicTrackerSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicTrackerSetting INSTANCE = new LinkMicTrackerSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_tracker", DEFAULT);
    }
}
