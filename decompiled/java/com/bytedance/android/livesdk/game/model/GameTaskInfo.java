package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GameTaskInfo {

    @C09CT("current_value")
    public int currentValue;

    @C09CT("reward_info")
    public GameTaskRewardInfo rewardInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("target_value")
    public int targetValue;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_type")
    public int taskType;
}
