package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_task_info_request_opt")
public final class LiveCoinTaskInfoRequestOptSettings {
    public static final LiveCoinTaskInfoRequestOptSettings INSTANCE = new LiveCoinTaskInfoRequestOptSettings();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_info_request_opt", DEFAULT);
    }
}
