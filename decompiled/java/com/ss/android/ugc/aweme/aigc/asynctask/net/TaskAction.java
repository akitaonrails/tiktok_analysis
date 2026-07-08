package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskAction {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("task_id")
    public final String taskId;

    public TaskAction() {
        this("", 0);
    }

    public TaskAction(String str, int i) {
        this.taskId = str;
        this.actionType = i;
    }
}
