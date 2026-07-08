package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_spark_popup_visible_report_event")
public final class LiveHybridSparkPopupVisibleReportEventSetting {
    public static final boolean DEFAULT = true;
    public static final LiveHybridSparkPopupVisibleReportEventSetting INSTANCE = new LiveHybridSparkPopupVisibleReportEventSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_spark_popup_visible_report_event", DEFAULT);
    }
}
