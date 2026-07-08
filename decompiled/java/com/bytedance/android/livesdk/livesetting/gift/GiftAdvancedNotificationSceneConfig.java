package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("advanced_notification_scene_config")
public final class GiftAdvancedNotificationSceneConfig {
    public static final GiftAdvancedNotificationSceneConfig INSTANCE = new GiftAdvancedNotificationSceneConfig();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("gift_notification_scene", "gift_announcement"), new Pair("gift_broadcast", "gift_announcement"), new Pair("tournament_rank", "champion_tournament"), new Pair("start_room_event", "weekly_rank"), new Pair("start_room_event_daily", "daily_rank"), new Pair("hourly_rank", "hourly_rank"), new Pair("daily_rank", "daily_rank"), new Pair("weekly_rank", "weekly_rank"), new Pair("weekly_game_rank", "weekly_game_rank"), new Pair("game_daily_rank", "game_daily_rank"), new Pair("fans_team_rank", "fans_team_rank"), new Pair("sale_rank", "sale_rank"), new Pair("weekly_rank_anchor_live", "weekly_rank_anchor_live"), new Pair("creator_class_ranking_settlement_a", "ranking_league_A"), new Pair("creator_class_ranking_settlement_b", "ranking_league_B"), new Pair("creator_class_ranking_settlement_c", "ranking_league_C"), new Pair("creator_class_ranking_settlement_d", "ranking_league_D"), new Pair("creator_class_ranking_settlement_s", "ranking_league_S"));

    private final HashMap<String, String> getValue() {
        HashMap<String, String> map = (HashMap) SettingsManager.INSTANCE.getValueSafely(GiftAdvancedNotificationSceneConfig.class);
        return map == null ? DEFAULT : map;
    }

    public final String getOrDefault(String str, String str2) {
        String str3;
        if (str != null && (str3 = getValue().get(str)) != null) {
            return str3;
        }
        return str2;
    }
}
