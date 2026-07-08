package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowLevelRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowLevelMyRecordRewardsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("can_claim_list")
        public List<AnchorGrowLevelRewardRecordItem> canClaimList = new ArrayList();

        @C09CT("already_claim_list")
        public List<AnchorGrowLevelRewardRecordItem> alreadyClaimList = new ArrayList();

        @C09CT("expired_claim_list")
        public List<AnchorGrowLevelRewardRecordItem> expiredClaimList = new ArrayList();
    }
}
