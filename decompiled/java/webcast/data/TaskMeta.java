package webcast.data;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TaskMeta {

    @C09CT("legacy_task_type")
    public int legacyTaskType;

    @C09CT("stats")
    public TaskStats stats;

    @C09CT("task_category")
    public long taskCategory;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_status")
    public long taskStatus;

    @C09CT("task_type")
    public String taskType = "";

    @C09CT("resource")
    public String resource = "";

    @C09CT("extra")
    public String extra = "";
}
