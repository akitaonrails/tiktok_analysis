package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GiftGalleryReportResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("accumulated_gallery_gift_receive_count")
        public long accumulatedGalleryGiftReceiveCount;

        @C09CT("available_swap_card")
        public long availableSwapCard;

        @C09CT("gallery_duel")
        public GalleryDuelReport galleryDuel;

        @C09CT("gift_gallery_video_report")
        public GiftGalleryVideoReport giftGalleryVideoReport;

        @C09CT("gift_gallery_video_report_status")
        public int giftGalleryVideoReportStatus;

        @C09CT("highest_gift_count_6w")
        public long highestGiftCount6w;

        @C09CT("offset_date")
        public long offsetDate;

        @C09CT("period")
        public long period;

        @C09CT("normal_gifts")
        public List<GiftInfo> normalGifts = new ArrayList();

        @C09CT("ops_gifts")
        public List<GiftInfo> opsGifts = new ArrayList();

        @C09CT("lit_up_trends")
        public List<LitUpTrendInfo> litUpTrends = new ArrayList();

        @C09CT("almost_lit_up_info")
        public List<AlmostLitUpInfo> almostLitUpInfo = new ArrayList();

        @C09CT("friends_progress")
        public List<FriendsProgress> friendsProgress = new ArrayList();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class AlmostLitUpInfo {

            @C09CT("gift_id")
            public long giftId;

            @C09CT("goal_count")
            public long goalCount;

            @C09CT("sent_count")
            public long sentCount;

            @C09CT("user_id")
            public String userId = "";

            @C09CT("user_name")
            public String userName = "";

            @C09CT("user_avatar")
            public String userAvatar = "";

            @C09CT("gift_name")
            public String giftName = "";

            @C09CT("gift_icon")
            public String giftIcon = "";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class FriendsProgress {

            @C09CT("all_lit")
            public boolean allLit;

            @C09CT("lit_up_gift_count")
            public long litUpGiftCount;

            @C09CT("rank_no")
            public long rankNo;

            @C09CT("user_name")
            public String userName = "";

            @C09CT("user_avatar")
            public String userAvatar = "";

            @C09CT("user_id")
            public String userId = "";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class LitUpTrendInfo {

            @C09CT("lit_up_gift_count")
            public long litUpGiftCount;

            @C09CT("week_start_date")
            public long weekStartDate;
        }
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
