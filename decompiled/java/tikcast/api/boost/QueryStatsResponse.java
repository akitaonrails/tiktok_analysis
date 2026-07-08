package tikcast.api.boost;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class QueryStatsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("flare_stats")
        public FlareStats flareStats;

        @C09CT("need_next_req")
        public boolean needNextReq;

        @C09CT("promote_stats")
        public PromoteStats promoteStats;
    }
}
