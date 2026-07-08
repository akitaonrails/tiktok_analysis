package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanConfig implements Serializable {

    @C09CT("tasks")
    public List<CommerceSmartUITasks> task;

    public final List<CommerceSmartUITasks> getTask() {
        return this.task;
    }

    public final void setTask(List<CommerceSmartUITasks> list) {
        this.task = list;
    }
}
