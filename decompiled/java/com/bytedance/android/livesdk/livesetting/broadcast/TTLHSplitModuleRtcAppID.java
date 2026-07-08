package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_split_module_rtc_app_id")
public final class TTLHSplitModuleRtcAppID {
    public static final TTLHSplitModuleRtcAppID INSTANCE = new TTLHSplitModuleRtcAppID();
    public static final String DEFAULT = "";

    public final String getRtcAppID() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_split_module_rtc_app_id", DEFAULT);
    }
}
