package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;
import com.bytedance.android.livesdk.chatroom.api.SubQueueUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueueInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("follow_status")
        public int followStatus;

        @C09CT("is_subscriber")
        public boolean isSubscriber;

        @C09CT("join_status")
        public int joinStatus;

        @C09CT("member_list")
        public List<SubQueueUser> memberList = new ArrayList();

        @C09CT("queue")
        public SubQueue queue;

        @C09CT("total_count")
        public long totalCount;
    }
}
