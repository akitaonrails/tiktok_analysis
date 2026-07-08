package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enable_friend_ranking")
public final class LiveFriendRankingSetting {
    public static int friendRankingLoopStrategy;
    public static final LiveFriendRankingSetting INSTANCE = new LiveFriendRankingSetting();
    public static final boolean DEFAULT = false;
    public static boolean enableFriendRanking = SettingsManager.INSTANCE.getBooleanValue("enable_friend_ranking", DEFAULT);

    public final boolean useLoopStrategyWithFriendRankingReplacingClassRank() {
        return friendRankingLoopStrategy == 2;
    }

    public final boolean useLoopStrategyWithFriendRankingReplacingPopularRanking() {
        return friendRankingLoopStrategy == 1;
    }

    public final boolean getEnableFriendRanking() {
        return enableFriendRanking;
    }

    public final int getFriendRankingLoopStrategy() {
        return friendRankingLoopStrategy;
    }

    public final void setEnableFriendRanking(boolean z) {
        enableFriendRanking = z;
    }

    public final void setFriendRankingLoopStrategy(int i) {
        friendRankingLoopStrategy = i;
    }
}
