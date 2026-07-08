package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_feed_incentive_task_cache_setting")
public final class LiveFeedIncentiveTaskCacheSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFeedIncentiveTaskCacheSetting INSTANCE = new LiveFeedIncentiveTaskCacheSetting();

    public final boolean enableOpt() {
        return SettingsManager.INSTANCE.getBooleanValue("live_feed_incentive_task_cache_setting", DEFAULT);
    }
}
