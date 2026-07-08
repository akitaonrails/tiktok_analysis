package com.ss.android.ugc.aweme.topicfeed.utils;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
public final class TopicFeedPreloadExpirySetting {
    public static final long DEFAULT = 10080000;
    public static final TopicFeedPreloadExpirySetting INSTANCE = new TopicFeedPreloadExpirySetting();

    public final long delayTimeMill() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJFF("topic_feed_preload_expiry_setting", DEFAULT);
    }
}
