package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorRecommendItem {

    @C09CT("anchor_room_info")
    public AnchorRoomInfo anchorRoomInfo;

    @C09CT("reward_amount")
    public long rewardAmount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_complete_target_num")
    public long taskCompleteTargetNum;

    @C09CT("task_completed_num")
    public long taskCompletedNum;

    @C09CT("task_id")
    public long taskId;
}
