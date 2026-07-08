package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CampaignDetailsV2Result {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("block_type")
        public int blockType;

        @C09CT("campaign_meta_data")
        public CampaignMetaData campaignMetaData;

        @C09CT("current_user")
        public UserDetails currentUser;

        @C09CT("user_campaign_status")
        public int userCampaignStatus;

        @C09CT("task_list")
        public List<Task> taskList = new ArrayList();

        @C09CT("shared_users")
        public List<UserDetails> sharedUsers = new ArrayList();

        @C09CT("recommended_users")
        public List<UserDetails> recommendedUsers = new ArrayList();

        @C09CT("biz_data")
        public String bizData = "";

        @C09CT("extra")
        public String extra = "";
    }
}
