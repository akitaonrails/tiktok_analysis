package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SubQueueHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("queue_list")
        public List<SubQueue> queueList = new ArrayList();

        @C09CT("total_count")
        public long totalCount;
    }
}
