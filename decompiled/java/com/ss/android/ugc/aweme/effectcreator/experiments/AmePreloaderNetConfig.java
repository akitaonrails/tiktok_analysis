package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class AmePreloaderNetConfig {

    @C09CT("interrupt_conditions")
    public final List<String> interruptConditions;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("load_tasks")
    public final List<AmeTaskNode> loadTask;

    @C09CT("priority_level")
    public final int priorityLevel;

    @C09CT("preload_task_type")
    public final String taskType;

    @C09CT("trigger_conditions")
    public final List<String> triggerConditions;

    public AmePreloaderNetConfig() {
        this(false, null, 0, null, null, null, 63, null);
    }

    public AmePreloaderNetConfig(boolean z, String str, int i, List<String> list, List<String> list2, List<AmeTaskNode> list3) {
        this.isEnabled = z;
        this.taskType = str;
        this.priorityLevel = i;
        this.triggerConditions = list;
        this.interruptConditions = list2;
        this.loadTask = list3;
    }

    public AmePreloaderNetConfig(boolean z, String str, int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? i : 0, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? C13BV.INSTANCE : list2, (i2 & 32) != 0 ? C13BV.INSTANCE : list3);
    }
}
