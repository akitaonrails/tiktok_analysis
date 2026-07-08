package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C235000vU;
import X.EnumC1811400xEo;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RankTypeV2 {
    public static final TypeAdapter ADAPTER;
    public static final RankTypeV2 LIZ;
    public static final RankTypeV2 LIZIZ;
    public static final RankTypeV2 LIZJ;
    public static final RankTypeV2 LIZLLL;
    public static final RankTypeV2 LJ;
    public static final RankTypeV2 LJFF;
    public static final RankTypeV2 LJI;
    public static final RankTypeV2 LJII;
    public static final RankTypeV2 LJIIIIZZ;
    public static final RankTypeV2 LJIIIZ;
    public static final RankTypeV2 LJIIJ;
    public static final RankTypeV2 LJIIJJI;
    public static final RankTypeV2 LJIIL;
    public static final RankTypeV2 LJIILIIL;
    public static final RankTypeV2 LJIILJJIL;
    public static final RankTypeV2 LJIILL;
    public static final RankTypeV2 LJIILLIIL;
    public static final RankTypeV2 LJIIZILJ;
    public static final RankTypeV2 LJIJ;
    public static final RankTypeV2 LJIJI;
    public static final RankTypeV2 LJIJJ;
    public static final RankTypeV2 LJIJJLI;
    public static final RankTypeV2 LJIL;
    public static final RankTypeV2 LJJ;
    public static final RankTypeV2 LJJI;
    public static final RankTypeV2 LJJIFFI;
    public static final RankTypeV2 LJJII;
    public static final RankTypeV2 LJJIII;
    public static final RankTypeV2 LJJIIJ;
    public static final RankTypeV2 LJJIIJZLJL;
    public static final RankTypeV2 LJJIIZ;
    public static final RankTypeV2 LJJIIZI;
    public static final RankTypeV2 LJJIJ;
    public static final RankTypeV2 LJJIJIIJI;

    @C09CT("group_type")
    public int group_type;

    @C09CT("rank_name")
    public String rankName;

    @C09CT("rank_phase")
    public int rankPhase;

    @C09CT("rank_settlement_countdown")
    public int rankSettlementCountdown;

    @C09CT("rank_settlement_countdown_duration")
    public int rankSettlementCountdownDuration;

    @C09CT("show_rank_keep_up_tip")
    public int showRankKeepUpTip;

    @C09CT("rank_style")
    public int style;

    @C09CT("rank_type")
    public int type;

    static {
        new C235000vU();
        EnumC1811400xEo enumC1811400xEo = EnumC1811400xEo.GIFT_RANK;
        LIZ = new RankTypeV2(0, enumC1811400xEo.getType(), "hourly_rank", 0, 0, 180, 5, 0);
        LIZIZ = new RankTypeV2(1, enumC1811400xEo.getType(), "weekly_rank", 0, 0, 86400, 3, 0);
        LIZJ = new RankTypeV2(5, enumC1811400xEo.getType(), "rookie_star_rank", 1, 0, 86400, 3, 3);
        EnumC1811400xEo enumC1811400xEo2 = EnumC1811400xEo.E_COMMERCE;
        LIZLLL = new RankTypeV2(6, enumC1811400xEo2.getType(), "sale_rank", 0, 0, -1, 0, 0);
        LJ = new RankTypeV2(26, enumC1811400xEo2.getType(), "collectibles", 0, 0, -1, 0, 0);
        LJFF = new RankTypeV2(27, enumC1811400xEo2.getType(), "beauty", 0, 0, -1, 0, 0);
        LJI = new RankTypeV2(28, enumC1811400xEo2.getType(), "women_wear", 0, 0, -1, 0, 0);
        LJII = new RankTypeV2(29, enumC1811400xEo2.getType(), "sale_rank_daily", 0, 0, -1, 0, 0);
        LJIIIIZZ = new RankTypeV2(30, enumC1811400xEo2.getType(), "fmcg", 3, 0, -1, 0, 0);
        LJIIIZ = new RankTypeV2(31, enumC1811400xEo2.getType(), "fashion", 3, 0, -1, 0, 0);
        LJIIJ = new RankTypeV2(32, enumC1811400xEo2.getType(), "lifestyle", 3, 0, -1, 0, 0);
        LJIIJJI = new RankTypeV2(33, enumC1811400xEo2.getType(), "electronics", 3, 0, -1, 0, 0);
        LJIIL = new RankTypeV2(8, enumC1811400xEo.getType(), "daily_rank", 0, 0, 3600, 3, 0);
        EnumC1811400xEo enumC1811400xEo3 = EnumC1811400xEo.GAME_RANK;
        LJIILIIL = new RankTypeV2(10, enumC1811400xEo3.getType(), "weekly_game_rank", 0, 0, -1, 0, 0);
        LJIILJJIL = new RankTypeV2(11, enumC1811400xEo3.getType(), "daily_game_rank", 0, 0, -1, 0, 0);
        LJIILL = new RankTypeV2(12, enumC1811400xEo.getType(), "hall_of_fame_rank", 0, 0, -1, 0, 0);
        LJIILLIIL = new RankTypeV2(13, enumC1811400xEo.getType(), "champion_tournament", 2, 0, 3600, 3, 0);
        LJIIZILJ = new RankTypeV2(13, enumC1811400xEo.getType(), "champion_tournament_phase_one", 2, 1, 3600, 3, 0);
        LJIJ = new RankTypeV2(13, enumC1811400xEo.getType(), "champion_tournament_phase_two", 2, 2, 3600, 3, 0);
        LJIJI = new RankTypeV2(13, enumC1811400xEo.getType(), "champion_tournament_phase_three", 2, 3, 3600, 3, 0);
        LJIJJ = new RankTypeV2(14, enumC1811400xEo.getType(), "daily_rookie_star_rank", 1, 0, 3600, 3, 2);
        LJIJJLI = new RankTypeV2(15, enumC1811400xEo.getType(), "fans_team_rank", 0, 0, 3600, 3, 0);
        LJIL = new RankTypeV2(16, enumC1811400xEo.getType(), "ranking_league", 3, 0, 3600, 3, 0);
        LJJ = new RankTypeV2(20, enumC1811400xEo3.getType(), "pubg", 0, 0, -1, 0, 0);
        LJJI = new RankTypeV2(21, enumC1811400xEo3.getType(), "mlbb", 0, 0, -1, 0, 0);
        LJJIFFI = new RankTypeV2(22, enumC1811400xEo3.getType(), "free_fire", 0, 0, -1, 0, 0);
        LJJII = new RankTypeV2(23, enumC1811400xEo3.getType(), "sub_weekly_game_rank1", 3, 0, -1, 0, 0);
        LJJIII = new RankTypeV2(24, enumC1811400xEo3.getType(), "sub_weekly_game_rank2", 3, 0, -1, 0, 0);
        LJJIIJ = new RankTypeV2(25, enumC1811400xEo3.getType(), "sub_weekly_game_rank3", 3, 0, -1, 0, 0);
        LJJIIJZLJL = new RankTypeV2(60, EnumC1811400xEo.CONTENT_SPOTLIGHT.getType(), "music_spotlight", 0, 0, -1, 0, 0);
        LJJIIZ = new RankTypeV2(34, EnumC1811400xEo.FRIEND_RANKING.getType(), "friends_ranking", 0, 0, -1, 0, 0);
        LJJIIZI = new RankTypeV2(101, enumC1811400xEo.getType(), "league_match", 0, 0, -1, 0, 0);
        LJJIJ = new RankTypeV2(1001, enumC1811400xEo.getType(), "league_campaign_rank", 0, 0, -1, 0, 0);
        LJJIJIIJI = new RankTypeV2(-1, EnumC1811400xEo.DEFAULT.getType(), "unknown", 0, 0, -1, 0, 0);
        NormalGson.singleton();
        ADAPTER = new RankTypeV2_OptTypeAdapter();
    }

    public RankTypeV2() {
        this(-1, EnumC1811400xEo.DEFAULT.getType(), "unknown", 0, 0, -1, 0, 0);
    }

    public final int hashCode() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RankTypeV2) {
            RankTypeV2 rankTypeV2 = (RankTypeV2) obj;
            if (this.type == rankTypeV2.type && this.rankPhase == rankTypeV2.rankPhase) {
                return true;
            }
            return false;
        }
        return false;
    }

    public RankTypeV2(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.type = i;
        this.group_type = i2;
        this.rankName = str;
        this.style = i3;
        this.rankPhase = i4;
        this.rankSettlementCountdown = i5;
        this.rankSettlementCountdownDuration = i6;
        this.showRankKeepUpTip = i7;
    }
}
