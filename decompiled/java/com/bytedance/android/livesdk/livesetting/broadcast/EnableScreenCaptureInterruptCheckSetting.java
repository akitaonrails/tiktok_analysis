package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_screen_capture_interrupt_check")
public final class EnableScreenCaptureInterruptCheckSetting {
    public static final int DEFAULT = 0;
    public static final EnableScreenCaptureInterruptCheckSetting INSTANCE = new EnableScreenCaptureInterruptCheckSetting();
    public static final int PERSIST = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_screen_capture_interrupt_check", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
