package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class AmeTaskNode {

    @C09CT("dependencies")
    public final List<String> dependencies;

    @C09CT("fetch_all_list_categories")
    public final List<String> fetchAllListCategories;

    @C09CT("interrupt_conditions")
    public final List<String> interruptConditions;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("priority_level")
    public final int priorityLevel;

    @C09CT("tab_list_page_count")
    public final int tabListPageCount;

    @C09CT("tab_resource_page_count")
    public final int tabResourcePageCount;

    @C09CT("task_name")
    public final String taskName;

    public AmeTaskNode() {
        this(null, false, 0, null, null, 0, 0, null, 255, null);
    }

    public AmeTaskNode(String str, boolean z, int i, List<String> list, List<String> list2, int i2, int i3, List<String> list3) {
        this.taskName = str;
        this.isEnabled = z;
        this.priorityLevel = i;
        this.interruptConditions = list;
        this.dependencies = list2;
        this.tabListPageCount = i2;
        this.tabResourcePageCount = i3;
        this.fetchAllListCategories = list3;
    }

    public AmeTaskNode(String str, boolean z, int i, List list, List list2, int i2, int i3, List list3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? C13BV.INSTANCE : list, (i4 & 16) != 0 ? C13BV.INSTANCE : list2, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) != 0 ? C13BV.INSTANCE : list3);
    }
}
