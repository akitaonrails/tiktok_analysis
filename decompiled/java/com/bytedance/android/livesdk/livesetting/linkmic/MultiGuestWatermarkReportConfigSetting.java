package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("multi_guest_watermark_report_config")
public final class MultiGuestWatermarkReportConfigSetting {
    public static final MultiGuestWatermarkReportConfigSetting INSTANCE = new MultiGuestWatermarkReportConfigSetting();
    public static final MultiGuestWatermarkReportConfig DEFAULT = new MultiGuestWatermarkReportConfig(20, 1000, true);

    public final MultiGuestWatermarkReportConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestWatermarkReportConfig multiGuestWatermarkReportConfig = DEFAULT;
        MultiGuestWatermarkReportConfig multiGuestWatermarkReportConfig2 = (MultiGuestWatermarkReportConfig) settingsManager.getValueSafely("multi_guest_watermark_report_config", multiGuestWatermarkReportConfig);
        return multiGuestWatermarkReportConfig2 != null ? multiGuestWatermarkReportConfig2 : multiGuestWatermarkReportConfig;
    }
}
