package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class FragmentReward {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("consume_period")
    public long consumePeriod;

    @C09CT("consume_time")
    public long consumeTime;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("reward_period")
    public long rewardPeriod;

    @C09CT("reward_time")
    public long rewardTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("source")
    public String source = "";

    @C09CT("reward_region")
    public String rewardRegion = "";

    @C09CT("consume_region")
    public String consumeRegion = "";
}
