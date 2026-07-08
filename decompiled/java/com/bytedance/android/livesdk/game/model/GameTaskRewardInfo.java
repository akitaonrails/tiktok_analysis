package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GameTaskRewardInfo {

    @C09CT("reward_id")
    public String rewardId = "";

    @C09CT("reward_value")
    public String rewardValue = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
