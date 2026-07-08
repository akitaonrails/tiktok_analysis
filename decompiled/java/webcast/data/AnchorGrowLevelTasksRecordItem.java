package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorGrowLevelTasksRecordItem {

    @C09CT("level")
    public long level;

    @C09CT("task_list")
    public List<AnchorGrowTaskListItem> taskList = new ArrayList();

    @C09CT("upgrade_level_time")
    public long upgradeLevelTime;
}
