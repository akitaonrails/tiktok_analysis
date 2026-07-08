package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveJourneySeasonWeeklyRecord {

    @C09CT("left_time")
    public long leftTime;

    @C09CT("task_list")
    public List<LiveJourneyTaskRecordInfo> taskList = new ArrayList();

    @C09CT("week_end_time")
    public long weekEndTime;

    @C09CT("week_num")
    public long weekNum;

    @C09CT("week_start_time")
    public long weekStartTime;
}
