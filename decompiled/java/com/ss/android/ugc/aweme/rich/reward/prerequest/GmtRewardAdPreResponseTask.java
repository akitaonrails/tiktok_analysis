package com.ss.android.ugc.aweme.rich.reward.prerequest;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardAdPreResponseTask {

    @C09CT("expire_time_ticks")
    public final long expireTime;

    @C09CT("pre_req_id")
    public final String preReqId;

    @C09CT("task_id")
    public final String taskId;

    public GmtRewardAdPreResponseTask() {
        this("", "", 0L);
    }

    public GmtRewardAdPreResponseTask(String str, String str2, long j) {
        this.taskId = str;
        this.preReqId = str2;
        this.expireTime = j;
    }
}
