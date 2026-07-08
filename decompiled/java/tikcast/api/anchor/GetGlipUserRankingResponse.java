package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipUserRankingResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("glip_user_ranking_list")
        public List<GlipUserRanking> glipUserRankingList = new ArrayList();

        @C09CT("glip_user_self_ranking")
        public GlipUserSelfRanking glipUserSelfRanking;

        @C09CT("ranking_update_time")
        public long rankingUpdateTime;

        @C09CT("task_mode")
        public int taskMode;

        @C09CT("total_ranking_count")
        public long totalRankingCount;
    }
}
