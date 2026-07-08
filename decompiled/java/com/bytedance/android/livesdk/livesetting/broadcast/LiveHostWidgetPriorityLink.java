package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_widget_priority_link")
public final class LiveHostWidgetPriorityLink {
    public static final boolean DEFAULT = false;
    public static final LiveHostWidgetPriorityLink INSTANCE = new LiveHostWidgetPriorityLink();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_widget_priority_link", DEFAULT);
    }
}
