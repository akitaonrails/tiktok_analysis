package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_align_report_probe_result")
public final class TTLHProbeAlignReportProbeResult {
    public static final int DEFAULT = 0;
    public static final TTLHProbeAlignReportProbeResult INSTANCE = new TTLHProbeAlignReportProbeResult();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_align_report_probe_result", DEFAULT) == 1;
    }
}
