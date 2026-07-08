package webcast.api.ranklist_class;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LeagueDetail {

    @C09CT("class_info")
    public ClassInfo classInfo;

    @C09CT("first_highest_class_time")
    public long firstHighestClassTime;

    @C09CT("his_highest_class")
    public int hisHighestClass;

    @C09CT("maintained_days")
    public long maintainedDays;

    @C09CT("recent_class_trends")
    public List<HisClassInfo> recentClassTrends = new ArrayList();

    public static final class ClassInfo {

        @C09CT("creator_class")
        public int creatorClass;

        @C09CT("cur_class_stars")
        public long curClassStars;
    }

    public static final class HisClassInfo {

        /* JADX INFO: renamed from: class, reason: not valid java name */
        @C09CT("class")
        public int f95class;

        @C09CT("record_time")
        public long recordTime;

        @C09CT("star")
        public long star;
    }
}
