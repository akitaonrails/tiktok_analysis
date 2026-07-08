package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveJourneyInfo {

    @C09CT("current_level")
    public long currentLevel;

    @C09CT("current_level_exp")
    public long currentLevelExp;

    @C09CT("task_info")
    public LiveJourneyTaskInfo taskInfo;

    @C09CT("total_get_exp")
    public long totalGetExp;

    @C09CT("level_info_list")
    public List<LiveJourneyLevelInfo> levelInfoList = new ArrayList();

    @C09CT("time_zone")
    public String timeZone = "";
}
