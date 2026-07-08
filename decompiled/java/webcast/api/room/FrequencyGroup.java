package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FrequencyGroup {

    @C09CT("daily_count")
    public long dailyCount;

    @C09CT("group_name")
    public String groupName = "";

    @C09CT("group_names")
    public List<String> groupNames = new ArrayList();

    @C09CT("interval")
    public long interval;

    @C09CT("max_count")
    public long maxCount;

    @C09CT("trigger_gap")
    public long triggerGap;
}
