package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneySeasonInfo;
import webcast.data.LiveJourneySeasonWeeklyRecord;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorLiveJourneySeasonWeeklyRecordsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("season_info")
        public LiveJourneySeasonInfo seasonInfo;

        @C09CT("list")
        public List<LiveJourneySeasonWeeklyRecord> list = new ArrayList();

        @C09CT("time_zone")
        public String timeZone = "";
    }
}
