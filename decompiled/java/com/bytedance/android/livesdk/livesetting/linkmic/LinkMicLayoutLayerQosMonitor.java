package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_enable_layout_qos_monitor")
public final class LinkMicLayoutLayerQosMonitor {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutLayerQosMonitor INSTANCE = new LinkMicLayoutLayerQosMonitor();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_layout_qos_monitor", DEFAULT);
    }
}
