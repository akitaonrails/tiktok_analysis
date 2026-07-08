package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_strategy_find_tp_data_crash_fix")
public final class LiveStrategyFindTpDataCrashFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveStrategyFindTpDataCrashFixSetting INSTANCE = new LiveStrategyFindTpDataCrashFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_strategy_find_tp_data_crash_fix", DEFAULT);
    }
}
