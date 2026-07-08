package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneyAddExpRecord;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorLiveJourneyAddExpHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("list")
        public List<LiveJourneyAddExpRecord> list = new ArrayList();

        @C09CT("time_zone")
        public String timeZone = "";
    }
}
