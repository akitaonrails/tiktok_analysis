package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class MGHostGrowthUserClaimReward {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("aggregation_duration")
    public int aggregationDuration;

    @C09CT("claim_status")
    public int claimStatus;

    @C09CT("flare_tier")
    public long flareTier;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("reward_id")
    public long rewardId;

    @C09CT("reward_num")
    public long rewardNum;

    @C09CT("type")
    public int type;

    @C09CT("update_time_ms")
    public long updateTimeMs;

    @C09CT("user_tag_enum_for_reward")
    public int userTagEnumForReward;
}
