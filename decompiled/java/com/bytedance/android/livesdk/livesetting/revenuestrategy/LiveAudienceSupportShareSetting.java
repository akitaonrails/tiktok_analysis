package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_support_share")
public final class LiveAudienceSupportShareSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAudienceSupportShareSetting INSTANCE = new LiveAudienceSupportShareSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_support_share", DEFAULT);
    }
}
