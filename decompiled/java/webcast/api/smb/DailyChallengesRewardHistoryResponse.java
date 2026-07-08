package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PaginationInfo;
import webcast.data.RewardTotals;
import webcast.data.SMBReward;

/* JADX INFO: loaded from: classes23.dex */
public final class DailyChallengesRewardHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("can_claim_all")
        public boolean canClaimAll;

        @C09CT("pagination_info")
        public PaginationInfo paginationInfo;

        @C09CT("rewards")
        public List<SMBReward> rewards = new ArrayList();

        @C09CT("totals")
        public RewardTotals totals;
    }
}
