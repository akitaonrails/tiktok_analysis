package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowLevelTasksRecordItem;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorGrowLevelMyRecordTasksResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("list")
        public List<AnchorGrowLevelTasksRecordItem> list = new ArrayList();
    }
}
