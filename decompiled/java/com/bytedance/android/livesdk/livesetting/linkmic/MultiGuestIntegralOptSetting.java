package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_integral_opt")
public final class MultiGuestIntegralOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestIntegralOptSetting INSTANCE = new MultiGuestIntegralOptSetting();
    public static final int OPT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_integral_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
