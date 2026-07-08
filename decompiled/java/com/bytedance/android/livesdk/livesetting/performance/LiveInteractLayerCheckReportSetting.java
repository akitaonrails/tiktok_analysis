package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_interact_layer_check_report")
public final class LiveInteractLayerCheckReportSetting {
    public static final LiveInteractLayerCheckReportSetting INSTANCE = new LiveInteractLayerCheckReportSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_interact_layer_check_report", DEFAULT);
    }
}
