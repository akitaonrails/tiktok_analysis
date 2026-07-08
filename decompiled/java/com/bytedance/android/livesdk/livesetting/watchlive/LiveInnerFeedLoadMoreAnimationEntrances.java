package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_feed_load_more_animation_entrances")
public final class LiveInnerFeedLoadMoreAnimationEntrances {
    public static final LiveInnerFeedLoadMoreAnimationEntrances INSTANCE = new LiveInnerFeedLoadMoreAnimationEntrances();
    public static final String[] DEFAULT = {"homepage_follow_live_cell", "homepage_follow_video_head", "homepage_hot_live_cell", "homepage_hot_video_head"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_inner_feed_load_more_animation_entrances", DEFAULT);
    }
}
