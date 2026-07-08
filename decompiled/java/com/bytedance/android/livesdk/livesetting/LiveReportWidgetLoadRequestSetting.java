package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_report_widget_load_request")
public final class LiveReportWidgetLoadRequestSetting {
    public static final LiveReportWidgetLoadRequestSetting INSTANCE = new LiveReportWidgetLoadRequestSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_report_widget_load_request", true);

    public final boolean enable() {
        return value;
    }
}
