package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_remove_dividing_line")
public final class MultiGuestRemoveDividingLineSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestRemoveDividingLineSetting INSTANCE = new MultiGuestRemoveDividingLineSetting();
    public static final int NO_DIVIDING_LINE_OPT_WAVE_BORDER = 1;
    public static final int NO_DIVIDING_LINE_RAW_WAVE_BORDER = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_remove_dividing_line", DEFAULT);
    }

    public final boolean isEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("multi_guest_remove_dividing_line", i) == 3 || settingsManager.getIntValue("multi_guest_remove_dividing_line", i) == 1;
    }
}
