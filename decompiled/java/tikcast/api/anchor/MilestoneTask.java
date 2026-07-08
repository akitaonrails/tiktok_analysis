package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MilestoneTask {

    @C09CT("task_type")
    public int taskType;

    @C09CT("user_count")
    public int userCount;

    @C09CT("task_title")
    public String taskTitle = "";

    @C09CT("stat_text")
    public String statText = "";

    @C09CT("users")
    public List<MilestoneUser> users = new ArrayList();
}
