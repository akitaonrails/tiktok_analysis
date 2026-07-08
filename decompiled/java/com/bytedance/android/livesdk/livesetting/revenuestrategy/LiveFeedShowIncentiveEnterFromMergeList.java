package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_incentive_info_show_tabs")
public final class LiveFeedShowIncentiveEnterFromMergeList {
    public static final LiveFeedShowIncentiveEnterFromMergeList INSTANCE = new LiveFeedShowIncentiveEnterFromMergeList();
    public static final String[] DEFAULT = {"homepage_hot"};

    public final String[] getAllowList() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_incentive_info_show_tabs", DEFAULT);
    }
}
