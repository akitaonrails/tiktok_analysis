package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_top_live_requesting_cacel_threshold")
public final class MultiGuestTopLiveRequestingCacelThresholdSetting {
    public static final int DEFAULT = 15000;
    public static final MultiGuestTopLiveRequestingCacelThresholdSetting INSTANCE = new MultiGuestTopLiveRequestingCacelThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_top_live_requesting_cacel_threshold", DEFAULT);
    }
}
