package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowLevelCurrentLevelDetail {

    @C09CT("current_exp")
    public long currentExp;

    @C09CT("current_level_info")
    public AnchorGrowLevelLevelInfo currentLevelInfo;

    @C09CT("has_next_level")
    public boolean hasNextLevel;

    @C09CT("is_completed")
    public boolean isCompleted;

    @C09CT("level")
    public long level;

    @C09CT("need_exp")
    public long needExp;

    @C09CT("task_list")
    public List<AnchorGrowTaskListItem> taskList = new ArrayList();
}
