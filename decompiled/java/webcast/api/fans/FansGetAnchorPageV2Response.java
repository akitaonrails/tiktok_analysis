package webcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorCustomizedGift;
import webcast.data.AnchorManagementCards;
import webcast.data.FanCustomBenefit;
import webcast.data.FansChatGroupInfo;
import webcast.data.FansClubNameInfo;
import webcast.data.TeamRankBonusInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetAnchorPageV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_category")
        public int anchorCategory;

        @C09CT("anchor_fans_count")
        public long anchorFansCount;

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("anchor_management_cards")
        public AnchorManagementCards anchorManagementCards;

        @C09CT("bonus_info")
        public TeamRankBonusInfo bonusInfo;

        @C09CT("chat_group_info")
        public FansChatGroupInfo chatGroupInfo;

        @C09CT("customized_gift")
        public AnchorCustomizedGift customizedGift;

        @C09CT("extra")
        public AnchorPageExtra extra;

        @C09CT("fans_club_name_info")
        public FansClubNameInfo fansClubNameInfo;

        @C09CT("is_popularity_rank_released")
        public boolean isPopularityRankReleased;

        @C09CT("rank_info")
        public AnchorPageRank rankInfo;

        @C09CT("scroll_to_user_id")
        public String scrollToUserId = "";

        @C09CT("benefits")
        public List<FanCustomBenefit> benefits = new ArrayList();
    }
}
