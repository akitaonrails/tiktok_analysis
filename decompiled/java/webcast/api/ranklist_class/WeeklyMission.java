package webcast.api.ranklist_class;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class WeeklyMission {

    @C09CT("end_time")
    public long endTime;

    @C09CT("mission_items")
    public List<MissionItem> missionItems = new ArrayList();

    @C09CT("start_time")
    public long startTime;

    @C09CT("upper_limit_reward")
    public long upperLimitReward;

    public static final class MissionItem {

        @C09CT("achieved")
        public boolean achieved;

        @C09CT("mission_type")
        public int missionType;

        @C09CT("ratio")
        public long ratio;
    }
}
