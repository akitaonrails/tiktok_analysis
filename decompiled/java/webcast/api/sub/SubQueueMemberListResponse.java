package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubQueueUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueueMemberListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("member_list")
        public List<SubQueueUser> memberList = new ArrayList();

        @C09CT("offset")
        public long offset;

        @C09CT("total_count")
        public long totalCount;
    }
}
