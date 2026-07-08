package webcast.privilege.fans;

import X.C09CT;
import webcast.data.CommunityAB;
import webcast.data.CommunityImageInfo;
import webcast.data.CommunityLevelInfo;
import webcast.data.CommunitySlotsInfo;
import webcast.data.CommunityUpgradeEvents;
import webcast.data.FanClubUserEvents;
import webcast.data.FansLevelInfo;
import webcast.data.RecentCommunityUpgradeInfo;
import webcast.data.UserCommunityExtra;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetUserCommunityPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("community_ab")
        public CommunityAB communityAb;

        @C09CT("extra")
        public UserCommunityExtra extra;

        @C09CT("fans_level_info")
        public FansLevelInfo fansLevelInfo;

        @C09CT("image_info")
        public CommunityImageInfo imageInfo;

        @C09CT("level_info")
        public CommunityLevelInfo levelInfo;

        @C09CT("recent_upgrade")
        public RecentCommunityUpgradeInfo recentUpgrade;

        @C09CT("slots_info")
        public CommunitySlotsInfo slotsInfo;

        @C09CT("upgrade_events")
        public CommunityUpgradeEvents upgradeEvents;

        @C09CT("user_events")
        public FanClubUserEvents userEvents;
    }
}
