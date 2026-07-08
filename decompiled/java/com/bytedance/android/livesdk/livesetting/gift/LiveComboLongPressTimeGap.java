package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_long_press_combo_time_gap")
public final class LiveComboLongPressTimeGap {
    public static final int DEFAULT = 125;
    public static final LiveComboLongPressTimeGap INSTANCE = new LiveComboLongPressTimeGap();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_long_press_combo_time_gap", DEFAULT);
    }
}
