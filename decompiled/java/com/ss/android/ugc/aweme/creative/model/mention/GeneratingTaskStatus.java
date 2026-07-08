package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneratingTaskStatus {

    @C09CT("complete_percentage")
    public final Integer percentage;

    @C09CT("task_id")
    public final String taskId;

    public GeneratingTaskStatus() {
        this(null, null);
    }

    public GeneratingTaskStatus(String str, Integer num) {
        this.taskId = str;
        this.percentage = num;
    }
}
