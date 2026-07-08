package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetActivityRewardDetailsResp {

    @C09CT("data")
    public GetActivityRewardDetailsRata data;

    public static final class GetActivityRewardDetailsRata {

        @C09CT("claimable")
        public long claimable;

        @C09CT("claimed")
        public long claimed;

        @C09CT("unclaimable_rewards")
        public List<RewardEntitlement> unclaimableRewards = new ArrayList();

        @C09CT("claimable_rewards")
        public List<RewardEntitlement> claimableRewards = new ArrayList();
    }
}
