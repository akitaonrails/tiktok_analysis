package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SeiCountDownForAllExtra {

    @C09CT("duration")
    public final Long duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long playId;

    @C09CT("res")
    public final String resourceId;

    @C09CT("stime")
    public final Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("tscore")
    public final Long targetScore;

    public SeiCountDownForAllExtra(Long l, Integer num, Long l2, Long l3, Long l4, String str) {
        this.playId = l;
        this.status = num;
        this.startTime = l2;
        this.duration = l3;
        this.targetScore = l4;
        this.resourceId = str;
    }
}
