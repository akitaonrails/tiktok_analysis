package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.glip.ItemDetailTOC;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipUserRewardItemListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("item_details")
        public List<ItemDetailTOC> itemDetails = new ArrayList();

        @C09CT("next_cursor")
        public String nextCursor = "";
    }
}
