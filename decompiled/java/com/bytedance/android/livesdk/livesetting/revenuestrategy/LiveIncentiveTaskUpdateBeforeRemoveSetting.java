package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_task_update_before_remove")
public final class LiveIncentiveTaskUpdateBeforeRemoveSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIncentiveTaskUpdateBeforeRemoveSetting INSTANCE = new LiveIncentiveTaskUpdateBeforeRemoveSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_update_before_remove", DEFAULT);
    }
}
