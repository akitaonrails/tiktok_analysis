package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateAIGCTaskStatusBody {

    @C09CT("task_action_list")
    public final List<TaskAction> taskActionList;

    public UpdateAIGCTaskStatusBody() {
        this(null, 1, null);
    }

    public UpdateAIGCTaskStatusBody(List<TaskAction> list) {
        this.taskActionList = list;
    }

    public UpdateAIGCTaskStatusBody(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
