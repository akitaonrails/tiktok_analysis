package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_speed_test_pre_request")
public final class BroadcastSpeedTestPreRequestSetting {
    public static final BroadcastSpeedTestPreRequestSetting INSTANCE = new BroadcastSpeedTestPreRequestSetting();
    public static final LiveSpeedTestPreRequest DEFAULT = new LiveSpeedTestPreRequest(false, 7.0d, 10.0d);

    private final LiveSpeedTestPreRequest getValue() {
        return (LiveSpeedTestPreRequest) SettingsManager.INSTANCE.getValueSafely("live_speed_test_pre_request", DEFAULT);
    }

    public final double availableDuration() {
        return getValue().getAvailableDuration();
    }

    public final boolean enable() {
        return getValue().getEnable();
    }

    public final double intervalTime() {
        return getValue().getIntervalTime();
    }
}
