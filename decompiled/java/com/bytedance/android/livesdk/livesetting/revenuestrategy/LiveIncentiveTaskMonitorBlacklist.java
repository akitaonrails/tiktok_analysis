package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_task_monitor_blacklist")
public final class LiveIncentiveTaskMonitorBlacklist {
    public static final LiveIncentiveTaskMonitorBlacklist INSTANCE = new LiveIncentiveTaskMonitorBlacklist();
    public static final String[] DEFAULT = {""};

    public final boolean disable(int i) {
        return C13LQ.LJIILLIIL(String.valueOf(i), SettingsManager.INSTANCE.getStringArrayValue("live_incentive_task_monitor_blacklist", DEFAULT));
    }
}
