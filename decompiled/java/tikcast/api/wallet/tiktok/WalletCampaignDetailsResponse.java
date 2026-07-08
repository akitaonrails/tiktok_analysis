package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class WalletCampaignDetailsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("campaign_end_time")
        public long campaignEndTime;

        @C09CT("campaign_start_time")
        public long campaignStartTime;

        @C09CT("campaign_status")
        public int campaignStatus;

        @C09CT("decoupling_campaign")
        public DecouplingCampaign decouplingCampaign;

        @C09CT("feature_block")
        public boolean featureBlock;

        @C09CT("fpc_block")
        public boolean fpcBlock;

        @C09CT("region_block")
        public boolean regionBlock;

        @C09CT("user_campaign_status")
        public int userCampaignStatus;

        @C09CT("campaign_id")
        public String campaignId = "";

        @C09CT("campaign_name")
        public String campaignName = "";

        @C09CT("extra")
        public Map<String, String> extra = new LinkedHashMap();

        @C09CT("shared_users")
        public List<UserDetails> sharedUsers = new ArrayList();

        @C09CT("recommended_users")
        public List<UserDetails> recommendedUsers = new ArrayList();

        @C09CT("referral_code")
        public String referralCode = "";
    }
}
