package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowInstanceDetail {

    @C09CT("instance_id")
    public String instanceId = "";

    @C09CT("daily_task_list")
    public List<AnchorGrowTaskListItem> dailyTaskList = new ArrayList();

    @C09CT("weekly_task_list")
    public List<AnchorGrowTaskListItem> weeklyTaskList = new ArrayList();
}
