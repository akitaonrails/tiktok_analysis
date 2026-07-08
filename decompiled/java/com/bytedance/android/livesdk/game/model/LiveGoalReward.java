package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGoalReward {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("condition")
    public LiveGoalRewardCondition condition;

    @C09CT("end_time")
    public long endTime;

    @C09CT("goal_id")
    public long goalId;

    @C09CT("reward_content")
    public String rewardContent = "";

    @C09CT("reward_users")
    public List<LiveStreamGoalContributor> rewardUsers = new ArrayList();

    @C09CT("start_time")
    public long startTime;
}
