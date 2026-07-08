package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_task_update_concurrent_fix")
public final class LiveIncentiveTaskUpdateConcurrentFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveIncentiveTaskUpdateConcurrentFixSetting INSTANCE = new LiveIncentiveTaskUpdateConcurrentFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_update_concurrent_fix", DEFAULT);
    }
}
