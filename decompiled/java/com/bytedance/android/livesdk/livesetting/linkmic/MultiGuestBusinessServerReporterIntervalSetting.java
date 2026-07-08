package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_business_server_reporter_interval")
public final class MultiGuestBusinessServerReporterIntervalSetting {
    public static final int DEFAULT = 20;
    public static final MultiGuestBusinessServerReporterIntervalSetting INSTANCE = new MultiGuestBusinessServerReporterIntervalSetting();

    public final int interval() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_business_server_reporter_interval", DEFAULT);
    }
}
