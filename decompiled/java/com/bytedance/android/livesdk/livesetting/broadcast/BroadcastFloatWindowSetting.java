package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_float_window_service")
public final class BroadcastFloatWindowSetting {
    public static final FloatWindowData DEFAULT;
    public static final BroadcastFloatWindowSetting INSTANCE = new BroadcastFloatWindowSetting();
    public static final FloatWindowData config;

    static {
        FloatWindowData floatWindowData = new FloatWindowData(5);
        DEFAULT = floatWindowData;
        config = (FloatWindowData) SettingsManager.INSTANCE.getValueSafely("broadcast_float_window_service", floatWindowData);
    }

    public final int getDelayTime() {
        return config.getDelayTimeInSeconds();
    }
}
