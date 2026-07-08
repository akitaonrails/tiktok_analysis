package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_friend_ranking_zero_score_hide_setting")
public final class LiveFriendRankingZeroScoreHideSetting {
    public static final LiveFriendRankingZeroScoreHideSetting INSTANCE = new LiveFriendRankingZeroScoreHideSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_friend_ranking_zero_score_hide_setting", DEFAULT);
    }
}
