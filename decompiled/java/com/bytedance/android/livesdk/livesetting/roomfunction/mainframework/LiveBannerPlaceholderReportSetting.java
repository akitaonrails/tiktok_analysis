package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_banner_mid_togethor_report_setting")
public final class LiveBannerPlaceholderReportSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBannerPlaceholderReportSetting INSTANCE = new LiveBannerPlaceholderReportSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_banner_mid_togethor_report_setting", DEFAULT);
    }
}
