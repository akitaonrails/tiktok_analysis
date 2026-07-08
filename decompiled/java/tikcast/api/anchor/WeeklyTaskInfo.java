package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WeeklyTaskInfo {

    @C09CT("current_week_index")
    public int currentWeekIndex;

    @C09CT("weekly_task_uninvolved")
    public boolean weeklyTaskUninvolved;

    @C09CT("week_tabs")
    public List<WeekTab> weekTabs = new ArrayList();

    @C09CT("current_week_tasks")
    public List<WeekTask> currentWeekTasks = new ArrayList();

    @C09CT("explanation_text")
    public String explanationText = "";
}
