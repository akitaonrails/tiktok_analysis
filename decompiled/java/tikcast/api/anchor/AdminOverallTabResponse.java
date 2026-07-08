package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AdminOverallTabResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("items")
        public List<AdminOverallTabItem> items = new ArrayList();

        @C09CT("next_cursor")
        public long nextCursor;
    }
}
