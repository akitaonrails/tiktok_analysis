package com.bytedance.android.livesdk.rank.api.config;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_friend_rank_capsule_max_miss")
public final class LiveFriendsRankingSuggestMatchCapsuleConfig {
    public static final int DEFAULT = 99;
    public static final LiveFriendsRankingSuggestMatchCapsuleConfig INSTANCE = new LiveFriendsRankingSuggestMatchCapsuleConfig();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_friend_rank_capsule_max_miss", DEFAULT);
    }
}
