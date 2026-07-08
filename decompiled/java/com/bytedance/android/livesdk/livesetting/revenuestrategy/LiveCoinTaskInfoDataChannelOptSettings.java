package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_task_info_datachannel_opt")
public final class LiveCoinTaskInfoDataChannelOptSettings {
    public static final LiveCoinTaskInfoDataChannelOptSettings INSTANCE = new LiveCoinTaskInfoDataChannelOptSettings();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_info_datachannel_opt", DEFAULT);
    }
}
