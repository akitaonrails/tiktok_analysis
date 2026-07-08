package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskFlow {

    @C09CT("result")
    public final List<TaskResult> result;

    public TaskFlow() {
        this(null, 1, null);
    }

    public TaskFlow(List<TaskResult> list) {
        this.result = list;
    }

    public TaskFlow(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
