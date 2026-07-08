package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class MGHostGrowthActivityReward {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("aggregation_duration")
    public int aggregationDuration;

    @C09CT("flare_tier")
    public long flareTier;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("reward_num")
    public long rewardNum;

    @C09CT("target_user_tag_enum")
    public int targetUserTagEnum;

    @C09CT("task_phase")
    public long taskPhase;

    @C09CT("type")
    public int type;
}
