package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_top_live_recommend_feed_enable")
public final class LiveSdkMultiTopLiveRecommendFeedEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiTopLiveRecommendFeedEnableSetting INSTANCE = new LiveSdkMultiTopLiveRecommendFeedEnableSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_top_live_recommend_feed_enable", DEFAULT);
    }
}
