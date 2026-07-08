package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_audience_device_score")
public final class TTliveAudienceDeviceScoreSetting {
    public static final float DEFAULT = -1.0f;
    public static final TTliveAudienceDeviceScoreSetting INSTANCE = new TTliveAudienceDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("ttlive_audience_device_score", DEFAULT);
    }
}
