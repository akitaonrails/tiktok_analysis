package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneyAddExpRecord;
import webcast.data.LiveJourneySeasonInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorLiveJourneySeasonExpHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("season_info")
        public LiveJourneySeasonInfo seasonInfo;

        @C09CT("total_get_exp")
        public long totalGetExp;

        @C09CT("list")
        public List<LiveJourneyAddExpRecord> list = new ArrayList();

        @C09CT("time_zone")
        public String timeZone = "";
    }
}
