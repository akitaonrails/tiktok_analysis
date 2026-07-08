package com.ss.android.ugc.aweme.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGCTaskStatus {

    @C09CT("job_type")
    public final String jobType;

    @C09CT("complete_percentage")
    public final Float percentage;

    @C09CT("job_status")
    public final Integer status;

    @C09CT("status_message")
    public final String statusMessage;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("waiting_time")
    public final Integer waitingTime;

    public AIGCTaskStatus() {
        this(null, null, null, null, null, null);
    }

    public AIGCTaskStatus(String str, Integer num, Float f, String str2, String str3, Integer num2) {
        this.taskId = str;
        this.status = num;
        this.percentage = f;
        this.statusMessage = str2;
        this.jobType = str3;
        this.waitingTime = num2;
    }
}
