package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_report_abnormal_live_finish")
public final class LiveReportBroadcastAbnormalFinish {
    public static final boolean DEFAULT = false;
    public static final LiveReportBroadcastAbnormalFinish INSTANCE = new LiveReportBroadcastAbnormalFinish();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_report_abnormal_live_finish", DEFAULT);
    }
}
