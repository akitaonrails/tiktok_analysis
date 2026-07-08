package tikcast.api.star_comment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StarCommentPurchaseHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("purchase_history")
        public List<StarCommentHistory> purchaseHistory = new ArrayList();
    }
}
