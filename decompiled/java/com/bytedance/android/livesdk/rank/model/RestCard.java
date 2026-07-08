package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class RestCard {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("consume_period")
    public long consumePeriod;

    @C09CT("consume_region")
    public long consumeRegion;

    @C09CT("consume_time")
    public long consumeTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("reward_period")
    public long rewardPeriod;

    @C09CT("reward_region")
    public long rewardRegion;

    @C09CT("reward_time")
    public long rewardTime;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
