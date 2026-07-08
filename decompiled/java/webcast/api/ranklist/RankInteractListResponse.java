package webcast.api.ranklist;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes4.dex */
public final class RankInteractListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("total_interact_num")
        public long totalInteractNum;

        @C09CT("ranks")
        public List<RankInfo> ranks = new ArrayList();

        @C09CT("is_same_live_map")
        public Map<Long, Boolean> isSameLiveMap = new LinkedHashMap();

        public static final class RankInfo {

            @C09CT("rank_user")
            public RankUser rankUser;
        }
    }
}
