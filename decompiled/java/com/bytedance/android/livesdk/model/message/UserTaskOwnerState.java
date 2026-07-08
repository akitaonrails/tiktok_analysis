package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserTaskOwnerState {

    @C09CT("feature_meta")
    public FeatureMeta featureMeta;

    @C09CT("repeated_times")
    public int repeatedTimes;

    @C09CT("round_idx")
    public int roundIdx;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("total_repeat_times")
    public int totalRepeatTimes;

    @C09CT("uid")
    public long uid;

    @C09CT("progresses")
    public List<UserTaskProgress> progresses = new ArrayList();

    @C09CT("state_id")
    public String stateId = "";
}
