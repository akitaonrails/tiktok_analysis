package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_short_return_enter_room_slardar_sample_rate")
public final class LiveShortReturnEnterRoomSlardarSampleRateSetting {
    public static final double DEFAULT = 1.0E-4d;
    public static final LiveShortReturnEnterRoomSlardarSampleRateSetting INSTANCE = new LiveShortReturnEnterRoomSlardarSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(LiveShortReturnEnterRoomSlardarSampleRateSetting.class);
    }
}
