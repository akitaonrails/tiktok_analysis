package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_applog_layout_metrics")
public final class LinkMicApplogLayoutMetrics {
    public static final boolean DEFAULT = true;
    public static final LinkMicApplogLayoutMetrics INSTANCE = new LinkMicApplogLayoutMetrics();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_applog_layout_metrics", DEFAULT);
    }
}
