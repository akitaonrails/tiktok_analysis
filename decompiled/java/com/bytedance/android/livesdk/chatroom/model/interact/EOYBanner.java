package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EOYBanner {

    @C09CT("end_time")
    public long endTime;

    @C09CT("grade_info")
    public GradeInfo gradeInfo;

    @C09CT("round")
    public long round;

    @C09CT("start_time")
    public long startTime;

    @C09CT("streak_info")
    public StreakInfo streakInfo;

    @C09CT("title")
    public String title = "";

    @C09CT("subtitle")
    public String subtitle = "";

    @C09CT("announcement_starling_key")
    public String announcementStarlingKey = "";

    @C09CT("description")
    public String description = "";

    @C09CT("schema")
    public String schema = "";

    public static final class GradeInfo {

        @C09CT("level")
        public long level;

        @C09CT("progress")
        public long progress;

        @C09CT("target")
        public long target;
    }

    public static final class MileStone {

        @C09CT("bonus_times")
        public long bonusTimes;

        @C09CT("target_value")
        public long targetValue;
    }

    public static final class StreakInfo {

        @C09CT("mile_stones")
        public List<MileStone> mileStones = new ArrayList();

        @C09CT("progress")
        public long progress;

        @C09CT("streak_type")
        public int streakType;
    }
}
