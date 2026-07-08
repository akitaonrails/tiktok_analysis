package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_strategy_tp_data_update_fix")
public final class LiveStrategyTpDataUpdateFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveStrategyTpDataUpdateFixSetting INSTANCE = new LiveStrategyTpDataUpdateFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_strategy_tp_data_update_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
