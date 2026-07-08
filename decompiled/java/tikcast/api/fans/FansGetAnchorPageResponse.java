package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.AnchorPopularityTask;
import webcast.data.FansClubBanner;
import webcast.data.PopularityRankCard;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetAnchorPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("anchor_task")
        public AnchorPopularityTask anchorTask;

        @C09CT("comment_fans")
        public long commentFans;

        @C09CT("fans_club_banner")
        public FansClubBanner fansClubBanner;

        @C09CT("fans_count")
        public long fansCount;

        @C09CT("fans_gift_num")
        public long fansGiftNum;

        @C09CT("gift_coins")
        public long giftCoins;

        @C09CT("is_popularity_rank_released")
        public boolean isPopularityRankReleased;

        @C09CT("new_fans")
        public FansList newFans;

        @C09CT("quick_upgrade_fans")
        public FansList quickUpgradeFans;

        @C09CT("rank_card")
        public PopularityRankCard rankCard;

        @C09CT("top_fans")
        public FansList topFans;

        @C09CT("watch_live_num")
        public long watchLiveNum;
    }
}
