package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class GetAIGCTaskDetailBody {

    @C09CT("task_id_list")
    public final List<String> taskIdList;

    public GetAIGCTaskDetailBody() {
        this(null, 1, null);
    }

    public GetAIGCTaskDetailBody(List<String> list) {
        this.taskIdList = list;
    }

    public GetAIGCTaskDetailBody(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
