package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorCustomizedGift;
import webcast.data.CelebrationPrivilege;
import webcast.data.CoinStrategyTaskExtra;
import webcast.data.FansChatGroupInfo;
import webcast.data.FansClubBanner;
import webcast.data.FansClubInfo;
import webcast.data.FansClubTeamMissionDetails;
import webcast.data.FansLevelInfo;
import webcast.data.FansScoreRule;
import webcast.data.FansTask;
import webcast.data.TeamRankBonusInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class FansGetTaskInfoResponse {

    @C09CT("data")
    public Data data;

    /* JADX INFO: loaded from: classes29.dex */
    public static final class Data {

        @C09CT("anchor_fans_count")
        public long anchorFansCount;

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("bonus_info")
        public TeamRankBonusInfo bonusInfo;

        @C09CT("celebration_privilege")
        public CelebrationPrivilege celebrationPrivilege;

        @C09CT("chat_group_info")
        public FansChatGroupInfo chatGroupInfo;

        @C09CT("coin_strategy_task_extra")
        public CoinStrategyTaskExtra coinStrategyTaskExtra;

        @C09CT("customized_gift")
        public AnchorCustomizedGift customizedGift;

        @C09CT("expire_time")
        public long expireTime;

        @C09CT("fans_club_banner")
        public FansClubBanner fansClubBanner;

        @C09CT("fans_club_info")
        public FansClubInfo fansClubInfo;

        @C09CT("fans_gift_id")
        public long fansGiftId;

        @C09CT("is_popularity_rank_released")
        public boolean isPopularityRankReleased;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("popularity_info")
        public UserPopularityInfo popularityInfo;

        @C09CT("task_extra")
        public TaskExtra taskExtra;

        @C09CT("team_mission_details")
        public FansClubTeamMissionDetails teamMissionDetails;

        @C09CT("user_info")
        public User userInfo;

        @C09CT("user_local_month")
        public long userLocalMonth;

        @C09CT("tasks")
        public List<FansTask> tasks = new ArrayList();

        @C09CT("level_configs")
        public List<FansScoreRule> levelConfigs = new ArrayList();

        @C09CT("top_member_avatars")
        public List<ImageModel> topMemberAvatars = new ArrayList();
    }
}
