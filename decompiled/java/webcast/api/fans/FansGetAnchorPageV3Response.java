package webcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.fans.SuperFanDataItemView;
import webcast.data.AnchorCustomizedGift;
import webcast.data.AnchorHighlight;
import webcast.data.AnchorNoticeBoard;
import webcast.data.CommunityCommonInfo;
import webcast.data.FanCustomBenefit;
import webcast.data.FansChatGroupInfo;
import webcast.data.FansClubBanner;
import webcast.data.FansClubNameInfo;
import webcast.data.FansClubTeamMissionDetails;
import webcast.data.FansCoreStatistics;
import webcast.data.PopularityRankCard;
import webcast.data.TeamRankBonusInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetAnchorPageV3Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_highlight")
        public AnchorHighlight anchorHighlight;

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("anchor_zone")
        public AnchorZone anchorZone;

        @C09CT("bonus_info")
        public TeamRankBonusInfo bonusInfo;

        @C09CT("chat_group_info")
        public FansChatGroupInfo chatGroupInfo;

        @C09CT("community_info")
        public CommunityCommonInfo communityInfo;

        @C09CT("competent_ranking")
        public PopularityRankCard competentRanking;

        @C09CT("core_statistics")
        public FansCoreStatistics coreStatistics;

        @C09CT("customized_gift")
        public AnchorCustomizedGift customizedGift;

        @C09CT("extra")
        public AnchorPageExtra extra;

        @C09CT("fans_badge")
        public AnchorFansBadge fansBadge;

        @C09CT("fans_club_name_info")
        public FansClubNameInfo fansClubNameInfo;

        @C09CT("fans_emote")
        public AnchorFansEmote fansEmote;

        @C09CT("notice_board")
        public AnchorNoticeBoard noticeBoard;

        @C09CT("rank_info")
        public AnchorPageRank rankInfo;

        @C09CT("super_fan_emote")
        public AnchorFansEmote superFanEmote;

        @C09CT("super_fan_management")
        public SuperFanManagement superFanManagement;

        @C09CT("team_mission_details")
        public FansClubTeamMissionDetails teamMissionDetails;

        @C09CT("total_income")
        public SuperFanDataItemView totalIncome;

        @C09CT("fans_club_banner")
        public List<FansClubBanner> fansClubBanner = new ArrayList();

        @C09CT("benefits")
        public List<FanCustomBenefit> benefits = new ArrayList();
    }
}
