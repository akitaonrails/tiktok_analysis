package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_friend_rank_suggestion_page")
public final class LiveFriendRankSuggestionPage {
    public static final LiveFriendRankSuggestionPage INSTANCE = new LiveFriendRankSuggestionPage();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=suggesting_match_viewers&enter_from=friends_ranking_quick_match&height_mode=fixed_7";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_friend_rank_suggestion_page", DEFAULT);
    }
}
