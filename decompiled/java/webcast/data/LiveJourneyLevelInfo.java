package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveJourneyLevelInfo {

    @C09CT("complete_time")
    public long completeTime;

    @C09CT("create_time")
    public long createTime;

    @C09CT("current_exp")
    public long currentExp;

    @C09CT("is_final_level")
    public boolean isFinalLevel;

    @C09CT("level")
    public long level;

    @C09CT("need_exp")
    public long needExp;

    @C09CT("next_level_reward_info")
    public AnchorGrowRewardInfo nextLevelRewardInfo;

    @C09CT("reward_info")
    public LiveJourneyRewardInfo rewardInfo;

    @C09CT("reward_with_downstream_info_list_after_receive")
    public List<LiveJourneyRewardInfo> rewardWithDownstreamInfoListAfterReceive = new ArrayList();

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
