package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FansContributorsRankResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("contributors_num")
        public int contributorsNum;

        @C09CT("countdown_seconds")
        public int countdownSeconds;

        @C09CT("extra")
        public Extra extra;

        @C09CT("has_next")
        public boolean hasNext;

        @C09CT("ranks")
        public List<RankInfo> ranks = new ArrayList();

        @C09CT("self_rank")
        public RankInfo selfRank;

        @C09CT("viewer_optout")
        public boolean viewerOptout;
    }
}
