package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.FansClubInfo;
import webcast.data.FansLevelInfo;
import webcast.data.PopularityRankCard;
import webcast.data.TeamRankBonusInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class TeamRankDetailsPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("bonus_info")
        public TeamRankBonusInfo bonusInfo;

        @C09CT("fans_club_info")
        public FansClubInfo fansClubInfo;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("rank_card")
        public PopularityRankCard rankCard;

        @C09CT("user_info")
        public User userInfo;
    }
}
