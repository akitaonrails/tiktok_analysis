package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interact_audience_time_out")
public final class LiveInteractAudienceTimeOutSetting {
    public static final int DEFAULT = 180;
    public static final LiveInteractAudienceTimeOutSetting INSTANCE = new LiveInteractAudienceTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_interact_audience_time_out", DEFAULT);
    }
}
