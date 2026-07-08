package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feed_show_incentive_task_info")
public final class LiveFeedShowIncentiveTaskInfoSetting {
    public static final int DEFAULT = 0;
    public static final LiveFeedShowIncentiveTaskInfoSetting INSTANCE = new LiveFeedShowIncentiveTaskInfoSetting();

    public final int getGroup() {
        return SettingsManager.INSTANCE.getIntValue("live_feed_show_incentive_task_info", DEFAULT);
    }
}
