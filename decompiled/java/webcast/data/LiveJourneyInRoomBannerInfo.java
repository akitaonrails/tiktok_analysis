package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveJourneyInRoomBannerInfo {

    @C09CT("current_exp")
    public long currentExp;

    @C09CT("current_level")
    public long currentLevel;

    @C09CT("is_final_level")
    public boolean isFinalLevel;

    @C09CT("show_task_info")
    public LiveJourneyTaskRecordInfo showTaskInfo;

    @C09CT("weekly_task_list")
    public List<LiveJourneyTaskRecordInfo> weeklyTaskList = new ArrayList();

    @C09CT("finish_at_once_task_list")
    public List<LiveJourneyInRoomBannerFinishAtOnceTaskInfo> finishAtOnceTaskList = new ArrayList();
}
