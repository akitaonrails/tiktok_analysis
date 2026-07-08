package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_timeout_strategy_group")
public final class LiveCoHosTimeoutStrategyGroup {
    public static final int DEFAULT = 0;
    public static final LiveCoHosTimeoutStrategyGroup INSTANCE = new LiveCoHosTimeoutStrategyGroup();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_timeout_strategy_group", DEFAULT);
    }

    public final boolean isDefaultGroup() {
        return getValue() == 0;
    }
}
