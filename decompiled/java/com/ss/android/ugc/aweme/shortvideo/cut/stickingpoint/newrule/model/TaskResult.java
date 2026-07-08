package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TaskResult {

    @C09CT("pred_dim")
    public final int predDim;

    @C09CT("task_id")
    public final String taskID;

    @C09CT("task_type")
    public final String taskType;

    public TaskResult() {
        this(null, null, 0);
    }

    public TaskResult(String str, String str2, int i) {
        this.taskID = str;
        this.taskType = str2;
        this.predDim = i;
    }
}
