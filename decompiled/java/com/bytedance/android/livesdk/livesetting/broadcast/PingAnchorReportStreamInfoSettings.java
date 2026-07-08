package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ping_anchor_report_stream_info")
public final class PingAnchorReportStreamInfoSettings {
    public static final PingAnchorReportStreamInfoSettings INSTANCE = new PingAnchorReportStreamInfoSettings();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("ping_anchor_report_stream_info", DEFAULT);

    public final boolean enable() {
        return value != DEFAULT;
    }
}
