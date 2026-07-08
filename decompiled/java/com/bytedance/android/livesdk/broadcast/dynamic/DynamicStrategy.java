package com.bytedance.android.livesdk.broadcast.dynamic;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class DynamicStrategy {

    @C09CT("priority")
    public final int mPriority;

    @C09CT("register_time_limit")
    public final int mRegisterTimeLimit;

    @C09CT("rehearsal_time")
    public final int mRehearsalTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int mSwitchStatus;

    public DynamicStrategy() {
        this(0, 30, 0, 30);
    }

    public DynamicStrategy(int i, int i2, int i3, int i4) {
        this.mSwitchStatus = i;
        this.mRegisterTimeLimit = i2;
        this.mPriority = i3;
        this.mRehearsalTime = i4;
    }
}
