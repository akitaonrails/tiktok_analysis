package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedTaskDowngradeConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("task_list")
    public final List<String> taskList;

    @C09CT("trigger_type_list")
    public final List<Integer> triggerTypeList;

    @C09CT("trigger_type_name_list")
    public final List<String> triggerTypeNameList;

    public FeedTaskDowngradeConfig() {
        this(false, null, null, null, 15, null);
    }

    public FeedTaskDowngradeConfig(boolean z, List<Integer> list, List<String> list2, List<String> list3) {
        this.isOpen = z;
        this.triggerTypeList = list;
        this.triggerTypeNameList = list2;
        this.taskList = list3;
    }

    public FeedTaskDowngradeConfig(boolean z, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
