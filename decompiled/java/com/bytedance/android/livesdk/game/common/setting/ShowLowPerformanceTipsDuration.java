package com.bytedance.android.livesdk.game.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("show_low_performance_tips_inapp_duartion_time")
public final class ShowLowPerformanceTipsDuration {
    public static final int $stable = 0;
    public static final int DEFAULT = 180;
    public static final ShowLowPerformanceTipsDuration INSTANCE = new ShowLowPerformanceTipsDuration();

    public final int getDuration() {
        return SettingsManager.INSTANCE.getIntValue("show_low_performance_tips_inapp_duartion_time", DEFAULT);
    }
}
