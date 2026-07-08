package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.glip.ItemDetailTOC;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipTaskRewardResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("item_details")
        public List<ItemDetailTOC> itemDetails = new ArrayList();

        @C09CT("next_cursor")
        public String nextCursor = "";

        @C09CT("single_task_reward_overview")
        public SingleTaskRewardOverview singleTaskRewardOverview;

        @C09CT("total_count")
        public long totalCount;
    }
}
