package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class FinishEncourageLOP {

    @C09CT("is_level_up")
    public boolean isLevelUp;

    @C09CT("level")
    public int level;

    @C09CT("task_list")
    public List<FinishEncourageTask> taskList = new ArrayList();

    @C09CT("progress_title")
    public String progressTitle = "";

    @C09CT("finish_title")
    public String finishTitle = "";
}
