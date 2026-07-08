package com.ss.android.ugc.aweme.rich.reward.prerequest;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardAdPreResponse {

    @C09CT("incentive_task_list")
    public final List<GmtRewardAdPreResponseTask> incentiveTaskList;

    public GmtRewardAdPreResponse() {
        this(null);
    }

    public GmtRewardAdPreResponse(List<GmtRewardAdPreResponseTask> list) {
        this.incentiveTaskList = list;
    }
}
