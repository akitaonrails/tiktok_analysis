package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_use_new_layout_event_monitor")
public final class LinkMicUseNewLayoutEventMonitor {
    public static final boolean DEFAULT = true;
    public static final LinkMicUseNewLayoutEventMonitor INSTANCE = new LinkMicUseNewLayoutEventMonitor();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_use_new_layout_event_monitor", DEFAULT);
    }
}
