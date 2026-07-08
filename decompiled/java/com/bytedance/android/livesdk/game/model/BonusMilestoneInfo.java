package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class BonusMilestoneInfo {

    @C09CT("index")
    public int index;

    @C09CT("qualified_view_count")
    public long qualifiedViewCount;

    @C09CT("reward_count")
    public long rewardCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
