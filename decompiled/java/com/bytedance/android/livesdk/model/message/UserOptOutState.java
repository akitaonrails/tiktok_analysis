package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class UserOptOutState {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("uid")
    public String uid = "";

    @C09CT("state_id")
    public String stateId = "";
}
