package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankItems;

/* JADX INFO: loaded from: classes.dex */
public final class GetTrendingRankResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("owner_anchor_info")
        public OwnerAnchorInfo ownerAnchorInfo;

        @C09CT("rank_items")
        public List<RankItems> rankItems = new ArrayList();
    }
}
