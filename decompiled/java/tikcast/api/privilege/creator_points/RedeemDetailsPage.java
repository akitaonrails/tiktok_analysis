package tikcast.api.privilege.creator_points;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RedeemDetailsPage {

    @C09CT("address")
    public CreatorTilesAddress address;

    @C09CT("current_balance")
    public int currentBalance;

    @C09CT("max_redeemable_rewards")
    public int maxRedeemableRewards;

    @C09CT("reward_definition")
    public RewardDefinition rewardDefinition;

    @C09CT("sections")
    public List<RedeemDetailsSection> sections = new ArrayList();
}
