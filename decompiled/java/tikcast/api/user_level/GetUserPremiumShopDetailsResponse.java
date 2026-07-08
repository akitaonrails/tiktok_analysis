package tikcast.api.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetUserPremiumShopDetailsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("bubble_info")
        public PremiumShopBubbleInfo bubbleInfo;

        @C09CT("current_server_time_ms")
        public long currentServerTimeMs;

        @C09CT("current_shop_info")
        public PremiumShopInfo currentShopInfo;

        @C09CT("eligibility_score")
        public long eligibilityScore;

        @C09CT("invitation_info")
        public InvitationDetailInfo invitationInfo;

        @C09CT("is_activated")
        public boolean isActivated;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("is_joined")
        public boolean isJoined;

        @C09CT("is_show_gallery")
        public boolean isShowGallery;

        @C09CT("recharge_details")
        public RechargeDetails rechargeDetails;

        @C09CT("shop_progress_score")
        public long shopProgressScore;

        @C09CT("show_bubble")
        public boolean showBubble;

        @C09CT("premium_shop_history_infos")
        public List<PremiumShopInfo> premiumShopHistoryInfos = new ArrayList();

        @C09CT("user_region")
        public String userRegion = "";

        @C09CT("education_page_content")
        public String educationPageContent = "";
    }
}
