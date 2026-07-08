package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_ktv_sei_interval_time")
public final class MultiGuestKtvSeiIntervalTimeSetting {
    public static final long DEFAULT = 3000;
    public static final MultiGuestKtvSeiIntervalTimeSetting INSTANCE = new MultiGuestKtvSeiIntervalTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("multi_guest_ktv_sei_interval_time", DEFAULT);
    }
}
