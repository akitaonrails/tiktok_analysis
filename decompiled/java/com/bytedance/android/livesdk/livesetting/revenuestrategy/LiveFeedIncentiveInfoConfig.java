package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feed_incentive_info_config")
public final class LiveFeedIncentiveInfoConfig {
    public static final LiveFeedIncentiveInfoConfig INSTANCE = new LiveFeedIncentiveInfoConfig();
    public static final FeedConfigParams DEFAULT = new FeedConfigParams(60, false, 7200, 3000, 2500);

    private final FeedConfigParams getSettingsValue() {
        FeedConfigParams feedConfigParams = (FeedConfigParams) SettingsManager.INSTANCE.getValueSafely(LiveFeedIncentiveInfoConfig.class);
        return feedConfigParams == null ? DEFAULT : feedConfigParams;
    }

    public final boolean enableRequestWhenLeaveRoom() {
        return getSettingsValue().enableRequestWhenLeaveRoom;
    }

    public final int getRefreshRange() {
        return getSettingsValue().refreshDelayRange;
    }

    public final long getTipsAnimDelay() {
        return getSettingsValue().animationDelay;
    }

    public final long getTipsAnimFirstDelay() {
        return getSettingsValue().firstAnimationDelay;
    }

    public final long timeCanRequestNextDay() {
        return getSettingsValue().canRequestNextTaskInfoTime;
    }
}
