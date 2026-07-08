package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RelationshipJourneyInfo {

    @C09CT("join_time")
    public long joinTime;

    @C09CT("total_heart_me_sent")
    public long totalHeartMeSent;

    @C09CT("total_watch_time")
    public long totalWatchTime;

    @C09CT("timeline_events")
    public List<TimelineEvent> timelineEvents = new ArrayList();

    @C09CT("today_card_list")
    public List<RelationshipTodayCard> todayCardList = new ArrayList();

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
