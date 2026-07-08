package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SeiGuestShowdownExtra {

    @C09CT("content_id")
    public final String contentId;

    @C09CT("duration")
    public final Long duration;

    @C09CT("loser_num")
    public final Integer loserNum;

    @C09CT("play_id")
    public final Long playId;

    @C09CT("r_step")
    public final Integer runningStep;

    @C09CT("start_time")
    public final Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("winner_num")
    public final Integer winnerNum;

    public SeiGuestShowdownExtra(Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, String str, Integer num4) {
        this.playId = l;
        this.status = num;
        this.startTime = l2;
        this.duration = l3;
        this.loserNum = num2;
        this.winnerNum = num3;
        this.contentId = str;
        this.runningStep = num4;
    }
}
