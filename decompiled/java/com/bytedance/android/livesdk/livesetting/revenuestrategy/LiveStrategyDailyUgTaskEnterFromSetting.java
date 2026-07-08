package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_strategy_daily_ug_task_enter_from")
public final class LiveStrategyDailyUgTaskEnterFromSetting {
    public static final LiveStrategyDailyUgTaskEnterFromSetting INSTANCE = new LiveStrategyDailyUgTaskEnterFromSetting();
    public static final String[] DEFAULT = {"daily_gift_button", "gift_guide_daily_gifting_task_popup", "outside_live_ug_page"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_strategy_daily_ug_task_enter_from", DEFAULT);
    }
}
