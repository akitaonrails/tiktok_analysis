package com.bytedance.touchpoint.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class PrefetchIncentiveAdRequestParam {

    @C09CT("engagement_type")
    public final Integer engagementType;

    @C09CT("completed_times")
    public final Integer index;

    @C09CT("task_id")
    public final String taskId;

    public PrefetchIncentiveAdRequestParam() {
        this(null, null, null);
    }

    public PrefetchIncentiveAdRequestParam(String str, Integer num, Integer num2) {
        this.taskId = str;
        this.engagementType = num;
        this.index = num2;
    }
}
