package tikcast.api.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnchorVaultReportResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_percent_rank")
        public long anchorPercentRank;

        @C09CT("current_shop_info")
        public PremiumShopInfo currentShopInfo;

        @C09CT("invitation_info")
        public InvitationDetailInfo invitationInfo;

        @C09CT("old_shop_info")
        public PremiumShopInfo oldShopInfo;

        @C09CT("anchor_receive_gift_num")
        public Map<String, Long> anchorReceiveGiftNum = new LinkedHashMap();

        @C09CT("old_supporter_users")
        public List<SimpleUser> oldSupporterUsers = new ArrayList();

        @C09CT("new_supporter_users")
        public List<SimpleUser> newSupporterUsers = new ArrayList();

        @C09CT("new_unlock_users")
        public List<SimpleUser> newUnlockUsers = new ArrayList();

        @C09CT("anchor_region")
        public String anchorRegion = "";

        @C09CT("anchor_page_content")
        public String anchorPageContent = "";
    }
}
