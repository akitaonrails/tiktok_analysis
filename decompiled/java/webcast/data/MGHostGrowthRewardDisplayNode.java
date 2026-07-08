package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MGHostGrowthRewardDisplayNode {

    @C09CT("display_user_tag")
    public int displayUserTag;

    @C09CT("issue_reward_time_ms")
    public long issueRewardTimeMs;

    @C09CT("reward_valid_offset_ms")
    public long rewardValidOffsetMs;

    @C09CT("segment_rewards")
    public List<MGHostGrowthUserClaimReward> segmentRewards = new ArrayList();
}
