package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PostPageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("last_active_time_sec")
        public long lastActiveTimeSec;

        @C09CT("offset")
        public long offset;

        @C09CT("post")
        public List<SpacePost> post = new ArrayList();

        @C09CT("total_count")
        public long totalCount;
    }
}
