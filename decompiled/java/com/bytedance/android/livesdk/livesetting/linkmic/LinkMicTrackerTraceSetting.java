package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_tracker_trace_enable")
public final class LinkMicTrackerTraceSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicTrackerTraceSetting INSTANCE = new LinkMicTrackerTraceSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_tracker_trace_enable", DEFAULT);
    }
}
