package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class GetAnchorShareListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_share_list")
        public List<AnchorShare> anchorShareList = new ArrayList();

        @C09CT("anchor_share_sort_type")
        public int anchorShareSortType;
    }
}
