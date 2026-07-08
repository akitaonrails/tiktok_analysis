package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.SubGrowthStat;
import webcast.data.SubInteractionStat;
import webcast.data.SubRelationStat;
import webcast.data.SubReportOwner;
import webcast.data.SubToolStat;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnnualSubReportResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("achievement_rank")
        public float achievementRank;

        @C09CT("achievement_title")
        public String achievementTitle = "";

        @C09CT("end_ts")
        public long endTs;

        @C09CT("growth_stat")
        public SubGrowthStat growthStat;

        @C09CT("has_report")
        public boolean hasReport;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("interaction_stat")
        public SubInteractionStat interactionStat;

        @C09CT("owner")
        public SubReportOwner owner;

        @C09CT("relation_stat")
        public SubRelationStat relationStat;

        @C09CT("revenue_unit")
        public int revenueUnit;

        @C09CT("start_ts")
        public long startTs;

        @C09CT("tool_stat")
        public SubToolStat toolStat;

        @C09CT("total_revenue")
        public float totalRevenue;
    }
}
