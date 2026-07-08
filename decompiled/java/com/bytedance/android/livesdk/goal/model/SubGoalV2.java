package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoalGift;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SubGoalV2 {

    @C09CT("gift")
    public LiveStreamSubGoalGift gift;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("pin_info")
    public SubGoalPinInfo pinInfo;

    @C09CT("progress")
    public long progress;

    @C09CT("target")
    public long target;

    @C09CT("type")
    public int type;
}
