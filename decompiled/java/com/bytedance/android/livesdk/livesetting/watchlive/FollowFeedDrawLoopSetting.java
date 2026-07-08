package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFollowFeedDrawLoop;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("follow_feed_draw_loop")
public final class FollowFeedDrawLoopSetting {
    public static final FollowFeedDrawLoopSetting INSTANCE = new FollowFeedDrawLoopSetting();
    public static final LiveFollowFeedDrawLoop DEFAULT = LiveFollowFeedDrawLoop.getDefault();

    public final LiveFollowFeedDrawLoop getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = DEFAULT;
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop2 = (LiveFollowFeedDrawLoop) settingsManager.getValueSafely("follow_feed_draw_loop", liveFollowFeedDrawLoop);
        return liveFollowFeedDrawLoop2 != null ? liveFollowFeedDrawLoop2 : liveFollowFeedDrawLoop;
    }

    public final LiveFollowFeedDrawLoop getDEFAULT() {
        return DEFAULT;
    }
}
