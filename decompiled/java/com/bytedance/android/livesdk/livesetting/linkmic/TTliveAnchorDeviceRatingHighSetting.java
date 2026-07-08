package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_anchor_device_rating_high")
public final class TTliveAnchorDeviceRatingHighSetting {
    public static final float DEFAULT = 7.92f;
    public static final TTliveAnchorDeviceRatingHighSetting INSTANCE = new TTliveAnchorDeviceRatingHighSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("ttlive_anchor_device_rating_high", DEFAULT);
    }
}
