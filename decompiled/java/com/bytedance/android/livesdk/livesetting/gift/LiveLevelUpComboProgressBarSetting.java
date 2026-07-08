package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_level_up_combo_progress_bar_count")
public final class LiveLevelUpComboProgressBarSetting {
    public static final int DEFAULT = 30;
    public static final LiveLevelUpComboProgressBarSetting INSTANCE = new LiveLevelUpComboProgressBarSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_level_up_combo_progress_bar_count", DEFAULT);
    }
}
