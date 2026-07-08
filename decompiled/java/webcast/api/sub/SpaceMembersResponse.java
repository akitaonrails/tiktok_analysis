package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceMembersResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("members_list")
        public List<SpaceMemberInfo> membersList = new ArrayList();

        @C09CT("offset")
        public long offset;

        @C09CT("total_count")
        public long totalCount;
    }
}
