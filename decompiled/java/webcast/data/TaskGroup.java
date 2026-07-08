package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TaskGroup {

    @C09CT("task_group_id")
    public long taskGroupId;

    @C09CT("tasks")
    public List<TaskMeta> tasks = new ArrayList();
}
